
import br.com.nunes.pdi_disciplina.util.ApresentarImagem;
import br.com.nunes.pdi_disciplina.util.ConstrutorBufferedImage;
import br.com.nunes.pdi_disciplina.util.EscalaCinza;
import br.com.nunes.pdi_disciplina.util.Rotacao;
import java.awt.Color;

public class MainTestarCarregarImagemEndereco {

    public static void main(String[] args) {
        ConstrutorBufferedImage c = new ConstrutorBufferedImage();
        Color[][] imagem
                = c.imagemBufferedImageParaMatrizColor(
                        c.construirBufferedImage(
                                "C:\\Users\\Aluno\\Pictures\\balao.jpg"
                        )
                );
        EscalaCinza ec = new EscalaCinza();
//mostrar negativo
        //imagem = ec.negativo(imagem);
        //a.mostrarImagem(c.construirBufferedImage(imagem));
// mostrar niveis de cinza
//        ApresentarImagem a = new ApresentarImagem();
//        Color[][] imagemCinza;
//        for (int i = 2; i <= 128; i *= 2) {
//            imagemCinza = ec.converterEscalaCinzaKNiveis(imagem, i);
//            a.mostrarImagem(c.construirBufferedImage(imagemCinza));
//        }

//mostrar rotação
           ApresentarImagem a = new ApresentarImagem();
           Rotacao r = new Rotacao();
           a.mostrarImagem(c.construirBufferedImage(r.girar90GrausHorario(imagem)));
    }
}
