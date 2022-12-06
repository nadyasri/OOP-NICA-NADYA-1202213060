public class Transportasiair {
    protected int jumlahKursi,biaya;

    public Transportasiair (int jumlahKursi,int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    public void informasi (){
        System.out.println("Transportasi air jenis tidak diketahui dengan kuris berjumlah" +jumlahKursi+"ditetapkan dengan biaya sebesar"+biaya+);
    }
    public void berlayar(){
        System.out.println("Transportasi air jenis tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.println("Transportasi air jenis tidak diketahui berlabuh dipantai");
    }
}
