/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persons;

import java.util.Arrays;

/**
 *
 * @author Student
 */
public class ListaFuncionarios extends Funcionario {
private int[]Listfuncionarios = new int[100];

    public int[] getListfuncionarios() {
        return Listfuncionarios;
    }

    public void setListfuncionarios(int[] Listfuncionarios) {
        this.Listfuncionarios = Listfuncionarios;
    }

   

    public ListaFuncionarios(String departamento, String name, int cedula) {
        super(departamento, name, cedula);
    }

    @Override
    public String toString() {
        return "ListaFuncionarios{" + "Listfuncionarios=" + Arrays.toString(Listfuncionarios) + '}';
    }
}
