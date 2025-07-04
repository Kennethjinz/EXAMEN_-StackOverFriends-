/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Denunciante;

/**
 *
 * @author Student
 */
public enum Identidad {
    PIBLICA("Publica"),
    ANONIMA("Anonima");
    
    private final String estado;

    private Identidad(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Identidad{" + "ordinal=" + ordinal() + ", name=" + name() + ", estado=" + estado + '}';
    }
    
    
}
