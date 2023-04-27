package br.com.nunes.pdi_disciplina.util;

import java.awt.Color;

public class EscalaCinza {

    public Color[][] converterEscalaCinzaMediaPonderada(Color[][] imagemColorida) {
        double totalVermelho = 0;
        double totalVerde = 0;
        double totalAzul = 0;
        for (int i = 0; i < imagemColorida.length; i++) {
            for (int j = 0; j < imagemColorida[0].length; j++) {
                totalVermelho = totalVermelho + imagemColorida[i][j].getRed();
                totalVerde = totalVerde + imagemColorida[i][j].getGreen();
                totalAzul = totalAzul + imagemColorida[i][j].getBlue();
            }
        }
        double totalDeCores = totalVerde + totalVermelho + totalAzul;

        double pesoVermelho = (totalVermelho / 100000) / (totalDeCores / 100000);
        double pesoVerde = (totalVerde / 100000) / (totalDeCores / 100000);
        double pesoAzul = (totalAzul / 100000) / (totalDeCores / 100000);

        Color[][] imagemCinza = new Color[imagemColorida.length][imagemColorida[0].length];
        for (int i = 0; i < imagemColorida.length; i++) {
            for (int j = 0; j < imagemColorida[0].length; j++) {
                int vermelho = imagemColorida[i][j].getRed();
                int verde = imagemColorida[i][j].getGreen();
                int azul = imagemColorida[i][j].getBlue();

                int media = (int) ((vermelho * pesoVermelho) + (verde * pesoVerde) + (azul * pesoAzul)) / 3;

                imagemCinza[i][j] = new Color(media, media, media);
            }
        }
        return imagemCinza;
    }

    public Color[][] converterEscalaCinzaMedia(Color[][] imagemColorida) {
        Color[][] imagemCinza = new Color[imagemColorida.length][imagemColorida[0].length];
        for (int i = 0; i < imagemColorida.length; i++) {
            for (int j = 0; j < imagemColorida[0].length; j++) {
                int vermelho = imagemColorida[i][j].getRed();
                int verde = imagemColorida[i][j].getGreen();
                int azul = imagemColorida[i][j].getBlue();

                int media = (vermelho + verde + azul) / 3;

                imagemCinza[i][j] = new Color(media, media, media);
            }
        }
        return imagemCinza;
    }

    public Color[][] negativo(Color[][] imagemColorida) {
        Color[][] imagemNegativa = new Color[imagemColorida.length][imagemColorida[0].length];
        for (int i = 0; i < imagemColorida.length; i++) {
            for (int j = 0; j < imagemColorida[0].length; j++) {
                int vermelho = imagemColorida[i][j].getRed();
                int verde = imagemColorida[i][j].getGreen();
                int azul = imagemColorida[i][j].getBlue();
                int vermelhoNegativo = 256 - 1 - vermelho;
                int verdeNegativo = 256 - 1 - verde;
                int azulNegativo = 256 - 1 - azul;
                Color colorNegativa = new Color(verdeNegativo, verdeNegativo, azulNegativo);

                imagemNegativa[i][j] = colorNegativa;
            }
        }
        return imagemNegativa;
    }

    public Color[][] converterEscalaCinza2Niveis(Color[][] imagemColorida) {
        Color[][] imagemCinza = new Color[imagemColorida.length][imagemColorida[0].length];
        imagemColorida = converterEscalaCinzaMedia(imagemColorida);
        for (int i = 0; i < imagemColorida.length; i++) {
            for (int j = 0; j < imagemColorida[0].length; j++) {
                // se o tom de cinza for menor do que 128 então preto
                // peguei o azul, pq como está cinza, todas as 3 cores são iguais
                if (imagemColorida[i][j].getBlue() < 128) {
                    imagemCinza[i][j] = new Color(0, 0, 0);
                } else {
                    imagemCinza[i][j] = new Color(255, 255, 255);
                }
            }
        }
        return imagemCinza;
    }
    public Color[][] converterEscalaCinza4Niveis(Color[][] imagemColorida) {
        Color[][] imagemCinza = new Color[imagemColorida.length][imagemColorida[0].length];
        imagemColorida = converterEscalaCinzaMedia(imagemColorida);
        for (int i = 0; i < imagemColorida.length; i++) {
            for (int j = 0; j < imagemColorida[0].length; j++) {
                // se o tom de cinza for menor do que 128 então preto
                // peguei o azul, pq como está cinza, todas as 3 cores são iguais
                if (imagemColorida[i][j].getBlue() < 64) {
                    imagemCinza[i][j] = new Color(0, 0, 0);
                } else if (imagemColorida[i][j].getBlue() < 128) {
                    imagemCinza[i][j] = new Color(84,84,84);
                
                } else if (imagemColorida[i][j].getBlue() < 192) {
                    imagemCinza[i][j] = new Color(170,170,170);
                
                } else {
                    imagemCinza[i][j] = new Color(255,255,255);
                }
            }
        }
        return imagemCinza;
    }

    public Color[][] converterEscalaCinzaKNiveis(Color[][] imagemColorida,int k) {
        Color[][] imagemCinza = new Color[imagemColorida.length][imagemColorida[0].length];
        imagemColorida = converterEscalaCinzaMedia(imagemColorida);
        int intervalos =(int) 256/k;
        int intervaloCor = (int) 255/(k-1);
        
        for (int i = 0; i < imagemColorida.length; i++) {
            for (int j = 0; j < imagemColorida[0].length; j++) {
                //cor antiga do pixel
                int corAntiga = imagemColorida[i][j].getBlue();
                //fazendo calculo da nova cor
                int novaCor= (int)(corAntiga/intervalos)*intervaloCor;
                //System.out.println(novaCor);
                imagemCinza[i][j]=new Color (novaCor,novaCor,novaCor);
            }
        }
        return imagemCinza;
    }
    
}
