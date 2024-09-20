public class Store {
    public static void main(String[] args) {
        //CONSTANTES PARA PRECIOS DE PRODUCTOS
        final int PRECIO_1 = 15;
        final int PRECIO_2 = 10;
        final int PRECIO_3 = 5;
        //CONSTANTES PARA LOS NUMEROS 
        final int CANTIDAD_1=2;
        final int CANTIDAD_2=3;
        final int CANTIDAD_3=4;
        //array para precios
        int[] precios={PRECIO_1,PRECIO_2,PRECIO_3};
        final int PRECIO_MEDIO=50;
        //array para numero
        int[] cantidades={CANTIDAD_1,CANTIDAD_2,CANTIDAD_3};

        int totalSales =0;

        for (int i = 0; i < precios.length; i++) {
            int total=cantidades[i]*precios[i];
            totalSales=totalSales+total;
        }
        if (totalSales > PRECIO_MEDIO) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
