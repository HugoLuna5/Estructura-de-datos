/**
 * Materia: Estructura de Datos
 * Nombre: Manuel Hernandez Hernandez
 * Feha:  05-10-2018
 * Laboratorio No: 1
 * Titulo: Convercion imagen RGB a Escala de grises
 * Grupo: Sistemas Tercero A
 * Descripcion General de La Clase: el Programa le permite elegir una imagen a color, 
 * para luego extraer y visualizar cada uno de sus componentes R, G y B, así también convertirlo 
 * y visualizarlo en escala de grises.
 * Equipo 4
*/
package Lab01PR05;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author HugoLuna
 */
public class Utils {

    public static File filesSelector() {
        File file = null;
        try {

            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            jfc.setMultiSelectionEnabled(true);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes", "png", "jpg", "jpge");
            jfc.setFileFilter(filter);

            jfc.setDialogTitle("Selecciona un archivo");
            int returnValue = jfc.showOpenDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {

                file = jfc.getSelectedFile();

            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return file;

    }

    public String pathSelector() {

        String selectedPath = "";
        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        //chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setDialogTitle("Selecciona la ubicacion de tu archivo");
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        int returnValue = chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {

             File file = chooser.getSelectedFile();
            
            selectedPath = file.getAbsolutePath();
        }

        return selectedPath;
    }

    public static int width(File file) throws IOException {

        BufferedImage bimg = ImageIO.read(file);
        int width = bimg.getWidth();

        return width;

    }

    public static int height(File file) throws IOException {

        BufferedImage bimg = ImageIO.read(file);
        int height = bimg.getHeight();

        return height;

    }

    public static int[][] getRGB(int w, int h, File file) throws IOException {

        BufferedImage image = ImageIO.read(file);
        int total_pixels = (h * w);
        Color[] colors = new Color[total_pixels];
        int i = 0;

        int matrizRGB[][] = new int[w][h];
        for (int x = 0; x < w; x++) {
            for (int y = 0; y < h; y++) {
                colors[i] = new Color(image.getRGB(x, y));
                i++;
            }
        }

        // Later you can retrieve them
        for (int j = 0; j < total_pixels; j++) {
            Color c = colors[j];
            int r = c.getRed();
            int g = c.getGreen();
            int b = c.getBlue();
            System.out.println("Red" + r + "Green" + g + "Blue" + b);
        }
        return matrizRGB;
    }

    public static String downloadFile(String urlFile, BufferedImage image) throws IOException {

        String fileUrl = urlFile + "/image_greyscale.jpg";
        ImageIO.write(image, "jpg", new File(fileUrl));

        return "image_greyscale.jpg";
    }
}
