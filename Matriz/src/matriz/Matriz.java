
package matriz;
import javax.swing.JOptionPane;
public class Matriz {

    public static void main(String[] args) {
        int 
          n = Integer.parseInt(JOptionPane.showInputDialog
        ("Ingrese un número:"));
        
        int
          m = Integer.parseInt(JOptionPane.showInputDialog
        ("Ingrese otro Número"));
        
        int matriz[][] = new int[n][m];
        String c = "";
        
        for(int a=0;a<n;a++){
            for(int b=0;b<m;b++)
                
            {c+="["+(n+m)+"]"+" - ";}
            
            c=c+"\n";
        }
        JOptionPane.showMessageDialog(null, c);

    }
    
}
