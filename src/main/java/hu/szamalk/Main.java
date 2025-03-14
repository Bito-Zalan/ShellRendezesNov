package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        int[] lista = {12, 34, 54, 2, 3};
        ShellRendezes sr = new ShellRendezes(lista);
        System.out.println("Rendezés előtt:");
        sr.kiirRendezettLista();
        sr.rendez();
        System.out.println("Rendezés után:");
        sr.kiirRendezettLista();
    }
}