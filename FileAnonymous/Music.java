import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Music {
    public static void main(String[] args){
        String filePath = "C:\\Users\\HP\\Downloads\\Jetski - Telecasted.wav";

        File file = new File(filePath);

        try(AudioInputStream audiostream = AudioSytem.getAudioInputStream(file)){
                Clip clip = AudioSytem.getClip();
                clip.open(audiostream);
                clip.start();

        }
        
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio File not supported");
                   }

        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resources");
        }

        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
    
}
