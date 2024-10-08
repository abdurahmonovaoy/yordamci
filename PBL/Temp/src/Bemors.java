import java.io.*;
import java.util.ArrayList;

public class Bemors {
    String fn;
    private ArrayList<Bemor> bemors = new ArrayList<>();

    public Bemors(String fn) {
        try {
            FileReader f = new FileReader(fn);
            BufferedReader br = new BufferedReader(f);
            String s;
            while ((s = br.readLine()) != null) {
                var q = s.split(";");
                bemors.add(new Bemor(q[0], q[1], q[2], q[3], q[4], Integer.parseInt(q[5]),Integer.parseInt(q[6])));
            }
            f.close();
            this.fn = fn;
        } catch (FileNotFoundException e) {
            System.out.println("Fayl topilmadi!");
        } catch (IOException e) {
            System.out.println("Fayldan o'qishda xato!");
            e.printStackTrace();
        }
    }

    public ArrayList<Bemor> Familiyadan_qidirish(String s) {
        ArrayList<Bemor> result = new ArrayList<>();
        for (Bemor m : bemors) {
            if (m.familiya.toLowerCase().contains(s.toLowerCase())) {
                result.add(new Bemor( m.Pasport,m.ism,m.familiya,  m.tashxis, m.manzil,m.yosh, m.telefon));
            }
        }
        return result;
    }

    public void Mijoz_ozgartirish(int index, String np, String ni, String nf, String nt, String nm,Integer ny,Integer nw) {
        bemors.get(index).Pasport = np;
        bemors.get(index).ism = ni;
        bemors.get(index).familiya = nf;
        bemors.get(index).tashxis = nt;
        bemors.get(index).manzil = nm;
        bemors.get(index).yosh = ny;
        bemors.get(index).telefon = nw;
    }

    public void NewBemor(String np, String ni, String nf, String nt, String nm,Integer ny,Integer nw) {
        Bemor new_bemor = new Bemor(np, ni, nf, nt, nm,ny,nw);
        bemors.add(new_bemor);
    }

    public void Save() {
        try {
            FileWriter f = new FileWriter(fn);
            for (Bemor m : bemors) {
                f.write(m.Pasport + ";" + m.ism + ";" + m.familiya + ";" + m.tashxis + ";" + m.manzil + ";"+m.yosh + ";" + m.telefon);
                f.write(System.lineSeparator());
            }
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void PrintAll() {
        System.out.println("Mijozlar soni: " + bemors.size());
        for (Bemor m : bemors) {
            System.out.println("=====================");
            System.out.println(m);
            System.out.println("Fam = " + m.familiya);
            System.out.println("Ism = " + m.ism);
            System.out.println("Tashxis = " + m.tashxis);
            System.out.println("Pasport = " + m.Pasport);
            System.out.println("Tel = " + m.telefon);
        }
    }

}