package br.ufpb.dcx.ayla.quiz;

import java.util.List;

public interface SistemaQuiz {
    public void cadastraPergunta(Pergunta p);
    public Pergunta sorteiaPergunta();
}
