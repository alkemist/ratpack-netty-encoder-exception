import org.ratpackframework.handling.Handler;
import org.ratpackframework.handling.Handlers;
import org.ratpackframework.launch.HandlerFactory;
import org.ratpackframework.launch.LaunchConfig;

public class MyHandlerFactory implements HandlerFactory {

    @Override
    public Handler create(LaunchConfig launchConfig) {
        return Handlers.assets("public", "index.txt");
    }
}
