package poo.encapsulamento.automovel;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual = 0;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void acelerar(int valorA ){
        valorA = velocidadeAtual + 10 ;
        System.out.println(valorA);
    }
    public void frear( int valorF){
        valorF = velocidadeAtual - 10;

        if(velocidadeAtual <=0){
            System.out.println("Carro parado");
        }
        else {
            System.out.println(valorF);
        }
    }
    public void exibirInfomacao(){
        System.out.println("Velocidade: " + velocidadeAtual );
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
