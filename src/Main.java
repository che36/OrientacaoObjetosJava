import desafios.funcionarios.Consultor;
import desafios.funcionarios.Vendedor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //NumeroReverso.numeroReveso();
        //Macaco macaco1 = new Macaco();

        //macaco1.comer("banana");
        //macaco1.comer("uva");
        //macaco1.comer("morango");


        //macaco1.digerir();
        //macaco1.digerir();
        //macaco1.digerir();
        //macaco1.digerir();

        Vendedor vendedor = new Vendedor("Cesar Vendedor", 123456l, 14d, 45l);
        System.out.println(vendedor.getSALARIO_MININO());
        System.out.println(vendedor.getNome());
        Consultor consultor = new Consultor("Consultor", 123456l, 45d, 84);
        System.out.println(consultor.getSALARIO_MININO());
        System.out.println(consultor.getNome());

    }

}