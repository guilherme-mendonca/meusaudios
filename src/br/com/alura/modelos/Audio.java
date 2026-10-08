package br.com.alura.modelos;

public class Audio {
  private String titulo;
  private double duracaoEmMinutos;
  private int totalReproducoes;
  private int totalCurtidas;
  private int classificacao;
  private double somaAvaliacoes;
  private int totalAvaliacoes;

  public String getTitulo() {
    return titulo;
  }

  public double getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public int getTotalReproducoes() {
    return totalReproducoes;
  }

  public int getTotalCurtidas() {
    return totalCurtidas;
  }

  public int getClassificacao() {
    return classificacao;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setDuracaoEmMinutos(double duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public void setClassificacao(int classificacao) {
    this.classificacao = classificacao;
  }

  public void exibeFichaTecnica() {
    System.out.println("Título: " + titulo);
    System.out.println("Duração em minutos: " + duracaoEmMinutos);
    System.out.println("Total de reproduções: " + totalReproducoes);
    System.out.println("Curtidas: " + totalCurtidas);
    System.out.println("Classificação: " + classificacao);
  }

  public void avalia(double nota) {
    somaAvaliacoes += nota;
    totalAvaliacoes++;
  }

  public void curte() {
    this.totalCurtidas++;
  }

  public void reproduz() {
    this.totalReproducoes++;
  }
}
