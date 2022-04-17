import java.util.Arrays;
import java.util.List;

public class Movie {

    //members
    private String title;
    private String studio;
    private String rating;


    //constructor
    public Movie(String t, String s, String r) {
        title = t;
        studio = s;
        rating = r;
    }

    public String toString()
    {
        return this.title + " " + this.studio + " " + this.rating;
    }
    //2nd constructor
    public Movie(String a, String b){
        title = a;
        studio = b;
        rating = "PG";
    }


    //method
    public static Movie[] getPG(Movie[] movies) {
        Movie[] newArrayMovie = new Movie[movies.length];
        int j = 0;
        for (int i = 0; i < movies.length; i++) {
            if(movies[i].rating.equals("PG")){
                newArrayMovie[j] = movies[i];
                j++;
            }
        }
        return newArrayMovie;
    }
    //new instance Casino Royale
public static    Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG-13");

    public static void main(String[] args) {
        Movie[] listMovies = {
                new Movie("One", "Two", "PG-18"),
                new Movie("One", "Two", "PG"),
                new Movie("One", "Two", "PG"),
                new Movie("One", "Two", "PG"),
        };
//        Movie[] list = getPG(listMovies);
//        for (int i = 0; i < list.length; i++) {
//            if(list[i] != null) {
//            System.out.println("New list of PG movies only: " + (list[i]).toString());
//        }}
        System.out.println(" New list of PG movies only: " + Arrays.toString(getPG(listMovies)));
    }


}
