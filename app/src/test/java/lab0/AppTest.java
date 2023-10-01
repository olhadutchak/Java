package lab0;
import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class AppTest {
    @DataProvider(name = "integerNumberTestData")
    public Object[][] integerNumberTestData() {
        return new Object[][] {
            {10, 3, 1},
            {7, 5, 2},
        
            
        };
    }

    @Test(dataProvider = "integerNumberTestData")
    public void testIntegerNumber(int A, int B, int expected) {
        int result = Lab0.integerNumber(A, B);
        assertEquals(result, expected);
    }

    @DataProvider(name = "conditionalTaskTestData")
    public Object[][] conditionalTaskTestData() {
        return new Object[][] {
            {1, 2, true},
            {0, -3, true},
            
        };
    }

    @Test(dataProvider = "conditionalTaskTestData")
    public void testConditionalTask(int A, int B, boolean expected) {
        boolean result = Lab0.conditionalTask(A, B);
        assertEquals(result, expected);
    }

    @DataProvider(name = "conditionalOperatorsTestData")
    public Object[][] conditionalOperatorsTestData() {
        return new Object[][] {
            {1, -2, 1, new int[] {2, 1}},
            
            {0, 0, 0, new int[] {0, 0}}
        };
    }

    @Test(dataProvider = "conditionalOperatorsTestData")
    public void testConditionalOperators(int number1, int number2, int number3, int[] expected) {
        int[] result = Lab0.conditionalOperators(number1, number2, number3);
        assertEquals(result, expected);
    }

    @DataProvider(name = "selectionOperatorTestData")
    public Object[][] selectionOperatorTestData() {
        return new Object[][] {
            {5.0, 2.0, 2.0, 7.0},
            {10.0, 2.0, 2, 8.0},
            {6.0, 0.0, 4, -1.0},
            {8.0, 0.0, 4, -1.0}
        };
    }

    @Test(dataProvider = "selectionOperatorTestData")
    public void testSelectionOperator(double A, double B, int N, double expected) {
        double result = Lab0.selectionOperator(A, B, N);
        assertEquals(result, expected);
    }

    @Test(dataProvider = "loopWithParameterTestData")
    public void testLoopWithParameter(double priceKg, double[] expectedPrices) {
        double[] actualPrices = Lab0.loopWithParameter(priceKg);

        for (int i = 0; i < expectedPrices.length; i++) {
            Assert.assertEquals(actualPrices[i], expectedPrices[i], 0.0001);
        }
    }
    @DataProvider
    public Object[][] loopWithParameterTestData() {
        return new Object[][] {
            {10.0, new double[]{1.00, 2.00, 3.00, 4.00, 5.00, 6.00, 7.00, 8.00, 9.00, 10.00}},
            {5.0, new double[]{0.50, 1.00, 1.50, 2.00, 2.50, 3.00, 3.50, 4.00, 4.50, 5.00}}
        };
    }

    
    @Test(dataProvider = "loopWithConditionTestData")
    public void testLoopWithCondition(int N, int expected) {
        int result = Lab0.loopWithCondition(N);
        assertEquals(result, expected);
    }
    @DataProvider(name = "loopWithConditionTestData")
    public Object[][] loopWithConditionTestData() {
    return new Object[][] {
        {1, 0},
        {2, 1},
        {4, 2},
        {8, 3},
        {16, 4}
    };
}

   
    @Test(dataProvider = "sequencesTestData")
    public void testSequences(double[] numbers, int[] expected) {
        int[] result = Lab0.sequences(numbers);
        assertEquals(result, expected);
    }
     @DataProvider(name = "sequencesTestData")
    public Object[][] sequencesTestData() {
        return new Object[][] {
            {new double[] {1.2, 2.5, 3.8}, new int[] {1, 2, 3, 6}},
            {new double[] {0.1, 0.2, 0.3}, new int[] {0, 0, 0, 0}},
            {new double[] {4.7, 5.9, 6.2}, new int[] {4, 5, 6, 15}},
            {new double[] {7.3, 8.1, 9.4}, new int[] {7, 8, 9, 24}}
        };
    }
    
    @Test(dataProvider = "testDatail")
    public void testFindMaxDensityDetail(double[][] inputMaterials, double[] expectedOutput) {
        double[] result = Lab0.findMaxDensityDetail(inputMaterials);

        Assert.assertEquals(result, expectedOutput, 0.01, "Помилка у тесті для вхідних даних: " + Arrays.deepToString(inputMaterials));
    }
    @DataProvider(name = "testDatail")
    public Object[][] testDatail() {
        return new Object[][] {
            
            { new double[][]{}, new double[]{0.0, 0.0} },

           
            { new double[][]{{10.0, 5.0}}, new double[]{0.0, 2.0} }
        };
    }

    

    @DataProvider(name = "arrayTestData")
    public Object[][] arrayTestData() {
        return new Object[][] {
            {1, new int[] {1}},
            {2, new int[] {1, 1}},
            {5, new int[] {1, 1, 2, 3, 5}},
            {8, new int[] {1, 1, 2, 3, 5, 8, 13, 21}}
        };
    }

    @Test(dataProvider = "arrayTestData")
    public void testArray(int n, int[] expected) {
        int[] result = Lab0.array(n);
        assertEquals(result, expected);
    }
    @Test(dataProvider = "matrixTest")
    public void testCreateMatrix(int M, int N, int D, int[] initialNumbers, int[][] expectedMatrix) {
        int[][] resultMatrix = Lab0.createMatrix(M, N, D, initialNumbers);
        assertEquals(resultMatrix, expectedMatrix);
    }

    @DataProvider(name = "matrixTest")
    public Object[][] matrixTest() {
        return new Object[][] {
            {3, 4, 2, new int[]{1, 2, 3}, new int[][]{{1, 3, 5, 7}, {2, 4, 6, 8}, {3, 5, 7, 9}}},
            {2, 3, 1, new int[]{2, 5}, new int[][]{{2, 3, 4}, {5, 6, 7}}}
        };
    }
    

    
}