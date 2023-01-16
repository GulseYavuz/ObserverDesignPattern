public class Muhabir implements Musteri {
    private int musteriId;

    @Override
    public int getId() {
        return 2;
    }

    @Override
    public void havaDurumunuHaberVer(String info) {
        System.out.println("Muhabir haberi: " + info);
    }

}
