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
import org.openapitools.server.api.model.AdPinAnalytics
import org.openapitools.server.api.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.server.api.model.Campaign
import org.openapitools.server.api.model.CampaignBatchUpdateItem
import org.openapitools.server.api.model.CampaignBatchWriteResponseModel
import org.openapitools.server.api.model.CampaignCreateItem
import org.openapitools.server.api.model.CampaignDeliveryEstimatesCampaign
import org.openapitools.server.api.model.CampaignDeliveryEstimatesResponse
import org.openapitools.server.api.model.CampaignsAnalyticsMetrics
import org.openapitools.server.api.model.CampaignsList200Response
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.MetricsResponse
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.ReportingColumnSync
import org.openapitools.server.api.model.ReportingTimeZone

@MiskTest(startService = true)
internal class CampaignsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var campaignsApi: CampaignsApiAction

    /**
     * To test CampaignsApiAction.adPinsAnalytics
     */
    @Test
    fun `should handle adPinsAnalytics`() {
        val campaignId = TODO()
        val pinIds = TODO()
        val startDate = TODO()
        val endDate = TODO()
        val columns = TODO()
        val granularity = TODO()
        val adAccountId = TODO()
        val clickWindowDays = TODO()
        val engagementWindowDays = TODO()
        val viewWindowDays = TODO()
        val conversionReportTime = TODO()
        val response: kotlin.collections.List<AdPinAnalytics> = campaignsApi.adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
    }

    /**
     * To test CampaignsApiAction.campaignTargetingAnalyticsGet
     */
    @Test
    fun `should handle campaignTargetingAnalyticsGet`() {
        val adAccountId = TODO()
        val campaignIds = TODO()
        val startDate = TODO()
        val endDate = TODO()
        val targetingTypes = TODO()
        val columns = TODO()
        val granularity = TODO()
        val clickWindowDays = TODO()
        val engagementWindowDays = TODO()
        val viewWindowDays = TODO()
        val conversionReportTime = TODO()
        val attributionTypes = TODO()
        val reportingTimezone = TODO()
        val response: MetricsResponse = campaignsApi.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)
    }

    /**
     * To test CampaignsApiAction.campaignsAnalytics
     */
    @Test
    fun `should handle campaignsAnalytics`() {
        val startDate = TODO()
        val endDate = TODO()
        val campaignIds = TODO()
        val columns = TODO()
        val granularity = TODO()
        val adAccountId = TODO()
        val clickWindowDays = TODO()
        val engagementWindowDays = TODO()
        val viewWindowDays = TODO()
        val conversionReportTime = TODO()
        val aggregateReportRows = TODO()
        val reportingTimezone = TODO()
        val response: kotlin.collections.List<CampaignsAnalyticsMetrics> = campaignsApi.campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)
    }

    /**
     * To test CampaignsApiAction.campaignsCreate
     */
    @Test
    fun `should handle campaignsCreate`() {
        val adAccountId = TODO()
        val campaignCreateItem = TODO()
        val response: CampaignBatchWriteResponseModel = campaignsApi.campaignsCreate(adAccountId, campaignCreateItem)
    }

    /**
     * To test CampaignsApiAction.campaignsGet
     */
    @Test
    fun `should handle campaignsGet`() {
        val campaignId = TODO()
        val adAccountId = TODO()
        val response: Campaign = campaignsApi.campaignsGet(campaignId, adAccountId)
    }

    /**
     * To test CampaignsApiAction.campaignsList
     */
    @Test
    fun `should handle campaignsList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val campaignIds = TODO()
        val entityStatuses = TODO()
        val response: CampaignsList200Response = campaignsApi.campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses)
    }

    /**
     * To test CampaignsApiAction.campaignsUpdate
     */
    @Test
    fun `should handle campaignsUpdate`() {
        val adAccountId = TODO()
        val campaignBatchUpdateItem = TODO()
        val response: CampaignBatchWriteResponseModel = campaignsApi.campaignsUpdate(adAccountId, campaignBatchUpdateItem)
    }

    /**
     * To test CampaignsApiAction.getCampaignDeliveryEstimates
     */
    @Test
    fun `should handle getCampaignDeliveryEstimates`() {
        val adAccountId = TODO()
        val campaignDeliveryEstimatesCampaign = TODO()
        val response: CampaignDeliveryEstimatesResponse = campaignsApi.getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign)
    }
}
