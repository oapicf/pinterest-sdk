package org.openapitools.api

import org.openapitools.model.AnalyticsMetricsResponse
import org.openapitools.model.Error
import org.openapitools.model.Pin
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class PinsApiTest {

    private val api: PinsApiController = PinsApiController()

    /**
     * To test PinsApiController.pinsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pinsAnalyticsTest() {
        val pinId:kotlin.String = TODO()
        val startDate:java.time.LocalDate = TODO()
        val endDate:java.time.LocalDate = TODO()
        val metricTypes:kotlin.collections.List<kotlin.String> = TODO()
        val appTypes:kotlin.String = TODO()
        val splitField:kotlin.String = TODO()
        val adAccountId:kotlin.String? = TODO()
        val response: ResponseEntity<Map<String, AnalyticsMetricsResponse>> = api.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)

        // TODO: test validations
    }

    /**
     * To test PinsApiController.pinsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pinsCreateTest() {
        val pin:Pin = TODO()
        val response: ResponseEntity<Pin> = api.pinsCreate(pin)

        // TODO: test validations
    }

    /**
     * To test PinsApiController.pinsDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pinsDeleteTest() {
        val pinId:kotlin.String = TODO()
        val response: ResponseEntity<Unit> = api.pinsDelete(pinId)

        // TODO: test validations
    }

    /**
     * To test PinsApiController.pinsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pinsGetTest() {
        val pinId:kotlin.String = TODO()
        val adAccountId:kotlin.String? = TODO()
        val response: ResponseEntity<Pin> = api.pinsGet(pinId, adAccountId)

        // TODO: test validations
    }

}
