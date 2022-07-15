import command.EnvioEmailCommand;
import validator.EnvioEmailCommandValidator;

public class EnvioService {
    EnvioService service;


    public EnvioService(EnvioService service) {
        this.service = service;
    }

    public boolean enviarEmail(EnvioEmailCommand envioEmailCommand) {

        if (!envioEmailCommand.isValid()) {
            throw new IllegalArgumentException();
        }

        return false;
    }

}
