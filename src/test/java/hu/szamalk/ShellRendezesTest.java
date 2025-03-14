package hu.szamalk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShellShellRendezesTest {

    public boolean eldontesTetel(int[] lista) {
        int i = 0;
        while (i < lista.length - 1) {
            if (lista[i] > lista[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Test
    void testShellRendezes() {
        int[] lista = {5, 3, 8, 4, 2};
        ShellRendezes sr = new ShellRendezes(lista);
        sr.rendez();

        assertTrue(eldontesTetel(lista));
    }

    @Test
    void testShellRendezesUresTomb() {
        int[] lista = {};
        ShellRendezes sr = new ShellRendezes(lista);
        sr.rendez();

        assertTrue(eldontesTetel(lista));
    }
}