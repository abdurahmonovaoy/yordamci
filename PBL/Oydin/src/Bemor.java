import javax.management.MBeanNotificationInfo;
import java.util.ArrayList;
import java.util.List;

public class Bemor {
     String Pasport;
     String ism;
     String familiya;
    String tashxis;
    String manzil;
     int yosh;
     int telefon;
public Bemor(String Pasport,String ism,String familiya,String tashxis,String manzil,Integer yosh,Integer telefon){
    this.Pasport = Pasport;
    this.ism = ism;
    this.familiya = familiya;
    this.manzil = manzil;
    this.yosh = yosh;
    this.tashxis = tashxis;
    this.telefon = telefon;
}

    public String getPasport() {
        return Pasport;
    }

    public String getIsm() {
        return ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public String getManzil() {
        return manzil;
    }

    public Integer getYosh() {
        return yosh;
    }

    public String getTashxis() {
        return tashxis;
    }

    public Integer getTelefon() {
        return telefon;
    }
}
