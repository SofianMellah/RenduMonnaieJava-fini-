package com.afpa.www.bean;

public class RenduMonnaie {

    private int prixArticle;
    private int sommeDonnerParLeClient;
    private int sommeARendre;
    private int billetDix;
    private int billetCinq;
    private int pieceUn;

    public RenduMonnaie (int prixArticle, int sommeDonnerParLeClient){
        this.prixArticle = prixArticle;
        this.sommeDonnerParLeClient = sommeDonnerParLeClient;
//        this.billetDix = billetDix;
//        this.billetCinq = billetCinq;
//        this.pieceUn = pieceUn;
    }

    public int getPrixArticle() {
        return prixArticle;
    }

    public void setPrixArticle(int prixArticle) {
        this.prixArticle = prixArticle;
    }

    public int getSommeDonnerParLeClient() {
        return sommeDonnerParLeClient;
    }

    public void setSommeDonnerParLeClient(int sommeDonnerParLeClient) {
        this.sommeDonnerParLeClient = sommeDonnerParLeClient;
    }

    public void calcule(){
        sommeARendre = sommeDonnerParLeClient - prixArticle;
        System.out.println("La somme à rendre est de : " + sommeARendre + "€");

        int billetDix = 0;
        while (sommeARendre >= 10) {
            ++billetDix;
            sommeARendre = sommeARendre -10;
        }

        int billetCinq = 0;

        if (sommeARendre >= 5) {
            ++billetCinq;
            sommeARendre = sommeARendre -5;
        }

        int pieceUn = sommeARendre;

        System.out.println("Il y a : " + billetDix + " billet(s) de 10 à rendre, " + "" + billetCinq + " de 5, et " + pieceUn + " pièces de 1");
    }
}
