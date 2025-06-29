public class Principal {
    public static void main(String[] args) {
        Email enivarMensagem = new Email();

        enivarMensagem.destinatario = "cliente@exemplo.com";
        enivarMensagem.assunto = "Promoção Especial!";
        enivarMensagem.mensagem = "Aproveite nossos descontos esta semana.";

        enivarMensagem.enviar();

        System.out.println("\n----------||----------");

        Sms enviarSMS = new Sms();

        enviarSMS.destinatario = "(11) 98765-4321";
        enviarSMS.mensagem = "Sua fatura foi paga com sucesso.";

        enviarSMS.enviar();

        System.out.println("\n----------||----------");

        Push enviarPush = new Push();

        enviarPush.destinatario = "usuario_app";
        enviarPush.titulo = "Novidade!";
        enviarPush.conteudo = "Você tem uma nova mensagem não lida.";

        enviarPush.enviar();
    }
}
