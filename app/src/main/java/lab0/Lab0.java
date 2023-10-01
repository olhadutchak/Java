package lab0;

public class Lab0 {
    //The given length of the edge of the cube is a. 
    //Find the volume of the cube V = a^3 and its surface area S = 6·a^2.
    public static double[] inputOutput(double a) {
        
        double volume = Math.pow(a, 3);
        
        double surfaceArea = 6 * Math.pow(a, 2);
        return new double[]{volume, surfaceArea};
    }

    /*Given positive integers A and B (A > B). On a length segment
    A is placed as much as possible
    the number of segments of length B (without overlays).
    Using the operation of taking the remainder from division by a whole,
    find the length of the unoccupied part of segment A
    */
    public static int integerNumber(int A, int B) {
        if (A > B) {
             
            return A % B; 
        } 
            return -1; 
        
        
    }
    /*Two integers are given: A, B.
    Check the truth of the statement: "True inequalities A and 0 or B < –2".
    */
    public static boolean conditionalTask(int A, int B) {
          
            return ( (A != 0) || (B < -2));
     
    }
    /*
     Three integers are given.
     Find the number of positives and the number
     of negative numbers in the original set.
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
    /*
     Arithmetic operations on numbers are numbered as follows: 1 - addition, 2 - subtraction,
     3 - multiplication, 4 - division. Given action number N (an integer in the range 1–4)
     and real numbers A and B (not equal to 0).
     Perform the specified action on the numbers and display the result.
     */
    public static double selectionOperator(double A, double B, int N) {
        switch (N) {
            case 1:
                return  A + B;
            case 2:
                return  A - B;
                
            case 3:
                return  A * B;
               
            case 4:
                if (B != 0) {
                    return  A / B;
                } 
                    return -1;
            default:
                throw new IllegalAccessError("Wrong number of switch");
        }

       
    }
    /*Given a real number - the price of 1 kg of candy.
    Output the cost of 0.1, 0.2, ... , 1 kg of candies*/
    public static double[] loopWithParameter(double priceKg) {
        double[] prices = new double[10]; 
    
        for (int i = 0; i < 10; i++) {
            double kg = (i + 1) * 0.1; 
            prices[i] = kg * priceKg; 
        }
    
        return prices;
    } 
    /*
     Given an integer N (> 0), which is some power of 2: N = 2K.
     Find the integer K - the indicator of this power.
     */
    public static int loopWithCondition(int N){
        int K = 0; 

        while (N > 1) {
            N = N / 2;
            K++;
        }
        return K;
    }
    /*Given an integer N and a set of N positive real numbers. 
    Print in the same order the integer parts of all numbers from the given set 
    (as real numbers with a zero fractional part), as well as the sum of all integer parts. */
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
    /* Given an integer N and a set of N pairs of numbers (m, v) - data on 
    the mass m and volume v of parts made of various materials. 
    Display the number of the part made from the material of maximum density, 
    as well as the value of this maximum density. Density P is calculated using the formula
    P = m/v.*/
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
    
    /*
     * An integer N (> 2) is given. Generate and output an integer array of size 
     * N containing the first N elements of the Fibonacci sequence FK:
     * F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, …
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
    /*
     * Given positive integers M, N, a number D and a 
     * set of M numbers. Form a matrix of size M ґ N, 
     * in which the first column coincides with the original set of numbers, 
     * and the elements of each subsequent column are equal to the sum of 
     * the corresponding element of the previous column and 
     * the number D (as a result, each row of the matrix will contain elements of an arithmetic progression).
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