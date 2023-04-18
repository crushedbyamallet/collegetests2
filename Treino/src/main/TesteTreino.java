package main;

import beans.Produto;
import beans.Endereco;
import beans.Empresa;

import javax.swing.JOptionPane;


public class TesteTreino {
    public static void main(String[] args) {
        
        //instanciar
        // (String nome, String tipo, String cnpj, Endereco endereco)
        Empresa objEmpresa = new Empresa(JOptionPane.showInputDialog("digite o nome: "), 
            JOptionPane.showInputDialog("digite o tipo de empresa: "), 
            JOptionPane.showInputDialog("digite o cnpj: "));
        
        // (String logradouro, int numero, String cep, String municipio, String estado)
        Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("digite o logradouro: "),
            Integer.parseInt(JOptionPane.showInputDialog("digite o número: ")),
            JOptionPane.showInputDialog("digite o CEP"),
            JOptionPane.showInputDialog("digite o bairro: "),
            JOptionPane.showInputDialog("digite o município: "),
            JOptionPane.showInputDialog("digite o estado: "));

        // (String tipo, String marca, int quantidade, double valor)
        Produto objProduto = new Produto(JOptionPane.showInputDialog("digite o tipo de produto"),
                JOptionPane.showInputDialog("digite a marca do produto: "),
                Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade: ")),
                Double.parseDouble(JOptionPane.showInputDialog("digite o valor: ")));
             
        objEmpresa.setEndereco(objEndereco);

        System.out.println("nome: " + objEmpresa.getNome() + 
                        "\ntipo de empresa: " + objEmpresa.getTipo() + 
                        "\nCNPJ: " + objEmpresa.getCnpj() + 
                        "\nlogradouro: " + objEmpresa.getEndereco().getLogradouro() + 
                        "\nnúmero: " + objEndereco.getNumero() +
                        "\nCEP: " + objEndereco.getNumero() + 
                        "\nbairro: " + objEndereco.getBairro() + 
                        "\nmunicípio: " + objEndereco.getMunicipio() + 
                        "\nestado: " + objEndereco.getEstado() + 
                        "\ntipo de produto: " + objProduto.getTipo() + 
                        "\nmarca: " + objProduto.getMarca() + 
                        "\nquantidade: " + objProduto.getQuantidade() + 
                        "\nvalor: " + objProduto.getValor());


    }
}
