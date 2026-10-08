package br.com.alura.principal;

import br.com.alura.modelos.Audio;
import br.com.alura.modelos.MinhasPreferidas;
import br.com.alura.modelos.Musica;
import br.com.alura.modelos.Podcast;

public class Principal {
  public static void main(String[] args) {
    Musica minhaMusica = new Musica();
    minhaMusica.setTitulo("You could be mine");
    minhaMusica.setArtista("Guns'N Roses");

    for (int i = 0; i < 1000; i++) {
      minhaMusica.reproduz();
    }

    for (int i = 0; i < 800; i++) {
      minhaMusica.curte();
    }

    Podcast meuPodcast = new Podcast();
    meuPodcast.setTitulo("NoticiasCast");
    meuPodcast.setApresentandor("Guilherme");

    for (int i = 0; i < 400; i++) {
      meuPodcast.reproduz();
    }

    for (int i = 0; i < 400; i++) {
      meuPodcast.curte();
    }

    MinhasPreferidas preferidas = new MinhasPreferidas();

    preferidas.inclui(minhaMusica);
    preferidas.inclui(meuPodcast);
  }
}
