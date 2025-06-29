public class Sms extends Notificacao {

    @Override
    public void enviar() {
        System.out.printf("Enviando SMS para: %s\nMensagem: %s",
                destinatario, mensagem);
    }
}
