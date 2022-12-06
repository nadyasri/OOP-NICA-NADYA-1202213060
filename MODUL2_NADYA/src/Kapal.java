public class Kapal extends Transportasiair {
    protected String mesin;

    public Kapal (int jumlahKursi,int biaya,String mesin){
         super(jumlahKursi, biaya);
         this.mesin = mesin;
    }
}

public void informasi (){
    System.out.println("Trasportasi air jenis kapal dengan kursi berjumlah "+ jumlahKursi+ "ditetapkan dengan biata sebesar" + biaya);
}
public void berlayar (){
    System.out.println("Transportasi air jenis kapal sedang berlayar menggunakan mesin" +mesin+ "dengan kecepatan yang tidak stabil");

}
public void berlayar (int kecepatan){
    System.out.println("Transportasi air jeni Kapal sedang berlayar mengunakan mesin"+mesin+"dengan keceptanan stabil di kisaran 20 knot");
}
public void berlabuh (){
    System.out.println("Transportasi air jenis kapal berlabuh");
}

