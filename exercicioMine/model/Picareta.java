package model;

public class Picareta {

    private int durabilidade;
    private final int durabilidadeMaxima;
    private int forca;
    private Material material;

    public Picareta(Material material) {
        this.setMaterial(material);
        this.setDurabilidade(material.getDurabilidade());
        this.setForca(material.getForca());
        this.durabilidadeMaxima = material.getDurabilidade();
    }

    public int getDurabilidade() {
        return this.durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public int getForca() {
        return this.forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getDurabilidadeMaxima() {
        return this.durabilidadeMaxima;
    }

}
