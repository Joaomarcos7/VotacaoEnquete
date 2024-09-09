package org.serviceemail;

import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        String[] opcoes = {"Opção A", "Opção B", "Opção C"};
        EnqueteSimples enquete = new EnqueteSimples(opcoes);

        TelaResultado telaResultado = new TelaResultado();
        TelaResultadoPercentual telaResultadoPercentual = new TelaResultadoPercentual();

        enquete.addEnqueteListener(telaResultado);
        enquete.addEnqueteListener(telaResultadoPercentual);

        TelaVotacaoCtrl controller = new TelaVotacaoCtrl(enquete);

        controller.actionPerformed(new ActionEvent(new Object(), 1, "Opção A"));
        controller.actionPerformed(new ActionEvent(new Object(), 2, "Opção B"));
        controller.actionPerformed(new ActionEvent(new Object(), 3, "Opção C"));
    }
}