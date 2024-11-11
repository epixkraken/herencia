package udla.dteran.herencia;

//en objetos hay redistribucion de código
//polimorfismo
//final es que esa clase no permite herencia

public class PrincipalHerencia {
    public static void main(String[] args) {
        Persona persona = new Persona();

        Alumno alumno = new Alumno();
        alumno.setNombre("Pumba");
        alumno.setApellido("Miau");
        alumno.setCarrera("Superestrella");
        alumno.setEdad(34);
        alumno.setCorreo("pimba@udla.ec");
        alumno.setNotap1(7D);
        alumno.setNotap2(8D);
        alumno.setNotap3(8D);
        System.out.println("Datos del Alumno");
        System.out.println("Nombre y Apellido = " + alumno.getNombre() + " " + alumno.getApellido());

        Profesor profesor = new Profesor();
    }
}
