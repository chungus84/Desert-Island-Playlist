import java.util.ArrayList;

public class PlayList {
    // class to create a dessert island play list
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Cochise");
        desertIslandPlaylist.add("Jeremy");
        desertIslandPlaylist.add("Freedom");
        desertIslandPlaylist.add("Soulbound");
        desertIslandPlaylist.add("Greatest Show on Earth");
        desertIslandPlaylist.add("Holy War");
        desertIslandPlaylist.add("Rainbow in the Dark");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(5);
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove("Jeremy");
        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);
    }
}
