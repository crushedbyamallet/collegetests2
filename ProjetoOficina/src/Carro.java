public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private double valor;
    private ParteCarro partecarro;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, double valor, ParteCarro partecarro) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.partecarro = partecarro;
    }

    public Carro(String marca, String modelo, int ano, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ParteCarro getPartecarro() {
        return partecarro;
    }

    public void setParteCarro(ParteCarro objParteCarro) {
    }
    
}

