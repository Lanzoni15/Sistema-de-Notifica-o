public class Push extends Notificacao {

    String titulo;
    String conteudo;

    @Override
    public void enviar() {
        System.out.printf("Enviando Push para: %s\nTítulo: %s\nConteúdo: %s",
                destinatario, titulo, conteudo);
    }
}
