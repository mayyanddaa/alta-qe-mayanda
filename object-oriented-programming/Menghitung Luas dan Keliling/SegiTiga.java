public class SegiTiga {
    int alas;
    int tinggi;

    public SegiTiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int keliling(){
        int keliling = alas * tinggi;
        System.out.println("Segitiga : " + keliling);
        return keliling;
    }

    public int luas(){
        int luas = alas * tinggi / 2;
        System.out.println("Segitiga : " + luas);
        return luas;
    }
}
