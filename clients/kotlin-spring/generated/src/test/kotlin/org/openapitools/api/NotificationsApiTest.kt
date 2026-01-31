package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.NotificationPostRequest
import org.openapitools.model.NotificationResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class NotificationsApiTest {

    private val api: NotificationsApiController = NotificationsApiController()

    /**
     * To test NotificationsApiController.notificationPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun notificationPostTest() {
        val notificationPostRequest: NotificationPostRequest = TODO()
        
        val response: ResponseEntity<NotificationResponse> = api.notificationPost(notificationPostRequest)

        // TODO: test validations
    }
}
