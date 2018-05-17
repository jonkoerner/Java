import java.lang.Math;
public class CalculateHypotenuse {
    public double calculate(int legA, int legB) {
        double legC = Math.sqrt((legA * legA+ legB * legB ));
        return legC;
        // calculate the value of c given legA and legB
    }
}