package br.ufpb.dcx.gabreeel.quiz;

import java.util.LinkedList;
import java.util.List;

public class SistemaQuizGabreeel implements SistemaQuiz{

    private List<Pergunta> perguntas;

    public SistemaQuizGabreeel(){
        this.perguntas = new LinkedList<>();
    }

    public SistemaQuizGabreeel(List<Pergunta> perguntas){
        this.perguntas = perguntas;
    }
    @Override
    public void cadastraPergunta(Pergunta p) {
        this.perguntas.add(p);
    }

    @Override
    public Pergunta sorteiaPergunta() throws  PerguntaNaoExisteException {
        if (this.perguntas.isEmpty()) {
            throw new PerguntaNaoExisteException("Não existe pergunta cadastrada");
        } else {
            //TODO: Depois melhorar usado random
            return this.perguntas.get(0);
        }
    }

    public List<Pergunta> getTodasAsPerguntas(){
        return this.perguntas;
    }
}
