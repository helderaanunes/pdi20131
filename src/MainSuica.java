
import br.com.nunes.pdi_disciplina.util.ApresentarImagem;
import br.com.nunes.pdi_disciplina.util.ConstrutorBufferedImage;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class MainSuica {

    public static void main(String[] args) {
        //Criando a matriz de pixels (Bandeira)
        // i = colunas e j = linhas
        Color[][] img = new Color[600][600];
        //for externo está percorrendo de forma horizontal
        for (int i = 0; i < img.length; i++) {
            // for interno está percorrendo de forma vertical
            for (int j = 0; j < img[0].length; j++) {
                //pintando todos os pixeis, pois não tem "ifs"
                img[i][j] = Color.RED;
            }
        }
        //Linha branca horizontal (da bandeira)
        for (int i = 100; i < 500; i++) { 
            for (int j = 200; j < 400; j++) {
                img[i][j] = Color.white;
            }
        }
        //Linha branca Vertical (da bandeira)
        for (int i = 200; i < 400; i++) {
            for (int j = 100; j < 500; j++) {
                img[i][j] = Color.white;
            }
        }

        BufferedImage imagem = new ConstrutorBufferedImage().construirBufferedImage(img);
        new ApresentarImagem().mostrarImagem(imagem);
    }

}
