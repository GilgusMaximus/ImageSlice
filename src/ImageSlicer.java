import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.imageio.ImageIO;

public class ImageSlicer {

   public static void main(String[] args){
      //args = bild path, image größe, output path
      if(args.length != 3) {
         System.err.println("Argument failure! 3 arguments needed - " + args.length + " arguments provided");
         System.exit(-1);
      }
      int size = Integer.parseInt(args[1]);
      int numberOfSlices = size/126;
      //lade das Bild
      File imageFile = new File(args[0]);
      BufferedImage original = null, sliced = new BufferedImage(126, 126, BufferedImage.TYPE_INT_RGB);
      try {
         original = ImageIO.read(imageFile);
      }catch(IOException e){
         System.err.println("IOException while reading bytes: " + e);
         System.err.println("Exiting system");
         System.exit(-1);
      }
      int imageNumber = 0;
      System.out.println(original.getWidth());
      for(int i = 0; i < numberOfSlices; i++) {
         for(int l = 0; l < numberOfSlices; l++) {
            for (int j = 0; j < 126; j++) {
               for (int k = 0; k < 126; k++) {
                  //l*126 is the offset on the x axis (next column), i*126 is the axis on the y axis (next row)
                  sliced.setRGB(k, j, original.getRGB(k + l * 126, j + i * 126));
               }
            }
            try {
               ImageIO.write(sliced, "png", new File(args[2] + "/slice" + imageNumber + ".png"));
            } catch (IOException e) {
               System.err.println("IOException while writing BufferedImage to file:" + e);
               System.err.println("Exiting System");
            }
            imageNumber++;
         }
      }

   }
}
