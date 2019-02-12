public class Staff extends Pegawai {
    private int tarif;
    private int hasil;

    public Staff(){
        this.tarifGaji(30);
        System.out.println("gaji Staff ");
    }


    public void tarifgaji(int tarif){
        hasil= tarif*30;
    }

}
