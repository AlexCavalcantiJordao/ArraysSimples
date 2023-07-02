package arrayssimples;

import java.util.Arrays;

public class ArraysSimples {

    public static void main(String[] args) {

        String[] paises = {"Brasil", "China", "Russia", "India"};
        //sSystem.out.println(paises);
        System.out.println(Arrays.toString(paises));

        int posicao = Arrays.binarySearch(paises, "Brasil");
        //System.out.println(posicao);

        Arrays.sort(paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));

    }
}
