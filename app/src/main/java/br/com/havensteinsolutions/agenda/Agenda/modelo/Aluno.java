package br.com.havensteinsolutions.agenda.Agenda.modelo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Aluno implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String site;
    private double nota;
    private String caminhoFoto;
    //private String Sobrenome;

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

//    public String getSobrenome() {
//        return Sobrenome;
//    }
//
//    public void setSobrenome(String sobrenome) {
//        Sobrenome = sobrenome;
//    }

    @Override
    public String toString() {
        return getId() + " - " + getNome();
    }

    public String getNomeCompleto() {
        return nome ;
    }
}
