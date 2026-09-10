package model;

public enum Material {

    MADEIRA(10, 1),
    PEDRA(20, 2),
    FERRO(30, 3),
    COBRE(40, 4),
    OURO(50, 5),
    DIAMANTE(60, 6),
    REDSTONE(70, 7),
    ESMERALDA(80, 8);

    private final int durabilidade;
    private final int forca;

    Material(int durabilidade, int forca) {
        this.durabilidade = durabilidade;
        this.forca = forca;
    }

    public int getDurabilidade() {
        return this.durabilidade;
    }

    public int getForca() {
        return this.forca;
    }

}
