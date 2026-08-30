package org.openapitools.api.consumer;

import org.openapitools.model.NotificationPostRequest;
import org.openapitools.model.NotificationResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.NotificationsService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/notifications")
public class NotificationsServiceController {

    @DubboReference
    private NotificationsService notificationsService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public NotificationResponse notificationPost(
        @RequestParam(name = "notificationPostRequest") NotificationPostRequest notificationPostRequest
    ) {
        return notificationsService.notificationPost(notificationPostRequest);
    }
}
