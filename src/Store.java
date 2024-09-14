public class Store {
    public static void main(String[] args) {
        //CONSTANTES PARA PRECIOS DE PRODUCTOS
        final int PRECIO_1 = 15;
        final int PRECIO_2 = 10;
        final int PRECIO_3 = 5;
        //CONSTANTES PARA LOS NUMEROS 
        final int NUMERO_1=2;
        final int NUMERO_2=3;
        final int NUMERO_3=4;

        int total1 = PRECIO_1 * NUMERO_1;
        int total2 = PRECIO_2 * NUMERO_2;
        int total3 = PRECIO_3 * NUMERO_3;
        final int PRECIO_MEDIO=50;
        //array para precios
        int[] precios={PRECIO_1,PRECIO_2,PRECIO_3};
        //array para numero
        int[] numeros={NUMERO_1,NUMERO_2,NUMERO_3};

        int totalSales =0;

        for (int i=0;i<precios.length;i++){
            
        }
        if (totalSales > PRECIO_MEDIO) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
