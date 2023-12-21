package br.ufpb.dcx.gabreeel.quiz;

import java.util.Arrays;
import java.util.Objects;

public class PerguntaME {
    private String enunciado;
    private String [] alternativas;
    private String respostaCorreta;

    public PerguntaME(String enunciado, String [] alternativas,
                      String respostaCorreta){
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public PerguntaME(){
        this("",new String[]{}, "");
    }

    public String getEnunciado(){
        return this.enunciado;
    }
    public void setEnunciado(String enunciado){
        this.enunciado = enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public String toString(){
        String tmp = this.enunciado+"\n";
        for (String s: this.alternativas){
            tmp+= s+"\n";
        }
        return tmp;
    }

    public boolean estahCorretaResposta(String resposta){
        return this.respostaCorreta.equals(resposta);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PerguntaME that = (PerguntaME) o;

        if (!Objects.equals(enunciado, that.enunciado)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(alternativas, that.alternativas)) return false;
        return Objects.equals(respostaCorreta, that.respostaCorreta);
    }

    @Override
    public int hashCode() {
        int result = enunciado != null ? enunciado.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(alternativas);
        result = 31 * result + (respostaCorreta != null ? respostaCorreta.hashCode() : 0);
        return result;
    }
}
