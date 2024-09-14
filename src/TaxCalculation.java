public class TaxCalculation {

    public static void main(String[] args) {
        // *Fase 1: Definición de constantes*
        final double TAX_RATE_HIGH = 0.15;  // Tasa de impuesto alta
        final double TAX_RATE_LOW = 0.10;   // Tasa de impuesto baja
        final double TAX_THRESHOLD = 50;    // Umbral para el cálculo del impuesto
        final double TOTAL_TAX_THRESHOLD = 50; // Umbral para el total de impuestos

        // *Fase 2: Diseño*
        // Array de precios de productos
        double[] productPrices = {100, 200};
        
        // Array de tasas impositivas
        double[] taxRates = {TAX_RATE_LOW, TAX_RATE_HIGH};

        // *Fase 3: Implementación*
        double totalTax = 0;

        for (double price : productPrices) {
            double tax;
            if (price > TAX_THRESHOLD) {
                tax = price * TAX_RATE_HIGH;  // Usar tasa alta si el precio es mayor al umbral
            } else {
                tax = price * TAX_RATE_LOW;   // Usar tasa baja si el precio es menor o igual al umbral
            }
            totalTax += tax;  // Acumulamos el impuesto total
        }

        // *Fase 4: Condición para el total de impuestos*
        if (totalTax > TOTAL_TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low total tax: " + totalTax);
        }
    }
}