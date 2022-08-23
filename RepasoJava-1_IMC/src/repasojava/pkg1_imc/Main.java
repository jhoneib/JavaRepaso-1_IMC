package repasojava.pkg1_imc;

import javax.swing.JOptionPane;

public class Main 
{

    public static void main(String[] args) 
    {
        double peso, imc, estatura;
        String name;
        
        
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su estatura en metros: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kg: "));
        name = JOptionPane.showInputDialog("Ingrese su nombre: ");
        
        
        Persona persona1 = new Persona(name, peso, estatura);
        
        imc = persona1.calculoIMC(persona1.getEstatura(), persona1.getPeso());
        
        System.out.println(persona1.getName()+" con peso de "+persona1.getPeso()+" kgs y estatura "+persona1.getEstatura()+
                " tiene un IMC de "+imc);
        
        System.out.println(persona1.getName()+" "+persona1.escalaIMC(imc));
        
        

    }    
    
    
    
}

