package br.com.claudineialves.execao;

public class ParametrosInvalidosExeption extends RuntimeException {
    private  String mensagem;

    public ParametrosInvalidosExeption(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return mensagem;
    }
}
