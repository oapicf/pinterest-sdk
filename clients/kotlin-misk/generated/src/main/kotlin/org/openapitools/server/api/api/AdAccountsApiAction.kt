package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
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

/**
* @TODO("Fill out implementation")
*/
@Singleton
class AdAccountsApiAction @Inject constructor(
) : WebAction {

    @Get("/ad_accounts/{ad_account_id}/analytics")
    @Description("Get ad account analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountAnalytics(
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "columns") columns: kotlin.collections.List<ReportingColumnSync>, 
         @QueryParam(value = "granularity") granularity: Granularity, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "click_window_days") clickWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "engagement_window_days") engagementWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "view_window_days") viewWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "conversion_report_time") conversionReportTime: kotlin.String, 
         @QueryParam(value = "reporting_timezone") reportingTimezone: ReportingTimeZone?
    ): kotlin.collections.List<AdAccountAnalyticsItems> {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/targeting_analytics")
    @Description("Get targeting analytics for an ad account")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountTargetingAnalyticsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "targeting_types") targetingTypes: kotlin.collections.List<AdsAnalyticsAccountTargetingType>, 
         @QueryParam(value = "columns") columns: kotlin.collections.List<ReportingColumnSync>, 
         @QueryParam(value = "granularity") granularity: Granularity, 
         @QueryParam(value = "click_window_days") clickWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "engagement_window_days") engagementWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "view_window_days") viewWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "conversion_report_time") conversionReportTime: kotlin.String, 
         @QueryParam(value = "attribution_types") attributionTypes: kotlin.collections.List<ConversionReportAttributionType>?, 
         @QueryParam(value = "reporting_timezone") reportingTimezone: ReportingTimeZone?
    ): MetricsResponse {
        TODO()
    }

    @Post("/ad_accounts")
    @Description("Create ad account")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountsCreate(
        @Valid @RequestBody adAccountCreate: AdAccountCreate
    ): AdAccount {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}")
    @Description("Get ad account")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): AdAccount {
        TODO()
    }

    @Get("/ad_accounts")
    @Description("List ad accounts")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountsList(
         @QueryParam(value = "include_shared_accounts") includeSharedAccounts: kotlin.Boolean, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): AdAccountsList200Response {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/reports/brand_category_sku")
    @Description("Create a request for a brand, category, SKU report")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun analyticsCreateConversionProductReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody conversionProductReportCreate: ConversionProductReportCreate
    ): ConversionProductReport {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/mmm_reports")
    @Description("Create a request for a Marketing Mix Modeling (MMM) report")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun analyticsCreateMmmReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody mmMReportCreate: MMMReportCreate
    ): MMMReport {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/reports")
    @Description("Create async request for an account analytics report")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun analyticsCreateReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest
    ): AdsAnalyticsCreateAsyncResponse {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/templates/{template_id}/reports")
    @Description("Create async request for an analytics report using a template")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun analyticsCreateTemplateReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Size(max=18) @PathParam("template_id") templateId: kotlin.String, 
         @QueryParam(value = "start_date") startDate: java.time.LocalDate?, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate?, 
         @QueryParam(value = "granularity") granularity: Granularity?
    ): TemplateBasedReport {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/reports/brand_category_sku")
    @Description("Get advertiser brand, category, SKU report")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun analyticsGetConversionProductReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "token") token: kotlin.String
    ): ConversionProductReport {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/mmm_reports")
    @Description("Get advertiser Marketing Mix Modeling (MMM) report.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun analyticsGetMmmReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "token") token: kotlin.String
    ): MMMReport {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/reports")
    @Description("Get the account analytics report created by the async call")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun analyticsGetReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "token") token: kotlin.String
    ): AdsAnalyticsGetAsyncResponse {
        TODO()
    }

    @Delete("/ad_accounts/{ad_account_id}/sandbox")
    @Description("Delete ads data for ad account in API Sandbox")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun sandboxDelete(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): kotlin.String {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/templates")
    @Description("List templates")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun templatesList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?
    ): TemplatesList200Response {
        TODO()
    }
}
