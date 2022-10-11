package padroescriacao.builder;

import java.util.Date;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private Date criacao;
    private String chassi;
    private int num_portas;
    private int num_passageiros;
    private int altura;


    public Carro() {
        this.marca = "";
        this.modelo = "";
        this.placa = "";
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
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

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getNum_portas() {
        return num_portas;
    }

    public void setNum_portas(int num_portas) {
        this.num_portas = num_portas;
    }

    public int getNum_passageiros() {
        return num_passageiros;
    }

    public void setNum_passageiros(int num_passageiros) {
        this.num_passageiros = num_passageiros;
    }
}
