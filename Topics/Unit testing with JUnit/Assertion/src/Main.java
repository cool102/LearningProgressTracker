

class CalculatorTest {

    void testAddition() {
        Calculator calculator = new Calculator();
        int res = calculator.add(5,2);
        Assertions.assertEquals(7,res);

    }
}