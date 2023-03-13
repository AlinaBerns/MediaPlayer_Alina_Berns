package be.intecbrussel;

public class MediaAdapter implements MediaPlayer{

    @Override
    public void play(String audioType, String fileName) {

    }

    protected AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayer getAdvancedMediaPlayer() {

        return advancedMediaPlayer;
    }

    public void setAdvancedMediaPlayer(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }



    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("mp4")){
            setAdvancedMediaPlayer(new Mp4Player());

        } else if (audioType.equalsIgnoreCase("vlc")) {
            setAdvancedMediaPlayer(new VlcPlayer());


        }


    }
}





