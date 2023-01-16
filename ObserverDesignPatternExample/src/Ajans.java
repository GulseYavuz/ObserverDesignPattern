public class Ajans implements Musteri {
    private int musteriId;

    @Override
    public int getId() {
        return 1;
    }

    @Override
    public void havaDurumunuHaberVer(String info) {
        System.out.println("ajans haberi: " + info);
    }
}
