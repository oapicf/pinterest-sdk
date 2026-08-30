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
import org.openapitools.server.api.model.CreativeType
import org.openapitools.server.api.model.MultiPinsAnalyticsMetricTypesItem
import org.openapitools.server.api.model.Pin
import org.openapitools.server.api.model.PinAnalyticsMetricsResponse
import org.openapitools.server.api.model.PinCreate
import org.openapitools.server.api.model.PinFilter
import org.openapitools.server.api.model.PinType
import org.openapitools.server.api.model.PinUpdate
import org.openapitools.server.api.model.PinsList200Response
import org.openapitools.server.api.model.PinsSaveRequestCreate
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.QuerypinanalyticsmetrictypesItems

@MiskTest(startService = true)
internal class PinsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var pinsApi: PinsApiAction

    /**
     * To test PinsApiAction.multiPinsAnalytics
     */
    @Test
    fun `should handle multiPinsAnalytics`() {
        val pinIds = TODO()
        val startDate = TODO()
        val endDate = TODO()
        val metricTypes = TODO()
        val appTypes = TODO()
        val adAccountId = TODO()
        val response: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, PinAnalyticsMetricsResponse>> = pinsApi.multiPinsAnalytics(pinIds, startDate, endDate, metricTypes, appTypes, adAccountId)
    }

    /**
     * To test PinsApiAction.pinsAnalytics
     */
    @Test
    fun `should handle pinsAnalytics`() {
        val pinId = TODO()
        val startDate = TODO()
        val endDate = TODO()
        val metricTypes = TODO()
        val appTypes = TODO()
        val splitField = TODO()
        val adAccountId = TODO()
        val response: kotlin.collections.Map<kotlin.String, PinAnalyticsMetricsResponse> = pinsApi.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)
    }

    /**
     * To test PinsApiAction.pinsCreate
     */
    @Test
    fun `should handle pinsCreate`() {
        val pinCreate = TODO()
        val adAccountId = TODO()
        val response: Pin = pinsApi.pinsCreate(pinCreate, adAccountId)
    }

    /**
     * To test PinsApiAction.pinsDelete
     */
    @Test
    fun `should handle pinsDelete`() {
        val pinId = TODO()
        val adAccountId = TODO()
        val response: Pin = pinsApi.pinsDelete(pinId, adAccountId)
    }

    /**
     * To test PinsApiAction.pinsGet
     */
    @Test
    fun `should handle pinsGet`() {
        val pinId = TODO()
        val adAccountId = TODO()
        val pinMetrics = TODO()
        val response: Pin = pinsApi.pinsGet(pinId, adAccountId, pinMetrics)
    }

    /**
     * To test PinsApiAction.pinsList
     */
    @Test
    fun `should handle pinsList`() {
        val pinFilter = TODO()
        val pinMetrics = TODO()
        val includeProtectedPins = TODO()
        val pinType = TODO()
        val creativeTypes = TODO()
        val adAccountId = TODO()
        val domain = TODO()
        val domains = TODO()
        val includeProductTagObj = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: PinsList200Response = pinsApi.pinsList(pinFilter, pinMetrics, includeProtectedPins, pinType, creativeTypes, adAccountId, domain, domains, includeProductTagObj, bookmark, pageSize)
    }

    /**
     * To test PinsApiAction.pinsSave
     */
    @Test
    fun `should handle pinsSave`() {
        val pinId = TODO()
        val pinsSaveRequestCreate = TODO()
        val adAccountId = TODO()
        val response: Pin = pinsApi.pinsSave(pinId, pinsSaveRequestCreate, adAccountId)
    }

    /**
     * To test PinsApiAction.pinsUpdate
     */
    @Test
    fun `should handle pinsUpdate`() {
        val pinId = TODO()
        val pinUpdate = TODO()
        val adAccountId = TODO()
        val response: Pin = pinsApi.pinsUpdate(pinId, pinUpdate, adAccountId)
    }
}
