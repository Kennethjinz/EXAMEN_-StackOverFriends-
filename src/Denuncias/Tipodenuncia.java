/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Denuncias;
/**
 *
 * @author Student
 */
public enum Tipodenuncia {
    CONTAMINACIONAIRE("Contaminacion del aire"),
    CONTAMINACIONAGUA("Contaminacion de agua"),
    TALAILEGAL("Tala ilegal"),
    VERTIDORESIDUOS("Vertido de residuos"),
    RUIDOEXCESIVO("Ruido excesivo"),
    AFECTACIONBIODIVERSIDAD("Afectacion a la biodiversidad");
    
    private final String TipoDenuncia; 

    private Tipodenuncia(String TipoDenuncia) {
        this.TipoDenuncia = TipoDenuncia;
    }

    public String getTipoDenuncia() {
        return TipoDenuncia;
    }

    @Override
    public String toString() {
        return "Tipodenuncia{" + "TipoDenuncia=" + TipoDenuncia + '}';
    }
    
    
}
