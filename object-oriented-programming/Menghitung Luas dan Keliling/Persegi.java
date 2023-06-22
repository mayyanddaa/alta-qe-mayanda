public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

     public int keliling(){
        int keliling = 4 * sisi;
        System.out.println("Persegi : " + keliling);
        return keliling;
    }

    public int luas(){
        int luas = sisi * sisi;
        System.out.println("Persegi : " + luas);
        return luas;
    }
}
