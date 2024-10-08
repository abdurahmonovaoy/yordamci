import java.util.ArrayList;
import java.util.List;

public class BemorStore {
    List<Bemor> bemors;

    public  BemorStore() {
        this.bemors = new ArrayList<>();
    }

    public void addBemor(String Pasport, String ism, String familiya,String tashxis,String manzil, Integer yosh,  String telefon) {
        Bemor bemor = new Bemor(Pasport, ism, familiya, tashxis,manzil, yosh, telefon);
        bemors.add(bemor);
        System.out.println("------------------------------" +
                "\nBemor bazaga qo'shildi: " + ism);
    }

    public void displayBemors() {
        if (bemors.isEmpty()) {
            System.out.println("Hozircha bemorlar yo'q");
        } else {
            System.out.println("------------------------------" +
                    "\nKasalxonamiz bemorlari: " +
                    "\n------------------------------");
            for (Bemor bemor : bemors) {
                System.out.println(
                        "Bemor Pasporti: " + bemor.getPasport() +
                                "\nBemor ismi: " + bemor.getIsm() +
                                "\nBemor familyasi: " + bemor.getFamiliya() +
                                "\nBemor tashxisi: " + bemor.getTashxis() +
                                "\nBemor manzili: " + bemor.getManzil() +
                                "\nBemor yoshi: " + bemor.getYosh() +
                                "\nBemor telefon raqami: " + bemor.getTelefon() +
                                "\n------------------------------"
                );
            }
        }
    }
}
