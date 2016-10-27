package ListeAmis;

import java.util.ArrayList;
import java.util.Scanner;

public class Ami {
    private Scanner clavier=new Scanner(System.in);
    private ArrayList<Ami> liste=new ArrayList<Ami>();
    private  int nbrAmis;
    private String nom;
    private String nationalite;

    public Ami(String nom, String nationalite) {
        this.nom = nom;
        this.nationalite = nationalite;
    }

    public Ami(Ami autre) {//constructeur de copie
        nom = autre.nom;
        nationalite = autre.nationalite;
    }

    public Ami() {

    }

    public boolean testNationnalite() {//tester si la nationalité d'ami est algérienne
        boolean b=false;
        switch (nationalite){
            case "allemand":
            case "belge":
            case "danois":
            case "espagnol":
            case "français":
            case "grec":
            case "russe":
            case "turc":
            case "marocain":
            case"tunisien":
                b=true;
                break;
            case"algérien":
                b=!nationalite.equals("algérien");
        }
        return b;
    }

    public void ajouter(int i, Ami p){
        liste.add(p);
    }

    public void  listeamis(int nbramis){// une liste pour tout les amis
        for(int i=0;i<nbramis;i++){
            System.out.print("entre le nom d'un ami svp : ");
            String h = clavier.nextLine();
            System.out.print("entre sa nationalité : ");
            String m = clavier.nextLine();
            Ami l=new Ami(h,m);
            ajouter(i,l);
        }
    }

    public  ArrayList<Ami>  maListe(){ // une liste pour tout les amis sauf les algériens
        ArrayList<Ami> tab2=new ArrayList<Ami>();
        for (int i =0; i < liste.size(); i++){
            if (liste.get(i).testNationnalite()){
                tab2.add(new Ami(liste.get(i)));
            }
        }
        return tab2;
    }

    public String toString(){
        return "le nom d'ami est : " + nom + "," + "sa nationnalité " + nationalite;
    }

    public   void afficherListAmis( ArrayList<Ami> liste2) {//afficher la liste des amis
        for (int i = 0; i < liste2.size(); i++) {
            System.out.println((i + 1) + ")" + liste2.get(i).toString());
        }
    }


}

