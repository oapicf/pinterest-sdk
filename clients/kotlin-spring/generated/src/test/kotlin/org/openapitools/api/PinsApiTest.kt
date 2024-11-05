package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.Pin
import org.openapitools.model.PinAnalyticsMetricsResponse
import org.openapitools.model.PinCreate
import org.openapitools.model.PinUpdate
import org.openapitools.model.PinsAnalyticsMetricTypesParameterInner
import org.openapitools.model.PinsList200Response
import org.openapitools.model.PinsSaveRequest
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class PinsApiTest {

    private val api: PinsApiController = PinsApiController()

    /**
     * To test PinsApiController.multiPinsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun multiPinsAnalyticsTest() {
        val pinIds: kotlin.collections.List<kotlin.String> = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val metricTypes: kotlin.collections.List<PinsAnalyticsMetricTypesParameterInner> = TODO()
        val appTypes: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Map<String, kotlin.collections.Map<kotlin.String>> = api.multiPinsAnalytics(pinIds, startDate, endDate, metricTypes, appTypes, adAccountId)

        // TODO: test validations
    }

    /**
     * To test PinsApiController.pinsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pinsAnalyticsTest() {
        val pinId: kotlin.String = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val metricTypes: kotlin.collections.List<PinsAnalyticsMetricTypesParameterInner> = TODO()
        val appTypes: kotlin.String = TODO()
        val splitField: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Map<String, PinAnalyticsMetricsResponse>> = api.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)

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
        val pinCreate: PinCreate = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Pin> = api.pinsCreate(pinCreate, adAccountId)

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
        val pinId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Unit> = api.pinsDelete(pinId, adAccountId)

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
        val pinId: kotlin.String = TODO()
        val pinMetrics: kotlin.Boolean = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Pin> = api.pinsGet(pinId, pinMetrics, adAccountId)

        // TODO: test validations
    }

    /**
     * To test PinsApiController.pinsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pinsListTest() {
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val pinFilter: kotlin.String? = TODO()
        val includeProtectedPins: kotlin.Boolean = TODO()
        val pinType: kotlin.String? = TODO()
        val creativeTypes: kotlin.collections.List<kotlin.String>? = TODO()
        val adAccountId: kotlin.String? = TODO()
        val pinMetrics: kotlin.Boolean = TODO()
        val response: ResponseEntity<PinsList200Response> = api.pinsList(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics)

        // TODO: test validations
    }

    /**
     * To test PinsApiController.pinsSave
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pinsSaveTest() {
        val pinId: kotlin.String = TODO()
        val pinsSaveRequest: PinsSaveRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Pin> = api.pinsSave(pinId, pinsSaveRequest, adAccountId)

        // TODO: test validations
    }

    /**
     * To test PinsApiController.pinsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pinsUpdateTest() {
        val pinId: kotlin.String = TODO()
        val pinUpdate: PinUpdate = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Pin> = api.pinsUpdate(pinId, pinUpdate, adAccountId)

        // TODO: test validations
    }
}
