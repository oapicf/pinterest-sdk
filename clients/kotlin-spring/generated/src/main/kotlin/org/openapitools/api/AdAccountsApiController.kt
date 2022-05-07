package org.openapitools.api

import org.openapitools.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.model.Error
import org.openapitools.model.Granularity
import org.openapitools.model.Paginated
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v5}")
class AdAccountsApiController() {


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/analytics"],
        produces = ["application/json"]
    )
    fun adAccountAnalytics(@Pattern(regexp="^\\d+$")  @PathVariable("ad_account_id") adAccountId: kotlin.String
,@NotNull  @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate
,@NotNull  @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate
,@NotNull  @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>
,@NotNull  @RequestParam(value = "granularity", required = true) granularity: Granularity
, @RequestParam(value = "click_window_days", required = false, defaultValue="30") clickWindowDays: kotlin.Int
, @RequestParam(value = "engagement_window_days", required = false, defaultValue="30") engagementWindowDays: kotlin.Int
, @RequestParam(value = "view_window_days", required = false, defaultValue="1") viewWindowDays: kotlin.Int
, @RequestParam(value = "conversion_report_time", required = false, defaultValue="TIME_OF_AD_ACTION") conversionReportTime: kotlin.String
): ResponseEntity<List<kotlin.collections.Map<kotlin.String, kotlin.Any>>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts"],
        produces = ["application/json"]
    )
    fun adAccountsList( @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
, @RequestParam(value = "include_shared_accounts", required = false, defaultValue="true") includeSharedAccounts: kotlin.Boolean
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ad_groups/analytics"],
        produces = ["application/json"]
    )
    fun adGroupsAnalytics(@Pattern(regexp="^\\d+$")  @PathVariable("ad_account_id") adAccountId: kotlin.String
,@NotNull  @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate
,@NotNull  @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate
,@NotNull @Size(min=1,max=100)  @RequestParam(value = "ad_group_ids", required = true) adGroupIds: kotlin.collections.List<kotlin.String>
,@NotNull  @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>
,@NotNull  @RequestParam(value = "granularity", required = true) granularity: Granularity
, @RequestParam(value = "click_window_days", required = false, defaultValue="30") clickWindowDays: kotlin.Int
, @RequestParam(value = "engagement_window_days", required = false, defaultValue="30") engagementWindowDays: kotlin.Int
, @RequestParam(value = "view_window_days", required = false, defaultValue="1") viewWindowDays: kotlin.Int
, @RequestParam(value = "conversion_report_time", required = false, defaultValue="TIME_OF_AD_ACTION") conversionReportTime: kotlin.String
): ResponseEntity<List<kotlin.collections.Map<kotlin.String, kotlin.Any>>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ad_groups"],
        produces = ["application/json"]
    )
    fun adGroupsList(@Pattern(regexp="^\\d+$")  @PathVariable("ad_account_id") adAccountId: kotlin.String
,@Size(min=1,max=100)  @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?
,@Size(min=1,max=100)  @RequestParam(value = "ad_group_ids", required = false) adGroupIds: kotlin.collections.List<kotlin.String>?
, @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<kotlin.String>?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
, @RequestParam(value = "order", required = false) order: kotlin.String?
, @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
, @RequestParam(value = "translate_interests_to_names", required = false, defaultValue="false") translateInterestsToNames: kotlin.Boolean
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ads/analytics"],
        produces = ["application/json"]
    )
    fun adsAnalytics(@Pattern(regexp="^\\d+$")  @PathVariable("ad_account_id") adAccountId: kotlin.String
,@NotNull  @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate
,@NotNull  @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate
,@NotNull @Size(min=1,max=100)  @RequestParam(value = "ad_ids", required = true) adIds: kotlin.collections.List<kotlin.String>
,@NotNull  @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>
,@NotNull  @RequestParam(value = "granularity", required = true) granularity: Granularity
, @RequestParam(value = "click_window_days", required = false, defaultValue="30") clickWindowDays: kotlin.Int
, @RequestParam(value = "engagement_window_days", required = false, defaultValue="30") engagementWindowDays: kotlin.Int
, @RequestParam(value = "view_window_days", required = false, defaultValue="1") viewWindowDays: kotlin.Int
, @RequestParam(value = "conversion_report_time", required = false, defaultValue="TIME_OF_AD_ACTION") conversionReportTime: kotlin.String
): ResponseEntity<List<kotlin.collections.Map<kotlin.String, kotlin.Any>>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ads"],
        produces = ["application/json"]
    )
    fun adsList(@Pattern(regexp="^\\d+$")  @PathVariable("ad_account_id") adAccountId: kotlin.String
,@Size(min=1,max=100)  @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?
,@Size(min=1,max=100)  @RequestParam(value = "ad_group_ids", required = false) adGroupIds: kotlin.collections.List<kotlin.String>?
,@Size(min=1,max=100)  @RequestParam(value = "ad_ids", required = false) adIds: kotlin.collections.List<kotlin.String>?
, @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<kotlin.String>?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
, @RequestParam(value = "order", required = false) order: kotlin.String?
, @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/reports"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun analyticsCreateReport(@Pattern(regexp="^\\d+$")  @PathVariable("ad_account_id") adAccountId: kotlin.String
, @Valid @RequestBody adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest
): ResponseEntity<AdsAnalyticsCreateAsyncResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/reports"],
        produces = ["application/json"]
    )
    fun analyticsGetReport(@Pattern(regexp="^\\d+$")  @PathVariable("ad_account_id") adAccountId: kotlin.String
,@NotNull  @RequestParam(value = "token", required = true) token: kotlin.String
): ResponseEntity<AdsAnalyticsGetAsyncResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/campaigns/analytics"],
        produces = ["application/json"]
    )
    fun campaignsAnalytics(@Pattern(regexp="^\\d+$")  @PathVariable("ad_account_id") adAccountId: kotlin.String
,@NotNull  @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate
,@NotNull  @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate
,@NotNull @Size(min=1,max=100)  @RequestParam(value = "campaign_ids", required = true) campaignIds: kotlin.collections.List<kotlin.String>
,@NotNull  @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>
,@NotNull  @RequestParam(value = "granularity", required = true) granularity: Granularity
, @RequestParam(value = "click_window_days", required = false, defaultValue="30") clickWindowDays: kotlin.Int
, @RequestParam(value = "engagement_window_days", required = false, defaultValue="30") engagementWindowDays: kotlin.Int
, @RequestParam(value = "view_window_days", required = false, defaultValue="1") viewWindowDays: kotlin.Int
, @RequestParam(value = "conversion_report_time", required = false, defaultValue="TIME_OF_AD_ACTION") conversionReportTime: kotlin.String
): ResponseEntity<List<kotlin.collections.Map<kotlin.String, kotlin.Any>>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/campaigns"],
        produces = ["application/json"]
    )
    fun campaignsList(@Pattern(regexp="^\\d+$")  @PathVariable("ad_account_id") adAccountId: kotlin.String
,@Size(min=1,max=100)  @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?
, @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<kotlin.String>?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
, @RequestParam(value = "order", required = false) order: kotlin.String?
, @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/product_groups/analytics"],
        produces = ["application/json"]
    )
    fun productGroupsAnalytics(@Pattern(regexp="^\\d+$")  @PathVariable("ad_account_id") adAccountId: kotlin.String
,@NotNull  @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate
,@NotNull  @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate
,@NotNull @Size(min=1,max=100)  @RequestParam(value = "product_group_ids", required = true) productGroupIds: kotlin.collections.List<kotlin.String>
,@NotNull  @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>
,@NotNull  @RequestParam(value = "granularity", required = true) granularity: Granularity
, @RequestParam(value = "click_window_days", required = false, defaultValue="30") clickWindowDays: kotlin.Int
, @RequestParam(value = "engagement_window_days", required = false, defaultValue="30") engagementWindowDays: kotlin.Int
, @RequestParam(value = "view_window_days", required = false, defaultValue="1") viewWindowDays: kotlin.Int
, @RequestParam(value = "conversion_report_time", required = false, defaultValue="TIME_OF_AD_ACTION") conversionReportTime: kotlin.String
): ResponseEntity<List<kotlin.collections.Map<kotlin.String, kotlin.Any>>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
