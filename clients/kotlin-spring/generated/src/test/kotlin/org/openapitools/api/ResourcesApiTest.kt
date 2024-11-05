package org.openapitools.api

import org.openapitools.model.AdAccountsCountryResponse
import org.openapitools.model.BookClosedResponse
import org.openapitools.model.DeliveryMetricsResponse
import org.openapitools.model.Error
import org.openapitools.model.SingleInterestTargetingOptionResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ResourcesApiTest {

    private val api: ResourcesApiController = ResourcesApiController()

    /**
     * To test ResourcesApiController.adAccountCountriesGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountCountriesGetTest() {
        val response: ResponseEntity<AdAccountsCountryResponse> = api.adAccountCountriesGet()

        // TODO: test validations
    }

    /**
     * To test ResourcesApiController.deliveryMetricsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deliveryMetricsGetTest() {
        val reportType: kotlin.String? = TODO()
        val response: ResponseEntity<DeliveryMetricsResponse> = api.deliveryMetricsGet(reportType)

        // TODO: test validations
    }

    /**
     * To test ResourcesApiController.interestTargetingOptionsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun interestTargetingOptionsGetTest() {
        val interestId: kotlin.String = TODO()
        val response: ResponseEntity<SingleInterestTargetingOptionResponse> = api.interestTargetingOptionsGet(interestId)

        // TODO: test validations
    }

    /**
     * To test ResourcesApiController.leadFormQuestionsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun leadFormQuestionsGetTest() {
        val response: ResponseEntity<Unit> = api.leadFormQuestionsGet()

        // TODO: test validations
    }

    /**
     * To test ResourcesApiController.metricsReadyStateGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun metricsReadyStateGetTest() {
        val date: kotlin.String = TODO()
        val response: ResponseEntity<BookClosedResponse> = api.metricsReadyStateGet(date)

        // TODO: test validations
    }

    /**
     * To test ResourcesApiController.targetingOptionsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun targetingOptionsGetTest() {
        val targetingType: kotlin.String = TODO()
        val clientId: kotlin.String? = TODO()
        val oauthSignature: kotlin.String? = TODO()
        val timestamp: kotlin.String? = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<List<kotlin.Any>> = api.targetingOptionsGet(targetingType, clientId, oauthSignature, timestamp, adAccountId)

        // TODO: test validations
    }
}
