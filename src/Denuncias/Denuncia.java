/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Denuncias;

/**
 *
 * @author Student
 */
public class Denuncia {
    public int Codigo; 
    public String Descipcion; 
    public Tipodenuncia Tipo;
    public String Provincia; 
     public String Canton; 

    public int getCodigo() {
        return Codigo;
    }

    public String getDescipcion() {
        return Descipcion;
    }

    public Tipodenuncia getTipo() {
        return Tipo;
    }

    public String getProvincia() {
        return Provincia;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setDescipcion(String Descipcion) {
        this.Descipcion = Descipcion;
    }

    public void setTipo(Tipodenuncia Tipo) {
        this.Tipo = Tipo;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }

    public Denuncia(int Codigo) {
        this.Codigo = Codigo;
        this.Descipcion = "";
        this.Tipo = Tipodenuncia.TALAILEGAL;
        this.Provincia = "";
        this.Canton = "";
    }

    @Override
    public String toString() {
        return "Denuncia{" + "Codigo=" + Codigo + ", Descipcion=" + Descipcion + ", Tipo=" + Tipo + ", Provincia=" + Provincia + ", Canton=" + Canton + '}';
    }

    
     
     
}
