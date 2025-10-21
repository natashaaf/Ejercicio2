import static jdk.internal.icu.text.UTF16.charAt;

public class Main {
    public static void main(String[] args) {


    }

    //1. Crea una función que sea checkWordLength(String word) que devuelva la longitud de
    // cada palabra que se le envíe como parámetro.

    public static int checkWordLength(String word) {

        word.length();

        return word.length();
    }

    //2. Crea una función NumOfVowels(String word) que devuelva el número de vocales que contiene esa palabra.
    // Para poder realizar este ejercicio, deberás descomponer el String en un array de char[] con la función: toCharArray();

    public static int NumOfVowels(String miscelanea) {

        char[] arrayChars = miscelanea.toCharArray();

        int cont = 0;

        for (int i = 0; i < arrayChars.length; i++) {
            char c = Character.toLowerCase(arrayChars[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cont++;
            }
        }

        return cont;
    }

    //3. Crea una función llamada checkNumberOfPrimes(int[] numbers) la cual se le envíe como parámetro un array de números
    // y nos devuelva cuantos números primos hay. Crea otra función que sea isPrime(int i) que devuelva un boolean. Úsala en la primera función.

    public static int isPrime(int[] numbers) {


        return;
    }

    public static int checkNumberOfPrimes(int[] numbers) {
        return 0;
    }

    //4: Crea una función llamada isIdentityMatrix(int[][] matrix) que devuelva un booleano conforme si una matriz
    // es identidad o no. Recuerda que una matriz identidad es aquella que su diagonal de izquierda a derecha son todo 1 y el resto son todo 0.

    public static boolean isIdentityMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (matrix[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
