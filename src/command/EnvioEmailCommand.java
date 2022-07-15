package command;

public class EnvioEmailCommand {
    private String emailDestinatario;
    private String assunto;
    private String emailRemetente;
    private String corpo;

    private char[] anexo;

    public EnvioEmailCommand(String emailDestinatario, String assunto, String emailRemetente, String corpo) {
        this(emailDestinatario, assunto, emailRemetente, corpo, null);
    }

    public EnvioEmailCommand(String emailDestinatario, String assunto, String emailRemetente, String corpo, char[] anexo) {
        this.emailDestinatario = emailDestinatario;
        this.assunto = assunto;
        this.emailRemetente = emailRemetente;
        this.corpo = corpo;
        this.anexo = anexo;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public String getCorpo() {
        return corpo;
    }

    public boolean isValid() {
        return false;
    }
}
