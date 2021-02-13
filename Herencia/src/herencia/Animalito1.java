
package herencia;
public class Animalito1 extends Animalito {

    private int numextremidades;
    private int numorejas;

    //Constructor
    public Animalito1(String especie, String habitat, String desplazamiento, int numextremidades, int numorejas) {
        super(especie, habitat, desplazamiento);
        this.numextremidades = numextremidades;
        this.numorejas = numorejas;
    }
    
    public class Animalito2 extends Animalito {

        private int edad;
        private String nombre;

        //Constructor
        public Animalito2(String especie, String habitat, String desplazamiento, int numextremidades, int numorejas, int edad, String nombre) {
            super(especie, habitat, desplazamiento);
            this.edad = edad;
            this.nombre = nombre;
        }

        public class Animalito3 extends Animalito {

            private String humor;
            private int tamano;

            //Constructor
            public Animalito3(String especie, String habitat, String desplazamiento, int numextremidades, int numorejas, int edad, String nombre, String humor, int tamano) {
                super(especie, habitat, desplazamiento);
                this.humor = humor;
                this.tamano = tamano;
            }

            public void muestradatos() {
                System.out.println("Animal: " + getEspecie() + "\nHabitat: " + getHabitat() + "\nDesplazamiento: " + getDesplazamiento() + "\nExtremidades: " + numextremidades + "\nOrejas: " + numorejas + "\nEdad: " + edad + "\nNombre: " + nombre + "\nHumor: " + humor + "\nTamaño: " + tamano);
            }
        }
    }
}
   

