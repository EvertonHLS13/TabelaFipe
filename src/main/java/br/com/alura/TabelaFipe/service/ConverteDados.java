package br.com.alura.TabelaFipe.service;

import br.com.alura.TabelaFipe.repository.IConverteDados;
import org.springframework.boot.json.JsonParseException;
import tools.jackson.databind.ObjectMapper;

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
}
