package org.openapitools.api.interfaces;

import org.openapitools.model.NotificationPostRequest;
import org.openapitools.model.NotificationResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface NotificationsService {

    /**
     * Receive notifications from external partners.
     * Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.
     *
     * @param notificationPostRequest  (required)
     * @return NotificationResponse
     */
    NotificationResponse notificationPost(
        NotificationPostRequest notificationPostRequest
    );
}
