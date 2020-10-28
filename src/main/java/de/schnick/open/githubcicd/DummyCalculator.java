package de.schnick.open.githubcicd;

public class DummyCalculator {

    public int addition(int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Number is too small :D");
        }else{
            return a + b;
        }
    }

    public int multiplication(int a, int b) {
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Number is too small :D");
        }else{
            return a * b;
        }
    }

    public static void main(String[] args) {
        DummyCalculator calculator = new DummyCalculator();
        System.out.println("1 + 1 = "+calculator.addition(1,1));
        System.out.println("1 * 1 = "+calculator.multiplication(1,1));
    }

}
