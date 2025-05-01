
package com.Strategy;


public class Diciplina {
    private MediaStrategy operacao;
    private double p1, p2, media;
    private String nome, situacao;

    public Diciplina(MediaStrategy operacao) {
        this.operacao = operacao;
    }

    public double calcularMedia(){
        return this.media= operacao.calcularMedia(p1,p2);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getSituacao() {
        return operacao.verificarSituacao(media);
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public MediaStrategy getEstrategia() {
        return operacao;
    }

    public void setEstrategia(MediaStrategy operacao) {
        this.operacao = operacao;
    }

}
