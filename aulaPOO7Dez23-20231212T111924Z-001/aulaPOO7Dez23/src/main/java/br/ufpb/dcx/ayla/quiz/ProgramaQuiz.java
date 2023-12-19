package br.ufpb.dcx.ayla.quiz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProgramaQuiz {

    public static void main(String [] args){
        List<PerguntaME> perguntas = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while(continuar){
            System.out.println("Digite uma opção:\n1.Cadastrar pergunta\n2.Responder quiz\n3.Sair");
            String opcao = sc.nextLine();
            if (opcao.equals("1")){
                PerguntaME pergunta = new PerguntaME();
                System.out.println("Digite o enunciado da pergunta");
                pergunta.setEnunciado(sc.nextLine());
                System.out.println("Quantas alternativas tem essa pergunta?");
                int quantAlt = Integer.parseInt(sc.nextLine());
                String [] alternativas = new String[quantAlt];
                for (int i=0; i<quantAlt; i++){
                    System.out.println("Digite a próxima alternativa");
                    alternativas[i] = sc.nextLine();
                }
                pergunta.setAlternativas(alternativas);
                System.out.println("Digite a resposta correta");
                pergunta.setRespostaCorreta(sc.nextLine());
                perguntas.add(pergunta);
                System.out.println("Pergunta cadastrada com sucesso");
            } else if (opcao.equals("2")){
                if (perguntas.size()==0){
                    System.out.println("Nenhuma pergunta foi cadastrada");
                    //TODO: FAZER
                }
            } else if (opcao.equals("3")){
                continuar = false;
            }
        }

        sc.close();
    }
}
