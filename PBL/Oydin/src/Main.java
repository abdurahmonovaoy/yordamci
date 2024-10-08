import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    BemorStore bemorStore = new BemorStore();
    Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("------------------------------" +
                    "\nBo'limlarmi tanlang: ");
            System.out.println("1 - Yangi Bemor qo'shish");
            System.out.println("2 - Bemorlar ro'yxatini ko'rish");
            System.out.println("0 - Chiqish" +
                    "\n------------------------------");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Bemornni pasportini kiriting: ");
                    String Pasport = scanner.nextLine();
                    System.out.println("Bemor ismi: ");
                    String ism = scanner.nextLine();
                    System.out.println("Bemor familyasi: ");
                    String familyasi = scanner.nextLine();
                    System.out.println("Bemor tashhis: ");
                    String tashxis = scanner.nextLine();
                    System.out.println("Bemor manzili: ");
                    String manzil = scanner.nextLine();
                    System.out.println("Bemor yosh: ");
                    Integer yosh = scanner.nextInt();
                    System.out.println("Bemor telefon raqami:");
                    Integer telefon = scanner.nextInt();
                    bemorStore.addBemor(Pasport,ism,familyasi,tashxis,manzil,yosh,telefon);
                    break;
                case 2:
                    bemorStore.displayBemors();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Dastur tugatildi!");
                    break;
                default:
                    System.out.println("Noto'g'ri tanlov!" + "\nIltimos, qaytadan kiriting?");
            }
        }
        


        Bemors b = new Bemors(".idea/Bemorlar.txt");

        b.NewBemor("AD1565183", "Oydinoy", "Abdurahmonova", "Tashhis", "Manzil",20, 971780973);
        b.Save();
        b.PrintAll();
        scanner.close();
    }
}