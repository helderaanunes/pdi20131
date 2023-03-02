
import br.com.nunes.pdi_disciplina.util.ApresentarImagem;
import br.com.nunes.pdi_disciplina.util.ConstrutorBufferedImage;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class MainQuadro {
    public static void main(String[] args) {
        Color[][] img = new Color[600][600];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                   img[i][j]= Color.white;
            }
        }
        for(int j =0;j<img[0].length;j++)
        {
            img[0][j]=Color.BLACK;
        }
        for (int i = 0; i<img.length;i++)
        {
            img [i][0]=Color.BLACK;
        }
        for (int i = 0; i<img.length;i++)
        {
            img [i][img[0].length-1]=Color.BLACK;
        }
        for (int j = 0; j<img.length;j++)
        {
            img [img.length-1][j]=Color.BLACK;
        }
        BufferedImage imagem = new ConstrutorBufferedImage().construirBufferedImage(img);
        new ApresentarImagem().mostrarImagem(imagem);
    }

}
