public class Hyperpar {

    public boolean Hyper(long numero){

        /*
        * Sacamos tamaño del número
        * Inicializamos las variables para no tener que repetirlo en el bucle
        */
        int n1, contador1 = 0;
        boolean resultado = true;
        String pasar = String.valueOf(numero);
        int tamanyo = pasar.length();

        for (int i = 0; i < tamanyo; i++) {
            n1 = Integer.parseInt(String.valueOf(pasar.charAt(i)));

            if (n1%2 != 0){
                contador1++;
            }
        }

        /*
         * Se hace la comprobación de si es Par o no
         */

        if (contador1 >= 1){
            resultado = false;
        }else {
            resultado = true;
        }

        return resultado;

    }


}
