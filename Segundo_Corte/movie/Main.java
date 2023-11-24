package movie;

//import java.util.ArrayList;
//import movie.ui.UIPeliculas;

import javax.swing.JOptionPane; 
import movie.ui.UIPeliculas;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ArrayList<String> meses = new ArrayList<>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        
        System.out.println(meses);
             
        /*for(String dato: meses) {
            System.out.println(dato);
        }
        */
        
        //meses.forEach(dato -> {
        //    System.out.println(dato);
        //});
        
        
        //Con Java Swing
        //**********************************************
        //JOptionPane.ERROR_MESSAGE.       -> 0
        //JOptionPane.INFORMATION_MESSAGE. -> 1
        //JOptionPane.WARNING_MESSAGE.     -> 2
        //JOptionPane.QUESTION_MESSAGE.    -> 3       
                        
        //Trainining panes:::
//        String valor = JOptionPane.showInputDialog(null,
//                "Ingrese Texto",
//                "Entrada",
//                3);
//        
//        JOptionPane.showMessageDialog(
//                null,
//                valor,
//                "Mi mensaje",
//                0);
        
        UIPeliculas.interfazUsuario();                        
    }    
}