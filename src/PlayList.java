import java.util.ArrayList;

public class PlayList {
    // class to create a dessert island play list
    ArrayList<String> playlist = new ArrayList<String>();

    // Constructor
    public PlayList() {

    }

    public ArrayList getPlayList() {
        /** returns all items in playlist */
        return playlist;
    }

    public void addToPlaylist(String[] list) {
        /** adds list of songs to playlist */
        for (String song : list) {
            playlist.add(song);
            System.out.println(song + " was added to playlist");
        }
    }

    public int getPlaylistSize() {
        /** retyrns size of playlist */
        return playlist.size();
    }

    public void removeFromPlaylist(String songToRemove) {
        /** removes song from playlist if it is currently a value in the playlist*/
        if (playlist.contains(songToRemove)) {
            playlist.remove(songToRemove);
            System.out.println(songToRemove + " has been removed from playlist");
        } else {
            System.out.println(songToRemove + " is not in this playlist");
        }
    }

    public void updatePlaylist(String songToUpdate, String replacementSong) {
        /** updates song by searching for the index of a song then sets it to a new value */
        if (playlist.contains(songToUpdate)) {
            playlist.set(playlist.indexOf(songToUpdate), replacementSong);
            System.out.println(songToUpdate + " has been replaced by " + replacementSong + " in the playlist");
        } else {
            System.out.println( songToUpdate + " does not exist in this playlist");
        }
    }



    public static void main(String[] args) {
//


        // Testing functionality
        String[] songsList = { "Cochise", "Jeremy", "Freedom", "Soulbound", "Greatest Show on Earth", "Holy War", "Rainbow in the Dark"};

        PlayList desertIslandPlaylist = new PlayList();
        System.out.println(desertIslandPlaylist.getPlayList());
        desertIslandPlaylist.addToPlaylist(songsList);
        System.out.println(desertIslandPlaylist.getPlayList());
        String[] new_songs = {"Devil and I", "Abyss"};
        desertIslandPlaylist.addToPlaylist(new_songs);
        System.out.println(desertIslandPlaylist.getPlayList());
        System.out.println(desertIslandPlaylist.getPlaylistSize());
        desertIslandPlaylist.removeFromPlaylist("Song 2");
        desertIslandPlaylist.removeFromPlaylist("Jeremy");
        desertIslandPlaylist.updatePlaylist("Soulbound", "Dice");
        desertIslandPlaylist.updatePlaylist("Song 2", "Evenflow");
        System.out.println(desertIslandPlaylist.getPlayList());

    }
}
