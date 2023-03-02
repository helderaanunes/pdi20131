
import br.com.nunes.pdi_disciplina.util.ApresentarImagem;
import br.com.nunes.pdi_disciplina.util.ConstrutorBufferedImage;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class MainSuecia {
    public static void main(String[] args) {
        Color[][] img = new Color[900][600];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                   
                   
                   if ((i>230 && i<370) || (j>230 && j<370))
                   {
                       img[i][j]= new Color(255, 223, 0);
                   }
                   else{
                       img[i][j]= new Color(1, 101, 170);
                   }
                   
            }
        }
        BufferedImage imagem = new ConstrutorBufferedImage().construirBufferedImage(img);
        new ApresentarImagem().mostrarImagem(imagem);
    }

}
