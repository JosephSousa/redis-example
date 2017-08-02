package com.ifpb.ads.bdnc.jedis;

/**
 *
 * @author Joseph Sousa
 * @mail Jsantos.te@gmail.com
 * @since 25/07/2017 , 14:24:07
 */
public class Pessoa {

    private int id;
    private int idade;
    private String nome;

    public Pessoa(int id, int idade, String nome) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", idade=" + idade + ", nome=" + nome + '}';
    }
    
    
}
