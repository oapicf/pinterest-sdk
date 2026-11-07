package org.openapitools.api

import org.openapitools.model.AdAccountCountriesGet200Response
import org.openapitools.model.BookClosed
import org.openapitools.model.DeliveryMetricsGet200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PublicTargetingType
import org.openapitools.model.ReportType
import org.openapitools.model.SingleInterestTargetingOption
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
        
        
        val response: ResponseEntity<AdAccountCountriesGet200Response> = api.adAccountCountriesGet()

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
        val reportType: ReportType? = TODO()
        
        
        val response: ResponseEntity<DeliveryMetricsGet200Response> = api.deliveryMetricsGet(reportType)

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
        
        
        val response: ResponseEntity<SingleInterestTargetingOption> = api.interestTargetingOptionsGet(interestId)

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
        
        
        val response: ResponseEntity<BookClosed> = api.metricsReadyStateGet(date)

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
        val targetingType: PublicTargetingType = TODO()
        val adAccountId: kotlin.String? = TODO()
        val clientId: kotlin.String? = TODO()
        val oauthSignature: kotlin.String? = TODO()
        val timestamp: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<List<kotlin.Any>> = api.targetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp)

        // TODO: test validations
    }
}
