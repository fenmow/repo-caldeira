
import model.Jogador;
import model.Material;

public class oldStevePOO {
    public static void main(String[] args) {

        Jogador player = new Jogador();

        player.fabricarPicareta(Material.FERRO);

        System.out.println(player.getPicareta().getMaterial());


        player.minerar(3);
        player.minerar(3);
        player.minerar(2);

        player.repararPicareta(4);

        player.minerar(10);
        player.minerar(10);
        player.minerar(10);

    }
}