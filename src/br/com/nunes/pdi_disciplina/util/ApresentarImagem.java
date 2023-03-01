package br.com.nunes.pdi_disciplina.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ApresentarImagem {
     public void salvarImagem(BufferedImage imagem) {
        File outputfile = new File(
                "image-"+System.currentTimeMillis()+".jpg");
        try {
            ImageIO.write(imagem, "jpg", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(ConstrutorBufferedImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public void mostrarImagem(BufferedImage imagem) {
        JFrame jf = new JFrame("Disciplina PDI - Imagem");
        JLabel labelImagem = new JLabel(new ImageIcon(imagem));
        jf.add(labelImagem);
        labelImagem.setBounds(0, 0, imagem.getWidth(), imagem.getHeight());
        jf.setVisible(true);
        jf.setSize(imagem.getWidth()+100, imagem.getHeight()+100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
