
public class TaxCalculation {

    public static void main(String[] args) {
        final double TAX_RATE_HIGH = 0.15;  // Tasa de impuesto alta
        final double TAX_RATE_LOW = 0.10;   // Tasa de impuesto baja
        final double TAX_THRESHOLD = 50;    // Umbral para el cálculo del impuesto
        int[] precios = {100, 200};

        double[] tax = {TAX_RATE_HIGH, TAX_RATE_LOW};
        double contador = 0;

        for (int i = 0; i < precios.length; i++) {
            double total = precios[i] - (precios[i] * tax[i]);

            contador = contador + total;
        }

        if (contador > TAX_THRESHOLD) {
            System.out.println("High total tax: " + contador);
        } else {
            System.out.println("Low total tax: " + contador);
        }
    }
}
