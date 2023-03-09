
import br.com.nunes.pdi_disciplina.util.ApresentarImagem;
import br.com.nunes.pdi_disciplina.util.ConstrutorBufferedImage;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class MainAlemanha {
    public static void main(String[] args) {
        // cria a bandeira
        Color[][] img = new Color[600][600];
        
        // cria as listras da bandeira
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
               // listra superior em preto
               if (j<200){
                   img[i][j]=Color.black;
               }
               // listra do meio em vermelho
               else if ( j<400)
                   img[i][j]=Color.red;
               // listra inferior em amarelo
               else{
                   img[i][j]= new Color(255, 206, 0);
               }
            }
        }
        BufferedImage imagem = new ConstrutorBufferedImage().construirBufferedImage(img);
        new ApresentarImagem().mostrarImagem(imagem);
    }

}
