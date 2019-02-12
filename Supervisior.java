public class Supervisior extends Pegawai{
    private int tarif;
    private int hasil;

    public Supervisior(){
        this.tarifGaji(30);
        System.out.println("Gaji supervisior");

    }
    public void tarifGaji(int tarif){
        hasil= tarif * 30;
        System.out.println(hasil);
    }

}
