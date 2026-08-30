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
import org.openapitools.server.api.model.ConversionMSOTEventsCreate
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class MsotEventsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var msotEventsApi: MsotEventsApiAction

    /**
     * To test MsotEventsApiAction.msotEventsCreate
     */
    @Test
    fun `should handle msotEventsCreate`() {
        val adAccountId = TODO()
        val conversionMSOTEventsCreate = TODO()
        val response = msotEventsApi.msotEventsCreate(adAccountId, conversionMSOTEventsCreate)
    }
}
