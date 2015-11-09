package main;

import Dibujos.*;
import java.awt.Color;

/**
 * Programa para dibujar figuras geométricas
 * @author Administrador
 */
public class Main  {

    /**
     * El método principal
     * @param args No se usa
     */
    public static void main(String[] args) {
     Ventana ventana = new Ventana(1000,500);
     //Muestra u oculta el grid de la ventana
     ventana.setShowGrid(false);
     
     
     Elipse elipsecabeza = new Elipse(500,100,125,250);
        elipsecabeza.setRelleno(true);
        elipsecabeza.setBorde(true);   
        elipsecabeza.setColorBorde(Color.BLACK);
        elipsecabeza.setGrosorBorde(3.0f);
        elipsecabeza.setAnguloRotacion(90);
        elipsecabeza.setColor (new Color (255,228,177));

        ventana.addFigura(elipsecabeza);
     
        Circulo circuloorejader = new Circulo(490,150,25);
     circuloorejader.setRelleno(true);
     circuloorejader.setColor (new Color (255,228,177));
     circuloorejader.setBorde(true);
     circuloorejader.setGrosorBorde(2.0f);
     circuloorejader.setColorBorde(Color.BLACK);
     ventana.addFigura(circuloorejader);
     
     
     Circulo detalleorejader = new Circulo(485,153,20);
     detalleorejader.setRelleno(true);
     detalleorejader.setColor (new Color (255,228,177));
     detalleorejader.setBorde(false);
     detalleorejader.setGrosorBorde(2.0f);
     detalleorejader.setColorBorde(Color.BLUE);
     ventana.addFigura(detalleorejader);
     
     
      Circulo circuloorejaizq = new Circulo(235,150,25);
     circuloorejaizq.setRelleno(true);
     circuloorejaizq.setColor (new Color (255,228,177));
     circuloorejaizq.setBorde(true);
     circuloorejaizq.setGrosorBorde(2.0f);
     circuloorejaizq.setColorBorde(Color.BLACK);
     ventana.addFigura(circuloorejaizq);

     Circulo detalleorejaizq = new Circulo(242,153,20);
     detalleorejaizq.setRelleno(true);
     detalleorejaizq.setColor (new Color (255,228,177));
     detalleorejaizq.setBorde(false);
     detalleorejaizq.setGrosorBorde(2.0f);
     detalleorejaizq.setColorBorde(Color.BLUE);
     ventana.addFigura(detalleorejaizq);
     
     
     
      Circulo circuloojoizq = new Circulo(290,155,43);      
        circuloojoizq.setRelleno(true);
        circuloojoizq.setColor(Color.WHITE);
        circuloojoizq.setBorde(true);
        circuloojoizq.setGrosorBorde(2.0f);
        circuloojoizq.setColorBorde(Color.BLACK);       
        ventana.addFigura(circuloojoizq);
        
        
           Circulo circuloojoizq2 = new Circulo(290,155,43);      
        circuloojoizq2.setRelleno(true);
        circuloojoizq2.setColor(Color.WHITE);
        circuloojoizq2.setBorde(true);
        circuloojoizq2.setGrosorBorde(2.0f);
        circuloojoizq2.setColorBorde(Color.BLACK);       
        ventana.addFigura(circuloojoizq2);
        
         Rectangulo rectangulo1 = new Rectangulo(280,185, 185, 15);
        rectangulo1.setColor(new Color (255,228,177));
        rectangulo1.setRelleno(true);
        rectangulo1.setBorde(false);
        rectangulo1.setGrosorBorde(2.0f);
        rectangulo1.setColorBorde(Color.blue);
        ventana.addFigura(rectangulo1);
        
        Circulo circuloojoizq3 = new Circulo(290,155,43);      
        circuloojoizq3.setRelleno(false);
        circuloojoizq3.setColor(Color.WHITE);
        circuloojoizq3.setBorde(true);
        circuloojoizq3.setGrosorBorde(2.0f);
        circuloojoizq3.setColorBorde(Color.BLACK);       
        ventana.addFigura(circuloojoizq3);
        
     
     
      Circulo circuloojoder = new Circulo(410,155,43);      
        circuloojoder.setRelleno(true);
        circuloojoder.setColor(Color.WHITE);
        circuloojoder.setBorde(true);
        circuloojoder.setGrosorBorde(2.0f);
        circuloojoder.setColorBorde(Color.BLACK);       
        ventana.addFigura(circuloojoder);
        
    
          Circulo circuloojoder2 = new Circulo(410,155,43);      
        circuloojoder2.setRelleno(false);
        circuloojoder2.setColor(new Color (255,228,177));
        circuloojoder2.setBorde(true);
        circuloojoder2.setGrosorBorde(2.0f);
        circuloojoder2.setColorBorde(Color.BLACK);       
        ventana.addFigura(circuloojoder2);
        
       
           
        
      Rectangulo rectangulo = new Rectangulo(350,185, 105, 15);
        rectangulo.setColor(new Color (255,228,177));
        rectangulo.setRelleno(true);
        rectangulo.setBorde(false);
        rectangulo.setGrosorBorde(2.0f);
        rectangulo.setColorBorde(Color.blue);
       ventana.addFigura(rectangulo); 
        
         Circulo circuloojoder3 = new Circulo(410,155,43);      
        circuloojoder3.setRelleno(false);
        circuloojoder3.setColor(Color.WHITE);
        circuloojoder3.setBorde(true);
        circuloojoder3.setGrosorBorde(2.0f);
        circuloojoder3.setColorBorde(Color.BLACK);       
        ventana.addFigura(circuloojoder3);
        
        

       
        
        
     
        
          
        
      Linea linea2 = new Linea(330, 185, 292, 185);        
          linea2.setBorde(true);
        ventana.addFigura(linea2); 
     
        
        
          
        
      Linea linea4 = new Linea(410, 185, 450, 185);        
          linea4.setBorde(true);
        ventana.addFigura(linea4); 
     
         Linea linea5 = new Linea(330, 150, 292, 140);        
          linea5.setBorde(true);
        ventana.addFigura(linea5); 
        
         Linea linea6 = new Linea(410, 150, 450, 140);        
          linea6.setBorde(true);
        ventana.addFigura(linea6);
        
        
          Circulo circulopupilader = new Circulo(417,174,8);
     circulopupilader.setRelleno(true);
     circulopupilader.setColor (Color.BLACK);
     circulopupilader.setBorde(false);
     circulopupilader.setGrosorBorde(10.0f);
     circulopupilader.setColorBorde(Color.BLUE);
        ventana.addFigura(circulopupilader);
        
         Circulo circulopupilaizq = new Circulo(300,175,8);
     circulopupilaizq.setRelleno(true);
     circulopupilaizq.setColor (Color.BLACK);
     circulopupilaizq.setBorde(false);
     circulopupilaizq.setGrosorBorde(10.0f);
     circulopupilaizq.setColorBorde(Color.BLUE);
        ventana.addFigura(circulopupilaizq);
        
      Curva curvanariz = new Curva (365,172,369,180,355,190,2.0f);
    ventana.addFigura(curvanariz);
    curvanariz.setBorde(true);
    curvanariz.setRelleno(false);
    
    Curva curvanariz2 = new Curva (355,190,360,200,373,190,2.0f);
    ventana.addFigura(curvanariz2);
    curvanariz2.setBorde(true);
    curvanariz2.setRelleno(false);
    
    Curva curvaboca = new Curva (363,205,383,203,386,213,2.0f);
    ventana.addFigura(curvaboca);
    curvaboca.setBorde(true);
    curvaboca.setRelleno(false);
    
    
     Circulo circulooamarillo1 = new Circulo(310,234,50);      
        circulooamarillo1.setRelleno(true);
        circulooamarillo1.setColor(Color.YELLOW);
        circulooamarillo1.setBorde(false);
        circulooamarillo1.setGrosorBorde(2.0f);
        circulooamarillo1.setColorBorde(Color.BLACK);       
        ventana.addFigura(circulooamarillo1);

       Rectangulo rectangulorojo = new Rectangulo(325,225, 80, 110);
        rectangulorojo.setColor(Color.RED);
        rectangulorojo.setRelleno(true);
        rectangulorojo.setBorde(false);
        rectangulorojo.setGrosorBorde(10.0f);
        rectangulorojo.setColorBorde(Color.blue);
        ventana.addFigura(rectangulorojo);
        
        Elipse elipse = new Elipse(322,328,40,18);
        elipse.setRelleno(true);
        elipse.setColor(Color.gray);
        elipse.setBorde(true);   
        elipse.setColorBorde(Color.gray);
        elipse.setGrosorBorde(2.0f);
        ventana.addFigura(elipse);
        
        Elipse elipse2 = new Elipse(325,315,40,18);
        elipse2.setRelleno(true);
        elipse2.setColor(Color.red);
        elipse2.setBorde(true);   
        elipse2.setColorBorde(Color.red);
        elipse2.setGrosorBorde(2.0f);
        ventana.addFigura(elipse2);
        
        Circulo circulooamarillo2 = new Circulo(310,220,50);      
        circulooamarillo2.setRelleno(true);
        circulooamarillo2.setColor(Color.YELLOW);
        circulooamarillo2.setBorde(false);
        circulooamarillo2.setGrosorBorde(2.0f);
        circulooamarillo2.setColorBorde(Color.BLACK);       
        ventana.addFigura(circulooamarillo2);
         
        Circulo circulooamarillo3 = new Circulo(377,222,50);      
        circulooamarillo3.setRelleno(true);
        circulooamarillo3.setColor(Color.YELLOW);
        circulooamarillo3.setBorde(false);
        circulooamarillo3.setGrosorBorde(2.0f);
        circulooamarillo3.setColorBorde(Color.BLACK);       
        ventana.addFigura(circulooamarillo3);
        
          Rectangulo rectanguloamarillo2 = new Rectangulo(355,225, 20, 28);
        rectanguloamarillo2.setColor(Color.YELLOW);
        rectanguloamarillo2.setRelleno(true);
        rectanguloamarillo2.setBorde(false);
        rectanguloamarillo2.setGrosorBorde(2.0f);
        rectanguloamarillo2.setColorBorde(Color.blue);
        ventana.addFigura(rectanguloamarillo2);
        
        Rectangulo rectangulorojo2 = new Rectangulo(346,225, 5, 28);
        rectangulorojo2.setColor(Color.RED);
        rectangulorojo2.setRelleno(true);
        rectangulorojo2.setBorde(false);
        rectangulorojo2.setGrosorBorde(2.0f);
        rectangulorojo2.setColorBorde(Color.blue);
        ventana.addFigura(rectangulorojo2);
        
        Rectangulo rectangulorojo3 = new Rectangulo(344,230, 2, 15);
        rectangulorojo3.setColor(Color.RED);
        rectangulorojo3.setRelleno(false);
        rectangulorojo3.setBorde(true);
        rectangulorojo3.setGrosorBorde(2.0f);
        rectangulorojo3.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo3);
        
