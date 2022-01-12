package ai.faire.balance.monitory.Service;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationServeice {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(NotificationServeice.class);

    public void addNotification(List<String> notifications) {

        for (String notification : notifications) {

            LOGGER.info(notification);

            System.out.println(notification);
        }
    }

}
