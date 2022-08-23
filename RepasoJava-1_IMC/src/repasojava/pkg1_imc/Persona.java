package repasojava.pkg1_imc;

public class Persona 
{
    private String name;
    private double peso;
    private double estatura;

    public Persona(String name, double peso, double estatura) 
    {
        this.name = name;
        this.peso = peso;
        this.estatura = estatura;
    }  
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public double calculoIMC(double estatura, double peso)
    {
        double imc;
        
        imc = peso / (estatura*estatura);
        
        return imc;
    }
    
    
    public String escalaIMC(double imc)
    {
        if( imc < 18.5 )
        {
            return "está Bajo de Peso";
        }
        else if( imc >= 18.5 && imc < 24.99 )
        {
            return "tiene un peso normal";
        }
        else if( imc >= 25 )
        {
            return "tiene sobrepeso";
        }
        else
        {
            return "está Obeso";
        }
                
    }
    
    
    
}
