package lab0;

public class Lab0 {
//The given length of the edge of the cube is a. 
//Find the volume of the cube V = a^3 and its surface area S = 6·a^2.
/**
 *
 * @param a The length of the edge of the cube (a > 0).
 * @return An array containing the volume and surface area of the cube.
 * @throws IllegalArgumentException If 'a' is less than or equal to 0.
 */
    public static double[] inputOutput(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("The length of the edge 'a' must be greater than 0.");
        }
        
        double volume = Math.pow(a, 3);
        double surfaceArea = 6 * Math.pow(a, 2);
        
        return new double[]{volume, surfaceArea};
    }
    

/**
 * Calculates the remaining length of segment A after placing as many segments of length B as possible on it without overlapping.
 *
 * @param A Length of segment A (A>0).
 * @param B Length of segment B (B>0 and < A).
 * @return The remaining length of segment A after placing segments of B on it.
 * @throws IllegalArgumentException If A <= B or if A or B is less than 0.
 */
public static int  integerNumber(int A, int B) {
    if (A <= 0 || B <= 0) {
        throw new IllegalArgumentException("A and B must be greater than 0");
    }
    
    if (A <= B) {
        throw new IllegalArgumentException("A must be greater than B");
    }
    
    return A % B;
}
 /**
 * Checks the truth of the statement: "True inequalities A and 0 or B < -2".
 *
 * @param A The first integer.
 * @param B The second integer.
 * @return True if the statement "A != 0 || B < -2" is true; otherwise, false.
 */
public static boolean conditionalTask(int A, int B) {
    return (A != 0) || (B < -2);
}   
/**
* Three integers are given.
     Find the number of positives and the number
     of negative numbers in the original set.

 * @param number1 The first integer.
 * @param number2 The second integer.
 * @param number3 The third integer.
 * @return An array of two integers containing the count of positive numbers (index 0)
 *         and the count of negative numbers (index 1) in the set.
*/
    public static int[] conditionalOperators(int number1, int number2, int number3) {
        int countPositive = 0;
        int countNegative = 0;
    

        countPositive += (number1 > 0) ? 1 : 0;
        countNegative += (number1 < 0) ? 1 : 0;
        countPositive += (number2 > 0) ? 1 : 0;
        countNegative += (number2 < 0) ? 1 : 0;
        countPositive += (number3 > 0) ? 1 : 0;
        countNegative += (number3 < 0) ? 1 : 0;
        
        return new int[] {countPositive, countNegative};
    }
/**
     Arithmetic operations on numbers are numbered as follows: 1 - addition, 2 - subtraction,
     3 - multiplication, 4 - division. Given action number N (an integer in the range 1–4)
     and real numbers A and B (not equal to 0).
     Perform the specified action on the numbers and display the result.

 * @param A The first real number (not equal to 0).
 * @param B The second real number (not equal to 0).
 * @param N The action number, where 1 represents addition, 2 represents subtraction,
 *          3 represents multiplication, and 4 represents division.
 * @return The result of the specified arithmetic operation.
 * @throws IllegalArgumentException If 'N' is not in the range 1-4, or if 'B' is equal to 0 when 'N' is 4.
 */
public static double selectionOperator(double A, double B, int N) {
    switch (N) {
        case 1:
            return A + B;
        case 2:
            return A - B;
        case 3:
            return A * B;
        case 4:
            if (B != 0) {
                return A / B;
            } else {
                throw new IllegalArgumentException("Division by zero is not allowed.");
            }
        default:
            throw new IllegalArgumentException("Invalid action number. It should be in the range 1-4.");
    }
}
/**
 * Calculate the cost of candy in increments of 0.1 kg up to 1 kg based on the price per 1 kg.
 *
 * @param priceKg The price of 1 kg of candy.
 * @return An array of 10 doubles representing the cost of 0.1, 0.2, ..., 1 kg of candy
 *         at the given price per 1 kg.
 */
