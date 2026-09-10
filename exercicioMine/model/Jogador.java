package model;

public class Jogador {

    private Picareta picareta;
    private int blocos;

    public Jogador() {
        this.setPicareta(null);
        this.setBlocos(0);
    }

    private void setPicareta(Picareta picareta) {
        this.picareta = picareta;
    }

    public Picareta getPicareta() {
        return this.picareta;
    }

    private void setBlocos(int blocos) {
        this.blocos = blocos;
    }

    private int getBlocos() {
        return this.blocos;
    }

    public void fabricarPicareta(Material material) {
        if (this.picareta != null) {
            System.out.println("Você já tem uma picareta.");
            return;
        }

        if (material.getDurabilidade() <= 0 || material.getForca() <= 0) {
            System.out.println("Durabilidade ou força inválidos.");
            return;
        }

        this.setPicareta(new Picareta(material));

        System.out.println(
                "Você fabricou uma picareta de " + material + "!\n" +
                "Com " + material.getDurabilidade() + " de durabilidade e " +
                material.getForca() + " de força.\n" +
                "Ela foi adicionada ao inventário."
        );
    }

    public void repararPicareta(int quantidadeDeReparo) {
        
        if (this.picareta == null) {
            System.out.println("Você não possui uma picareta para reparar.");
            return;
        }

        if (quantidadeDeReparo <= 0) {
            System.out.println("A quantidade de reparo deve ser maior que zero.");
            return;
        }
        
        if (this.picareta.getDurabilidade() == this.picareta.getDurabilidadeMaxima()) {
            System.out.println("A picareta não precisa de reparos.");
            return;
        }

        int novaDurabilidade = this.picareta.getDurabilidade() + quantidadeDeReparo;
        int reparoMaximo = this.picareta.getDurabilidadeMaxima() - this.picareta.getDurabilidade();

        if (novaDurabilidade > this.picareta.getDurabilidadeMaxima()) {
            System.out.println(
                    "Impossível reparar. Reparo limitado a "+reparoMaximo+" pontos. "
            );
            return;
        }

        this.picareta.setDurabilidade(novaDurabilidade);

        System.out.println(
                "A picareta foi reparada com sucesso e agora possui " + this.picareta.getDurabilidade() + " pontos de durabilidade"
        );
    }

    public void minerar(int blocos) {

        if (blocos <= 0) {
            System.out.println("A quantidade de blocos deve ser maior que zero.");
            return;
        }

        if (this.picareta == null) {
            System.out.println("Você não possui uma picareta para minerar.");
            return;
        }
        
        if (this.picareta.getDurabilidade() == 0) {
            System.out.println("Não é possível minerar com uma picareta quebrada.");
            return;
        }

        int blocosMinerados = 0;

        for (int i = 0; i < blocos; i++) {
            this.picareta.setDurabilidade(this.getPicareta().getDurabilidade()-1);
            if (this.picareta.getDurabilidade() < 0) this.picareta.setDurabilidade(0);
            blocosMinerados+=this.picareta.getForca();
            if (this.picareta.getDurabilidade() == 0) {
                System.out.println(
                        "A picareta de "+this.picareta.getMaterial()+" Quebrou completamente enquanto minerava"
                );
                break;
            }
        }

        int totalBlocos = this.getBlocos() + blocosMinerados;
        this.setBlocos(totalBlocos);

        System.out.println("Você minerou um total de "+blocosMinerados+" blocos.");
        System.out.println("Você agora tem "+this.getBlocos()+" blocos.");

    }

}
