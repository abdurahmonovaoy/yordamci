import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Bemors b = new Bemors(".idea/Bemorlar.txt");

        b.NewBemor("AD434568", "oy", "Abdurahmonova", "kasal", "kasal",20, "392520010");
        b.Save();
        b.PrintAll();
    }
}