package br.com.alura.modelos;

public class Audio {
  // Atributos privados garantindo o encapsulamento, impendindo alterações diretas fora da classe
  private String titulo;
  private double duracaoEmMinutos;
  private int totalReproducoes;
  private int totalCurtidas;
  private int classificacao;

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

  // Métodos com regras de negócio, em vez de permitir alterar o totalCurtidas diretamente com um setter
  public void curte() {
    this.totalCurtidas++;
  }

  public void reproduz() {
    this.totalReproducoes++;
  }
}
