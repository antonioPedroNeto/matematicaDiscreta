package pixel;


	import java.awt.Color;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;

	import javax.imageio.ImageIO;
	import javax.swing.JFileChooser;

	public class ColocaPixel {
		
		public static void main(String[] args) throws IOException {
			// Abre a tela para escolher a imagem do disco
			JFileChooser fc = new JFileChooser();
			if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION){ // abre um menu para escolher qual imagem vai ser utilizada
				
			}
	    	// L� a imagem
			BufferedImage img = ImageIO.read(fc.getSelectedFile());
			img.setRGB(0, 0, Color.black.getRGB());//troca a cor do pixel (0,0)
			img.setRGB(0, 1, Color.yellow.getRGB());//troca a cor do pixel (0,1)
		
		ImageIO.write(img, "png", new File("output.png"));
		}//fecha main
}//fecha class