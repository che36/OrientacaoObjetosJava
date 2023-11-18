package desafios;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    //atributos
    private String nome;
    private List<String> bucho = new ArrayList<>();

    //métodos
    public void comer(String comida) {
        if (bucho.size() == 3) {
            System.out.println("Bucho Cheio!");
        } else {
            bucho.add(comida);
        }
        System.out.println(bucho);
    }

    public void digerir() {
        if (bucho.isEmpty()) {
            System.out.println("Bucho Vazio!");

        } else {
            bucho.remove(0);
        }
        System.out.println(bucho);
    }
}
