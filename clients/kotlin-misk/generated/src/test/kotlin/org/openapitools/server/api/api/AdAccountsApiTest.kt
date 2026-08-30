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
import org.openapitools.server.api.model.AdAccount
import org.openapitools.server.api.model.AdAccountAnalyticsItems
import org.openapitools.server.api.model.AdAccountCreate
import org.openapitools.server.api.model.AdAccountsList200Response
import org.openapitools.server.api.model.AdsAnalyticsAccountTargetingType
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.server.api.model.ConversionProductReport
import org.openapitools.server.api.model.ConversionProductReportCreate
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.MMMReport
import org.openapitools.server.api.model.MMMReportCreate
import org.openapitools.server.api.model.MetricsResponse
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.ReportingColumnSync
import org.openapitools.server.api.model.ReportingTimeZone
import org.openapitools.server.api.model.TemplateBasedReport
import org.openapitools.server.api.model.TemplatesList200Response

@MiskTest(startService = true)
internal class AdAccountsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var adAccountsApi: AdAccountsApiAction

    /**
     * To test AdAccountsApiAction.adAccountAnalytics
     */
    @Test
    fun `should handle adAccountAnalytics`() {
        val startDate = TODO()
        val endDate = TODO()
        val columns = TODO()
        val granularity = TODO()
        val adAccountId = TODO()
        val clickWindowDays = TODO()
        val engagementWindowDays = TODO()
        val viewWindowDays = TODO()
        val conversionReportTime = TODO()
        val reportingTimezone = TODO()
        val response: kotlin.collections.List<AdAccountAnalyticsItems> = adAccountsApi.adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone)
    }

    /**
     * To test AdAccountsApiAction.adAccountTargetingAnalyticsGet
     */
    @Test
    fun `should handle adAccountTargetingAnalyticsGet`() {
        val adAccountId = TODO()
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
        val response: MetricsResponse = adAccountsApi.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)
    }

    /**
     * To test AdAccountsApiAction.adAccountsCreate
     */
    @Test
    fun `should handle adAccountsCreate`() {
        val adAccountCreate = TODO()
        val response: AdAccount = adAccountsApi.adAccountsCreate(adAccountCreate)
    }

    /**
     * To test AdAccountsApiAction.adAccountsGet
     */
    @Test
    fun `should handle adAccountsGet`() {
        val adAccountId = TODO()
        val response: AdAccount = adAccountsApi.adAccountsGet(adAccountId)
    }

    /**
     * To test AdAccountsApiAction.adAccountsList
     */
    @Test
    fun `should handle adAccountsList`() {
        val includeSharedAccounts = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: AdAccountsList200Response = adAccountsApi.adAccountsList(includeSharedAccounts, bookmark, pageSize)
    }

    /**
     * To test AdAccountsApiAction.analyticsCreateConversionProductReport
     */
    @Test
    fun `should handle analyticsCreateConversionProductReport`() {
        val adAccountId = TODO()
        val conversionProductReportCreate = TODO()
        val response: ConversionProductReport = adAccountsApi.analyticsCreateConversionProductReport(adAccountId, conversionProductReportCreate)
    }

    /**
     * To test AdAccountsApiAction.analyticsCreateMmmReport
     */
    @Test
    fun `should handle analyticsCreateMmmReport`() {
        val adAccountId = TODO()
        val mmMReportCreate = TODO()
        val response: MMMReport = adAccountsApi.analyticsCreateMmmReport(adAccountId, mmMReportCreate)
    }

    /**
     * To test AdAccountsApiAction.analyticsCreateReport
     */
    @Test
    fun `should handle analyticsCreateReport`() {
        val adAccountId = TODO()
        val adsAnalyticsCreateAsyncRequest = TODO()
        val response: AdsAnalyticsCreateAsyncResponse = adAccountsApi.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest)
    }

    /**
     * To test AdAccountsApiAction.analyticsCreateTemplateReport
     */
    @Test
    fun `should handle analyticsCreateTemplateReport`() {
        val adAccountId = TODO()
        val templateId = TODO()
        val startDate = TODO()
        val endDate = TODO()
        val granularity = TODO()
        val response: TemplateBasedReport = adAccountsApi.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity)
    }

    /**
     * To test AdAccountsApiAction.analyticsGetConversionProductReport
     */
    @Test
    fun `should handle analyticsGetConversionProductReport`() {
        val adAccountId = TODO()
        val token = TODO()
        val response: ConversionProductReport = adAccountsApi.analyticsGetConversionProductReport(adAccountId, token)
    }

    /**
     * To test AdAccountsApiAction.analyticsGetMmmReport
     */
    @Test
    fun `should handle analyticsGetMmmReport`() {
        val adAccountId = TODO()
        val token = TODO()
        val response: MMMReport = adAccountsApi.analyticsGetMmmReport(adAccountId, token)
    }

    /**
     * To test AdAccountsApiAction.analyticsGetReport
     */
    @Test
    fun `should handle analyticsGetReport`() {
        val adAccountId = TODO()
        val token = TODO()
        val response: AdsAnalyticsGetAsyncResponse = adAccountsApi.analyticsGetReport(adAccountId, token)
    }

    /**
     * To test AdAccountsApiAction.sandboxDelete
     */
    @Test
    fun `should handle sandboxDelete`() {
        val adAccountId = TODO()
        val response: kotlin.String = adAccountsApi.sandboxDelete(adAccountId)
    }

    /**
     * To test AdAccountsApiAction.templatesList
     */
    @Test
    fun `should handle templatesList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val response: TemplatesList200Response = adAccountsApi.templatesList(adAccountId, bookmark, pageSize, order)
    }
}
