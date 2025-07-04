/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Denunciante;

import persons.Person;

/**
 *
 * @author Student
 */
public class denunciante  {
    private Person name;
    private Person cedula;
    private String correo;
    private Identidad anonimo;

    public Person getName() {
        return name;
    }

    public Person getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public denunciante(Person name, Person cedula, String correo, String anonimo) {
        this.name = name;
        this.cedula = cedula;
        this.correo = correo;
        this.anonimo = Identidad.ANONIMA ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("denunciante{");
        sb.append("name=").append(name);
        sb.append(", cedula=").append(cedula);
        sb.append(", correo=").append(correo);
        sb.append(", anonimo=").append(anonimo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
