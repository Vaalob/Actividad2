
package Calificaciones;

public class Promedio {
    
    private float prom;
    private String nombre;
    private String nota;

    public String getNombre() {
        return nombre;
    }

    public String getNota() {
        return nota;
    }
   
    public void setNota(String nota) {
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void crearNombre(String _nombre){
        nombre = _nombre;
    }

 public void calcularProm(float calif1, float calif2, float calif3, float calif4, float calif5){

     prom = (calif1 + calif2 + calif3 + calif4 + calif5) /5 ;
 }
 
 public void mostrarNota(){
     if (prom >= 0 && prom <= 50)
     {
         nota = "F";
     }
     else if (prom >= 51 && prom <= 60)
     {
         nota = "E";
     }
     else if (prom >= 61 && prom <= 70)
     {
         nota = "D";
     }
     else if (prom >= 71 && prom <= 80)
     {
         nota = "C";
     }
     else if (prom >= 81 && prom <= 90)
     {
         nota = "B";
     }
     else if (prom >= 91 && prom <= 100)
     {
         nota = "A";
     }
     
}
 
    public void mostraProm(){
        System.out.println("Promedio: " +prom);
        System.out.println("Calificacion Final: " +nota);
    }
}
