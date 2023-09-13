package br.com.fiap.model;

import br.com.fiap.data.BikeDao;
import java.util.Scanner;

public class Bike{
        
    private int idBike;
    private String modelo;
    private String cor;
    private String chassi;
    private String categoria;
    private String nomeBike;
    private String marca;
    private int valor;
    private String modificacao;
    private String acidente;
    private int ano;

    // ID_BICICLETA INTEGER PRIMARY KEY,
    // MODELO VARCHAR(20) NOT NULL,
    // MARCA VARCHAR(20) NOT NULL,
    // ANO INTEGER NOT NULL,
    // PRECO INTEGER NOT NULL,
    // NUMERO_SERIE VARCHAR(20) NOT NULL,
    // TIPO VARCHAR(30) NOT NULL,
    // ID_CLIENTE INTEGER REFERENCES CLIENTE (ID_CLIENTE)

    public Bike() {
    }

    public void cadastrarBike(){
        
        Bike bike = new Bike();
        var novaBike = new BikeDao();
            
        Scanner scan = new Scanner(System.in);

        System.out.println("\n ---- CADASTRO BIKE ----\n");
        System.out.print("Informe um nome de identificacao para sua Bike: ");
        bike.setNome(scan.nextLine());
        System.out.print("Informe a marca da sua Bike: ");
        bike.setMarca(scan.nextLine());
        System.out.print("Informe o modelo da sua Bike: ");
        bike.setModelo(scan.nextLine());
        System.out.print("Informe a cor da sua Bike: ");
        bike.setCor(scan.nextLine());
        System.out.print("Informe a categoria da sua Bike: ");
        bike.setCategoria(scan.nextLine());
        System.out.print("Informe o chassi da sua Bike: ");
        bike.setChassi(scan.nextLine());
        System.out.print("Informe o valor total da sua Bike: ");
        bike.setValor(Integer.parseInt(scan.nextLine()));
        System.out.print("Sua Bike ja sofreu alguma modificacao? ");
        bike.setModificacao(scan.nextLine());
        System.out.print("Sua Bike ja sofreu algum acidente? ");
        bike.setAcidente(scan.nextLine());
        
        try {
            novaBike.inserir(bike);
            System.out.println("Bike cadastrada com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        scan.close();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdBike() {
    return idBike;
    }

    public String getModelo() {
    return modelo;
    }

    public void setModelo(String modelo) {
    this.modelo = modelo;
    }

    public String getCor() {
    return cor;
    }

    public void setCor(String cor) {
    this.cor = cor;
    }

    public String getChassi() {
    return chassi;
    }

    public void setChassi(String chassi) {
    this.chassi = chassi;
    }

    public String getCategoria() {
    return categoria;
    }

    public void setCategoria(String categoria) {
    this.categoria = categoria;
    }

    public String getNome() {
    return nomeBike;
    }

    public void setNome(String nome) {
    this.nomeBike = nome;
    }

    public String getMarca() {
    return marca;
    }

    public void setMarca(String marca) {
    this.marca = marca;
    }

    public int getValor() {
    return valor;
    }

    public void setValor(int valor) {
    this.valor = valor;
    }

    public String isModificacao() {
    return modificacao;
    }	

    public void setModificacao(String modificacao) {
        this.modificacao = modificacao;
    }

    public void setAcidente(String acidente) {
        this.acidente = acidente;
    }
}