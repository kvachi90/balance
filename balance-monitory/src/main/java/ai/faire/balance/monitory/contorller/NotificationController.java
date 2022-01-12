package ai.faire.balance.monitory.contorller;

import ai.faire.balance.monitory.Service.NotificationServeice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NotificationController {
    
      @Autowired
    private NotificationServeice notificationService;
    
    @PostMapping("/notifications")
    public void addNotification(@RequestBody List<String> notifications){
         
        notificationService.addNotification(notifications);
    } 

}
