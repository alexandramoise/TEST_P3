import java.util.*;

// RAND 1

public class Main {
    // fiecare subpunct e rezolvat in cate o metoda statica.
    public static void main(String[] args) {
        // b) se creaza si afiseaza lista de carti
        List <Carte> carti = new ArrayList<>();
        creare(carti);
        System.out.println("\n --------- LISTA DE CARTI -----------");
        for(Carte c : carti)
            System.out.println(c);

        // c) sortat lista dupa nr de capitole, si daca e egal dupa titlu
        sortare(carti);
        System.out.println("\n ---------- LISTA SORTATA -----------");
        for (Carte c : carti)
            System.out.println(c);

        //d) titlul cartilor scrise de fiecare autor
        System.out.println("\n ----------- CARTI SCRISE DE FIECARE AUTOR --------");
        carti_scrise_de_fiecare_autor(carti);

        //e) cartile ce au nr de pagini intr-un anumit interval
        System.out.println("\n ------------ CARTI CE AU NR DE PAGINI IN INTERVALUL DAT --------------");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Intervalul: [ " + a + "," + b + " ]");
        for(Carte c : carti)
            nr_pagini_in_interval(c,a,b);

    }

    public static void creare(List <Carte> carti) {
        // a) se creaza obiecte de tipul claselor
        List <Sectiune> sec1 = new ArrayList<>();
        sec1.add(new Sectiune("Bine am venit pe lume",25));
        sec1.add(new Sectiune("Primii ani",50));

        List <Sectiune> sec2 = new ArrayList<>();
        sec2.add(new Sectiune("Ani de scoala...",100));
        sec2.add(new Sectiune("Ce am invatat in 12 ani de trezit la 7 dimineata?",40));
        sec2.add(new Sectiune("Recunoscator!",50));

        List <Sectiune> sec3 = new ArrayList<>();
        sec3.add(new Sectiune("Prima parte",20));
        sec3.add(new Sectiune("Continuarea",50));

        Capitol c1 = new Capitol("Inceputurile mele",sec1);
        Capitol c2 = new Capitol("Viata in roz",sec2);
        Capitol c3 = new Capitol("Ceva nou",sec3);

        List <Capitol> cap1 = new ArrayList<>();
        cap1.add(c1);
        cap1.add(c2);

        List <Capitol> cap2 = new ArrayList<>();
        cap2.add(c3);

        Carte carte1 = new Carte("39 - nr ghinionist","Ana Maria Soare",cap1);
        Carte carte2 = new Carte("13","Sorin Titel",cap2);
        Carte carte3 = new Carte("Biblioteca mea","Ana Maria Soare",cap2);

        carti.add(carte1);
        carti.add(carte2);
        carti.add(carte3);
    }

    public static void sortare(List <Carte> car) {
        Collections.sort(car,new Comparator<Carte>() {
            @Override
            public int compare(Carte o1,Carte o2) {
                if(o1.getCapitole().size() == o2.getCapitole().size())
                    return o1.getNume().compareTo(o2.getNume());
                else
                    return o1.getCapitole().size() - o2.getCapitole().size();
            }
        });
    }

    public static void carti_scrise_de_fiecare_autor(List <Carte> car) {
        Map <String,List <String>> dic = new HashMap<>();
        for (Carte c : car)
            if(dic.containsKey(c.getAutor())) {
                List <String> auxiliar = dic.get(c.getAutor());
                auxiliar.add(c.getNume());
                dic.put(c.getAutor(),auxiliar);
            }
            else {
                List <String> aux = new ArrayList<>();
                aux.add(c.getNume());
                dic.put(c.getAutor(),aux);
            }

        for(Map.Entry<String,List<String>> pereche : dic.entrySet())
            System.out.println(pereche.getKey() + "-> " + pereche.getValue());
    }

    public static void nr_pagini_in_interval(Carte c,int n,int m) {
        int total;
        Map <String,Integer> pag = new HashMap<>();
        for (Capitol cap : c.getCapitole()) {
            total = 0;
            for (Sectiune s : cap.getSectiuni())
                total += s.getNumar_pagini();
            pag.put(c.getNume(),total);
        }

        for(Map.Entry<String,Integer> per : pag.entrySet())
            if(per.getValue() >= n && per.getValue() <= m)
                System.out.println("Cartea: " + per.getKey() + " are " + per.getValue() + " pagini");
    }
}