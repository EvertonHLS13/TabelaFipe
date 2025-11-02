package br.com.alura.TabelaFipe.repository;

import java.util.List;

public interface IConverteDados {

    <T> T obeterDados(String json, Class<T>  classe);


    <T>List<T> obterLista(String json, Class<T> classe);
}
