package be.intecbrussel;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {

        mediaAdapter = new MediaAdapter(audioType);

        if (mediaAdapter.getAdvancedMediaPlayer() instanceof Mp4Player) {
            mediaAdapter.getAdvancedMediaPlayer().playMp4(fileName);

        } else if ((mediaAdapter.getAdvancedMediaPlayer() instanceof VlcPlayer)) {
            mediaAdapter.getAdvancedMediaPlayer().playVlc(fileName);

        } else if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing " + audioType + "." + " Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }

    protected MediaAdapter mediaAdapter;
}
