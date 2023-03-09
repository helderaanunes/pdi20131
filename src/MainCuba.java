
import br.com.nunes.pdi_disciplina.util.ApresentarImagem;
import br.com.nunes.pdi_disciplina.util.ConstrutorBufferedImage;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class MainCuba {
    public static void main(String[] args) {
        // cria a bandeira
        Color[][] img = new Color[600][500];
        
        // cria as listras da bandeira
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                // criar azul
                img[i][j] = Color.blue;
                
                // cria listras brancas
                if( j >= 100 && j<= 200){
                    img[i][j] = Color.white;
                }
                if( j >= 300 && j<= 400){
                    img[i][j] = Color.white;
                }
                
                // cria a parte superior do triangulo (vermelho)
                if( i < j && j < 250){
                    img[i][j] = Color.red;
                }
            }
        }
        
        // parte inferior em vermelha
        int cont = img[0].length;
        for(int i=0; i < 250; i++){
            for(int j=250; j < cont; j++){
                img[i][j] = Color.red;
            }
            cont -= 1;
        }
        
        BufferedImage imagem = new ConstrutorBufferedImage().construirBufferedImage(img);
        new ApresentarImagem().mostrarImagem(imagem);
    }

}
