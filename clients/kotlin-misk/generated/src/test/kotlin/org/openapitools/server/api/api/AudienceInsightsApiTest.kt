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
import org.openapitools.server.api.model.AudienceInsightType
import org.openapitools.server.api.model.AudienceInsights
import org.openapitools.server.api.model.AudienceInsightsScopeAndTypeGet200Response
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class AudienceInsightsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var audienceInsightsApi: AudienceInsightsApiAction

    /**
     * To test AudienceInsightsApiAction.audienceInsightsGet
     */
    @Test
    fun `should handle audienceInsightsGet`() {
        val adAccountId = TODO()
        val audienceInsightType = TODO()
        val response: AudienceInsights = audienceInsightsApi.audienceInsightsGet(adAccountId, audienceInsightType)
    }

    /**
     * To test AudienceInsightsApiAction.audienceInsightsScopeAndTypeGet
     */
    @Test
    fun `should handle audienceInsightsScopeAndTypeGet`() {
        val adAccountId = TODO()
        val response: AudienceInsightsScopeAndTypeGet200Response = audienceInsightsApi.audienceInsightsScopeAndTypeGet(adAccountId)
    }
}
