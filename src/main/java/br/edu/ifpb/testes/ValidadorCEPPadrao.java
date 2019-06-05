package br.edu.ifpb.testes;

public class ValidadorCEPPadrao implements ValidadorCEP {

    public boolean validar(String s) throws CEPNuloException {
        if(s == null) {
            throw new CEPNuloException("Não é permitido um CEP nulo!");
        }
        String padrao = "\\d{5}-\\d{3}";
        return s.matches(padrao);
    }
}
