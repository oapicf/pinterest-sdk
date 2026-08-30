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
import org.openapitools.server.api.model.AdvertiserDefinedEventsCreate200Response
import org.openapitools.server.api.model.AdvertiserDefinedEventsCreateRequest
import org.openapitools.server.api.model.AdvertiserDefinedEventsGet200Response
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class ConversionsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var conversionsApi: ConversionsApiAction

    /**
     * To test ConversionsApiAction.advertiserDefinedEventsCreate
     */
    @Test
    fun `should handle advertiserDefinedEventsCreate`() {
        val adAccountId = TODO()
        val advertiserDefinedEventsCreateRequest = TODO()
        val response: AdvertiserDefinedEventsCreate200Response = conversionsApi.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest)
    }

    /**
     * To test ConversionsApiAction.advertiserDefinedEventsDelete
     */
    @Test
    fun `should handle advertiserDefinedEventsDelete`() {
        val adAccountId = TODO()
        val eventNames = TODO()
        val response: AdvertiserDefinedEventsCreate200Response = conversionsApi.advertiserDefinedEventsDelete(adAccountId, eventNames)
    }

    /**
     * To test ConversionsApiAction.advertiserDefinedEventsGet
     */
    @Test
    fun `should handle advertiserDefinedEventsGet`() {
        val adAccountId = TODO()
        val response: AdvertiserDefinedEventsGet200Response = conversionsApi.advertiserDefinedEventsGet(adAccountId)
    }

    /**
     * To test ConversionsApiAction.advertiserDefinedEventsUpdate
     */
    @Test
    fun `should handle advertiserDefinedEventsUpdate`() {
        val adAccountId = TODO()
        val advertiserDefinedEventsCreateRequest = TODO()
        val response: AdvertiserDefinedEventsCreate200Response = conversionsApi.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest)
    }
}
