package br.com.alura.modelos;

// Herança (extends): Podcast herda todos os atributos e métodos de Audio
public class Podcast extends Audio {
  // Atributos específicos que apenas Podcasts possuem
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
