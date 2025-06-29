public class Notificacao {
    String destinatario;
    String mensagem;

    public void enviar() {
        System.out.printf("Enviado XXXX para: %s\nXXXX: %s\nXXXXX: %s",
        destinatario, mensagem);
    }
}
