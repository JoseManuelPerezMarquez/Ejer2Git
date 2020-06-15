/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCO1;

/**
 *
 * @author josem
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int imc(){
        double imc;
        int resultado =0;
       
          imc=(this.peso/(this.altura*this.altura));
          if(imc<20){
              resultado= -1;
          }else if(imc>=20 && imc<=25){
              resultado= 0;
          }else if(imc>25){
              resultado= 1;
          }
         return resultado;
    }
    public boolean mayorE (){
        boolean result = true;
        if(this.edad>=18){
           result= true; 
        }else{
            result = false;
        }
        return result;
    }
    public String sexo(){
        String result = "";
        if(this.sexo.equals("H")){
            result = "H";
        }else if(this.sexo.equals("M")){
            result = "M";
        }else{
            result ="H";
        }
        return result;
    }

    @Override
    public String toString() {
        
        return "nombre:" + nombre + "\napellidos:" + apellidos + "\nedad:" + edad + "\nsexo:" + sexo + "\npeso:" + peso + "\naltura:" + altura ;
    }

}
