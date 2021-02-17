
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.advanced.AdvancedPlayer;

/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private AdvancedPlayer player;
    
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {
        player = null;
    }
    
    /**
     * Play a part of the given file.
     * The method returns once it has finished playing.
     * @param filename The file to be played.
     */
    public void playSample(String filename)
    {
        try {
            setupPlayer(filename);
            player.play(500);
        }
        catch(JavaLayerException e) {
            reportProblem(filename);
        }
        finally {
            killPlayer();
        }
    }
    
    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param filename The file to be played.
     */
    public void startPlaying(final String filename)
    {
        try {
            setupPlayer(filename);