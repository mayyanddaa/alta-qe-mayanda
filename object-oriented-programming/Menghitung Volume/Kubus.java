public class Kubus {
    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public int volume(){
        int volume = sisi * sisi * sisi;
        System.out.println("Kubus : " + volume);
        return volume;
    }
}
