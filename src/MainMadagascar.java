
import br.com.nunes.pdi_disciplina.util.ApresentarImagem;
import br.com.nunes.pdi_disciplina.util.ConstrutorBufferedImage;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class MainMadagascar {

    public static void main(String[] args) {
        
        // cria a bandeira
        Color[][] img = new Color[600][400];
        
        // pinta de azul e verde 
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                if (j < 200) {
                    img[i][j] = Color.blue;
                } else {
                    img[i][j] = Color.green;
                }
                if (i < j && j < 200) {
                    img[i][j] = Color.white;
                }
            }
        }
        
        // a parte branca da bandeira
        for (int i = 200; i >= 0; i--) {
            for (int j = 200; j < img[0].length; j++) {
                if (i < j - 200 && i < 200) {
                    img[i][j] = Color.white;
                }
            }
        }
        BufferedImage imagem = new ConstrutorBufferedImage().construirBufferedImage(img);
        new ApresentarImagem().mostrarImagem(imagem);
    }

}
