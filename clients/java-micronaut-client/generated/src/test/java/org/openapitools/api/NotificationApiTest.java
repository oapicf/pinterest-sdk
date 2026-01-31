package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.NotificationPostRequest;
import org.openapitools.model.NotificationResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for NotificationApi
 */
@MicronautTest
public class NotificationApiTest {

    @Inject
    NotificationApi api;

    
    /**
     * Receive notifications from external partners.
     *
     * Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.
     */
    @Test
    @Disabled("Not Implemented")
    public void notificationPostTest() {
        // given
        NotificationPostRequest notificationPostRequest = new NotificationPostRequest();

        // when
        NotificationResponse body = api.notificationPost(notificationPostRequest).block();

        // then
        // TODO implement the notificationPostTest()
    }

    
}
