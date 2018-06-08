
public class Verifier {
    public static void verify(Integer max, Integer firstElement, Integer secondElement){
        if (firstElement <= 0)
            throw new IllegalArgumentException("fisrtElement parameter must be positive");

        if (max < firstElement)
            throw new IllegalArgumentException("firstElement parameter must be below or equal max");

        if (secondElement <= 0)
            throw new IllegalArgumentException("secondElement parameter must be positive");

        if (max < secondElement)
            throw new IllegalArgumentException("secondElement parameter must be below or equal max");
    }

    public static boolean checkPositive(Integer max){
        if (max>0){
            return true;
        }else{
            throw new IllegalArgumentException("Total must be positive");
        }
    }


}
