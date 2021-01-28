
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
    