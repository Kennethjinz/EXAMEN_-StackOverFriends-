/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persons;


public class Funcionario extends Person {
   private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Funcionario(String departamento, String name, int cedula) {
        super(name, cedula);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "departamento=" + departamento + '}';
    }
   
}
