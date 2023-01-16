public class Main {
    public static void main(String[] args) {

        HavaDurumuHaberi haber = new HavaDurumuHaberi();
        Musteri musteri1 = new Ajans();
        haber.add(musteri1);

        Musteri musteri2 = new Muhabir();
        haber.add(musteri2);

        haber.bildir();


    }
}