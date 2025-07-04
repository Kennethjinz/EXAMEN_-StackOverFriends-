/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaDenuncias;
import interfaces.InterfaceGeneral;
import Denuncias.*;
/**
 *
 * @author Student
 */
public abstract class listaDenuncia implements InterfaceGeneral {
    /**
     * Lista de Denuncias:
Atributos:
Cursos: Arreglo estático.
Método:
Métodos de comportamiento genérico.
Cantidad de denuncias por tipo: Debe retornar la cantidad de denuncias por un t
     */
    
    private static Denuncia[] cursos = new Denuncia[20];
    
    public int findAndCount(Denuncia[] curso, int id){
        
        int cant = 0;
        
        for (Denuncia curso1 : curso) {
            if (id == curso1.getCodigo()) {
                cant++;
            } 
          }
        return cant;
        }
    
 
}