         Rectangulo rectangulorojo4 = new Rectangulo(342,235, 2, 15);
        rectangulorojo4.setColor(Color.RED);
        rectangulorojo4.setRelleno(false);
        rectangulorojo4.setBorde(true);
        rectangulorojo4.setGrosorBorde(2.0f);
        rectangulorojo4.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo4);
        
        Rectangulo rectangulorojo5 = new Rectangulo(350,226,3,5);
        rectangulorojo5.setColor(Color.RED);
        rectangulorojo5.setRelleno(true);
        rectangulorojo5.setBorde(true);
        rectangulorojo5.setGrosorBorde(2.0f);
        rectangulorojo5.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo5);
        
        Rectangulo rectangulorojo6 = new Rectangulo(350,229,3,5);
        rectangulorojo6.setColor(Color.RED);
        rectangulorojo6.setRelleno(true);
        rectangulorojo6.setBorde(true);
        rectangulorojo6.setGrosorBorde(2.0f);
        rectangulorojo6.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo6);
        
         Rectangulo rectangulorojo7 = new Rectangulo(355,225,3,2);
        rectangulorojo7.setColor(Color.RED);
        rectangulorojo7.setRelleno(true);
        rectangulorojo7.setBorde(true);
        rectangulorojo7.setGrosorBorde(2.0f);
        rectangulorojo7.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo7);
        
         Rectangulo rectanguloamarillo3  = new Rectangulo(376,235,8,10);
        rectanguloamarillo3.setColor(Color.RED);
        rectanguloamarillo3.setRelleno(true);
        rectanguloamarillo3.setBorde(true);
        rectanguloamarillo3.setGrosorBorde(2.0f);
        rectanguloamarillo3.setColorBorde(Color.RED);
        ventana.addFigura(rectanguloamarillo3);
        
        
          Rectangulo rectanguloamarillo4  = new Rectangulo(373,234,8,10);
        rectanguloamarillo4.setColor(Color.RED);
        rectanguloamarillo4.setRelleno(true);
        rectanguloamarillo4.setBorde(true);
        rectanguloamarillo4.setGrosorBorde(2.0f);
        rectanguloamarillo4.setColorBorde(Color.RED);
        ventana.addFigura(rectanguloamarillo4);
        
        Rectangulo rectanguloamarillo5  = new Rectangulo(378,230,8,10);
        rectanguloamarillo5.setColor(Color.RED);
        rectanguloamarillo5.setRelleno(true);
        rectanguloamarillo5.setBorde(true);
        rectanguloamarillo5.setGrosorBorde(2.0f);
        rectanguloamarillo5.setColorBorde(Color.RED);
        ventana.addFigura(rectanguloamarillo5);
        
          Rectangulo rectanguloamarillo6  = new Rectangulo(384,225,8,3);
        rectanguloamarillo6.setColor(Color.RED);
        rectanguloamarillo6.setRelleno(true);
        rectanguloamarillo6.setBorde(true);
        rectanguloamarillo6.setGrosorBorde(2.0f);
        rectanguloamarillo6.setColorBorde(Color.RED);
        ventana.addFigura(rectanguloamarillo6);
        
        
           Rectangulo rectanguloamarillo7  = new Rectangulo(381,229,8,3);
        rectanguloamarillo7.setColor(Color.RED);
        rectanguloamarillo7.setRelleno(true);
        rectanguloamarillo7.setBorde(true);
        rectanguloamarillo7.setGrosorBorde(2.0f);
        rectanguloamarillo7.setColorBorde(Color.RED);
        ventana.addFigura(rectanguloamarillo7);
        
        
            Rectangulo rectanguloamarillo8  = new Rectangulo(369,225,8,2);
        rectanguloamarillo8.setColor(Color.YELLOW);
        rectanguloamarillo8.setRelleno(true);
        rectanguloamarillo8.setBorde(true);
        rectanguloamarillo8.setGrosorBorde(2.0f);
        rectanguloamarillo8.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo8);
        
        Rectangulo rectanguloamarillo9  = new Rectangulo(405,224,8,3);
        rectanguloamarillo9.setColor(Color.YELLOW);
        rectanguloamarillo9.setRelleno(true);
        rectanguloamarillo9.setBorde(true);
        rectanguloamarillo9.setGrosorBorde(2.0f);
        rectanguloamarillo9.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo9);
        
         Rectangulo rectanguloamarillo10  = new Rectangulo(408,224,8,3);
        rectanguloamarillo10.setColor(Color.YELLOW);
        rectanguloamarillo10.setRelleno(true);
        rectanguloamarillo10.setBorde(true);
        rectanguloamarillo10.setGrosorBorde(2.0f);
        rectanguloamarillo10.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo10);
        
        Rectangulo rectanguloamarillo11  = new Rectangulo(412,227,8,3);
        rectanguloamarillo11.setColor(Color.YELLOW);
        rectanguloamarillo11.setRelleno(true);
        rectanguloamarillo11.setBorde(true);
        rectanguloamarillo11.setGrosorBorde(2.0f);
        rectanguloamarillo11.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo11);
        
        Rectangulo rectanguloamarillo12  = new Rectangulo(414,230,8,3);
        rectanguloamarillo12.setColor(Color.YELLOW);
        rectanguloamarillo12.setRelleno(true);
        rectanguloamarillo12.setBorde(true);
        rectanguloamarillo12.setGrosorBorde(2.0f);
        rectanguloamarillo12.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo12);
        
        Rectangulo rectanguloamarillo13  = new Rectangulo(410,270,20,8);
        rectanguloamarillo13.setColor(Color.YELLOW);
        rectanguloamarillo13.setRelleno(true);
        rectanguloamarillo13.setBorde(true);
        rectanguloamarillo13.setGrosorBorde(2.0f);
        rectanguloamarillo13.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo13);
        
        Rectangulo rectanguloamarillo14  = new Rectangulo(408,260,20,8);
        rectanguloamarillo14.setColor(Color.YELLOW);
        rectanguloamarillo14.setRelleno(true);
        rectanguloamarillo14.setBorde(true);
        rectanguloamarillo14.setGrosorBorde(2.0f);
        rectanguloamarillo14.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo14);
        
          Rectangulo rectanguloamarillo15 = new Rectangulo(407,250,20,8);
        rectanguloamarillo15.setColor(Color.YELLOW);
        rectanguloamarillo15.setRelleno(true);
        rectanguloamarillo15.setBorde(true);
        rectanguloamarillo15.setGrosorBorde(2.0f);
        rectanguloamarillo15.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo15);
        
        
               Rectangulo rectanguloamarillo16 = new Rectangulo(409,270,20,8);
        rectanguloamarillo16.setColor(Color.YELLOW);
        rectanguloamarillo16.setRelleno(true);
        rectanguloamarillo16.setBorde(true);
        rectanguloamarillo16.setGrosorBorde(2.0f);
        rectanguloamarillo16.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo16);
        
            Rectangulo rectanguloamarillo17 = new Rectangulo(411,278,8,2);
        rectanguloamarillo17.setColor(Color.YELLOW);
        rectanguloamarillo17.setRelleno(true);
        rectanguloamarillo17.setBorde(true);
        rectanguloamarillo17.setGrosorBorde(2.0f);
        rectanguloamarillo17.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo17);
        
         Rectangulo rectanguloamarillo18 = new Rectangulo(414,279,8,2);
        rectanguloamarillo18.setColor(Color.YELLOW);
        rectanguloamarillo18.setRelleno(true);
        rectanguloamarillo18.setBorde(true);
        rectanguloamarillo18.setGrosorBorde(2.0f);
        rectanguloamarillo18.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo18);
        
          Rectangulo rectanguloamarillo19 = new Rectangulo(419,278,8,2);
        rectanguloamarillo19.setColor(Color.YELLOW);
        rectanguloamarillo19.setRelleno(true);
        rectanguloamarillo19.setBorde(true);
        rectanguloamarillo19.setGrosorBorde(2.0f);
        rectanguloamarillo19.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectanguloamarillo19);
         
        
         Rectangulo rectangulorojo8 = new Rectangulo(385,265,20,8);
        rectangulorojo8.setColor(Color.RED);
        rectangulorojo8.setRelleno(true);
        rectangulorojo8.setBorde(true);
        rectangulorojo8.setGrosorBorde(2.0f);
        rectangulorojo8.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo8);
        
           Rectangulo rectangulorojo9 = new Rectangulo(399,262,3,2);
        rectangulorojo9.setColor(Color.RED);
        rectangulorojo9.setRelleno(true);
        rectangulorojo9.setBorde(true);
        rectangulorojo9.setGrosorBorde(2.0f);
        rectangulorojo9.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo9);
        
         Rectangulo rectangulorojo10 = new Rectangulo(380,245,5,20);
        rectangulorojo10.setColor(Color.RED);
        rectangulorojo10.setRelleno(true);
        rectangulorojo10.setBorde(true);
        rectangulorojo10.setGrosorBorde(2.0f);
        rectangulorojo10.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo10);
        
           Rectangulo rectangulorojo11 = new Rectangulo(383,258,5,5);
        rectangulorojo11.setColor(Color.RED);
        rectangulorojo11.setRelleno(true);
        rectangulorojo11.setBorde(true);
        rectangulorojo11.setGrosorBorde(2.0f);
        rectangulorojo11.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo11);
    
        Rectangulo rectangulorojo12 = new Rectangulo(385,261,5,5);
        rectangulorojo12.setColor(Color.RED);
        rectangulorojo12.setRelleno(true);
        rectangulorojo12.setBorde(true);
        rectangulorojo12.setGrosorBorde(2.0f);
        rectangulorojo12.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo12);
        
        Rectangulo rectangulorojo13 = new Rectangulo(325,261,30,10);
        rectangulorojo13.setColor(Color.RED);
        rectangulorojo13.setRelleno(true);
        rectangulorojo13.setBorde(true);
        rectangulorojo13.setGrosorBorde(2.0f);
        rectangulorojo13.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo13);
        
        Rectangulo rectangulorojo14 = new Rectangulo(323,273,30,10);
        rectangulorojo14.setColor(Color.RED);
        rectangulorojo14.setRelleno(true);
        rectangulorojo14.setBorde(true);
        rectangulorojo14.setGrosorBorde(2.0f);
        rectangulorojo14.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo14);
        
          Rectangulo rectangulorojo15 = new Rectangulo(323,285,30,11);
        rectangulorojo15.setColor(Color.RED);
        rectangulorojo15.setRelleno(true);
        rectangulorojo15.setBorde(true);
        rectangulorojo15.setGrosorBorde(2.0f);
        rectangulorojo15.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo15);
    
         Rectangulo rectangulorojo16 = new Rectangulo(340,256,30,11);
        rectangulorojo16.setColor(Color.RED);
        rectangulorojo16.setRelleno(true);
        rectangulorojo16.setBorde(true);
        rectangulorojo16.setGrosorBorde(2.0f);
        rectangulorojo16.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo16);
        
        Rectangulo rectangulorojo17 = new Rectangulo(338,258,5,8);
        rectangulorojo17.setColor(Color.RED);
        rectangulorojo17.setRelleno(true);
        rectangulorojo17.setBorde(true);
        rectangulorojo17.setGrosorBorde(2.0f);
        rectangulorojo17.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo17);
        
        Rectangulo rectangulorojo18 = new Rectangulo(335,260,5,8);
        rectangulorojo18.setColor(Color.RED);
        rectangulorojo18.setRelleno(true);
        rectangulorojo18.setBorde(true);
        rectangulorojo18.setGrosorBorde(2.0f);
        rectangulorojo18.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo18);
    
        Rectangulo rectangulorojo19 = new Rectangulo(340,255,1,2);
        rectangulorojo19.setColor(Color.RED);
        rectangulorojo19.setRelleno(true);
        rectangulorojo19.setBorde(true);
        rectangulorojo19.setGrosorBorde(2.0f);
        rectangulorojo19.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo19);
        
        Rectangulo rectangulorojo20 = new Rectangulo(350,254,5,2);
        rectangulorojo20.setColor(Color.RED);
        rectangulorojo20.setRelleno(true);
        rectangulorojo20.setBorde(true);
        rectangulorojo20.setGrosorBorde(2.0f);
        rectangulorojo20.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo20);
        
        Rectangulo rectangulorojo21 = new Rectangulo(358,252,6,2);
        rectangulorojo21.setColor(Color.YELLOW);
        rectangulorojo21.setRelleno(true);
        rectangulorojo21.setBorde(true);
        rectangulorojo21.setGrosorBorde(2.0f);
        rectangulorojo21.setColorBorde(Color.YELLOW);
        ventana.addFigura(rectangulorojo21);
        
        Rectangulo rectangulorojo22 = new Rectangulo(370,252,3,2);
        rectangulorojo22.setColor(Color.RED);
        rectangulorojo22.setRelleno(true);
        rectangulorojo22.setBorde(true);
        rectangulorojo22.setGrosorBorde(2.0f);
        rectangulorojo22.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo22);
        
        Rectangulo rectangulorojo23 = new Rectangulo(391,225,3,1);
        rectangulorojo23.setColor(Color.RED);
        rectangulorojo23.setRelleno(true);
        rectangulorojo23.setBorde(true);
        rectangulorojo23.setGrosorBorde(2.0f);
        rectangulorojo23.setColorBorde(Color.RED);
        ventana.addFigura(rectangulorojo23);
        
        
        Rectangulo rectangulorojo24 = new Rectangulo(405,275,3,20);
        rectangulorojo24.setColor(Color.RED);
        rectangulorojo24.setRelleno(true);
        rectangulorojo24.setBorde(true);
        rectangulorojo24.setGrosorBorde(2.0f);
        rectangulorojo24.setColorBorde(Color.red);
        ventana.addFigura(rectangulorojo24);
        
        
         Rectangulo rectangulorojo25 = new Rectangulo(407,292,3,3);
        rectangulorojo25.setColor(Color.RED);
        rectangulorojo25.setRelleno(true);
        rectangulorojo25.setBorde(true);
        rectangulorojo25.setGrosorBorde(1.0f);
        rectangulorojo25.setColorBorde(Color.red);
        ventana.addFigura(rectangulorojo25);
        
        Rectangulo rectangulomanoder1 = new Rectangulo(410,282,12,13);
        rectangulomanoder1.setColor(new Color (255,228,177));
        rectangulomanoder1.setRelleno(true);
        rectangulomanoder1.setBorde(true);
        rectangulomanoder1.setGrosorBorde(1.0f);
        rectangulomanoder1.setColorBorde(new Color (255,228,177));
        ventana.addFigura(rectangulomanoder1);
        
        Rectangulo rectangulomanoder2 = new Rectangulo(412,282,12,9);
        rectangulomanoder2.setColor(new Color (255,228,177));
        rectangulomanoder2.setRelleno(true);
        rectangulomanoder2.setBorde(true);
        rectangulomanoder2.setGrosorBorde(1.0f);
        rectangulomanoder2.setColorBorde(new Color (255,228,177));
        ventana.addFigura(rectangulomanoder2);
        
        Rectangulo rectangulomanoder3 = new Rectangulo(422,282,5,5);
        rectangulomanoder3.setColor(new Color (255,228,177));
        rectangulomanoder3.setRelleno(true);
        rectangulomanoder3.setBorde(true);
        rectangulomanoder3.setGrosorBorde(1.0f);
        rectangulomanoder3.setColorBorde(new Color (255,228,177));
        ventana.addFigura(rectangulomanoder3);
        
        Rectangulo rectangulomanoizq1 = new Rectangulo(312,274,10,8);
        rectangulomanoizq1.setColor(new Color (255,228,177));
        rectangulomanoizq1.setRelleno(true);
        rectangulomanoizq1.setBorde(true);
        rectangulomanoizq1.setGrosorBorde(1.0f);
        rectangulomanoizq1.setColorBorde(new Color (255,228,177));
        ventana.addFigura(rectangulomanoizq1);
        
          Rectangulo rectangulomanoizq2 = new Rectangulo(313,280,8,5);
        rectangulomanoizq2.setColor(new Color (255,228,177));
        rectangulomanoizq2.setRelleno(true);
        rectangulomanoizq2.setBorde(true);
        rectangulomanoizq2.setGrosorBorde(1.0f);
        rectangulomanoizq2.setColorBorde(new Color (255,228,177));
        ventana.addFigura(rectangulomanoizq2);
        
        Rectangulo rectangulomanoizq3 = new Rectangulo(315,284,6,5);
        rectangulomanoizq3.setColor(new Color (255,228,177));
        rectangulomanoizq3.setRelleno(true);
        rectangulomanoizq3.setBorde(false);
        rectangulomanoizq3.setGrosorBorde(1.0f);
        rectangulomanoizq3.setColorBorde(new Color (255,228,177));
        ventana.addFigura(rectangulomanoizq3);
        
           Rectangulo rectangulomanoizq4 = new Rectangulo(312,274,6,5);
        rectangulomanoizq4.setColor(new Color (255,228,177));
        rectangulomanoizq4.setRelleno(true);
        rectangulomanoizq4.setBorde(true);
        rectangulomanoizq4.setGrosorBorde(2.0f);
        rectangulomanoizq4.setColorBorde(new Color (255,228,177));
        ventana.addFigura(rectangulomanoizq4);
        
        
         Rectangulo rectangulobrazoizq1 = new Rectangulo(310,255,6,15);
        rectangulobrazoizq1.setColor(Color.yellow);
        rectangulobrazoizq1.setRelleno(true);
        rectangulobrazoizq1.setBorde(true);
        rectangulobrazoizq1.setGrosorBorde(2.0f);
        rectangulobrazoizq1.setColorBorde(Color.yellow);
        ventana.addFigura(rectangulobrazoizq1);
        
          Rectangulo rectangulopies1 = new Rectangulo(328,335,75,10);
        rectangulopies1.setColor(Color.gray);
        rectangulopies1.setRelleno(true);
        rectangulopies1.setBorde(true);
        rectangulopies1.setGrosorBorde(2.0f);
        rectangulopies1.setColorBorde(Color.gray);
        ventana.addFigura(rectangulopies1);
        
        Rectangulo rectangulopies2 = new Rectangulo(344,333,25,5);
        rectangulopies2.setColor(Color.gray);
        rectangulopies2.setRelleno(true);
        rectangulopies2.setBorde(true);
        rectangulopies2.setGrosorBorde(2.0f);
        rectangulopies2.setColorBorde(Color.gray);
        ventana.addFigura(rectangulopies2);
         
        Rectangulo rectangulopies3 = new Rectangulo(395,333,7,5);
        rectangulopies3.setColor(Color.gray);
        rectangulopies3.setRelleno(true);
        rectangulopies3.setBorde(true);
        rectangulopies3.setGrosorBorde(2.0f);
        rectangulopies3.setColorBorde(Color.gray);
        ventana.addFigura(rectangulopies3);
    
        Rectangulo rectangulopies4 = new Rectangulo(369,342,14,5);
        rectangulopies4.setColor(Color.gray);
        rectangulopies4.setRelleno(true);
        rectangulopies4.setBorde(true);
        rectangulopies4.setGrosorBorde(2.0f);
        rectangulopies4.setColorBorde(Color.gray);
        ventana.addFigura(rectangulopies4);
        
     Curva curvaboca2 = new Curva (360,200,358,205,365,210,2.0f);
    ventana.addFigura(curvaboca2);
    curvaboca2.setBorde(true);
    curvaboca2.setRelleno(false);
 
    
        Curva curvapelo1 = new Curva (350,110,355,87,365,98,2.0f);
    ventana.addFigura(curvapelo1);
    curvapelo1.setBorde(true);
    curvapelo1.setRelleno(false);

        Curva curvapelo2 = new Curva (325,113,335,87,340,100,2.0f);
    ventana.addFigura(curvapelo2);
    curvapelo2.setBorde(true);
    curvapelo2.setRelleno(false);
    
     Curva curvapelo3 = new Curva (295,120,310,90,310,110,2.0f);
    ventana.addFigura(curvapelo3);
    curvapelo3.setBorde(true);
    curvapelo3.setRelleno(false);

    
     Curva curvapelo4 = new Curva (270,133,283,100,285,120,2.0f);
    ventana.addFigura(curvapelo4);
    curvapelo4.setBorde(true);
    curvapelo4.setRelleno(false);

     Curva curvapelo5 = new Curva (370,110,375,87,385,98,2.0f);
    ventana.addFigura(curvapelo5);
    curvapelo5.setBorde(true);
    curvapelo5.setRelleno(false);
    
    Curva curvapelo6 = new Curva (395,110,395,87,410,100,2.0f);
    ventana.addFigura(curvapelo6);
    curvapelo6.setBorde(true);
    curvapelo6.setRelleno(false);
        
   Curva curvapelo7 = new Curva (415,110,415,87,430,108,2.0f);
    ventana.addFigura(curvapelo7);
    curvapelo7.setBorde(true);
    curvapelo7.setRelleno(false);
    
    Curva curvapelo8 = new Curva (435,113,445,95,455,115,2.0f);
    ventana.addFigura(curvapelo8);
    curvapelo8.setBorde(true);
    curvapelo8.setRelleno(false);
        
    Curva curvapelo9 = new Curva (455,120,464,100,470,120,2.0f);
    ventana.addFigura(curvapelo9);
    curvapelo9.setBorde(true);
    curvapelo9.setRelleno(false);
    
    Curva curvapelo10 = new Curva (475,130,484,115,490,135,2.0f);
    ventana.addFigura(curvapelo10);
    curvapelo10.setBorde(true);
    curvapelo10.setRelleno(false);
     
    Curva curvaespalda1 = new Curva (410,220,430,225,430,280,2.0f);
    ventana.addFigura(curvaespalda1);
    curvaespalda1.setBorde(true);
    curvaespalda1.setRelleno(false);
    
     Curva curvabrazoder = new Curva (430,280,420,285,410,280,2.0f);
    ventana.addFigura(curvabrazoder);
    curvabrazoder.setBorde(true);
    curvabrazoder.setRelleno(false);
    
    Curva curvamano2 = new Curva (410,280,410,285,400,250,2.0f);
    ventana.addFigura(curvamano2);
    curvamano2.setBorde(true);
    curvamano2.setRelleno(false);
    
    Curva curvbrazoizq = new Curva (325,220,305,240,310,270,2.0f);
    ventana.addFigura(curvbrazoizq);
    curvbrazoizq.setBorde(true);
    curvbrazoizq.setRelleno(false);
    
     Curva curvbrazoizq2 = new Curva (310,270,305,270,320,275,2.0f);
    ventana.addFigura(curvbrazoizq2);
    curvbrazoizq2.setBorde(true);
    curvbrazoizq2.setRelleno(false);
    
    Curva curvbrazoizq3 = new Curva (335,230,315,260,325,310,2.0f);
    ventana.addFigura(curvbrazoizq3);
    curvbrazoizq3.setBorde(true);
    curvbrazoizq3.setRelleno(false);
    
    Linea lineapiernaizq1 = new Linea(325, 310, 325, 330);        
          lineapiernaizq1.setBorde(true);
          lineapiernaizq1.setGrosorBorde(2.0f);
        ventana.addFigura(lineapiernaizq1);
        
     Curva curvapiernaizq1 = new Curva (325,330,335,335,360,330,2.0f);
    ventana.addFigura(curvapiernaizq1);
    curvapiernaizq1.setBorde(true);
    curvapiernaizq1.setRelleno(false);
    
     Linea lineaentrepierna = new Linea(360,330,360,295);        
          lineaentrepierna.setBorde(true);
          lineaentrepierna.setGrosorBorde(2.0f);
        ventana.addFigura(lineaentrepierna);
        
    Curva curvaentrepierna = new Curva (360,295,350,295,350,290,2.0f);
    ventana.addFigura(curvaentrepierna);
    curvaentrepierna.setBorde(true);
    curvaentrepierna.setRelleno(false);
    
        Curva curvapiernader1 = new Curva (360,330,385,338,404,330,2.0f);
    ventana.addFigura(curvapiernader1);
    curvapiernader1.setBorde(true);
    curvapiernader1.setRelleno(false);
    
     Linea lineapiernader1 = new Linea(404,330,405,295);        
          lineapiernader1.setBorde(true);
          lineapiernader1.setGrosorBorde(2.0f);
        ventana.addFigura(lineapiernader1);
        
        Curva curvamanoder1 = new Curva (410,280,405,295,415,295,2.0f);
    ventana.addFigura(curvamanoder1);
    curvamanoder1.setBorde(true);
    curvamanoder1.setRelleno(false);
        
     Curva curvamanoder2 = new Curva (415,288,413,300,420,295,2.0f);
    ventana.addFigura(curvamanoder2);
    curvamanoder2.setBorde(true);
    curvamanoder2.setRelleno(false);
    
    Curva curvamanoder3 = new Curva (420,290,417,310,430,280,2.0f);
    ventana.addFigura(curvamanoder3);
    curvamanoder3.setBorde(true);
    curvamanoder3.setRelleno(false);
         
    
      Curva curvamanoizq1 = new Curva (310,270,310,290,321,290,2.0f);
    ventana.addFigura(curvamanoizq1);
    curvamanoizq1.setBorde(true);
    curvamanoizq1.setRelleno(false);
    
    Curva curvamanoizq2 = new Curva (315,280,320,290,322,280,2.0f);
    ventana.addFigura(curvamanoizq2);
    curvamanoizq2.setBorde(true);
    curvamanoizq2.setRelleno(false);
    
    Curva curvaunionmanoder = new Curva (405,295,413,300,410,293,2.0f);
    ventana.addFigura(curvaunionmanoder);
    curvaunionmanoder.setBorde(true);
    curvaunionmanoder.setRelleno(false);
        
     
     Curva curvapieizq1 = new Curva (325,330,310,350,360,345,2.0f);
    ventana.addFigura(curvapieizq1);
    curvapieizq1.setBorde(true);
    curvapieizq1.setRelleno(false);
    
    Curva curvapieder1 = new Curva (360,330,345,355,404,345,2.0f);
    ventana.addFigura(curvapieder1);
    curvapieder1.setBorde(true);
    curvapieder1.setRelleno(false);
    
    Curva curvapieder2 = new Curva (404,343,404,340,404,328,2.0f);
    ventana.addFigura(curvapieder2);
    curvapieder2.setBorde(true);
    curvapieder2.setRelleno(false);
    
    Curva curvatiranteizq1 = new Curva (347,225,340,230,340,250,2.0f);
    ventana.addFigura(curvatiranteizq1);
    curvatiranteizq1.setBorde(true);
    curvatiranteizq1.setRelleno(false);
    
      Curva curvatiranteizq2 = new Curva (360,225,350,230,350,250,2.0f);
    ventana.addFigura(curvatiranteizq2);
    curvatiranteizq2.setBorde(true);
    curvatiranteizq2.setRelleno(false);
    
      Curva curvatiranteder1 = new Curva (380,225,370,230,370,250,2.0f);
    ventana.addFigura(curvatiranteder1);
    curvatiranteder1.setBorde(true);
    curvatiranteder1.setRelleno(false);
    
          Curva curvatiranteder2 = new Curva (395,225,385,230,385,250,2.0f);
    ventana.addFigura(curvatiranteder2);
    curvatiranteder2.setBorde(true);
    curvatiranteder2.setRelleno(false);
    
    
    Circulo circulotirante1 = new Circulo(338,240,15);      
        circulotirante1.setRelleno(true);
        circulotirante1.setColor(Color.YELLOW);
        circulotirante1.setBorde(true);
        circulotirante1.setGrosorBorde(2.0f);
        circulotirante1.setColorBorde(Color.BLACK);       
        ventana.addFigura(circulotirante1);
        
     Circulo circulotirante2 = new Circulo(370,241,15);      
        circulotirante2.setRelleno(true);
        circulotirante2.setColor(Color.YELLOW);
        circulotirante2.setBorde(true);
        circulotirante2.setGrosorBorde(2.0f);
        circulotirante2.setColorBorde(Color.BLACK);       
        ventana.addFigura(circulotirante2);
        
    
     
    Curva curvatiranteder3 = new Curva (385,250,390,270,402,260,2.0f);
    ventana.addFigura(curvatiranteder3);
    curvatiranteder3.setBorde(true);
    curvatiranteder3.setRelleno(false);
    
       Curva curvatiranteder4 = new Curva (370,250,365,260,350,250,2.0f);
    ventana.addFigura(curvatiranteder4);
    curvatiranteder4.setBorde(true);
    curvatiranteder4.setRelleno(false);
    
    
     Curva curvatiranteder5 = new Curva (325,260,340,260,340,250,2.0f);
    ventana.addFigura(curvatiranteder5);
    curvatiranteder5.setBorde(true);
    curvatiranteder5.setRelleno(false);
    
    
 
    
    
    
      
    //Centra la ventana
     ventana.centeredScreen();
     //Muestra la ventana
     ventana.mostrar();
    /* 
     //Crea un circulo
     Circulo circulo = new Circulo(20,20,100);
     circulo.setRelleno(true);
     circulo.setColor (new Color(255,0,0));
     circulo.setBorde(true);
     circulo.setGrosorBorde(10.0f);
     circulo.setColorBorde(Color.BLUE);
     
     //fondo//ventana.setColor(Color.BLUE);
     ventana.addFigura(circulo);
     //Centra la ventana
     ventana.centeredScreen();
     //Muestra la ventana
     ventana.mostrar();
        */
    }  
    
}

    /*
        // Crea la ventana de dibujo
        Ventana ventana = new Ventana(1000,500); 
        
        // Muestra u oculta el grid de la ventana
        ventana.setShowGrid(true);  
        
        // Crea las figuras
        Circulo circulo = new Circulo(20,20,100);      
        circulo.setRelleno(true);
        circulo.setColor(Color.BLUE);
        circulo.setBorde(true);
        circulo.setGrosorBorde(5.0f);
        circulo.setColorBorde(Color.MAGENTA);       
        ventana.addFigura(circulo);
        
        RectanguloRedondo rectanguloR = new RectanguloRedondo(400,200,300,100,25,25);
        rectanguloR.setColor(Color.YELLOW);     
        ventana.addFigura(rectanguloR);      
        
        Cuadrado cuadrado = new Cuadrado(300,300,100);
        cuadrado.setColor(250,190,120);
        cuadrado.setAnguloRotacion(45);
        cuadrado.setPuntoRotacion(300,300);
        ventana.addFigura(cuadrado);
        
        Elipse elipse = new Elipse(100,200,100,50);
        elipse.setRelleno(false);
        elipse.setBorde(true);   
        elipse.setColorBorde(Color.RED);
        elipse.setGrosorBorde(3.0f);
        elipse.setAnguloRotacion(90);
        ventana.addFigura(elipse);
            
        Rectangulo rectangulo = new Rectangulo(700,400, 200, 40);
        rectangulo.setColor(170,110,100);
        rectangulo.setRelleno(false);
        rectangulo.setBorde(true);
        rectangulo.setGrosorBorde(10.0f);
        rectangulo.setColorBorde(Color.blue);
        rectangulo.setAnguloRotacion(70);
        ventana.addFigura(rectangulo);     
   
        Triangulo triangulo = new Triangulo(400,100,200,300,200,100);
        triangulo.setColor(150,100,120);       
        ventana.addFigura(triangulo);
    
        // Centra la ventana
        ventana.centeredScreen();
        // Maximiza la ventana
        ventana.maximized();
        // Muestra la ventana
        ventana.mostrar();  
        
       */
        













/*
        Cuadrado cuadradoRojo=new Cuadrado(0, 0, 100);
        cuadradoRojo.setColor(255, 0, 0);
        ventana.addFigura(cuadradoRojo);
        
        Circulo circuloVerde=new Circulo(100, 100, 100);
        circuloVerde.setColor(0,255, 0);
        ventana.addFigura(circuloVerde);       
        
        Linea linea=new Linea(0, 0, 300, 300);        
        ventana.addFigura(linea); 
 */