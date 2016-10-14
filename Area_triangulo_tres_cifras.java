
package area_triangulo_tres_cifras;

import Tres_Cifras.Tres_Cifras;
import javax.swing.JOptionPane;
import AreaPerimetroTriangulo.AreaPerimetroTriangulo;
/**
 *
 * @author OTHONIEL
 */
public class Area_triangulo_tres_cifras {

    
    public static void main(String[] args) {
        
    Tres_Cifras tres = new Tres_Cifras();
      AreaPerimetroTriangulo tri = new AreaPerimetroTriangulo();
             int opcion=0,a,h,b;
        do{
           try  {
               opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                       "1.tres cifras"
                            +"\n2 area y perimetro del triangulo rectangulo "
                              + "\n3salir"

                                                    )); 
            switch(opcion){
               case 1:
                   try{
                       a=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa cinco numeros"));
                tres.Tres_Cifras(a);
                              
                   }catch(NumberFormatException n){
                       JOptionPane.showInputDialog(null,"Error"+ n.getMessage());
                   }
                     break;
                  
                   case 2:
                   try{

                 b=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor de la base"));
                 h=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor de la altura"));
                             tri.triangulo(h, b);
                   }catch(NumberFormatException n){
                       JOptionPane.showInputDialog(null,"Error"+ n.getMessage());
                   }
                     break;
                       
                   
                    case 3:
                   JOptionPane.showInputDialog(null,"programa finalizado");
                   break;
                   
              
               default:
                    JOptionPane.showInputDialog(null,"Opcion incorrecta");                         
                   
               }
           }catch(Exception e){
               JOptionPane.showInputDialog(null,"Error"+ e.getMessage()); 
           }
        }while(opcion!=3);
        }
        }   
    
