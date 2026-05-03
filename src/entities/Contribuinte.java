package entities;

public abstract class Contribuinte {
    private String nome;
    private Double RendaAnual;

    public Contribuinte() {
    }

    public Contribuinte(String nome, Double rendaAnual) {
        this.nome = nome;
        this.RendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return RendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        RendaAnual = rendaAnual;
    }

    public abstract Double tax();

    public String toString() {
        return nome
                + ": $ "
                + String.format("%.2f",getRendaAnual());
    }
}
