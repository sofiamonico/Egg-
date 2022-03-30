/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package PersonaEntidades;

import java.util.Date;
import java.util.Scanner;

public class Persona {
    public String nombre;
    public Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        this.nombre=leer.next();
        System.out.println("Ingrese el dia de nacimiento");
        int dia= leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes= leer.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int anio= leer.nextInt();
        Date fecha= new Date(anio-1900,mes-1,dia);
        this.fechaNacimiento=fecha;
    }
    
    public int calcularEdad(){
        Date fechaActual = new Date();
        return fechaActual.getYear() - this.fechaNacimiento.getYear();
    }
    
    public boolean menorQue(int edad){
        int edadPersona = calcularEdad();
        return edadPersona<edad;
    }
    
    public void mostrarPersona(){
        System.out.println("La persona ingresada se llama: " + this.nombre + 
                " Y su fecha de nacimiento es : " + this.fechaNacimiento);
    }
}
