public class Bemor {
    private final String pasport;
    String Pasport;
     String ism;
     String familiya;
    String tashxis;
    String manzil;
     int yosh;
     String telefon;

    public Bemor(String pasport, String ism, String familiya, String tashxis, String manzil, int yosh, String telefon) {
        this.pasport = pasport;
        this.ism = ism;
        this.familiya = familiya;
        this.tashxis = tashxis;
        this.manzil = manzil;
        this.yosh = Integer.parseInt(String.valueOf(yosh));
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

    public String getTelefon() {
        return telefon;
    }

    @Override
    public String toString() {
        return "Bemor{" +
                "Pasport='" + Pasport + '\'' +
                ", ism='" + ism + '\'' +
                ", familiya='" + familiya + '\'' +
                ", tashxis='" + tashxis + '\'' +
                ", manzil='" + manzil + '\'' +
                ", yosh=" + yosh +
                ", telefon=" + telefon +
                '}';
    }
}
