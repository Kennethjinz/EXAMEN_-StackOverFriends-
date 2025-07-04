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
public class listaDenunciantes extends denunciante {
    public int[] listaDenunciante = new int [50];

    public int[] getListaDenunciante() {
        return listaDenunciante;
    }

    public void setListaDenunciante(int[] listaDenunciante) {
        this.listaDenunciante = listaDenunciante;
    }

    public listaDenunciantes(Person name, Person cedula, String correo, String anonimo) {
        super(name, cedula, correo, anonimo);
    }

    @Override
    public String toString() {
        return "listaDenunciantes{" + "listaDenunciante=" + listaDenunciante + '}';
    }

  
    
}
