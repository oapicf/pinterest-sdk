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
import org.openapitools.server.api.model.EventQualityScore
import org.openapitools.server.api.model.IngestionSourceOptions
import org.openapitools.server.api.model.LookbackPeriodOptions
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SourcePlatformOptions

@MiskTest(startService = true)
internal class ConversionEqsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var conversionEqsApi: ConversionEqsApiAction

    /**
     * To test ConversionEqsApiAction.conversionEqsList
     */
    @Test
    fun `should handle conversionEqsList`() {
        val lookbackPeriod = TODO()
        val adAccountId = TODO()
        val sourcePlatform = TODO()
        val ingestionSource = TODO()
        val response: kotlin.collections.List<EventQualityScore> = conversionEqsApi.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource)
    }
}
