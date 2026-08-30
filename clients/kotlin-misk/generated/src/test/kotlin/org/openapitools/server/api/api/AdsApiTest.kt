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
import org.openapitools.server.api.model.Ad
import org.openapitools.server.api.model.AdBatchUpdate
import org.openapitools.server.api.model.AdBatchWriteResponseModel
import org.openapitools.server.api.model.AdCreate
import org.openapitools.server.api.model.AdPreviewRequest
import org.openapitools.server.api.model.AdPreviewURLResponse
import org.openapitools.server.api.model.AdsAnalytics
import org.openapitools.server.api.model.AdsAnalyticsAdTargetingType
import org.openapitools.server.api.model.AdsList200Response
import org.openapitools.server.api.model.CampaignAdPreview
import org.openapitools.server.api.model.CampaignAdPreviewCreate
import org.openapitools.server.api.model.CampaignAdPreviewCreate200ResponseInner
import org.openapitools.server.api.model.CampaignAdPreviewDelete200ResponseInner
import org.openapitools.server.api.model.ConversionAttributionWindowDays
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.ConversionReportTimeType
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.MetricsResponse
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.ReportingColumnSync
import org.openapitools.server.api.model.ReportingTimeZone

@MiskTest(startService = true)
internal class AdsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var adsApi: AdsApiAction

    /**
     * To test AdsApiAction.adPreviewsCreate
     */
    @Test
    fun `should handle adPreviewsCreate`() {
        val adAccountId = TODO()
        val adPreviewRequest = TODO()
        val response: AdPreviewURLResponse = adsApi.adPreviewsCreate(adAccountId, adPreviewRequest)
    }

    /**
     * To test AdsApiAction.adTargetingAnalyticsGet
     */
    @Test
    fun `should handle adTargetingAnalyticsGet`() {
        val adAccountId = TODO()
        val adIds = TODO()
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
        val sortColumns = TODO()
        val sortAscending = TODO()
        val response: MetricsResponse = adsApi.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)
    }

    /**
     * To test AdsApiAction.adsAnalytics
     */
    @Test
    fun `should handle adsAnalytics`() {
        val startDate = TODO()
        val endDate = TODO()
        val columns = TODO()
        val granularity = TODO()
        val adAccountId = TODO()
        val pinIds = TODO()
        val adIds = TODO()
        val clickWindowDays = TODO()
        val engagementWindowDays = TODO()
        val viewWindowDays = TODO()
        val conversionReportTime = TODO()
        val campaignIds = TODO()
        val reportingTimezone = TODO()
        val response: kotlin.collections.List<AdsAnalytics> = adsApi.adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone)
    }

    /**
     * To test AdsApiAction.adsCreate
     */
    @Test
    fun `should handle adsCreate`() {
        val adAccountId = TODO()
        val adCreate = TODO()
        val response: AdBatchWriteResponseModel = adsApi.adsCreate(adAccountId, adCreate)
    }

    /**
     * To test AdsApiAction.adsGet
     */
    @Test
    fun `should handle adsGet`() {
        val adId = TODO()
        val adAccountId = TODO()
        val response: Ad = adsApi.adsGet(adId, adAccountId)
    }

    /**
     * To test AdsApiAction.adsList
     */
    @Test
    fun `should handle adsList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val campaignIds = TODO()
        val adGroupIds = TODO()
        val adIds = TODO()
        val entityStatuses = TODO()
        val response: AdsList200Response = adsApi.adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses)
    }

    /**
     * To test AdsApiAction.adsUpdate
     */
    @Test
    fun `should handle adsUpdate`() {
        val adAccountId = TODO()
        val adBatchUpdate = TODO()
        val response: AdBatchWriteResponseModel = adsApi.adsUpdate(adAccountId, adBatchUpdate)
    }

    /**
     * To test AdsApiAction.campaignAdPreviewCreate
     */
    @Test
    fun `should handle campaignAdPreviewCreate`() {
        val adAccountId = TODO()
        val campaignAdPreviewCreate = TODO()
        val response: kotlin.collections.List<CampaignAdPreviewCreate200ResponseInner> = adsApi.campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate)
    }

    /**
     * To test AdsApiAction.campaignAdPreviewDelete
     */
    @Test
    fun `should handle campaignAdPreviewDelete`() {
        val adGroupIds = TODO()
        val adAccountId = TODO()
        val response: kotlin.collections.List<CampaignAdPreviewDelete200ResponseInner> = adsApi.campaignAdPreviewDelete(adGroupIds, adAccountId)
    }

    /**
     * To test AdsApiAction.campaignAdPreviewRead
     */
    @Test
    fun `should handle campaignAdPreviewRead`() {
        val adGroupIds = TODO()
        val adAccountId = TODO()
        val response: kotlin.collections.List<CampaignAdPreview> = adsApi.campaignAdPreviewRead(adGroupIds, adAccountId)
    }
}
