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
import org.openapitools.server.api.model.AdAccountCountriesGet200Response
import org.openapitools.server.api.model.BookClosed
import org.openapitools.server.api.model.DeliveryMetricsGet200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PublicTargetingType
import org.openapitools.server.api.model.ReportType
import org.openapitools.server.api.model.SingleInterestTargetingOption

@MiskTest(startService = true)
internal class ResourcesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var resourcesApi: ResourcesApiAction

    /**
     * To test ResourcesApiAction.adAccountCountriesGet
     */
    @Test
    fun `should handle adAccountCountriesGet`() {
        val response: AdAccountCountriesGet200Response = resourcesApi.adAccountCountriesGet()
    }

    /**
     * To test ResourcesApiAction.deliveryMetricsGet
     */
    @Test
    fun `should handle deliveryMetricsGet`() {
        val reportType = TODO()
        val response: DeliveryMetricsGet200Response = resourcesApi.deliveryMetricsGet(reportType)
    }

    /**
     * To test ResourcesApiAction.interestTargetingOptionsGet
     */
    @Test
    fun `should handle interestTargetingOptionsGet`() {
        val interestId = TODO()
        val response: SingleInterestTargetingOption = resourcesApi.interestTargetingOptionsGet(interestId)
    }

    /**
     * To test ResourcesApiAction.leadFormQuestionsGet
     */
    @Test
    fun `should handle leadFormQuestionsGet`() {
        val response = resourcesApi.leadFormQuestionsGet()
    }

    /**
     * To test ResourcesApiAction.metricsReadyStateGet
     */
    @Test
    fun `should handle metricsReadyStateGet`() {
        val date = TODO()
        val response: BookClosed = resourcesApi.metricsReadyStateGet(date)
    }

    /**
     * To test ResourcesApiAction.targetingOptionsGet
     */
    @Test
    fun `should handle targetingOptionsGet`() {
        val targetingType = TODO()
        val adAccountId = TODO()
        val clientId = TODO()
        val oauthSignature = TODO()
        val timestamp = TODO()
        val response: kotlin.collections.List<kotlin.Any> = resourcesApi.targetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp)
    }
}
