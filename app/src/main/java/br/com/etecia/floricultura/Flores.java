package br.com.etecia.floricultura;

public class Flores {

    private String nome;

    private int imagem;

    //alt insert - constructor

    public Flores(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }


    //alt + insert - getter and setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

