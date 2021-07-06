import commands.ping;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.io.ObjectInputFilter;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDA api = JDABuilder.createDefault(Config.get("TOKEN")).build();
        api.addEventListener(new ping());
    }
}
