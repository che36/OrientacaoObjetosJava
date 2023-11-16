package desafios;

import java.util.Scanner;

public class NumeroReverso {
    public static void numeroReveso() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Informe um valor inteiro e positivo (este numero deverá conter 4 dígitos):");
            int numeroInformado = scan.nextInt();
            String numeroInformadoString = String.valueOf(numeroInformado);
            if (numeroInformado >= 1000 && numeroInformado <= 9999) {
                StringBuilder stringBuilder = new StringBuilder(numeroInformadoString);
                System.out.println();
            }
        } while (true);
    }
}

