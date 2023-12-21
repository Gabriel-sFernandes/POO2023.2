package br.ufpb.dcx.gabreeel.quiz;

import java.util.List;

public interface SistemaQuiz {
    public void cadastraPergunta(Pergunta p);
    public Pergunta sorteiaPergunta() throws PerguntaNaoExisteException;
}
