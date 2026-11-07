package org.openapitools.api

import org.openapitools.model.CreativeType
import org.openapitools.model.MultiPinsAnalyticsMetricTypesItem
import org.openapitools.model.Pin
import org.openapitools.model.PinAnalyticsMetricsResponse
import org.openapitools.model.PinCreate
import org.openapitools.model.PinFilter
import org.openapitools.model.PinType
import org.openapitools.model.PinUpdate
import org.openapitools.model.PinsList200Response
import org.openapitools.model.PinsSaveRequestCreate
import org.openapitools.model.PinterestLibError
import org.openapitools.model.ProductTagsBulkAddRequest
import org.openapitools.model.ProductTagsBulkDeleteRequest
import org.openapitools.model.ProductTagsError
import org.openapitools.model.ProductTagsResponse
import org.openapitools.model.QuerypinanalyticsmetrictypesItems
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
        val metricTypes: kotlin.collections.List<MultiPinsAnalyticsMetricTypesItem> = TODO()
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
        val metricTypes: kotlin.collections.List<QuerypinanalyticsmetrictypesItems> = TODO()
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
        
        
        val response: ResponseEntity<Pin> = api.pinsDelete(pinId, adAccountId)

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
        val adAccountId: kotlin.String? = TODO()
        val pinMetrics: kotlin.Boolean = TODO()
        
        
        val response: ResponseEntity<Pin> = api.pinsGet(pinId, adAccountId, pinMetrics)

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
        val pinFilter: PinFilter? = TODO()
        val pinMetrics: kotlin.Boolean = TODO()
        val includeProtectedPins: kotlin.Boolean = TODO()
        val pinType: PinType? = TODO()
        val creativeTypes: kotlin.collections.List<CreativeType>? = TODO()
        val adAccountId: kotlin.String? = TODO()
        val domain: kotlin.String? = TODO()
        val domains: kotlin.collections.List<kotlin.String>? = TODO()
        val includeProductTagObj: kotlin.Boolean? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<PinsList200Response> = api.pinsList(pinFilter, pinMetrics, includeProtectedPins, pinType, creativeTypes, adAccountId, domain, domains, includeProductTagObj, bookmark, pageSize)

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
        val pinsSaveRequestCreate: PinsSaveRequestCreate = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Pin> = api.pinsSave(pinId, pinsSaveRequestCreate, adAccountId)

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

    /**
     * To test PinsApiController.productTagsBulkAdd
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun productTagsBulkAddTest() {
        val pinId: kotlin.String = TODO()
        val productTagsBulkAddRequest: ProductTagsBulkAddRequest = TODO()
        
        
        val response: ResponseEntity<ProductTagsResponse> = api.productTagsBulkAdd(pinId, productTagsBulkAddRequest)

        // TODO: test validations
    }

    /**
     * To test PinsApiController.productTagsBulkDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun productTagsBulkDeleteTest() {
        val pinId: kotlin.String = TODO()
        val productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest = TODO()
        
        
        val response: ResponseEntity<Unit> = api.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest)

        // TODO: test validations
    }

    /**
     * To test PinsApiController.productTagsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun productTagsListTest() {
        val pinId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<ProductTagsResponse> = api.productTagsList(pinId)

        // TODO: test validations
    }
}
