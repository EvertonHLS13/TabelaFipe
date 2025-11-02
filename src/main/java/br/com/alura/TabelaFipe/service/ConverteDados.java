package br.com.alura.TabelaFipe.service;

import br.com.alura.TabelaFipe.repository.IConverteDados;
import org.springframework.boot.json.JsonParseException;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.type.CollectionType;

import java.util.Collection;
import java.util.List;

public class ConverteDados implements IConverteDados {
    private ObjectMapper maper = new ObjectMapper();


    @Override
    public <T> T obeterDados(String json, Class<T> classe) {
        try {
            return maper.readValue(json, classe);
        } catch (JsonParseException e){
            throw  new RuntimeException(e);
        }
    }

        @Override
        public <T> List<T> obterLista(String json, Class<T> classe) {
            CollectionType lista = maper.getTypeFactory()
                    .constructCollectionType(List.class, classe);

            try {
                return maper.readValue(json, lista);
            } catch (JsonParseException e){
                throw new RuntimeException(e);
            }

            }

    }
