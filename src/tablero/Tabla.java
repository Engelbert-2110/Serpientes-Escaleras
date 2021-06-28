package tablero;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Tabla extends JFrame implements ActionListener{
    JLabel label[] = new JLabel[64];
    Color casillas, fondo, jugador, casilla2, jugador2;
    JButton movimiento;
    int dadito, player, player2;
    private int c0;
    
    
    
      
    
    
    public Tabla(){
        
        super("Escaleras y Serpientes");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        objetos();
        this.getContentPane().setBackground(fondo);
        this.setVisible(true);
        
        
    }
    
    
    
    public void objetos(){
        casillas = new Color (204,204,204);
        casilla2 = new Color (255,51,0);
        fondo = new Color (0,255,255);
        jugador = new Color (0,204,0);
        jugador2 = new Color (0,7,0);
       
        for (int i = 0; i < label.length; i++) {
            label[i] = new JLabel("");
        }
        
        movimiento = new JButton("Dado");
        
        this.setLayout(null);
        
        label[0].setBounds(10, 10, 50, 50);
        label[1].setBounds(60, 10, 50, 50);
        label[2].setBounds(110, 10, 50, 50);
        label[3].setBounds(160, 10, 50, 50);
        label[4].setBounds(210, 10, 50, 50);
        label[5].setBounds(260, 10, 50, 50);
        label[6].setBounds(310, 10, 50, 50);
        label[7].setBounds(360, 10, 50, 50);
        
        //SEgunda fila
        label[8].setBounds(10, 60, 50, 50);
        label[9].setBounds(60, 60, 50, 50);
        label[10].setBounds(110, 60, 50, 50);
        label[11].setBounds(160, 60, 50, 50);
        label[12].setBounds(210, 60, 50, 50);
        label[13].setBounds(260, 60, 50, 50);
        label[14].setBounds(310, 60, 50, 50);
        label[15].setBounds(360, 60, 50, 50);
        
        //Tercerafila
        label[16].setBounds(10, 110, 50, 50);
        label[17].setBounds(60, 110, 50, 50);
        label[18].setBounds(110, 110, 50, 50);
        label[19].setBounds(160, 110, 50, 50);
        label[20].setBounds(210, 110, 50, 50);
        label[21].setBounds(260, 110, 50, 50);
        label[22].setBounds(310, 110, 50, 50);
        label[23].setBounds(360, 110, 50, 50);
        
        //cuartafila
        label[24].setBounds(10, 160, 50, 50);
        label[25].setBounds(60, 160, 50, 50);
        label[26].setBounds(110, 160, 50, 50);
        label[27].setBounds(160, 160, 50, 50);
        label[28].setBounds(210, 160, 50, 50);
        label[29].setBounds(260, 160, 50, 50);
        label[30].setBounds(310, 160, 50, 50);
        label[31].setBounds(360, 160, 50, 50);
        
        //quintafila
        label[32].setBounds(10, 210, 50, 50);
        label[33].setBounds(60, 210, 50, 50);
        label[34].setBounds(110, 210, 50, 50);
        label[35].setBounds(160, 210, 50, 50);
        label[36].setBounds(210, 210, 50, 50);
        label[37].setBounds(260, 210, 50, 50);
        label[38].setBounds(310, 210, 50, 50);
        label[39].setBounds(360, 210, 50, 50);
        
        //sextafila
        label[40].setBounds(10, 260, 50, 50);
        label[41].setBounds(60, 260, 50, 50);
        label[42].setBounds(110, 260, 50, 50);
        label[43].setBounds(160, 260, 50, 50);
        label[44].setBounds(210, 260, 50, 50);
        label[45].setBounds(260, 260, 50, 50);
        label[46].setBounds(310, 260, 50, 50);
        label[47].setBounds(360, 260, 50, 50);
        
        label[48].setBounds(10, 310, 50, 50);
        label[49].setBounds(60, 310, 50, 50);
        label[50].setBounds(110, 310, 50, 50);
        label[51].setBounds(160, 310, 50, 50);
        label[52].setBounds(210, 310, 50, 50);
        label[53].setBounds(260, 310, 50, 50);
        label[54].setBounds(310, 310, 50, 50);
        label[55].setBounds(360, 310, 50, 50);
        
        label[56].setBounds(10, 360, 50, 50);
        label[57].setBounds(60, 360, 50, 50);
        label[58].setBounds(110, 360, 50, 50);
        label[59].setBounds(160, 360, 50, 50);
        label[60].setBounds(210, 360, 50, 50);
        label[61].setBounds(260, 360, 50, 50);
        label[62].setBounds(310, 360, 50, 50);
        label[63].setBounds(360, 360, 50, 50);

        movimiento.setBounds(430,300,80,30);
        
        tab();
        label[0].setBackground(jugador);
       //label[1].setBackground(jugador2);

        for (int i = 0; i < label.length; i++) {
            this.add(label[i]);
        }

        this.add(movimiento);
        movimiento.addActionListener(this);
    }
    
    public void tab(){
        for (int i = 0; i < label.length; i++) {
            label[i].setOpaque(true);
        }
        
        
         //primerafila
        label[0].setBackground(casillas);
        label[1].setBackground(casilla2);
        label[2].setBackground(casillas);
        label[3].setBackground(casilla2);
        label[4].setBackground(casillas);
        label[5].setBackground(casilla2);
        label[6].setBackground(casillas);
        label[7].setBackground(casilla2);
        
        //Segundafila
        label[8].setBackground(casilla2);
        label[9].setBackground(casillas);
        label[10].setBackground(casilla2);
        label[11].setBackground(casillas);
        label[12].setBackground(casilla2);
        label[13].setBackground(casillas);
        label[14].setBackground(casilla2);
        label[15].setBackground(casillas);
        
        //tercerafila
        label[16].setBackground(casillas);
        label[17].setBackground(casilla2);
        label[18].setBackground(casillas);
        label[19].setBackground(casilla2);
        label[20].setBackground(casillas);
        label[21].setBackground(casilla2);
        label[22].setBackground(casillas);
        label[23].setBackground(casilla2);
        
        
        //Cuartafila
        label[24].setBackground(casilla2);
        label[25].setBackground(casillas);
        label[26].setBackground(casilla2);
        label[27].setBackground(casillas);
        label[28].setBackground(casilla2);
        label[29].setBackground(casillas);
        label[30].setBackground(casilla2);
        label[31].setBackground(casillas);
        
        //Quintafila
        label[32].setBackground(casillas);
        label[33].setBackground(casilla2);
        label[34].setBackground(casillas);
        label[35].setBackground(casilla2);
        label[36].setBackground(casillas);
        label[37].setBackground(casilla2);
        label[38].setBackground(casillas);
        label[39].setBackground(casilla2);
        
        //sextafila
        label[40].setBackground(casilla2);
        label[41].setBackground(casillas);
        label[42].setBackground(casilla2);
        label[43].setBackground(casillas);
        label[44].setBackground(casilla2);
        label[45].setBackground(casillas);
        label[46].setBackground(casilla2);
        label[47].setBackground(casillas);
        
          //septimafila
        label[48].setBackground(casillas);
        label[49].setBackground(casilla2);
        label[50].setBackground(casillas);
        label[51].setBackground(casilla2);
        label[52].setBackground(casillas);
        label[53].setBackground(casilla2);
        label[54].setBackground(casillas);
        label[55].setBackground(casilla2);
        
        
          //Octavafila
        label[56].setBackground(casilla2);
        label[57].setBackground(casillas);
        label[58].setBackground(casilla2);
        label[59].setBackground(casillas);
        label[60].setBackground(casilla2);
        label[61].setBackground(casillas);
        label[62].setBackground(casilla2);
        label[63].setBackground(casillas);
        
    }

    
    
    
    private JLabel[] j1 = new JLabel [64];
    private JLabel[] j2 = new JLabel [64];
    
    private int posj1 = 0;
    private int posj2 = 0;

    private int turno = 0;
    
    
    public void actionPerformed(ActionEvent ae) {
        
        if (turno == 0) {
            JOptionPane.showMessageDialog(null, "Turno j1");
            
            int espacios  = (int)(((Math.random())*60)/10)+1;
            
            posj1+=espacios;
            int postablero = posj1+1;
            JOptionPane.showMessageDialog(null, "Has sacado un "+ espacios +" te mueves a la posicion"+postablero);
            
            for (int i = 0; i < 64; i++) {
                
                if (posj1 == 4) {
                    JOptionPane.showMessageDialog(null, "Pisas una escalera, avanza hasta la casilla 10");
                    posj1= 9;
                }
                
                //j2
                
                 if (posj2 == 4) {
                    JOptionPane.showMessageDialog(null, "Pisas una escalera, avanza hasta la casilla 10");
                    posj2= 9;
                }

            }
                for (int i = 0; i < posj1; i++) {
               
                label[posj1].setBackground(jugador);
                
                }
               
            if (posj1 >=63) {
                  
                JOptionPane.showMessageDialog(null, "J1 ha ganado");
                    
            }  
            
            turno =1;
            
            
            
        }else if (turno == 1) {
                JOptionPane.showMessageDialog(null, "Turno j2");
            
                int espacios  = (int)(((Math.random())*60)/10)+1;

                posj2+=espacios;
                int postablero = posj2+1;
                JOptionPane.showMessageDialog(null, "Has sacado un "+ espacios +" te mueves a la posicion"+postablero);
            
                for (int i = 0; i < 64; i++) {

                    if (posj2 == 4) {
                        JOptionPane.showMessageDialog(null, "Pisas una escalera, avanza hasta la casilla 10");
                        posj2= 9;
                    }
                    
                    if (posj1 == 4) {
                       JOptionPane.showMessageDialog(null, "Pisas una escalera, avanza hasta la casilla 10 ");
                       posj1= 9; 
                    }

                }

                for (int i = 0; i < posj2; i++) {
                    
                    label[posj2].setBackground(jugador2);

                }

                if (posj2 >=63) {

                    JOptionPane.showMessageDialog(null, "J2 ha ganado");

                }
                
                turno =0;
            }
        
        
        
        /*if(ae.getSource() == movimiento){
            
            if (turno == 0) {
                
                dadito = (int)(((Math.random())*60)/10)+1;
                JOptionPane.showMessageDialog(null,"Turno J1\nHas caido en: "+dadito);
                player = player + dadito;
            
                for (int i = 0; i < player; i++) {
                    tab();
                    label[player].setBackground(jugador);
                
                }
                
            } 
            
            if (turno == 1) {
                dadito = (int)(((Math.random())*60)/10)+1;
            JOptionPane.showMessageDialog(null,"Turno J2\nHas caido en: "+dadito);
            player2 = player2 + dadito;
            for (int i = 0; i < player; i++) {
                tab();
                label[player].setBackground(jugador2);
            }
                
                
            }
            
           
            
            
            
            
            
            switch(player){
                case 0:
                    tab();
                    label[0].setBackground(jugador);  
                break;
                    case 1:
                    tab();
                    label[1].setBackground(jugador);
                break;
                case 2:
                    tab();
                    label[63].setBackground(jugador);
                break;
                case 3:
                    tab();
                    label[63].setBackground(jugador);
                break;
                case 4:
                    tab();
                    label[63].setBackground(jugador);
                break;
                case 5:
                    tab();
                    label[63].setBackground(jugador);
                break;
                case 6:
                    tab();
                    label[63].setBackground(jugador);
                break;
                case 7:
                    tab();
                    label[63].setBackground(jugador);
                break;
                case 8:
                    tab();
                    label[63].setBackground(jugador);
                break;
                case 9:
                    tab();
                    label[63].setBackground(jugador);
                break;
                case 10:
                    tab();
                    label[63].setBackground(jugador);
                break;
                
                //Segund parte
                case 11:
                    tab();
                    c12.setBackground(jugador);
                break;
                case 12:
                    tab();
                    c13.setBackground(jugador);
                break;
                case 13:
                    tab();
                    c14.setBackground(jugador);
                break;
                case 14:
                    tab();
                    c15.setBackground(jugador);
                break;
                case 15:
                    tab();
                    c16.setBackground(jugador);
                break;
                case 16:
                    tab();
                    c17.setBackground(jugador);
                break;
                case 17:
                    tab();
                    c18.setBackground(jugador);
                break;
                case 18:
                    tab();
                    c19.setBackground(jugador);
                break;
                case 19:
                    tab();
                    c20.setBackground(jugador);
                break;
                case 20:
                    tab();
                    c21.setBackground(jugador);
                break;
                
                //Tercera parte
                case 21:
                    tab();
                    c22.setBackground(jugador);
                break;
                case 22:
                    tab();
                    c23.setBackground(jugador);
                break;
                case 23:
                    tab();
                    c24.setBackground(jugador);
                break;
                case 24:
                    tab();
                    c25.setBackground(jugador);
                break;
                case 25:
                    tab();
                    c26.setBackground(jugador);
                break;
                case 26:
                    tab();
                    c27.setBackground(jugador);
                break;
                case 27:
                    tab();
                    c28.setBackground(jugador);
                break;
                case 28:
                    tab();
                    c29.setBackground(jugador);
                break;
                case 29:
                    tab();
                    c30.setBackground(jugador);
                break;
                case 30:
                    tab();
                    c31.setBackground(jugador);
                break;
                
                //Cuarta parte
                case 31:
                    tab();
                    c32.setBackground(jugador);
                break;
                case 32:
                    tab();
                    c33.setBackground(jugador);
                break;
                case 33:
                    tab();
                    c34.setBackground(jugador);
                break;
                case 34:
                    tab();
                    c35.setBackground(jugador);
                break;
                case 35:
                    tab();
                    c36.setBackground(jugador);
                break;
                case 36:
                    tab();
                    c37.setBackground(jugador);
                break;
                case 37:
                    tab();
                    c38.setBackground(jugador);
                break;
                case 38:
                    tab();
                    c39.setBackground(jugador);
                break;
                case 39:
                    tab();
                    c40.setBackground(jugador);
                break;
                case 40:
                    tab();
                    c41.setBackground(jugador);
                break;
                
                //Quinta parte
                case 41:
                    tab();
                    c42.setBackground(jugador);
                break;
                case 42:
                    tab();
                    c43.setBackground(jugador);
                break;
                case 43:
                    tab();
                    c44.setBackground(jugador);
                break;
                case 44:
                    tab();
                    c45.setBackground(jugador);
                break;
                case 45:
                    tab();
                    c46.setBackground(jugador);
                break;
                case 46:
                    tab();
                    c47.setBackground(jugador);
                break;
                case 47:
                    tab();
                    c48.setBackground(jugador);
                break;
                
                 case 48:
                    tab();
                    c49.setBackground(jugador);
                break;
                case 49:
                    tab();
                    c50.setBackground(jugador);
                break;
                case 50:
                    tab();
                    c51.setBackground(jugador);
                break;
                case 51:
                    tab();
                    c52.setBackground(jugador);
                break;
                case 52:
                    tab();
                    c53.setBackground(jugador);
                break;
                case 53:
                    tab();
                    c54.setBackground(jugador);
                break;
                case 54:
                    tab();
                    c55.setBackground(jugador);
                break;
                case 55:
                    tab();
                    c56.setBackground(jugador);
                break;

                case 56:
                    tab();
                    c57.setBackground(jugador);
                break;
                case 57:
                    tab();
                    c58.setBackground(jugador);
                break;
                case 58:
                    tab();
                    c59.setBackground(jugador);
                break;
                case 59:
                    tab();
                    c60.setBackground(jugador);
                break;
                case 60:
                    tab();
                    c61.setBackground(jugador);
                break;
                case 61:
                    tab();
                    c62.setBackground(jugador);
                break;
                case 62:
                    tab();
                    c63.setBackground(jugador);
                break;
                case 63:
                    tab();
                    c64.setBackground(jugador);
                break;
               
            }
        }*/
      
    }

    
}