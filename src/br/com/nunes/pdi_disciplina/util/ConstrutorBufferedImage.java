package br.com.nunes.pdi_disciplina.util;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class ConstrutorBufferedImage {

    public BufferedImage construirBufferedImage(Color[][] matrizPixel) {
        BufferedImage imagem = new BufferedImage(matrizPixel.length,
                matrizPixel[0].length,
                BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < matrizPixel.length; i++) {
            for (int j = 0; j < matrizPixel[0].length; j++) {
                imagem.setRGB(i, j, getRGBInt(matrizPixel[i][j].getRed(),
                        matrizPixel[i][j].getGreen(),
                        matrizPixel[i][j].getBlue()));
            }
        }
        return imagem;
    }

    private int getRGBInt(int r, int g, int b) {
        return ((r << 16) | (g << 8) | b);
    }

    public BufferedImage construirBufferedImage(String enderecoImagem) {
        ImageIcon imagemImageIcon = new ImageIcon(enderecoImagem);
        final Image tmpImagem = imagemImageIcon.getImage();
        final BufferedImage imagem = new BufferedImage(
                imagemImageIcon.getIconWidth(),
                imagemImageIcon.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);
        imagem.getGraphics().drawImage(tmpImagem, 0, 0, null);
        tmpImagem.flush();
        return imagem;
    }

    public Color [][] imagemBufferedImageParaMatrizColor (BufferedImage imagem){
        Color [] [] matrizColor = new Color[imagem.getWidth()][imagem.getHeight()];
        for (int i = 0; i < matrizColor.length; i++) {
            for (int j = 0; j < matrizColor[0].length; j++) {
                matrizColor[i][j]=new Color(imagem.getRGB(i, j));
            }
        }
        return matrizColor;
    }
}
