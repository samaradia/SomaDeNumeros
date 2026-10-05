public class LambdaExercises {
    public static void main(String[] args) {
        Multiplicacao mult = (a,b) -> a * b;
        System.out.println("Multiplicação: " + mult.multiplicacao(5,7));
    }
}