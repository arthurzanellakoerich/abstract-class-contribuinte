package entities;

public class PessoaJuridica  extends Contribuinte {
    private int numeroFuncionarios;

    public PessoaJuridica(){
    }

    public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double tax() {
        double imposto;
        if (numeroFuncionarios > 10){
            imposto = getRendaAnual() * 0.14;
        } else {
            imposto = getRendaAnual() * 0.16;
        }
        return imposto;
    }
}
