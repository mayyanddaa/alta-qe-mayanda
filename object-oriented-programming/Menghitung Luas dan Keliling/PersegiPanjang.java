public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int keliling(){
        int keliling = 2 * panjang + 2 * lebar;
        System.out.println("Persegi Panjang : " + keliling);
        return keliling;
    }

    public int luas(){
        int luas = panjang * lebar;
        System.out.println("Persegi Panjang : " + luas);
        return luas;
    }
}
