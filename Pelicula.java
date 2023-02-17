public class Pelicula {

    // El nombre de la pelicula
    private String nombrePelicula;
    // Cantidad de premios ganados
    private int premios;
    // Las peliculas que estan en Netflix
    private boolean peliculasEstanEnNetflix;

    /**
     * Crea peliculas con el nombre de la pelicula,premios de la pelicula y las peliculas que estan en Netflix
     */
    public Pelicula (String nombreDePelicula,int premiosGanados,boolean peliculasEnNetflix){
        nombrePelicula=nombreDePelicula;
        premios=premiosGanados;
        peliculasEstanEnNetflix=true;
    }

    public String getnombrePelicula(){
        return nombrePelicula;
    }

    public int getpremios(){
        return premios;
    }

    public boolean getpeliculasEstanEnNetflix(){
        return peliculasEstanEnNetflix;
    }

    public   void setNombrePelicula(String nombreDePelicula){
        nombrePelicula=nombreDePelicula;
    }

    public void SumarPremiosGanados(int cantidadPremios){
        premios =premios + cantidadPremios;
    }

    public void alternarPeliculasDeNetflix(){
        peliculasEstanEnNetflix=false;
    }

    public void imprimirPeliculas(){
        System.out.println("el nombre de la pelicula es"+ nombrePelicula);
        System.out.println("el numero de premios que tiene la pelicula es"+ premios);
        System.out.println(" las peliculas que estan en Netflix"+ peliculasEstanEnNetflix);
    }

    public String getPelicula(String pelicula){
        return pelicula;
    }

}

