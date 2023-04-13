
import br.com.nunes.pdi_disciplina.util.ApresentarImagem;
import br.com.nunes.pdi_disciplina.util.ConstrutorBufferedImage;
import br.com.nunes.pdi_disciplina.util.EscalaCinza;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class MainEscalaCinzaMediaPonderada {

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
        Color [][] cinza = e.converterEscalaCinzaMediaPonderada(img);
        
        
        BufferedImage imagem = new ConstrutorBufferedImage().construirBufferedImage(img);
        new ApresentarImagem().mostrarImagem(imagem);
        BufferedImage imagemCinza = new ConstrutorBufferedImage().construirBufferedImage(cinza);
        new ApresentarImagem().mostrarImagem(imagemCinza);
    }

}
