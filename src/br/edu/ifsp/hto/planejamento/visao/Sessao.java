package br.edu.ifsp.hto.planejamento.visao;

import java.util.HashMap;

public class Sessao {
    private static HashMap<String, Object> valores = new HashMap<>();

    public static void adicionar(String chave, Object valor) {
        valores.put(chave, valor);
    }

    public static Object pegar(String chave) {
        return valores.get(chave);
    }
}
