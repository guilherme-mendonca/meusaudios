package br.com.alura.modelos;

public class Podcast extends Audio {
  private String apresentandor;
  private String descricao;

  public String getApresentandor() {
    return apresentandor;
  }

  public void setApresentandor(String apresentandor) {
    this.apresentandor = apresentandor;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public int getClassificacao() {
    if (getTotalReproducoes() > 400) {
      return 10;
    } else {
      return 8;
    }
  }
}
