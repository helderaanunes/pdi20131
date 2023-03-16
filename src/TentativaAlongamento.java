
import br.com.nunes.pdi_disciplina.util.ApresentarImagem;
import br.com.nunes.pdi_disciplina.util.ConstrutorBufferedImage;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class TentativaAlongamento {
    public static void main(String[] args) {
        // cria imagem inicial
        Color[][] img = new Color[2][2];
         img[0][0]=Color.blue;
         img[1][1]=Color.blue;
         img[0][1]=Color.black;
         img[1][0]=Color.black;
         //variavel que controla o aumento no eixo X da nova imagem
         int vezesAumentadaCol= 100;  
         int vezesAumentadaLin= 100;  
         //definindo o tamanho da nova imagem, esta nova imagem, já está aumentada X vezes
         Color[][] imgAlongadaH = 
                 new Color[img.length*vezesAumentadaCol][img[0].length*vezesAumentadaLin];
         //laços para percorrer nossa matriz de pixel(nova imagem alongada)
         for (int i =0;i<imgAlongadaH.length;i++){
             for (int j =0; j< imgAlongadaH[0].length;j++){
                 int valorArredondadoParaBaixoColuna = (int) Math.floor(i/vezesAumentadaCol) ;
                 int valorArredondadoParaBaixoLinha = (int) Math.floor(j/vezesAumentadaCol) ;
                 imgAlongadaH[i][j] =
                         img[valorArredondadoParaBaixoColuna][valorArredondadoParaBaixoLinha];
                 
             }
         }
         
        
        BufferedImage imagem = new ConstrutorBufferedImage().construirBufferedImage(img);
        new ApresentarImagem().mostrarImagem(imagem);
        BufferedImage imagemAlongada = new ConstrutorBufferedImage().construirBufferedImage(imgAlongadaH);
        new ApresentarImagem().mostrarImagem(imagemAlongada);
    }

}