public static double[] loopWithParameter(double priceKg) {
    double[] prices = new double[10]; 

    for (int i = 0; i < 10; i++) {
        double kg = (i + 1) * 0.1; 
        prices[i] = kg * priceKg; 
    }

    return prices;
}
/**
 * Calculate the exponent K of a given integer N, which is a power of 2: N = 2^K.
 *
 * @param N An integer N (> 0) that is a power of 2.
 * @return The integer K - the exponent of the power of 2.
 */
public static int loopWithCondition(int N){
    int K = 0; 

    while (N > 1) {
        N = N / 2;
        K++;
    }
    return K;
}
   
/**Given an integer N and a set of N positive real numbers. 
    Print in the same order the integer parts of all numbers from the given set 
    (as real numbers with a zero fractional part), as well as the sum of all integer parts.
     
 
 * @param numbers An array of positive real numbers.
 * @return An array of integers containing the integer parts of the numbers followed by their sum.
 */
    public static int[] sequences(double[] numbers) {
        int[] result = new int[numbers.length + 1];
        int sum = 0;
    
        for (int i = 0; i < numbers.length; i++) {
            double number = numbers[i];
            result[i] = (int) number;
            sum += result[i];
        }
    
        result[numbers.length] = sum;
        return result;
    }
/** Given an integer N and a set of N pairs of numbers (m, v) - data on 
    the mass m and volume v of parts made of various materials. 
    Display the number of the part made from the material of maximum density, 
    as well as the value of this maximum density. Density P is calculated using the formula
    P = m/v.
    *
 * @param materials An array of N pairs of numbers representing mass (m) and volume (v) of materials.
 * @return An array of two doubles: the index of the material with maximum density and its maximum density.
 *         If the input is null or empty, it returns [0.0, 0.0].
    */
    public static double[] findMaxDensityDetail(double[][] materials) {
        if (materials == null || materials.length == 0) {
            return new double[]{0.0, 0.0};
        }
    
        double maxDensity = -1;
        int maxDensityIndex = -1;
    
        for (int i = 0; i < materials.length; i++) {
            double mass = materials[i][0];
            double volume = materials[i][1];
            double density = mass / volume;
    
            if (density > maxDensity) {
                maxDensity = density;
                maxDensityIndex = i;
            }
        }
    
        return new double[]{maxDensityIndex, maxDensity};
    }
    
/**
     * An integer N (> 2) is given. Generate and output an integer array of size 
     * N containing the first N elements of the Fibonacci sequence FK:
     * F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, …
     *  
 * @param n An integer N (> 2) specifying the number of Fibonacci numbers to generate.
 * @return An integer array of size N containing the first N elements of the Fibonacci sequence.
 *         If N is less than or equal to 2, it returns an empty array.
     */
    public static int[] array(int n) {
        if (n <= 0) {
            return new int[0]; 
        }
    
        int[] fibonacciArray = new int[n];
        if (n >= 1) {
            fibonacciArray[0] = 1;
        }
        if (n >= 2) {
            fibonacciArray[1] = 1;
        }
    
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
    
        return fibonacciArray;
    }
    /**
     * Given positive integers M, N, a number D and a 
     * set of M numbers. Form a matrix of size M ґ N, 
     * in which the first column coincides with the original set of numbers, 
     * and the elements of each subsequent column are equal to the sum of 
     * the corresponding element of the previous column and 
     * the number D (as a result, each row of the matrix will contain elements of an arithmetic progression).
     * @param M  The number of rows in the matrix.
     * @param N  The number of columns in the matrix.
     * @param D  The common difference for the arithmetic progression in each column.
     * @param initialNumbers An array of M positive integers representing the values in the first column.
     * @return A 2D array (matrix) of size MxN containing the specified elements.
     */
    public static int[][] createMatrix(int M, int N, int D, int[] initialNumbers) {
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            matrix[i][0] = initialNumbers[i];
        }
        for (int j = 1; j < N; j++) {
            for (int i = 0; i < M; i++) {
                matrix[i][j] = matrix[i][j - 1] + D;
            }
        }
    
        return matrix;
    }

    public static void main(String[] args) {
        
        
}
} 