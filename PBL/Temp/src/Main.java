import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Bemors b = new Bemors(".idea/Bemorlar.txt");

        b.NewBemor("AD4565368", "Oydinoy", "Abdurahmonova", "Kasal", "Andijon",20 , 974562811);
        b.Save();
        b.PrintAll();
    }
}