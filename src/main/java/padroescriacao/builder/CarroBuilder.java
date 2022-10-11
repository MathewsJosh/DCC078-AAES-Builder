package padroescriacao.builder;

import java.util.Date;

public class CarroBuilder {

    private Carro carro;

    public CarroBuilder() {
        carro = new Carro();
    }

    public Carro build() {
        if (carro.getMarca() == "") {
            throw new IllegalArgumentException("Marca inválida");
        }
        if (carro.getModelo().equals("")) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        if (carro.getPlaca().equals("")) {
            throw new IllegalArgumentException("Placa inválida");
        }
        return carro;
    }

    public CarroBuilder setMarca(String marca) {
        carro.setMarca(marca);
        return this;
    }

    public CarroBuilder setModelo(String modelo) {
        carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setPlaca(String placa) {
        carro.setPlaca(placa);
        return this;
    }

    public CarroBuilder setCriacao(Date criacao) {
        carro.setCriacao(criacao);
        return this;
    }

    public CarroBuilder setChassi(String chassi) {
        carro.setChassi(chassi);
        return this;
    }

    public CarroBuilder setNum_portas(int num_portas) {
        carro.setNum_portas(num_portas);
        return this;
    }

    public CarroBuilder setNum_passageiros(int num_passageiros) {
        carro.setNum_passageiros(num_passageiros);
        return this;
    }

    public CarroBuilder setAltura(int altura) {
        carro.setAltura(altura);
        return this;
    }


}
