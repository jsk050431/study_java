public class Calculator {

    int first;
    int second;
    
    Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    int add() {
        return first + second;
    }
    int sub() {
        return first - second;
    }
    int mul() {
        return first * second;
    }
    double div() {
        return (double)first / (double)second;
    }
}