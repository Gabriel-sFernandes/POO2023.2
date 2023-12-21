package br.ufpb.dcx.gabreeel.quiz;

public class PerguntaNaoExisteException extends Exception{

    public PerguntaNaoExisteException(String msg){
        super(msg);
    }
}