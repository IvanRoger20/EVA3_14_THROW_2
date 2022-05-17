/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_14_throw_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_14_THROW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona persona = new persona();
        persona.setNombre("Juan escutia");
        try {
            persona.setEdad(23);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            persona persona2 = new persona("Juan Salomon",30);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

class persona {
    private String Nombre;
    private int Edad;

    public persona() {
    }

    public persona(String Nombre, int Edad) throws Exception {
        this.Nombre = Nombre;
        setEdad(Edad);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) throws Exception {
        if(Edad >= 0 && Edad <= 130 )
            this.Edad = Edad;
        else 
            throw new Exception("Rango de edad incorrecta!!");
    }
    
}