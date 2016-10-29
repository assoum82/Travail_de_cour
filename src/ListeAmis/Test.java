package ListeAmis;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.print("le nbr d'amis est : " );
        int nbr= clavier.nextInt();
        Ami p=new  Ami();
        p.listeamis(nbr);
        ArrayList<Ami> tab2=new ArrayList<Ami>();
        tab2=p.maListe();
        p.afficherListAmis(tab2);

    }
}
//
