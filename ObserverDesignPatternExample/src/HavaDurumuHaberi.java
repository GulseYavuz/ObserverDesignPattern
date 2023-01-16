import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HavaDurumuHaberi {

    //observer sınıfımız

    private List<Musteri> musteriler = new ArrayList<>();

    public void add(Musteri musteri){
        musteriler.add(musteri);
    }

    public void bildir(){
        String info = " ";
        int number = new Random().nextInt(3) +1;
        switch (number){
            case 1:
                info = "ılık";
                break;
            case 2:
                info =" soğuk";
                break;
            case 3:
                info = "sıcak";
                break;
            default: info = "böyle bi değer yok";

        }
        for (Musteri musteri : musteriler){
            musteri.havaDurumunuHaberVer(info);
        }

    }
}
