/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persons;

/**
 *
 * @author Student
 */
public abstract class Person {
    private String name;
    private int cedula;

    public String getName() {
        return name;
    }

    public int getCedula() {
        return cedula;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int cedula) {
        this.name = name;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", cedula=" + cedula + '}';
    }
    
    
}
