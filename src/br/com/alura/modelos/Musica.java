package br.com.alura.modelos;

// Herança (extends): Musica herda todos os atributos e métodos de Audio
public class Musica extends Audio {
  // Atributos específicos que apenas Musicas possuem
  private String album;
  private String artista;
  private String genero;

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String getArtista() {
    return artista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  @Override
  public int getClassificacao() {
    if (getTotalCurtidas() > 500) {
      return 10;
    } else {
      return 8;
    }
  }
}
