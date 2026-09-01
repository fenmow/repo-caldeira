public class Main {

    public static void main(String[] args) {

        String[] nomes = {
            "Tigresa",
            "Macaco",
            "Louva-a-Deus",
            "Víbora",
            "Garça"
        };

        int[] vida = {
            70,
            40,
            15,
            20,
            40
        };

        int vidaTaiLung = 100;
        int danoFuriosos = 10;
        int danoTaiLung = 25;

        int furiososVivos = 5;
        // A batalha continua enquanto os dois lados estiverem vivos
        while (vidaTaiLung > 0 && furiososVivos > 0) {
            System.out.println("\n=== NOVA RODADA ===");
            int integrante = 0;
            // Cada membro dos Cinco Furiosos tem sua vez
            while (integrante < nomes.length && vidaTaiLung > 0) {
                // Verifica se o integrante ainda está vivo
                if (vida[integrante] > 0) {
                    System.out.println(nomes[integrante] + " atacou Tai Lung!");
                    vidaTaiLung -= danoFuriosos;
                    // Impede que a vida fique negativa
                    if (vidaTaiLung < 0) {
                        vidaTaiLung = 0;
                    }
                    System.out.println("Vida de Tai Lung: " + vidaTaiLung);
                } else {
                    System.out.println(nomes[integrante] + " está derrotado e não pode atacar.");
                }

                integrante++;
            }
            // Tai Lung contra-ataca
            if (vidaTaiLung > 0) {
                System.out.println("\nTai Lung contra-atacou!");
                integrante = 0;
                while (integrante < nomes.length) {
                    if (vida[integrante] > 0) {
                        vida[integrante] -= danoTaiLung;
                        // Impede que a vida fique negativa
                        if (vida[integrante] < 0) {
                            vida[integrante] = 0;
                        }
                        System.out.println(nomes[integrante] + " recebeu dano! Vida: " + vida[integrante]);
                        // Verifica se o integrante foi derrotado
                        if (vida[integrante] == 0) {
                            furiososVivos--;
                            System.out.println(nomes[integrante] + " foi derrotado!");
                            System.out.println("Furiosos restantes: " + furiososVivos);
                        }
                    }
                    integrante++;
                }
            }
        }
// Verifica quem venceu
        if (vidaTaiLung <= 0) {
            System.out.println("\nTAI LUNG FOI DERROTADO!");
            System.out.println("Os Cinco Furiosos venceram!");
        } else {
            System.out.println("\nOS CINCO FURIOSOS FORAM DERROTADOS!");
            System.out.println("TAI LUNG VENCEU!");
        }
    }
}
