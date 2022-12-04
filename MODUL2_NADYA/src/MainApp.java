public class MainApp {
    
    public static void main(String[] args) throws Exception {
        Perangkat prk = new Perangkat("Vgen", 8, 2.40);
        prk.informasi();
        System.out.println("");

        Laptop ltp = new Laptop("Samsung", 5, 5.00, true);
        ltp.informasi();
        ltp.bukaGame("Free Fire");
        ltp.kirimEmail("gasterus@gmail.com");
        ltp.kirimEmail("harusmenang@gmail.com", "logincoy@gmail.com");
        System.out.println("");

        Handphone hp = new Handphone("Lexar", 4, 1.80, false);
        hp.informasi();
        hp.telfon(628538790);
        hp.kirimSMS(628514576);
        hp.kirimSMS(628711167, 628900087);






}
}
