package br.com.alura.modelos;

public class MinhasPreferidas {
  public void inclui(Audio audio) {
    if (audio.getClassificacao() >= 9) {
      System.out.println(audio.getTitulo() + " é sucesso no mundo todo!");
    } else {
      System.out.println(audio.getTitulo() + " também vale a sua atenção");
    }
  }
}
