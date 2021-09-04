import java.util.*;

class DVD{
    public static void main(String[] args) {
        //Declaring an array
        DVD[] dvdCollection = new DVD[15];

        String name;
        int realeaseYear;
        String director;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a movie:\t");
        name = sc.nextLine();
        System.out.println("Enter a release year:\t");
        realeaseYear = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a director:\t");
        director = sc.nextLine();

        for( int i = 0; i < dvdCollection.length; i++){
            System.out.println("Movie collection category : " +dvdCollection[i]);
        }
        System.out.println(Arrays.toString(dvdCollection));
    }
}