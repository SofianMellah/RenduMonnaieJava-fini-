package com.afpa.www.main;

import com.afpa.www.bean.RenduMonnaie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int prixArticle = 0;
        System.out.println("Le prix de l'article est de : ");
        prixArticle = sc.nextInt();

        int sommeDonnerParLeClient = 0;
        System.out.println("La somme que le client à donner est de : ");
        sommeDonnerParLeClient = sc.nextInt();

        RenduMonnaie maVar = new RenduMonnaie(prixArticle, sommeDonnerParLeClient);
        maVar.calcule();

    }
}