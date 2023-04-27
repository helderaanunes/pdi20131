
import br.com.nunes.pdi_disciplina.util.ApresentarImagem;
import br.com.nunes.pdi_disciplina.util.ConstrutorBufferedImage;
import br.com.nunes.pdi_disciplina.util.EscalaCinza;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class MainEscalaCinzaNiveis {

    public static void main(String[] args) {
        // cria a imagem da árvore com uma matriz de cores
        Color[][] img = new Color[600][600];
        //pintando tudo de branco
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                img[i][j] = Color.white;
            }
        }
        //pintando o gramado
        for (int i = 0; i < img.length; i++) {
            for (int j = 400; j < img[0].length; j++) {
                img[i][j] = Color.GREEN;
            }
        }
        //pintando o tronco da árvore
        for (int i = 250; i < 350; i++) {
            for (int j = 200; j < 500; j++) {
                img[i][j] = new Color(185, 122, 87);
            }
        }

        //pintando as folhas da árvore
        for (int i = 100; i < 500; i++) {
            for (int j = 50; j < 200; j++) {
                img[i][j] = new Color(42, 177, 80);
            }
        }
        
        EscalaCinza e = new EscalaCinza();
        Color [][] cinza = e.converterEscalaCinzaMedia(img);
        
        Color [][] cinza2Niveis = e.converterEscalaCinzaKNiveis(img,2);
        Color [][] cinza4Niveis = e.converterEscalaCinzaKNiveis(img,4);
        Color [][] cinza8Niveis = e.converterEscalaCinzaKNiveis(img,8);
        Color [][] cinza16Niveis = e.converterEscalaCinzaKNiveis(img,16);
        Color [][] cinza32Niveis = e.converterEscalaCinzaKNiveis(img,32);
        Color [][] cinza64Niveis = e.converterEscalaCinzaKNiveis(img,64);
        Color [][] cinza128Niveis = e.converterEscalaCinzaKNiveis(img,128);
        
         new ApresentarImagem().mostrarImagem(new ConstrutorBufferedImage().construirBufferedImage(cinza2Niveis));
         new ApresentarImagem().mostrarImagem(new ConstrutorBufferedImage().construirBufferedImage(cinza4Niveis));
         new ApresentarImagem().mostrarImagem(new ConstrutorBufferedImage().construirBufferedImage(cinza8Niveis));
         new ApresentarImagem().mostrarImagem(new ConstrutorBufferedImage().construirBufferedImage(cinza16Niveis));
         new ApresentarImagem().mostrarImagem(new ConstrutorBufferedImage().construirBufferedImage(cinza32Niveis));
         new ApresentarImagem().mostrarImagem(new ConstrutorBufferedImage().construirBufferedImage(cinza64Niveis));
         new ApresentarImagem().mostrarImagem(new ConstrutorBufferedImage().construirBufferedImage(cinza128Niveis));
//        BufferedImage imagem2Niveis = new ConstrutorBufferedImage().construirBufferedImage(cinza2Niveis);
//        new ApresentarImagem().mostrarImagem(imagem2Niveis);
//        BufferedImage imagem4Niveis = new ConstrutorBufferedImage().construirBufferedImage(cinza4Niveis);
//        new ApresentarImagem().mostrarImagem(imagem4Niveis);
//        BufferedImage imagemCinza = new ConstrutorBufferedImage().construirBufferedImage(cinza);
//        new ApresentarImagem().mostrarImagem(imagemCinza);
    }

}
