public class Email extends Notificacao {
    String assunto;

    @Override
    public void enviar() {
        System.out.printf("Enviando Email para: %s\nAssunto: %s\nMensagem: %s",
                destinatario, assunto, mensagem);
    }
}
