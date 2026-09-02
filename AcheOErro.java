public class AcheOErro {
    public static void main(String[] args) {
        // NÍVEL 1 
        
        /* 
        int flexoes = 1;

        while (flexoes <= 5) {
            System.out.println("Po fez a flexão número " + flexoes);
        }
        System.out.println("Treino concluído!"); 
        */

        // CÓDIGO CORRETO:
        int flexoes = 1;

        while (flexoes <= 5) {
            System.out.println("Po fez a flexão número " + flexoes);
            flexoes++; // CORREÇÃO: Agora ele conta cada flexão
        }
        System.out.println("Treino concluído!\n");

        // NÍVEL 2

        /* 
        int bolinhos = 5;

        while (bolinhos > 0) {
            System.out.println("Po comeu um bolinho!");
            bolinhos++; 
        }

        System.out.println("Saco de bolinhos vazio!");
        */

        // CÓDIGO CORRETO:
        int bolinhos = 5;

        while (bolinhos > 0) {
        System.out.println("Po comeu um bolinho!");
        bolinhos--; // CORREÇÃO: Diminui 1 bolinho
        }

        System.out.println("Saco de bolinhos vazio!");

    }
}


