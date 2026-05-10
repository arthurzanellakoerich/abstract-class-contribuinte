package entities;

public class PessoaFisica  extends Contribuinte{
    public  Double gastoSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setgastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double tax() {
        double imposto;
        if (getRendaAnual() < 20000.00){
            imposto = getRendaAnual() * 0.15;
        } else {
            imposto = getRendaAnual() *0.25;
        }
        if (getGastoSaude() > 0) {
            imposto -= getGastoSaude() * 0.50;
        }
        return imposto;
    }
}
