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
import org.openapitools.server.api.model.AdGroup
import org.openapitools.server.api.model.AdGroupAudienceSizing
import org.openapitools.server.api.model.AdGroupAudienceSizingCreate
import org.openapitools.server.api.model.AdGroupCreateCreate
import org.openapitools.server.api.model.AdGroupUpdateBatchUpdate
import org.openapitools.server.api.model.AdGroupsAnalyticsMetrics
import org.openapitools.server.api.model.AdGroupsCreate200Response
import org.openapitools.server.api.model.AdGroupsList200Response
import org.openapitools.server.api.model.AdsAnalyticsAdGroupTargetingType
import org.openapitools.server.api.model.BidFloor
import org.openapitools.server.api.model.BidFloorCreate
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.DynamicTitlesDownloadCSV
import org.openapitools.server.api.model.DynamicTitlesGetStatus
import org.openapitools.server.api.model.DynamicTitlesProcessCSV
import org.openapitools.server.api.model.DynamicTitlesProcessCSVCreate
import org.openapitools.server.api.model.DynamicTitlesUploadURL
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.MetricsResponse
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.ReportingColumnSync
import org.openapitools.server.api.model.ReportingTimeZone

@MiskTest(startService = true)
internal class AdGroupsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var adGroupsApi: AdGroupsApiAction

    /**
     * To test AdGroupsApiAction.adGroupsAnalytics
     */
    @Test
    fun `should handle adGroupsAnalytics`() {
        val startDate = TODO()
        val endDate = TODO()
        val adGroupIds = TODO()
        val columns = TODO()
        val granularity = TODO()
        val adAccountId = TODO()
        val clickWindowDays = TODO()
        val engagementWindowDays = TODO()
        val viewWindowDays = TODO()
        val conversionReportTime = TODO()
        val aggregateReportRows = TODO()
        val reportingTimezone = TODO()
        val response: kotlin.collections.List<AdGroupsAnalyticsMetrics> = adGroupsApi.adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)
    }

    /**
     * To test AdGroupsApiAction.adGroupsAudienceSizing
     */
    @Test
    fun `should handle adGroupsAudienceSizing`() {
        val adAccountId = TODO()
        val adGroupAudienceSizingCreate = TODO()
        val response: AdGroupAudienceSizing = adGroupsApi.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate)
    }

    /**
     * To test AdGroupsApiAction.adGroupsBidFloorGet
     */
    @Test
    fun `should handle adGroupsBidFloorGet`() {
        val adAccountId = TODO()
        val bidFloorCreate = TODO()
        val response: BidFloor = adGroupsApi.adGroupsBidFloorGet(adAccountId, bidFloorCreate)
    }

    /**
     * To test AdGroupsApiAction.adGroupsCreate
     */
    @Test
    fun `should handle adGroupsCreate`() {
        val adAccountId = TODO()
        val adGroupCreateCreate = TODO()
        val response: AdGroupsCreate200Response = adGroupsApi.adGroupsCreate(adAccountId, adGroupCreateCreate)
    }

    /**
     * To test AdGroupsApiAction.adGroupsDynamicTitlesDownloadCsv
     */
    @Test
    fun `should handle adGroupsDynamicTitlesDownloadCsv`() {
        val adAccountId = TODO()
        val adGroupId = TODO()
        val response: DynamicTitlesDownloadCSV = adGroupsApi.adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId)
    }

    /**
     * To test AdGroupsApiAction.adGroupsDynamicTitlesGetStatus
     */
    @Test
    fun `should handle adGroupsDynamicTitlesGetStatus`() {
        val adAccountId = TODO()
        val adGroupId = TODO()
        val response: DynamicTitlesGetStatus = adGroupsApi.adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId)
    }

    /**
     * To test AdGroupsApiAction.adGroupsDynamicTitlesGetUploadUrl
     */
    @Test
    fun `should handle adGroupsDynamicTitlesGetUploadUrl`() {
        val adAccountId = TODO()
        val adGroupId = TODO()
        val response: DynamicTitlesUploadURL = adGroupsApi.adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId)
    }

    /**
     * To test AdGroupsApiAction.adGroupsDynamicTitlesProcessCsv
     */
    @Test
    fun `should handle adGroupsDynamicTitlesProcessCsv`() {
        val adAccountId = TODO()
        val adGroupId = TODO()
        val dynamicTitlesProcessCSVCreate = TODO()
        val response: DynamicTitlesProcessCSV = adGroupsApi.adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate)
    }

    /**
     * To test AdGroupsApiAction.adGroupsGet
     */
    @Test
    fun `should handle adGroupsGet`() {
        val adGroupId = TODO()
        val adAccountId = TODO()
        val response: AdGroup = adGroupsApi.adGroupsGet(adGroupId, adAccountId)
    }

    /**
     * To test AdGroupsApiAction.adGroupsList
     */
    @Test
    fun `should handle adGroupsList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val campaignIds = TODO()
        val adGroupIds = TODO()
        val entityStatuses = TODO()
        val translateInterestsToNames = TODO()
        val response: AdGroupsList200Response = adGroupsApi.adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames)
    }

    /**
     * To test AdGroupsApiAction.adGroupsTargetingAnalyticsGet
     */
    @Test
    fun `should handle adGroupsTargetingAnalyticsGet`() {
        val adAccountId = TODO()
        val adGroupIds = TODO()
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
        val response: MetricsResponse = adGroupsApi.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)
    }

    /**
     * To test AdGroupsApiAction.adGroupsUpdate
     */
    @Test
    fun `should handle adGroupsUpdate`() {
        val adAccountId = TODO()
        val adGroupUpdateBatchUpdate = TODO()
        val response: AdGroupsCreate200Response = adGroupsApi.adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate)
    }

    /**
     * To test AdGroupsApiAction.getAdGroupsByPromotionIdsList
     */
    @Test
    fun `should handle getAdGroupsByPromotionIdsList`() {
        val adAccountId = TODO()
        val promotionIds = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val response: AdGroupsList200Response = adGroupsApi.getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order)
    }
}
