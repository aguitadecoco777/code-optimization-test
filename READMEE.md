[3:40 PM, 9/14/2024] cristian..: public class TaxCalculation {

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
[3:45 PM, 9/14/2024] cristian..: # Refactorization Quiz: Applying the SDLC Process

AgeVallidation

Aquí tienes una versión reducida y concisa de la documentación para el código Java AgeValidation:

---

## *Documentación del Código: AgeValidation*

### *Descripción General*

El programa AgeValidation solicita al usuario que ingrese su edad y verifica si cumple con un límite de edad para conceder o denegar el acceso. El límite de edad es 18 años.

### *Componentes del Código*

1. *Importación de Librerías*

    java
    import java.util.Scanner;
    

    - Importa la clase Scanner para la entrada de datos desde la consola.

2. *Método Principal*

    java
    public static void main(String[] args) {
    

    - Método principal que inicia la ejecución del programa.

3. *Creación y Uso del Objeto Scanner*

    java
    Scanner escaner = new Scanner(System.in); // Creación del objeto Scanner
    System.out.print("Ingrese su edad: ");
    int edadUsuario = escaner.nextInt();
    

    - Crea un objeto Scanner para leer la edad del usuario desde la consola.

4. Definición de la Constante y Validación

    java
    final int AGE_LIMIT = 18;
    if (edadUsuario >= AGE_LIMIT) {
        System.out.println("Access granted");
    } else {
        System.out.println("Access denied");
    }
    

    - Define AGE_LIMIT como 18. Verifica si la edad del usuario es suficiente para conceder el acceso.

### *Ejemplo de Ejecución*

- *Entrada: 20 → **Salida*: Access granted
- *Entrada: 16 → **Salida*: Access denied

---

TaxCalculation

Aquí tienes una documentación concisa para el código Java TaxCalculation, destacando los aspectos más importantes.

---

## *Documentación del Código: TaxCalculation*

### *Descripción General*

El programa TaxCalculation calcula el impuesto total para una lista de precios de productos, aplicando diferentes tasas impositivas basadas en un umbral de precio. Luego, determina si el impuesto total supera un umbral predefinido para clasificar el impuesto como alto o bajo.

### *Componentes del Código*

1. *Definición de Constantes*

    java
    final double TAX_RATE_HIGH = 0.15;  // Tasa de impuesto alta
    final double TAX_RATE_LOW = 0.10;   // Tasa de impuesto baja
    final double TAX_THRESHOLD = 50;    // Umbral para aplicar la tasa impositiva
    final double TOTAL_TAX_THRESHOLD = 50; // Umbral para el total de impuestos
    

    - *TAX_RATE_HIGH*: Tasa de impuesto aplicada a precios superiores al umbral.
    - *TAX_RATE_LOW*: Tasa de impuesto aplicada a precios inferiores o iguales al umbral.
    - *TAX_THRESHOLD*: Umbral de precio para decidir la tasa impositiva.
    - *TOTAL_TAX_THRESHOLD*: Umbral para determinar si el impuesto total es alto o bajo.

2. *Diseño de Datos*

    java
    double[] productPrices = {100, 200};  // Array de precios de productos
    

    - *productPrices*: Array que contiene los precios de los productos para los cuales se calculará el impuesto.

3. *Cálculo del Impuesto*

    java
    double totalTax = 0;

    for (double price : productPrices) {
        double tax;
        if (price > TAX_THRESHOLD) {
            tax = price * TAX_RATE_HIGH;  // Tasa alta para precios mayores al umbral
        } else {
            tax = price * TAX_RATE_LOW;   // Tasa baja para precios menores o iguales al umbral
        }
        totalTax += tax;  // Acumulación del impuesto total
    }
    

    - *totalTax*: Variable que acumula el impuesto calculado para todos los productos.
    - El bucle for itera sobre cada precio y calcula el impuesto basado en la tasa correspondiente, acumulando el resultado en totalTax.

4. *Evaluación del Impuesto Total*

    java
    if (totalTax > TOTAL_TAX_THRESHOLD) {
        System.out.println("High total tax: " + totalTax);
    } else {
        System.out.println("Low total tax: " + totalTax);
    }
    

    - Compara el totalTax con TOTAL_TAX_THRESHOLD para clasificar el impuesto total como alto o bajo e imprime el resultado.

### *Ejemplo de Ejecución*

- *Precios*: {100, 200}
- *Tasa Alta*: 0.15
- *Tasa Baja*: 0.10
- *Umbral de Precio*: 50
- *Umbral Total de Impuesto*: 50

- *Impuesto Total Calculado*: 45 + 30 = 75
- *Salida*: High total tax: 75