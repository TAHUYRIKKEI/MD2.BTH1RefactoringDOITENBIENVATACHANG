public class Calculator {
    public static int Calculator(int firstOperand, int secondOperand, int operator){
            switch (operator) {
                case '+':
                    return firstOperand + secondOperand;
                case '-':
                    return  firstOperand -secondOperand;
                case '*':
                    return  firstOperand * secondOperand;
                case '/':
                    if (secondOperand !=0)
                        return  firstOperand /secondOperand;
                    else
                        throw new RuntimeException("Can not divide by 0");
                default:
                    throw new RuntimeException("Unsupported operation");


            }
        }


}
