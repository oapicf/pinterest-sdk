package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.NotificationPostRequest
import org.openapitools.server.api.model.NotificationResponse
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class NotificationApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var notificationApi: NotificationApiAction

    /**
     * To test NotificationApiAction.notificationPost
     */
    @Test
    fun `should handle notificationPost`() {
        val notificationPostRequest = TODO()
        val response: NotificationResponse = notificationApi.notificationPost(notificationPostRequest)
    }
}
