package br.com.nunes.pdi_disciplina.util;

import java.awt.Color;

public class Rotacao {
    public Color[][] girar90GrausHorario(Color [][] img){
        //Criar imagem "girada", troquei a altura pela largura
        // se for um quadrado funciona do mesmo jeito.
        
        Color [] [] nova = new Color[img[0].length][img.length];
        // new Color[numeroDeColunas][numeroDeLinhas];
        // img.length => pega o comprimento do primeiro array, ou seja,
        //               o número de colunas
        // img[0].length => oega o numero de linhas da coluna 0 
        //                  (primeira coluna).
        for (int i = 0 ; i<nova.length;i++){
            for (int j =0; j<nova[0].length;j++){
                nova[i][j]=Color.black;
            }
        }
        return nova;
    }
}
