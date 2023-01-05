public class Movie {
    static String tittle;
    static String studio;
    static String rating;

    public Movie(String tittleOfMovie, String studioName, String ratingOfTheMovie){
        tittle=tittleOfMovie;
        studio = studioName;
        rating = ratingOfTheMovie;
    }
    public Movie(String tittleOfTheMovie, String studioName){
        tittle= tittleOfTheMovie;
        studio = studioName;
        rating = "PG";
    }
    public static String printInfo(){
       // System.out.println(tittle+studio+rating);

       return "Movie name: "+tittle + "\n" + "Studio: " + studio+ "\n" + "Rating: " + rating;
    }

    public static void main(String[] args) {
        new Movie("Harry poter", "Don't Know");
        System.out.println(printInfo());
    }
}