
package herencia;

public class Animalito 
{
    private String especie;
    private String habitat;
    private String desplazamiento; 

    public Animalito(String especie, String habitat, String desplazamiento) {
        this.especie = especie;
        this.habitat = habitat;
        this.desplazamiento = desplazamiento;
    }

    public String getEspecie() {
        return especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }
    
}
