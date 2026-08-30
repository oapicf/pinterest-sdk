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
import org.openapitools.server.api.model.ConversionEvents
import org.openapitools.server.api.model.ConversionEventsCreate
import org.openapitools.server.api.model.DetailedError
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class ConversionEventsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var conversionEventsApi: ConversionEventsApiAction

    /**
     * To test ConversionEventsApiAction.eventsCreate
     */
    @Test
    fun `should handle eventsCreate`() {
        val adAccountId = TODO()
        val conversionEventsCreate = TODO()
        val test = TODO()
        val response: ConversionEvents = conversionEventsApi.eventsCreate(adAccountId, conversionEventsCreate, test)
    }
}
