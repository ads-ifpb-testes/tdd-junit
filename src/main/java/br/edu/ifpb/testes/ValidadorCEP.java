package br.edu.ifpb.testes;

public interface ValidadorCEP {
    boolean validar(String s) throws CEPNuloException;
}
