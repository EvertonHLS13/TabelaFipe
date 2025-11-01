package br.com.alura.TabelaFipe.repository;

public interface IConverteDados {

    <T> T obeterDados(String json, Class<T>  classe);

}
