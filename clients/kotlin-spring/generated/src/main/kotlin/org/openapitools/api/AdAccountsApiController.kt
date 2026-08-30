package org.openapitools.api

import org.openapitools.model.Ad
import org.openapitools.model.AdAccount
import org.openapitools.model.AdAccountAnalyticsItems
import org.openapitools.model.AdAccountCreate
import org.openapitools.model.AdAccountToAdAccountSharedAudience
import org.openapitools.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.model.AdAccountToBusinessSharedAudience
import org.openapitools.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.model.AdAccountsAudience
import org.openapitools.model.AdAccountsAudienceCreate
import org.openapitools.model.AdAccountsAudienceUpdate
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.model.AdAccountsList200Response
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response
import org.openapitools.model.AdBatchUpdate
import org.openapitools.model.AdBatchWriteResponseModel
import org.openapitools.model.AdCreate
import org.openapitools.model.AdGroup
import org.openapitools.model.AdGroupAudienceSizing
import org.openapitools.model.AdGroupAudienceSizingCreate
import org.openapitools.model.AdGroupCreateCreate
import org.openapitools.model.AdGroupUpdateBatchUpdate
import org.openapitools.model.AdGroupsAnalyticsMetrics
import org.openapitools.model.AdGroupsCreate200Response
import org.openapitools.model.AdGroupsList200Response
import org.openapitools.model.AdPinAnalytics
import org.openapitools.model.AdPreviewRequest
import org.openapitools.model.AdPreviewURLResponse
import org.openapitools.model.AdsAnalytics
import org.openapitools.model.AdsAnalyticsAccountTargetingType
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType
import org.openapitools.model.AdsAnalyticsAdTargetingType
import org.openapitools.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.model.AdsCreditRedeem
import org.openapitools.model.AdsCreditRedeemCreate
import org.openapitools.model.AdsCreditsDiscountsGet200Response
import org.openapitools.model.AdsList200Response
import org.openapitools.model.AdvertiserDefinedEventsCreate200Response
import org.openapitools.model.AdvertiserDefinedEventsCreateRequest
import org.openapitools.model.AdvertiserDefinedEventsGet200Response
import org.openapitools.model.AudienceAccountType
import org.openapitools.model.AudienceInsightType
import org.openapitools.model.AudienceInsights
import org.openapitools.model.AudienceInsightsScopeAndTypeGet200Response
import org.openapitools.model.AudienceOwnershipType
import org.openapitools.model.AudiencesList200Response
import org.openapitools.model.BidFloor
import org.openapitools.model.BidFloorCreate
import org.openapitools.model.BillingInvoiceDocumentType
import org.openapitools.model.BillingInvoiceDownloadResponse
import org.openapitools.model.BillingInvoiceSortField
import org.openapitools.model.BillingInvoiceStatus
import org.openapitools.model.BillingInvoicesGet200Response
import org.openapitools.model.BillingProfilesGet200Response
import org.openapitools.model.BulkDownload
import org.openapitools.model.BulkDownloadCreate
import org.openapitools.model.BulkJobData
import org.openapitools.model.BulkUpsertRequest
import org.openapitools.model.BulkUpsertResponse
import org.openapitools.model.Campaign
import org.openapitools.model.CampaignAdPreview
import org.openapitools.model.CampaignAdPreviewCreate
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInner
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInner
import org.openapitools.model.CampaignBatchUpdateItem
import org.openapitools.model.CampaignBatchWriteResponseModel
import org.openapitools.model.CampaignCreateItem
import org.openapitools.model.CampaignDeliveryEstimatesCampaign
import org.openapitools.model.CampaignDeliveryEstimatesResponse
import org.openapitools.model.CampaignsAnalyticsMetrics
import org.openapitools.model.CampaignsList200Response
import org.openapitools.model.ConversionAttributionWindowDays
import org.openapitools.model.ConversionDeletionRequest
import org.openapitools.model.ConversionDeletionRequestCreate
import org.openapitools.model.ConversionDeletionRequestList200Response
import org.openapitools.model.ConversionEventResponse
import org.openapitools.model.ConversionEvents
import org.openapitools.model.ConversionEventsCreate
import org.openapitools.model.ConversionMSOTEventsCreate
import org.openapitools.model.ConversionProductReport
import org.openapitools.model.ConversionProductReportCreate
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.ConversionReportTimeType
import org.openapitools.model.ConversionTag
import org.openapitools.model.ConversionTagCreate
import org.openapitools.model.ConversionTagsList200Response
import org.openapitools.model.CustomerList
import org.openapitools.model.CustomerListCreate
import org.openapitools.model.CustomerListUpdateWithRequiredBody
import org.openapitools.model.CustomerListUpload
import org.openapitools.model.CustomerListUploadCreateRequest
import org.openapitools.model.CustomerListUploadCreateResponse
import org.openapitools.model.CustomerListsList200Response
import org.openapitools.model.CustomerSegment
import org.openapitools.model.CustomerSegmentCreate
import org.openapitools.model.CustomerSegmentList200Response
import org.openapitools.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
import org.openapitools.model.DetailedError
import org.openapitools.model.DynamicTitlesDownloadCSV
import org.openapitools.model.DynamicTitlesGetStatus
import org.openapitools.model.DynamicTitlesProcessCSV
import org.openapitools.model.DynamicTitlesProcessCSVCreate
import org.openapitools.model.DynamicTitlesUploadURL
import org.openapitools.model.EntityStatus
import org.openapitools.model.EventQualityScore
import org.openapitools.model.Granularity
import org.openapitools.model.IngestionSourceOptions
import org.openapitools.model.Keywords
import org.openapitools.model.KeywordsCreate
import org.openapitools.model.KeywordsGet200Response
import org.openapitools.model.KeywordsMetricsArrayResponse
import org.openapitools.model.KeywordsUpdate
import org.openapitools.model.LabelCreateRequest
import org.openapitools.model.LabelUpdateRequest
import org.openapitools.model.LabeledEntities
import org.openapitools.model.LabeledEntitiesCreate
import org.openapitools.model.LabelsList200Response
import org.openapitools.model.LabelsResponse
import org.openapitools.model.LeadForm
import org.openapitools.model.LeadFormBatchUpdate
import org.openapitools.model.LeadFormCreate
import org.openapitools.model.LeadFormTest
import org.openapitools.model.LeadFormTestCreate
import org.openapitools.model.LeadFormsCreate200Response
import org.openapitools.model.LeadFormsList200Response
import org.openapitools.model.LeadSubscription
import org.openapitools.model.LeadSubscriptionPostParamsCreate
import org.openapitools.model.LeadsExportResponseData
import org.openapitools.model.LeadsExports
import org.openapitools.model.LeadsExportsCreate
import org.openapitools.model.LookbackPeriodOptions
import org.openapitools.model.MMMReport
import org.openapitools.model.MMMReportCreate
import org.openapitools.model.MatchType
import org.openapitools.model.MetricsResponse
import org.openapitools.model.OrderLine
import org.openapitools.model.OrderLinesList200Response
import org.openapitools.model.PageVisitConversionTagsGet200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.ProductGroupAnalyticsItems
import org.openapitools.model.ProductGroupPromotion
import org.openapitools.model.ProductGroupPromotions
import org.openapitools.model.ProductGroupPromotionsCreate
import org.openapitools.model.ProductGroupPromotionsList200Response
import org.openapitools.model.ProductGroupPromotionsUpdateWithRequiredBody
import org.openapitools.model.Promotion
import org.openapitools.model.PromotionBatchUpdate
import org.openapitools.model.PromotionCreate
import org.openapitools.model.PromotionsList200Response
import org.openapitools.model.PromotionsResponse
import org.openapitools.model.QueryLabelEntityStatusesItems
import org.openapitools.model.QueryLabelTypesItems
import org.openapitools.model.ReportingColumnSync
import org.openapitools.model.ReportingTimeZone
import org.openapitools.model.SSIOAccount
import org.openapitools.model.SSIOInsertionOrder
import org.openapitools.model.SSIOInsertionOrderCreate
import org.openapitools.model.SSIOInsertionOrderStatusResponse
import org.openapitools.model.SSIOInsertionOrderUpdate
import org.openapitools.model.Schedule
import org.openapitools.model.ScheduleBatchUpdate
import org.openapitools.model.ScheduleCreate
import org.openapitools.model.ScheduleStatus
import org.openapitools.model.ScheduleType
import org.openapitools.model.SchedulesCreate200ResponseInner
import org.openapitools.model.SchedulesList200Response
import org.openapitools.model.SourcePlatformOptions
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response
import org.openapitools.model.TargetingTemplate
import org.openapitools.model.TargetingTemplateCreate
import org.openapitools.model.TargetingTemplateList200Response
import org.openapitools.model.TargetingTemplateUpdateRequestReadOrUpdate
import org.openapitools.model.TemplateBasedReport
import org.openapitools.model.TemplatesList200Response
import org.openapitools.model.TermsOfService
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
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
import javax.validation.constraints.Email
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

    @Operation(
        summary = "Get ad account analytics",
        operationId = "adAccountAnalytics",
        description = """  Get analytics for the specified `ad_account_id`, filtered by the specified options.

  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

  - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.

  - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = AdAccountAnalyticsItems::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/analytics"
        value = [PATH_AD_ACCOUNT_ANALYTICS],
        produces = ["application/json"]
    )
    fun adAccountAnalytics(
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<ReportingColumnSync>,
        @NotNull @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: java.math.BigDecimal,
        @Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,
        @Parameter(description = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", schema = Schema(allowableValues = ["PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE"])) @Valid @RequestParam(value = "reporting_timezone", required = false) reportingTimezone: ReportingTimeZone?
    ): ResponseEntity<List<AdAccountAnalyticsItems>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get targeting analytics for an ad account",
        operationId = "adAccountTargetingAnalyticsGet",
        description = """Get targeting analytics for an ad account.
For the requested account and metrics, the response will include the requested metric information
(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/>

* The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
* If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
* If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = MetricsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/targeting_analytics"
        value = [PATH_AD_ACCOUNT_TARGETING_ANALYTICS_GET],
        produces = ["application/json"]
    )
    fun adAccountTargetingAnalyticsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Size(min=1,max=15) @Parameter(description = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true) @Valid @RequestParam(value = "targeting_types", required = true) targetingTypes: kotlin.collections.List<AdsAnalyticsAccountTargetingType>,
        @NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<ReportingColumnSync>,
        @NotNull @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,
        @Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: java.math.BigDecimal,
        @Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,
        @Size(max=2) @Parameter(description = "List of types of attribution for the conversion report") @Valid @RequestParam(value = "attribution_types", required = false) attributionTypes: kotlin.collections.List<ConversionReportAttributionType>?,
        @Parameter(description = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", schema = Schema(allowableValues = ["PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE"])) @Valid @RequestParam(value = "reporting_timezone", required = false) reportingTimezone: ReportingTimeZone?
    ): ResponseEntity<MetricsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List accounts with access to an audience owned by an ad account",
        operationId = "adAccountsAudiencesSharedAccountsList",
        description = """List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccountsAudiencesSharedAccountsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/audiences/shared/accounts"
        value = [PATH_AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST],
        produces = ["application/json"]
    )
    fun adAccountsAudiencesSharedAccountsList(
        @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of the audience to use to filter the results.", required = true) @Valid @RequestParam(value = "audience_id", required = true) audienceId: kotlin.String,
        @NotNull @Parameter(description = "Filter accounts by account type.", required = true, schema = Schema(allowableValues = ["AD_ACCOUNT", "BUSINESS_ACCOUNT"])) @Valid @RequestParam(value = "account_type", required = true) accountType: AudienceAccountType,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create ad account",
        operationId = "adAccountsCreate",
        description = """Create a new ad account. Different ad accounts can support different currencies, payment methods, etc.
An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.

You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.)
For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccount::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = AdAccount::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts"
        value = [PATH_AD_ACCOUNTS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adAccountsCreate(
        @Parameter(description = "", required = true) @Valid @RequestBody adAccountCreate: AdAccountCreate
    ): ResponseEntity<AdAccount> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ad account",
        operationId = "adAccountsGet",
        description = """Get an ad account""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccount::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}"
        value = [PATH_AD_ACCOUNTS_GET],
        produces = ["application/json"]
    )
    fun adAccountsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<AdAccount> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List ad accounts",
        operationId = "adAccountsList",
        description = """Get a list of the ad_accounts that the "operation user_account" has access to.
        - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccountsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts"
        value = [PATH_AD_ACCOUNTS_LIST],
        produces = ["application/json"]
    )
    fun adAccountsList(
        @Parameter(description = "Include shared ad accounts", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "include_shared_accounts", required = false, defaultValue = "true") includeSharedAccounts: kotlin.Boolean,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<AdAccountsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete lead ads subscription",
        operationId = "adAccountsSubscriptionsDelById",
        description = """Delete an existing lead ads webhook subscription by ID.
  - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LeadSubscription::class))]),
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"
        value = [PATH_AD_ACCOUNTS_SUBSCRIPTIONS_DEL_BY_ID],
        produces = ["application/json"]
    )
    fun adAccountsSubscriptionsDelById(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a subscription.", required = true) @PathVariable("subscription_id") subscriptionId: kotlin.String
    ): ResponseEntity<LeadSubscription> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get lead ads subscription by ID",
        operationId = "adAccountsSubscriptionsGetById",
        description = """Get an existing lead ads webhook subscription by ID.
  - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LeadSubscription::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"
        value = [PATH_AD_ACCOUNTS_SUBSCRIPTIONS_GET_BY_ID],
        produces = ["application/json"]
    )
    fun adAccountsSubscriptionsGetById(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a subscription.", required = true) @PathVariable("subscription_id") subscriptionId: kotlin.String
    ): ResponseEntity<LeadSubscription> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get lead ads subscriptions",
        operationId = "adAccountsSubscriptionsGetList",
        description = """Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccountsSubscriptionsGetList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/leads/subscriptions"
        value = [PATH_AD_ACCOUNTS_SUBSCRIPTIONS_GET_LIST],
        produces = ["application/json"]
    )
    fun adAccountsSubscriptionsGetList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<AdAccountsSubscriptionsGetList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create lead ads subscription",
        operationId = "adAccountsSubscriptionsPost",
        description = """Create a lead ads webhook subscription.
Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.
  - Only requests for the OWNER or ADMIN of the ad_account will be allowed.
  - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.
  - For data security, egress lead data is encrypted with AES-256-GCM.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LeadSubscription::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/leads/subscriptions"
        value = [PATH_AD_ACCOUNTS_SUBSCRIPTIONS_POST],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adAccountsSubscriptionsPost(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate
    ): ResponseEntity<LeadSubscription> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ad group analytics",
        operationId = "adGroupsAnalytics",
        description = """Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.

- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = AdGroupsAnalyticsMetrics::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ad_groups/analytics"
        value = [PATH_AD_GROUPS_ANALYTICS],
        produces = ["application/json"]
    )
    fun adGroupsAnalytics(
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Size(min=1,max=250) @Parameter(description = "List of Ad group Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "ad_group_ids", required = true) adGroupIds: kotlin.collections.List<kotlin.String>,
        @NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<ReportingColumnSync>,
        @NotNull @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: java.math.BigDecimal,
        @Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,
        @Parameter(description = "Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "aggregate_report_rows", required = false, defaultValue = "false") aggregateReportRows: kotlin.Boolean,
        @Parameter(description = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", schema = Schema(allowableValues = ["PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE"])) @Valid @RequestParam(value = "reporting_timezone", required = false) reportingTimezone: ReportingTimeZone?
    ): ResponseEntity<List<AdGroupsAnalyticsMetrics>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get audience sizing",
        operationId = "adGroupsAudienceSizing",
        description = """Get potential audience size for an ad group with given targeting criteria.
Potential audience size estimates the number of people you may be able to reach per month with your campaign.
It is based on historical advertising data and the targeting criteria you select.
It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdGroupAudienceSizing::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = AdGroupAudienceSizing::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing"
        value = [PATH_AD_GROUPS_AUDIENCE_SIZING],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adGroupsAudienceSizing(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate
    ): ResponseEntity<AdGroupAudienceSizing> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get bid floors",
        operationId = "adGroupsBidFloorGet",
        description = """List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.

Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.

A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.

**Equivalency equations**, using dollars as an example currency:

* $1 = 1,000,000 microdollars
* 1 microdollar = $0.000001

**To convert between currency and microcurrency**, using dollars as an example currency:

* To convert dollars to microdollars, mutiply dollars by 1,000,000
* To convert microdollars to dollars, divide microdollars by 1,000,000

For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BidFloor::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = BidFloor::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/bid_floor"
        value = [PATH_AD_GROUPS_BID_FLOOR_GET],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adGroupsBidFloorGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody bidFloorCreate: BidFloorCreate
    ): ResponseEntity<BidFloor> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create ad groups",
        operationId = "adGroupsCreate",
        description = """Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).

For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).

**Notes:**
- `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.

Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.

**Equivalency equations**, using dollars as an example currency:
- $1 = 1,000,000 microdollars
- 1 microdollar = $0.000001

**To convert between currency and microcurrency**, using dollars as an example currency:
- To convert dollars to microdollars, multiply dollars by 1,000,000
- To convert microdollars to dollars, divide microdollars by 1,000,000

- Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.
- Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only.
- If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdGroupsCreate200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/ad_groups"
        value = [PATH_AD_GROUPS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adGroupsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=30)  @RequestBody adGroupCreateCreate: kotlin.collections.List<AdGroupCreateCreate>
    ): ResponseEntity<AdGroupsCreate200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get dynamic titles CSV download URL",
        operationId = "adGroupsDynamicTitlesDownloadCsv",
        description = """Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = DynamicTitlesDownloadCSV::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv"
        value = [PATH_AD_GROUPS_DYNAMIC_TITLES_DOWNLOAD_CSV],
        produces = ["application/json"]
    )
    fun adGroupsDynamicTitlesDownloadCsv(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Ad group ID.", required = true) @PathVariable("ad_group_id") adGroupId: kotlin.String
    ): ResponseEntity<DynamicTitlesDownloadCSV> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get dynamic titles status",
        operationId = "adGroupsDynamicTitlesGetStatus",
        description = """Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = DynamicTitlesGetStatus::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status"
        value = [PATH_AD_GROUPS_DYNAMIC_TITLES_GET_STATUS],
        produces = ["application/json"]
    )
    fun adGroupsDynamicTitlesGetStatus(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Ad group ID.", required = true) @PathVariable("ad_group_id") adGroupId: kotlin.String
    ): ResponseEntity<DynamicTitlesGetStatus> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get dynamic titles upload URL",
        operationId = "adGroupsDynamicTitlesGetUploadUrl",
        description = """Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = DynamicTitlesUploadURL::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads"
        value = [PATH_AD_GROUPS_DYNAMIC_TITLES_GET_UPLOAD_URL],
        produces = ["application/json"]
    )
    fun adGroupsDynamicTitlesGetUploadUrl(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Ad group ID.", required = true) @PathVariable("ad_group_id") adGroupId: kotlin.String
    ): ResponseEntity<DynamicTitlesUploadURL> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Process dynamic titles CSV",
        operationId = "adGroupsDynamicTitlesProcessCsv",
        description = """Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = DynamicTitlesProcessCSV::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = DynamicTitlesProcessCSV::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles"
        value = [PATH_AD_GROUPS_DYNAMIC_TITLES_PROCESS_CSV],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adGroupsDynamicTitlesProcessCsv(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Ad group ID.", required = true) @PathVariable("ad_group_id") adGroupId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate
    ): ResponseEntity<DynamicTitlesProcessCSV> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ad group",
        operationId = "adGroupsGet",
        description = """Get a specific ad group given the ad group ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdGroup::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}"
        value = [PATH_AD_GROUPS_GET],
        produces = ["application/json"]
    )
    fun adGroupsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Ad group ID.", required = true) @PathVariable("ad_group_id") adGroupId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<AdGroup> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List ad groups",
        operationId = "adGroupsList",
        description = """List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids).
**Note:** Provide only campaign_id or ad_group_id. Do not provide both.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdGroupsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ad_groups"
        value = [PATH_AD_GROUPS_LIST],
        produces = ["application/json"]
    )
    fun adGroupsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?,
        @Size(min=1,max=250) @Parameter(description = "List of Campaign Ids to use to filter the results.") @Valid @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?,
        @Size(min=1,max=250) @Parameter(description = "List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.") @Valid @RequestParam(value = "ad_group_ids", required = false) adGroupIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Entity status") @Valid @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<EntityStatus>,
        @Parameter(description = "Return interests as text names (if value is true) rather than topic IDs.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "translate_interests_to_names", required = false, defaultValue = "false") translateInterestsToNames: kotlin.Boolean
    ): ResponseEntity<AdGroupsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get targeting analytics for ad groups",
        operationId = "adGroupsTargetingAnalyticsGet",
        description = """Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49").

- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = MetricsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics"
        value = [PATH_AD_GROUPS_TARGETING_ANALYTICS_GET],
        produces = ["application/json"]
    )
    fun adGroupsTargetingAnalyticsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Size(min=1,max=250) @Parameter(description = "List of Ad group Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "ad_group_ids", required = true) adGroupIds: kotlin.collections.List<kotlin.String>,
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Size(min=1,max=14) @Parameter(description = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.", required = true) @Valid @RequestParam(value = "targeting_types", required = true) targetingTypes: kotlin.collections.List<AdsAnalyticsAdGroupTargetingType>,
        @NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<ReportingColumnSync>,
        @NotNull @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,
        @Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: java.math.BigDecimal,
        @Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,
        @Size(max=2) @Parameter(description = "List of types of attribution for the conversion report") @Valid @RequestParam(value = "attribution_types", required = false) attributionTypes: kotlin.collections.List<ConversionReportAttributionType>?,
        @Parameter(description = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", schema = Schema(allowableValues = ["PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE"])) @Valid @RequestParam(value = "reporting_timezone", required = false) reportingTimezone: ReportingTimeZone?,
        @Size(min=1,max=2) @Parameter(description = "Sort Columns.") @Valid @RequestParam(value = "sort_columns", required = false) sortColumns: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Sort ascending.") @Valid @RequestParam(value = "sort_ascending", required = false) sortAscending: kotlin.Boolean?
    ): ResponseEntity<MetricsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update ad groups",
        operationId = "adGroupsUpdate",
        description = """Update multiple existing ad groups.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdGroupsCreate200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/ad_groups"
        value = [PATH_AD_GROUPS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adGroupsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=30)  @RequestBody adGroupUpdateBatchUpdate: kotlin.collections.List<AdGroupUpdateBatchUpdate>
    ): ResponseEntity<AdGroupsCreate200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get pins analytics",
        operationId = "adPinsAnalytics",
        description = """Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = AdPinAnalytics::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/pins/analytics"
        value = [PATH_AD_PINS_ANALYTICS],
        produces = ["application/json"]
    )
    fun adPinsAnalytics(
        @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Campaign Id to use to filter the results.", required = true) @Valid @RequestParam(value = "campaign_id", required = true) campaignId: kotlin.String,
        @NotNull @Size(min=1,max=100) @Parameter(description = "List of Pin IDs.", required = true) @Valid @RequestParam(value = "pin_ids", required = true) pinIds: kotlin.collections.List<kotlin.String>,
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<ReportingColumnSync>,
        @NotNull @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: java.math.BigDecimal,
        @Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String
    ): ResponseEntity<List<AdPinAnalytics>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create ad preview with pin or image",
        operationId = "adPreviewsCreate",
        description = """Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.

If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)

You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdPreviewURLResponse::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = AdPreviewURLResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/ad_previews"
        value = [PATH_AD_PREVIEWS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adPreviewsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody adPreviewRequest: AdPreviewRequest
    ): ResponseEntity<AdPreviewURLResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get targeting analytics for ads",
        operationId = "adTargetingAnalyticsGet",
        description = """Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49").

* The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
* If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
* If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = MetricsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ads/targeting_analytics"
        value = [PATH_AD_TARGETING_ANALYTICS_GET],
        produces = ["application/json"]
    )
    fun adTargetingAnalyticsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Size(min=1,max=250) @Parameter(description = "List of Ad Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "ad_ids", required = true) adIds: kotlin.collections.List<kotlin.String>,
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Size(min=1,max=14) @Parameter(description = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true) @Valid @RequestParam(value = "targeting_types", required = true) targetingTypes: kotlin.collections.List<AdsAnalyticsAdTargetingType>,
        @NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<ReportingColumnSync>,
        @NotNull @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,
        @Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"])) @Valid @RequestParam(value = "click_window_days", required = false) clickWindowDays: ConversionAttributionWindowDays?,
        @Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"])) @Valid @RequestParam(value = "engagement_window_days", required = false) engagementWindowDays: ConversionAttributionWindowDays?,
        @Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"])) @Valid @RequestParam(value = "view_window_days", required = false) viewWindowDays: ConversionAttributionWindowDays?,
        @Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"])) @Valid @RequestParam(value = "conversion_report_time", required = false) conversionReportTime: ConversionReportTimeType?,
        @Size(max=2) @Parameter(description = "List of types of attribution for the conversion report") @Valid @RequestParam(value = "attribution_types", required = false) attributionTypes: kotlin.collections.List<ConversionReportAttributionType>?,
        @Parameter(description = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", schema = Schema(allowableValues = ["PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE"])) @Valid @RequestParam(value = "reporting_timezone", required = false) reportingTimezone: ReportingTimeZone?,
        @Size(min=1,max=2) @Parameter(description = "Sort Columns.") @Valid @RequestParam(value = "sort_columns", required = false) sortColumns: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Sort ascending.") @Valid @RequestParam(value = "sort_ascending", required = false) sortAscending: kotlin.Boolean?
    ): ResponseEntity<MetricsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ad analytics",
        operationId = "adsAnalytics",
        description = """    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.
    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
    - The request must contain either ad_ids or both campaign_ids and pin_ids.
    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = AdsAnalytics::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ads/analytics"
        value = [PATH_ADS_ANALYTICS],
        produces = ["application/json"]
    )
    fun adsAnalytics(
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<ReportingColumnSync>,
        @NotNull @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Size(min=1,max=100) @Parameter(description = "List of Pin IDs.") @Valid @RequestParam(value = "pin_ids", required = false) pinIds: kotlin.collections.List<kotlin.String>?,
        @Size(min=1,max=250) @Parameter(description = "List of Ad Ids to use to filter the results.") @Valid @RequestParam(value = "ad_ids", required = false) adIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: java.math.BigDecimal,
        @Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,
        @Size(min=1,max=250) @Parameter(description = "List of Campaign Ids to use to filter the results.") @Valid @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", schema = Schema(allowableValues = ["PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE"])) @Valid @RequestParam(value = "reporting_timezone", required = false) reportingTimezone: ReportingTimeZone?
    ): ResponseEntity<List<AdsAnalytics>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create ads",
        operationId = "adsCreate",
        description = """Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdBatchWriteResponseModel::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/ads"
        value = [PATH_ADS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=30)  @RequestBody adCreate: kotlin.collections.List<AdCreate>
    ): ResponseEntity<AdBatchWriteResponseModel> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Redeem ad credits",
        operationId = "adsCreditRedeem",
        description = """Redeem ads credit on behalf of the ad account id and apply it towards billing.

**This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdsCreditRedeem::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = AdsCreditRedeem::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write", "billing:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/ads_credit/redeem"
        value = [PATH_ADS_CREDIT_REDEEM],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adsCreditRedeem(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody adsCreditRedeemCreate: AdsCreditRedeemCreate
    ): ResponseEntity<AdsCreditRedeem> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ads credit discounts",
        operationId = "adsCreditsDiscountsGet",
        description = """Returns the list of discounts applied to the account.

**This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdsCreditsDiscountsGet200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read", "billing:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ads_credit/discounts"
        value = [PATH_ADS_CREDITS_DISCOUNTS_GET],
        produces = ["application/json"]
    )
    fun adsCreditsDiscountsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<AdsCreditsDiscountsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ad",
        operationId = "adsGet",
        description = """Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will
contain additional information from the Ad Review process.
For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Ad::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ads/{ad_id}"
        value = [PATH_ADS_GET],
        produces = ["application/json"]
    )
    fun adsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "The ID of this ad.", required = true) @PathVariable("ad_id") adId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<Ad> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List ads",
        operationId = "adsList",
        description = """List ads that meet the filters provided:
    - Listed campaign ids or ad group ids or ad ids
    - Listed entity statuses

If no filter is provided, all ads in the ad account are returned.

**Note:**
Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.

Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.

For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ads"
        value = [PATH_ADS_LIST],
        produces = ["application/json"]
    )
    fun adsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?,
        @Size(min=1,max=250) @Parameter(description = "List of Campaign Ids to use to filter the results.") @Valid @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?,
        @Size(min=1,max=250) @Parameter(description = "List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.") @Valid @RequestParam(value = "ad_group_ids", required = false) adGroupIds: kotlin.collections.List<kotlin.String>?,
        @Size(min=1,max=250) @Parameter(description = "List of Ad Ids to use to filter the results.") @Valid @RequestParam(value = "ad_ids", required = false) adIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Entity status") @Valid @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<EntityStatus>
    ): ResponseEntity<AdsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update ads",
        operationId = "adsUpdate",
        description = """Update multiple existing ads""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdBatchWriteResponseModel::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/ads"
        value = [PATH_ADS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=30)  @RequestBody adBatchUpdate: kotlin.collections.List<AdBatchUpdate>
    ): ResponseEntity<AdBatchWriteResponseModel> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create advertiser defined events",
        operationId = "advertiserDefinedEventsCreate",
        description = """Map advertiser defined events to standard events for the given ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdvertiserDefinedEventsCreate200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/advertiser_defined_events"
        value = [PATH_ADVERTISER_DEFINED_EVENTS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun advertiserDefinedEventsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest
    ): ResponseEntity<AdvertiserDefinedEventsCreate200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete advertiser defined events",
        operationId = "advertiserDefinedEventsDelete",
        description = """Untrack advertiser defined events for the given ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdvertiserDefinedEventsCreate200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/ad_accounts/{ad_account_id}/advertiser_defined_events"
        value = [PATH_ADVERTISER_DEFINED_EVENTS_DELETE],
        produces = ["application/json"]
    )
    fun advertiserDefinedEventsDelete(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Parameter(description = "List of event names to delete", required = true) @Valid @RequestParam(value = "event_names", required = true) eventNames: kotlin.collections.List<kotlin.String>
    ): ResponseEntity<AdvertiserDefinedEventsCreate200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get advertiser defined events",
        operationId = "advertiserDefinedEventsGet",
        description = """Get advertiser defined events for the given ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdvertiserDefinedEventsGet200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/advertiser_defined_events"
        value = [PATH_ADVERTISER_DEFINED_EVENTS_GET],
        produces = ["application/json"]
    )
    fun advertiserDefinedEventsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<AdvertiserDefinedEventsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update advertiser defined events",
        operationId = "advertiserDefinedEventsUpdate",
        description = """Update advertiser defined event names or mappings for the given ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdvertiserDefinedEventsCreate200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/advertiser_defined_events"
        value = [PATH_ADVERTISER_DEFINED_EVENTS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun advertiserDefinedEventsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest
    ): ResponseEntity<AdvertiserDefinedEventsCreate200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a request for a brand, category, SKU report",
        operationId = "analyticsCreateConversionProductReport",
        description = """  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)
  This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionProductReport::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = ConversionProductReport::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/reports/brand_category_sku"
        value = [PATH_ANALYTICS_CREATE_CONVERSION_PRODUCT_REPORT],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun analyticsCreateConversionProductReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody conversionProductReportCreate: ConversionProductReportCreate
    ): ResponseEntity<ConversionProductReport> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a request for a Marketing Mix Modeling (MMM) report",
        operationId = "analyticsCreateMmmReport",
        description = """    This creates an asynchronous mmm report based on the given request.
    It returns a token that you can use to download the report when it is
    ready. NOTE: An additional limit of 5 queries per minute per advertiser
    applies to this endpoint while it's in beta release.
    For the ADVERTISER_PAID_SPEND_IN_DOLLAR,
    ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR
    columns: if you receive bonus media, this value still includes that spend, and it will
    need to be removed manually with support from your Pinterest account team for a
    fully netted value. Over time, we'll also subtract bonus media and other incentives as
    data becomes available. Production and other non-media fees are excluded.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = MMMReport::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = MMMReport::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/mmm_reports"
        value = [PATH_ANALYTICS_CREATE_MMM_REPORT],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun analyticsCreateMmmReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody mmMReportCreate: MMMReportCreate
    ): ResponseEntity<MMMReport> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create async request for an account analytics report",
        operationId = "analyticsCreateReport",
        description = """  This returns a token that you can use to download the report when it is ready.
  Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.
  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
  - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.
  - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.
  - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdsAnalyticsCreateAsyncResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/reports"
        value = [PATH_ANALYTICS_CREATE_REPORT],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun analyticsCreateReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest
    ): ResponseEntity<AdsAnalyticsCreateAsyncResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create async request for an analytics report using a template",
        operationId = "analyticsCreateTemplateReport",
        description = """  This takes a template ID and an optional custom timeframe and
  constructs an asynchronous report based on the template. It returns
  a token that you can use to download the report when it is ready.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = TemplateBasedReport::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = TemplateBasedReport::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/templates/{template_id}/reports"
        value = [PATH_ANALYTICS_CREATE_TEMPLATE_REPORT],
        produces = ["application/json"]
    )
    fun analyticsCreateTemplateReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Size(max=18) @Parameter(description = "Unique identifier of a template.", required = true) @PathVariable("template_id") templateId: kotlin.String,
        @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.") @Valid @RequestParam(value = "start_date", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate?,
        @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.") @Valid @RequestParam(value = "end_date", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate?,
        @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = false) granularity: Granularity?
    ): ResponseEntity<TemplateBasedReport> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get advertiser brand, category, SKU report",
        operationId = "analyticsGetConversionProductReport",
        description = """  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)
  Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionProductReport::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/reports/brand_category_sku"
        value = [PATH_ANALYTICS_GET_CONVERSION_PRODUCT_REPORT],
        produces = ["application/json"]
    )
    fun analyticsGetConversionProductReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Parameter(description = "Token returned from the post request creation call", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String
    ): ResponseEntity<ConversionProductReport> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get advertiser Marketing Mix Modeling (MMM) report.",
        operationId = "analyticsGetMmmReport",
        description = """    Get an mmm report for an ad account. This returns a URL to an
    mmm metrics report given a token returned from the create mmm report endpoint.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = MMMReport::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/mmm_reports"
        value = [PATH_ANALYTICS_GET_MMM_REPORT],
        produces = ["application/json"]
    )
    fun analyticsGetMmmReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Parameter(description = "Token returned from the post request creation call", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String
    ): ResponseEntity<MMMReport> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get the account analytics report created by the async call",
        operationId = "analyticsGetReport",
        description = """  This returns a URL to an analytics report given a token returned from the post request report creation call.
  You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.
  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdsAnalyticsGetAsyncResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/reports"
        value = [PATH_ANALYTICS_GET_REPORT],
        produces = ["application/json"]
    )
    fun analyticsGetReport(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Parameter(description = "Token returned from the post request creation call", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String
    ): ResponseEntity<AdsAnalyticsGetAsyncResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get audience insights",
        operationId = "audienceInsightsGet",
        description = """Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.

[Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AudienceInsights::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/audience_insights"
        value = [PATH_AUDIENCE_INSIGHTS_GET],
        produces = ["application/json"]
    )
    fun audienceInsightsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Parameter(description = "Type of audience insights.", required = true, schema = Schema(allowableValues = ["YOUR_TOTAL_AUDIENCE", "YOUR_ENGAGED_AUDIENCE", "PINTEREST_TOTAL_AUDIENCE"])) @Valid @RequestParam(value = "audience_insight_type", required = true) audienceInsightType: AudienceInsightType
    ): ResponseEntity<AudienceInsights> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get audience insights scope and type",
        operationId = "audienceInsightsScopeAndTypeGet",
        description = """Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AudienceInsightsScopeAndTypeGet200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/insights/audiences"
        value = [PATH_AUDIENCE_INSIGHTS_SCOPE_AND_TYPE_GET],
        produces = ["application/json"]
    )
    fun audienceInsightsScopeAndTypeGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<AudienceInsightsScopeAndTypeGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create audience",
        operationId = "audiencesCreate",
        description = """Create a new audience for the ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccountsAudience::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = AdAccountsAudience::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/audiences"
        value = [PATH_AUDIENCES_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun audiencesCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody adAccountsAudienceCreate: AdAccountsAudienceCreate
    ): ResponseEntity<AdAccountsAudience> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get audience",
        operationId = "audiencesGet",
        description = """Get a specific audience given the audience ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccountsAudience::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/audiences/{audience_id}"
        value = [PATH_AUDIENCES_GET],
        produces = ["application/json"]
    )
    fun audiencesGet(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Audience ID.", required = true) @PathVariable("audience_id") audienceId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<AdAccountsAudience> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List audiences",
        operationId = "audiencesList",
        description = """Get list of audiences for the ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AudiencesList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/audiences"
        value = [PATH_AUDIENCES_LIST],
        produces = ["application/json"]
    )
    fun audiencesList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?,
        @Parameter(description = "", schema = Schema(allowableValues = ["OWNED", "RECEIVED"])) @Valid @RequestParam(value = "ownership_type", required = false) ownershipType: AudienceOwnershipType?,
        @Parameter(description = "When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "exclude_nca", required = false, defaultValue = "false") excludeNca: kotlin.Boolean
    ): ResponseEntity<AudiencesList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update audience",
        operationId = "audiencesUpdate",
        description = """Update an existing audience for the ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccountsAudience::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/audiences/{audience_id}"
        value = [PATH_AUDIENCES_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun audiencesUpdate(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Audience ID.", required = true) @PathVariable("audience_id") audienceId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody adAccountsAudienceUpdate: AdAccountsAudienceUpdate
    ): ResponseEntity<AdAccountsAudience> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get download url for a billing invoice",
        operationId = "billingInvoiceDownloadGet",
        description = """Get download url for a billing invoice.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BillingInvoiceDownloadResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read", "billing:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download"
        value = [PATH_BILLING_INVOICE_DOWNLOAD_GET],
        produces = ["application/json"]
    )
    fun billingInvoiceDownloadGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of a billing invoice.", required = true) @PathVariable("billing_invoice_id") billingInvoiceId: kotlin.String
    ): ResponseEntity<BillingInvoiceDownloadResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get billing invoices",
        operationId = "billingInvoicesGet",
        description = """Get billing invoices in the advertiser account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BillingInvoicesGet200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read", "billing:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/billing_invoices"
        value = [PATH_BILLING_INVOICES_GET],
        produces = ["application/json"]
    )
    fun billingInvoicesGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?,
        @Parameter(description = "Field of which to sort billing invoices", schema = Schema(allowableValues = ["DUE_DATE", "BILLING_PERIOD", "DOCUMENT_TYPE", "TOTAL_AMOUNT", "INVOICE_NUMBER"], defaultValue = "DUE_DATE")) @Valid @RequestParam(value = "sort", required = false, defaultValue = "DUE_DATE") sort: BillingInvoiceSortField,
        @Parameter(description = "Status of billing invoices to filter by", schema = Schema(allowableValues = ["OPEN", "CLOSED"])) @Valid @RequestParam(value = "status", required = false) status: BillingInvoiceStatus?,
        @Parameter(description = "Document type of billing invoices to filter by", schema = Schema(allowableValues = ["INVOICE", "CREDIT_MEMO"])) @Valid @RequestParam(value = "document_type", required = false) documentType: BillingInvoiceDocumentType?,
        @Parameter(description = "Starting point for due dates when searching for invoices. Format: YYYY-MM-DD") @Valid @RequestParam(value = "start_due_date", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDueDate: java.time.LocalDate?,
        @Parameter(description = "Ending point for due dates when searching for invoices. Format: YYYY-MM-DD") @Valid @RequestParam(value = "end_due_date", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDueDate: java.time.LocalDate?
    ): ResponseEntity<BillingInvoicesGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get billing profiles",
        operationId = "billingProfilesGet",
        description = """Get billing profiles in the advertiser account.

**This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BillingProfilesGet200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read", "billing:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/billing_profiles"
        value = [PATH_BILLING_PROFILES_GET],
        produces = ["application/json"]
    )
    fun billingProfilesGet(
        @NotNull @Parameter(description = "Return active billing profiles, if false return all billing profiles.", required = true) @Valid @RequestParam(value = "is_active", required = true) isActive: kotlin.Boolean,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<BillingProfilesGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get advertiser entities in bulk",
        operationId = "bulkDownloadCreate",
        description = """Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads,
keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused,
only active entities will return data.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BulkDownload::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = BulkDownload::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/bulk/download"
        value = [PATH_BULK_DOWNLOAD_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun bulkDownloadCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody bulkDownloadCreate: BulkDownloadCreate
    ): ResponseEntity<BulkDownload> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Download advertiser entities in bulk",
        operationId = "bulkRequestGet",
        description = """Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the
new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BulkJobData::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}"
        value = [PATH_BULK_REQUEST_GET],
        produces = ["application/json"]
    )
    fun bulkRequestGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Bulk request ID that is from one of the entities bulk endpoints", required = true) @PathVariable("bulk_request_id") bulkRequestId: kotlin.String,
        @Parameter(description = "If set to True then attach the errors/details to all the requests", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "include_details", required = false, defaultValue = "false") includeDetails: kotlin.Boolean
    ): ResponseEntity<BulkJobData> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create/update ad entities in bulk",
        operationId = "bulkUpsertCreate",
        description = """Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels.
Note that this request will be processed asynchronously; the response will include a <code>request_id</code>
that can be used to obtain the status of the request.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BulkUpsertResponse::class))]),
            ApiResponse(responseCode = "default", description = "Unexpected error", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/bulk/upsert"
        value = [PATH_BULK_UPSERT_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun bulkUpsertCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Parameters to get create/update ad entities in bulk", required = true) @Valid @RequestBody bulkUpsertRequest: BulkUpsertRequest
    ): ResponseEntity<BulkUpsertResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create ad preview records for one or more ad groups",
        operationId = "campaignAdPreviewCreate",
        description = """Create ad preview records for one or more ad groups that can be shared.
Each ad group is processed independently; individual failures do not block other previews.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = CampaignAdPreviewCreate200ResponseInner::class)))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(array = ArraySchema(schema = Schema(implementation = CampaignAdPreview::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/campaign_ad_preview"
        value = [PATH_CAMPAIGN_AD_PREVIEW_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun campaignAdPreviewCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody campaignAdPreviewCreate: kotlin.collections.List<CampaignAdPreviewCreate>
    ): ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete ad preview records for one or more ad groups",
        operationId = "campaignAdPreviewDelete",
        description = """Delete ad preview records for one or more ad groups.
All ad groups are validated before deleting any records.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = CampaignAdPreviewDelete200ResponseInner::class)))]),
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/ad_accounts/{ad_account_id}/campaign_ad_preview"
        value = [PATH_CAMPAIGN_AD_PREVIEW_DELETE],
        produces = ["application/json"]
    )
    fun campaignAdPreviewDelete(
        @NotNull @Size(min=1,max=250) @Parameter(description = "List of Ad group Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "ad_group_ids", required = true) adGroupIds: kotlin.collections.List<kotlin.String>,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Fetch ad preview records for one or more ad groups",
        operationId = "campaignAdPreviewRead",
        description = """Fetch ad preview records for one or more ad groups.
Returns all active previews associated with the provided ad group IDs.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = CampaignAdPreview::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/campaign_ad_preview"
        value = [PATH_CAMPAIGN_AD_PREVIEW_READ],
        produces = ["application/json"]
    )
    fun campaignAdPreviewRead(
        @NotNull @Size(min=1,max=250) @Parameter(description = "List of Ad group Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "ad_group_ids", required = true) adGroupIds: kotlin.collections.List<kotlin.String>,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<List<CampaignAdPreview>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get targeting analytics for campaigns",
        operationId = "campaignTargetingAnalyticsGet",
        description = """Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49").

* The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
* If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
* If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = MetricsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics"
        value = [PATH_CAMPAIGN_TARGETING_ANALYTICS_GET],
        produces = ["application/json"]
    )
    fun campaignTargetingAnalyticsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Size(min=1,max=250) @Parameter(description = "List of Campaign Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "campaign_ids", required = true) campaignIds: kotlin.collections.List<kotlin.String>,
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Size(min=1,max=14) @Parameter(description = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true) @Valid @RequestParam(value = "targeting_types", required = true) targetingTypes: kotlin.collections.List<AdsAnalyticsCampaignTargetingType>,
        @NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<ReportingColumnSync>,
        @NotNull @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,
        @Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: java.math.BigDecimal,
        @Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,
        @Size(max=2) @Parameter(description = "List of types of attribution for the conversion report") @Valid @RequestParam(value = "attribution_types", required = false) attributionTypes: kotlin.collections.List<ConversionReportAttributionType>?,
        @Parameter(description = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", schema = Schema(allowableValues = ["PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE"])) @Valid @RequestParam(value = "reporting_timezone", required = false) reportingTimezone: ReportingTimeZone?
    ): ResponseEntity<MetricsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get campaign analytics",
        operationId = "campaignsAnalytics",
        description = """Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = CampaignsAnalyticsMetrics::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/campaigns/analytics"
        value = [PATH_CAMPAIGNS_ANALYTICS],
        produces = ["application/json"]
    )
    fun campaignsAnalytics(
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Size(min=1,max=250) @Parameter(description = "List of Campaign Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "campaign_ids", required = true) campaignIds: kotlin.collections.List<kotlin.String>,
        @NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<ReportingColumnSync>,
        @NotNull @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: java.math.BigDecimal,
        @Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,
        @Parameter(description = "Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "aggregate_report_rows", required = false, defaultValue = "false") aggregateReportRows: kotlin.Boolean,
        @Parameter(description = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", schema = Schema(allowableValues = ["PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE"])) @Valid @RequestParam(value = "reporting_timezone", required = false) reportingTimezone: ReportingTimeZone?
    ): ResponseEntity<List<CampaignsAnalyticsMetrics>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create campaigns",
        operationId = "campaignsCreate",
        description = """Create multiple new campaigns. Every campaign has its own campaign_id
and houses one or more ad groups, which contain one or more ads.

For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).

**Note:**
- The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).

Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.

A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.

**Equivalency equations**, using dollars as an example currency:

- $1 = 1,000,000 microdollars
- 1 microdollar = $0.000001

**To convert between currency and microcurrency**, using dollars as an example currency:

- To convert dollars to microdollars, multiply dollars by 1,000,000
- To convert microdollars to dollars, divide microdollars by 1,000,000""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CampaignBatchWriteResponseModel::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/campaigns"
        value = [PATH_CAMPAIGNS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun campaignsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=30)  @RequestBody campaignCreateItem: kotlin.collections.List<CampaignCreateItem>
    ): ResponseEntity<CampaignBatchWriteResponseModel> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get campaign",
        operationId = "campaignsGet",
        description = """Get a specific campaign given the campaign ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Campaign::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}"
        value = [PATH_CAMPAIGNS_GET],
        produces = ["application/json"]
    )
    fun campaignsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Campaign ID, must be associated with the ad account ID provided in the path.", required = true) @PathVariable("campaign_id") campaignId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<Campaign> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List campaigns",
        operationId = "campaignsList",
        description = """Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary
roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CampaignsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/campaigns"
        value = [PATH_CAMPAIGNS_LIST],
        produces = ["application/json"]
    )
    fun campaignsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?,
        @Size(min=1,max=250) @Parameter(description = "List of Campaign Ids to use to filter the results.") @Valid @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Entity status") @Valid @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<EntityStatus>
    ): ResponseEntity<CampaignsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update campaigns",
        operationId = "campaignsUpdate",
        description = """Update multiple ad campaigns based on campaign_ids.

**Note:**
- The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).

Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.

A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.

**Equivalency equations**, using dollars as an example currency:

- $1 = 1,000,000 microdollars
- 1 microdollar = $0.000001

**To convert between currency and microcurrency**, using dollars as an example currency:

- To convert dollars to microdollars, multiply dollars by 1,000,000
- To convert microdollars to dollars, divide microdollars by 1,000,000""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CampaignBatchWriteResponseModel::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/campaigns"
        value = [PATH_CAMPAIGNS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun campaignsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=30)  @RequestBody campaignBatchUpdateItem: kotlin.collections.List<CampaignBatchUpdateItem>
    ): ResponseEntity<CampaignBatchWriteResponseModel> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a conversion deletion request",
        operationId = "conversionDeletionRequestCreate",
        description = """**This endpoint is currently in beta and not available to all apps.**
[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`.
After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion
within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionDeletionRequest::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = ConversionDeletionRequest::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/conversion_deletion_requests"
        value = [PATH_CONVERSION_DELETION_REQUEST_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun conversionDeletionRequestCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody conversionDeletionRequestCreate: ConversionDeletionRequestCreate
    ): ResponseEntity<ConversionDeletionRequest> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete a conversion deletion request",
        operationId = "conversionDeletionRequestDelete",
        description = """**This endpoint is currently in beta and not available to all apps.**
[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
Delete a conversion deletion request from `ad_account_id` with `request_id`.
This will cancel the request and prevent it from being processed. This can only be
done if the request is in the `PENDING` status and before the 72 hours mark.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionDeletionRequest::class))]),
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}"
        value = [PATH_CONVERSION_DELETION_REQUEST_DELETE],
        produces = ["application/json"]
    )
    fun conversionDeletionRequestDelete(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of the conversion deletion request", required = true) @PathVariable("request_id") requestId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<ConversionDeletionRequest> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get a single conversion deletion request",
        operationId = "conversionDeletionRequestGet",
        description = """**This endpoint is currently in beta and not available to all apps.**
[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
Get a single conversion deletion request from `ad_account_id` with `request_id`.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionDeletionRequest::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}"
        value = [PATH_CONVERSION_DELETION_REQUEST_GET],
        produces = ["application/json"]
    )
    fun conversionDeletionRequestGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of the conversion deletion request", required = true) @PathVariable("request_id") requestId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<ConversionDeletionRequest> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List conversion deletion requests",
        operationId = "conversionDeletionRequestList",
        description = """**This endpoint is currently in beta and not available to all apps.**
[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
Get a list of the conversion deletion requests for the specified `ad_account_id`.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionDeletionRequestList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/conversion_deletion_requests"
        value = [PATH_CONVERSION_DELETION_REQUEST_LIST],
        produces = ["application/json"]
    )
    fun conversionDeletionRequestList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?
    ): ResponseEntity<ConversionDeletionRequestList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get event quality score (EQS)",
        operationId = "conversionEqsList",
        description = """Get the Event Quality Score (EQS) of your conversion signals.

[Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = EventQualityScore::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/conversion_eqs"
        value = [PATH_CONVERSION_EQS_LIST],
        produces = ["application/json"]
    )
    fun conversionEqsList(
        @NotNull @Parameter(description = "Lookback window (number of days).", required = true, schema = Schema(allowableValues = ["1d", "14d"])) @Valid @RequestParam(value = "lookback_period", required = true) lookbackPeriod: LookbackPeriodOptions,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Source platform of event.", schema = Schema(allowableValues = ["WEB", "MOBILE", "MOBILE_ANDROID", "MOBILE_IOS", "OFFLINE", "PINTEREST_WEB", "PINTEREST_ANDROID", "PINTEREST_IOS", "POINT_OF_SALE"])) @Valid @RequestParam(value = "source_platform", required = false) sourcePlatform: SourcePlatformOptions?,
        @Parameter(description = "Ingestion source of event.", schema = Schema(allowableValues = ["TAG", "MMP", "FILE_UPLOAD", "CONVERSIONS_API", "NATIVE"])) @Valid @RequestParam(value = "ingestion_source", required = false) ingestionSource: IngestionSourceOptions?
    ): ResponseEntity<List<EventQualityScore>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create conversion tag",
        operationId = "conversionTagsCreate",
        description = """Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.

The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.

For more information, see:

[Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)

[Pinterest Tag](/docs/track-conversions/pinterest-tag/)

[Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionTag::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = ConversionTag::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/conversion_tags"
        value = [PATH_CONVERSION_TAGS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun conversionTagsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody conversionTagCreate: ConversionTagCreate
    ): ResponseEntity<ConversionTag> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get conversion tag",
        operationId = "conversionTagsGet",
        description = """Get information about an existing conversion tag.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionTag::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}"
        value = [PATH_CONVERSION_TAGS_GET],
        produces = ["application/json"]
    )
    fun conversionTagsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Id of the conversion tag.", required = true) @PathVariable("conversion_tag_id") conversionTagId: kotlin.String
    ): ResponseEntity<ConversionTag> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List conversion tags",
        operationId = "conversionTagsList",
        description = """List conversion tags associated with an ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionTagsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/conversion_tags"
        value = [PATH_CONVERSION_TAGS_LIST],
        produces = ["application/json"]
    )
    fun conversionTagsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Filter by deleted status", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "filter_deleted", required = false, defaultValue = "false") filterDeleted: kotlin.Boolean
    ): ResponseEntity<ConversionTagsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get country's keyword metrics",
        operationId = "countryKeywordsMetricsGet",
        description = """  See keyword metrics for a specified country, aggregated across all of Pinterest.
  (Definitions are available from the "Get delivery metrics definitions"
  [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = KeywordsMetricsArrayResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/keywords/metrics"
        value = [PATH_COUNTRY_KEYWORDS_METRICS_GET],
        produces = ["application/json"]
    )
    fun countryKeywordsMetricsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Parameter(description = "Two letter country code (ISO 3166-1 alpha-2)", required = true) @Valid @RequestParam(value = "country_code", required = true) countryCode: kotlin.String,
        @NotNull @Size(min=1,max=2000) @Parameter(description = "Comma-separated keywords", required = true) @Valid @RequestParam(value = "keywords", required = true) keywords: kotlin.collections.List<kotlin.String>
    ): ResponseEntity<KeywordsMetricsArrayResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create customer list upload",
        operationId = "customerListUploadsCreate",
        description = """Create a customer list upload request for multipart S3 upload.

Note: Each part must be at least 5mb; however the last part can be any size greater than 0.
Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.

**Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CustomerListUploadCreateResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads"
        value = [PATH_CUSTOMER_LIST_UPLOADS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun customerListUploadsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Customer list ID.", required = true) @PathVariable("customer_list_id") customerListId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody customerListUploadCreateRequest: CustomerListUploadCreateRequest
    ): ResponseEntity<CustomerListUploadCreateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get customer list upload",
        operationId = "customerListUploadsGet",
        description = """Get the metadata for a given upload by its ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CustomerListUpload::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}"
        value = [PATH_CUSTOMER_LIST_UPLOADS_GET],
        produces = ["application/json"]
    )
    fun customerListUploadsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Customer list ID.", required = true) @PathVariable("customer_list_id") customerListId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Customer List Upload ID.", required = true) @PathVariable("customer_list_upload_id") customerListUploadId: kotlin.String
    ): ResponseEntity<CustomerListUpload> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Run customer list upload",
        operationId = "customerListUploadsRun",
        description = """Begin processing a customer list upload.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CustomerListUpload::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run"
        value = [PATH_CUSTOMER_LIST_UPLOADS_RUN],
        produces = ["application/json"]
    )
    fun customerListUploadsRun(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Customer list ID.", required = true) @PathVariable("customer_list_id") customerListId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Customer List Upload ID.", required = true) @PathVariable("customer_list_upload_id") customerListUploadId: kotlin.String
    ): ResponseEntity<CustomerListUpload> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create customer lists",
        operationId = "customerListsCreate",
        description = """Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).

A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

**Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**
 
When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.
 
To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CustomerList::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = CustomerList::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/customer_lists"
        value = [PATH_CUSTOMER_LISTS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun customerListsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody customerListCreate: CustomerListCreate
    ): ResponseEntity<CustomerList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get customer list",
        operationId = "customerListsGet",
        description = """Gets a specific customer list given the customer list ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CustomerList::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"
        value = [PATH_CUSTOMER_LISTS_GET],
        produces = ["application/json"]
    )
    fun customerListsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Customer list ID.", required = true) @PathVariable("customer_list_id") customerListId: kotlin.String
    ): ResponseEntity<CustomerList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get customer lists",
        operationId = "customerListsList",
        description = """Get a set of customer lists including id and name based on the filters provided.

(Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CustomerListsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/customer_lists"
        value = [PATH_CUSTOMER_LISTS_LIST],
        produces = ["application/json"]
    )
    fun customerListsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?,
        @Parameter(description = "When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "exclude_nca", required = false, defaultValue = "false") excludeNca: kotlin.Boolean
    ): ResponseEntity<CustomerListsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update customer list",
        operationId = "customerListsUpdate",
        description = """Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)

When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your "CUSTOMER_LIST" audience. Your original list of records to add will be deleted when the matching process is complete.

For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CustomerList::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"
        value = [PATH_CUSTOMER_LISTS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun customerListsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Customer list ID.", required = true) @PathVariable("customer_list_id") customerListId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody
    ): ResponseEntity<CustomerList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create customer segments",
        operationId = "customerSegmentCreate",
        description = """Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CustomerSegment::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = CustomerSegment::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/customer_segments"
        value = [PATH_CUSTOMER_SEGMENT_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun customerSegmentCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody customerSegmentCreate: CustomerSegmentCreate
    ): ResponseEntity<CustomerSegment> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List customer segments",
        operationId = "customerSegmentList",
        description = """Get a list of the customer segments in the specified `ad_account_id`.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CustomerSegmentList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/customer_segments"
        value = [PATH_CUSTOMER_SEGMENT_LIST],
        produces = ["application/json"]
    )
    fun customerSegmentList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?,
        @Parameter(description = "Include audience sizing in result or not", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "include_sizing", required = false, defaultValue = "false") includeSizing: kotlin.Boolean,
        @Parameter(description = "Search query. Can contain pin description keywords or comma-separated pin IDs.") @Valid @RequestParam(value = "search_query", required = false) searchQuery: kotlin.String?
    ): ResponseEntity<CustomerSegmentList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update customer segments",
        operationId = "customerSegmentUpdate",
        description = """Update the customer segment given advertiser ID and customer segment ID""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/customer_segments"
        value = [PATH_CUSTOMER_SEGMENT_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun customerSegmentUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Send conversions",
        operationId = "eventsCreate",
        description = """The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object.
- This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`).
- The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.)
- This endpoint has a rate limit of 5,000 calls per minute per ad account.
- If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionEvents::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "422", description = "The request was well-formed but was unable to be followed due to semantic errors.", content = [Content(schema = Schema(implementation = DetailedError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "503", description = "The server is currently unable to handle the request due to a temporary overload or scheduled maintenance.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]),SecurityRequirement(name = "conversion_token") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/events"
        value = [PATH_EVENTS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun eventsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody conversionEventsCreate: ConversionEventsCreate,
        @Parameter(description = "Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.") @Valid @RequestParam(value = "test", required = false) test: kotlin.Boolean?
    ): ResponseEntity<ConversionEvents> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List of ad groups using promotions IDs.",
        operationId = "getAdGroupsByPromotionIdsList",
        description = """  Get a list of ad groups that are associated with those promotion ids""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdGroupsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/promotion_applied_entities"
        value = [PATH_GET_AD_GROUPS_BY_PROMOTION_IDS_LIST],
        produces = ["application/json"]
    )
    fun getAdGroupsByPromotionIdsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Size(min=1,max=50) @Parameter(description = "List of Promotion IDs to use to filter the results.", required = true) @Valid @RequestParam(value = "promotion_ids", required = true) promotionIds: kotlin.collections.List<kotlin.String>,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?
    ): ResponseEntity<AdGroupsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get campaign delivery estimates",
        operationId = "getCampaignDeliveryEstimates",
        description = """Get delivery estimates for an ads campaign

**This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CampaignDeliveryEstimatesResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "503", description = "The service is temporarily unavailable.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/campaigns/delivery_estimates"
        value = [PATH_GET_CAMPAIGN_DELIVERY_ESTIMATES],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCampaignDeliveryEstimates(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=1)  @RequestBody campaignDeliveryEstimatesCampaign: kotlin.collections.List<CampaignDeliveryEstimatesCampaign>
    ): ResponseEntity<CampaignDeliveryEstimatesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create keywords",
        operationId = "keywordsCreate",
        description = """  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).

  **Notes:**
  - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).
  - All keyword match types are available for ad groups.

  For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).

  **Returns:**
  - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.
  - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:
    ```json
    {
      "keywords": [],
      "errors": [
        {
          "data": {
            "archived": null,
            "match_type": "EXACT",
            "parent_type": null,
            "value": "foobar",
            "parent_id": null,
            "type": "keyword",
            "id": null
          },
          "error_messages": [
            "Advertisers and Campaigns only accept excluded targeting attributes."
          ]
        }
      ]
    }""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Keywords::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = Keywords::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/keywords"
        value = [PATH_KEYWORDS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun keywordsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody keywordsCreate: KeywordsCreate
    ): ResponseEntity<Keywords> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get keywords",
        operationId = "keywordsGet",
        description = """    Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.

    For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).

    **Notes:**
    - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).
    - All keyword match types are available for ad groups.

    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).

    **Returns:**
    - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.
    - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:
      ```json
      {
        "keywords": [],
        "errors": [
          {
            "data": {
              "archived": null,
              "match_type": "EXACT",
              "parent_type": null,
              "value": "foobar",
              "parent_id": null,
              "type": "keyword",
              "id": null
            },
            "error_messages": [
              "Advertisers and Campaigns only accept excluded targeting attributes."
            ]
          }
        ]
      }""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = KeywordsGet200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/keywords"
        value = [PATH_KEYWORDS_GET],
        produces = ["application/json"]
    )
    fun keywordsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Campaign Id to use to filter the results.") @Valid @RequestParam(value = "campaign_id", required = false) campaignId: kotlin.String?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Ad group Id.") @Valid @RequestParam(value = "ad_group_id", required = false) adGroupId: kotlin.String?,
        @Size(min=1,max=250) @Parameter(description = "List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.") @Valid @RequestParam(value = "ad_group_ids", required = false) adGroupIds: kotlin.collections.List<kotlin.String>?,
        @Size(min=1,max=5) @Parameter(description = "Keyword [match type](/docs/api-features/targeting-overview/)") @Valid @RequestParam(value = "match_types", required = false) matchTypes: kotlin.collections.List<MatchType>?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<KeywordsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update keywords",
        operationId = "keywordsUpdate",
        description = """  Update one or more keywords' bid and archived fields. Archiving
  a keyword effectively deletes it - keywords no longer receive metrics and
  are no longer visible within the parent entity's keywords list.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Keywords::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/keywords"
        value = [PATH_KEYWORDS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun keywordsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody keywordsUpdate: KeywordsUpdate
    ): ResponseEntity<Keywords> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Apply label to entity",
        operationId = "labelsApply",
        description = """  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

  Apply a label to one or more campaigns.
  Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.
  Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.

  **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LabeledEntities::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = LabeledEntities::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/labels/{label_id}/apply"
        value = [PATH_LABELS_APPLY],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun labelsApply(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Label ID.", required = true) @PathVariable("label_id") labelId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody labeledEntitiesCreate: LabeledEntitiesCreate
    ): ResponseEntity<LabeledEntities> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create labels",
        operationId = "labelsCreate",
        description = """[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

Apply one or more labels to a campaign.
Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/).
Currently, you can apply brand and custom labels. Future releases will provide more options.

**Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LabelsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/labels"
        value = [PATH_LABELS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun labelsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody labelCreateRequest: LabelCreateRequest
    ): ResponseEntity<LabelsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List labels",
        operationId = "labelsList",
        description = """[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

See a list of labels for assets that your account owns, and filter the list by different criteria.
If no filter is provided, it will default to labels associated with the ad account id.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LabelsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/labels"
        value = [PATH_LABELS_LIST],
        produces = ["application/json"]
    )
    fun labelsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Size(min=1,max=250) @Parameter(description = "List of Campaign Ids to use to filter the results.") @Valid @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?,
        @Size(min=1,max=250) @Parameter(description = "List of Label Ids to use to filter the results.") @Valid @RequestParam(value = "label_ids", required = false) labelIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Label entity status") @Valid @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<QueryLabelEntityStatusesItems>,
        @Parameter(description = "Label type.") @Valid @RequestParam(value = "label_types", required = false) labelTypes: kotlin.collections.List<QueryLabelTypesItems>,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<LabelsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Remove label from entities",
        operationId = "labelsRemove",
        description = """  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

  Remove a label from one or more entities.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LabeledEntities::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = LabeledEntities::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/labels/{label_id}/remove"
        value = [PATH_LABELS_REMOVE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun labelsRemove(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Label ID.", required = true) @PathVariable("label_id") labelId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody labeledEntitiesCreate: LabeledEntitiesCreate
    ): ResponseEntity<LabeledEntities> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update labels",
        operationId = "labelsUpdate",
        description = """[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

Change the properties of one or more labels.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LabelsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/labels"
        value = [PATH_LABELS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun labelsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody labelUpdateRequest: LabelUpdateRequest
    ): ResponseEntity<LabelsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get lead form by id",
        operationId = "leadFormGet",
        description = """**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**

Gets a lead form given it's ID. It must also be associated with the provided ad account ID.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LeadForm::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}"
        value = [PATH_LEAD_FORM_GET],
        produces = ["application/json"]
    )
    fun leadFormGet(
        @Pattern(regexp="^\\d+$") @Parameter(description = "The ID of this lead form", required = true) @PathVariable("lead_form_id") leadFormId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<LeadForm> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create lead form test data",
        operationId = "leadFormTestCreate",
        description = """Create lead form test data based on the list of answers provided as part of the body.
- List of answers should follow the questions creation order.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LeadFormTest::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test"
        value = [PATH_LEAD_FORM_TEST_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun leadFormTestCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a lead form.", required = true) @PathVariable("lead_form_id") leadFormId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody leadFormTestCreate: LeadFormTestCreate
    ): ResponseEntity<LeadFormTest> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create lead forms",
        operationId = "leadFormsCreate",
        description = """**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**

Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LeadFormsCreate200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/lead_forms"
        value = [PATH_LEAD_FORMS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun leadFormsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=30)  @RequestBody leadFormCreate: kotlin.collections.List<LeadFormCreate>
    ): ResponseEntity<LeadFormsCreate200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List lead forms",
        operationId = "leadFormsList",
        description = """**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**

List lead forms associated with an ad account ID.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LeadFormsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/lead_forms"
        value = [PATH_LEAD_FORMS_LIST],
        produces = ["application/json"]
    )
    fun leadFormsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?
    ): ResponseEntity<LeadFormsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update lead forms",
        operationId = "leadFormsUpdate",
        description = """**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**

Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LeadFormsCreate200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/lead_forms"
        value = [PATH_LEAD_FORMS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun leadFormsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=30)  @RequestBody leadFormBatchUpdate: kotlin.collections.List<LeadFormBatchUpdate>
    ): ResponseEntity<LeadFormsCreate200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a request to export leads collected from a lead ad",
        operationId = "leadsExportCreate",
        description = """**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**

Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.

Note: Lead ad data will be available up to 30 days after the lead has been submitted.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LeadsExports::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = LeadsExports::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/leads_export"
        value = [PATH_LEADS_EXPORT_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun leadsExportCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody leadsExportsCreate: LeadsExportsCreate
    ): ResponseEntity<LeadsExports> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get the lead export from the lead export create call",
        operationId = "leadsExportGet",
        description = """**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**

Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.

Note: Lead ad data will be available up to 30 days after the lead has been submitted.

For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LeadsExportResponseData::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}"
        value = [PATH_LEADS_EXPORT_GET],
        produces = ["application/json"]
    )
    fun leadsExportGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "lead_export_id token returned from the create a lead export endpoint", required = true) @PathVariable("leads_export_id") leadsExportId: kotlin.String
    ): ResponseEntity<LeadsExportResponseData> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Send Measurement Source Of Truth (MSOT) attributed conversion events",
        operationId = "msotEventsCreate",
        description = """**This feature is currently in beta and not available to all apps.**
If you are interested in joining the beta, reach out to your Pinterest account manager.

Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest
based on their `ad_account_id`. The request body should be a JSON object.

- These events will not be used in Reporting.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded."),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = kotlin.Any::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "msot:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/msot/events"
        value = [PATH_MSOT_EVENTS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun msotEventsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody conversionMSOTEventsCreate: ConversionMSOTEventsCreate
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Ocpm eligible conversion tags",
        operationId = "ocpmEligibleConversionTagsGet",
        description = """Get Ocpm eligible conversion tag events for an ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = kotlin.collections.Map::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible"
        value = [PATH_OCPM_ELIGIBLE_CONVERSION_TAGS_GET],
        produces = ["application/json"]
    )
    fun ocpmEligibleConversionTagsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<Map<String, kotlin.collections.List<ConversionEventResponse>>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get order line",
        operationId = "orderLinesGet",
        description = """Get a specific existing order line associated with an ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = OrderLine::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}"
        value = [PATH_ORDER_LINES_GET],
        produces = ["application/json"]
    )
    fun orderLinesGet(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Order line ID.", required = true) @PathVariable("order_line_id") orderLineId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<OrderLine> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get order lines.",
        operationId = "orderLinesList",
        description = """List existing order lines associated with an ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = OrderLinesList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/order_lines"
        value = [PATH_ORDER_LINES_LIST],
        produces = ["application/json"]
    )
    fun orderLinesList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?
    ): ResponseEntity<OrderLinesList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get page visit conversion tags",
        operationId = "pageVisitConversionTagsGet",
        description = """Get all page visit conversion tag events for an ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = PageVisitConversionTagsGet200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/conversion_tags/page_visit"
        value = [PATH_PAGE_VISIT_CONVERSION_TAGS_GET],
        produces = ["application/json"]
    )
    fun pageVisitConversionTagsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?
    ): ResponseEntity<PageVisitConversionTagsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create product group promotions",
        operationId = "productGroupPromotionsCreate",
        description = """Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ProductGroupPromotions::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = ProductGroupPromotions::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/product_group_promotions"
        value = [PATH_PRODUCT_GROUP_PROMOTIONS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun productGroupPromotionsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody productGroupPromotionsCreate: ProductGroupPromotionsCreate
    ): ResponseEntity<ProductGroupPromotions> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get a product group promotion by id",
        operationId = "productGroupPromotionsGet",
        description = """Get a product group promotion by id""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ProductGroupPromotion::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}"
        value = [PATH_PRODUCT_GROUP_PROMOTIONS_GET],
        produces = ["application/json"]
    )
    fun productGroupPromotionsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of a product group promotion", required = true) @PathVariable("product_group_promotion_id") productGroupPromotionId: kotlin.String
    ): ResponseEntity<ProductGroupPromotion> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get product group promotions",
        operationId = "productGroupPromotionsList",
        description = """List existing product group promotions associated with an ad account.

Include either ad_group_id or product_group_promotion_ids in your request.

**Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters.
Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ProductGroupPromotionsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/product_group_promotions"
        value = [PATH_PRODUCT_GROUP_PROMOTIONS_LIST],
        produces = ["application/json"]
    )
    fun productGroupPromotionsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?,
        @Size(min=1,max=250) @Parameter(description = "List of Product group promotion Ids.") @Valid @RequestParam(value = "product_group_promotion_ids", required = false) productGroupPromotionIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Entity status") @Valid @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<EntityStatus>,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Ad group Id.") @Valid @RequestParam(value = "ad_group_id", required = false) adGroupId: kotlin.String?
    ): ResponseEntity<ProductGroupPromotionsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update product group promotions",
        operationId = "productGroupPromotionsUpdate",
        description = """Update multiple existing Product Group Promotions (by product_group_id)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ProductGroupPromotions::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/product_group_promotions"
        value = [PATH_PRODUCT_GROUP_PROMOTIONS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun productGroupPromotionsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody
    ): ResponseEntity<ProductGroupPromotions> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get product group analytics",
        operationId = "productGroupsAnalytics",
        description = """Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.

- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = ProductGroupAnalyticsItems::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/product_groups/analytics"
        value = [PATH_PRODUCT_GROUPS_ANALYTICS],
        produces = ["application/json"]
    )
    fun productGroupsAnalytics(
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Size(min=1,max=250) @Parameter(description = "List of Product group Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "product_group_ids", required = true) productGroupIds: kotlin.collections.List<kotlin.String>,
        @NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<ReportingColumnSync>,
        @NotNull @Parameter(description = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: java.math.BigDecimal,
        @Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: java.math.BigDecimal,
        @Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,
        @Parameter(description = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", schema = Schema(allowableValues = ["PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE"])) @Valid @RequestParam(value = "reporting_timezone", required = false) reportingTimezone: ReportingTimeZone?
    ): ResponseEntity<List<ProductGroupAnalyticsItems>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create promotions",
        operationId = "promotionsCreate",
        description = """Create multiple new promotions.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = PromotionsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/promotions"
        value = [PATH_PROMOTIONS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun promotionsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=30)  @RequestBody promotionCreate: kotlin.collections.List<PromotionCreate>
    ): ResponseEntity<PromotionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete promotion by id",
        operationId = "promotionsDelete",
        description = """Delete a promotion within Pinterest.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Promotion::class))]),
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/ad_accounts/{ad_account_id}/promotions/{promotion_id}"
        value = [PATH_PROMOTIONS_DELETE],
        produces = ["application/json"]
    )
    fun promotionsDelete(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Promotion ID", required = true) @PathVariable("promotion_id") promotionId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<Promotion> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get promotion by id",
        operationId = "promotionsGet",
        description = """Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Promotion::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/promotions/{promotion_id}"
        value = [PATH_PROMOTIONS_GET],
        produces = ["application/json"]
    )
    fun promotionsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Promotion ID", required = true) @PathVariable("promotion_id") promotionId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<Promotion> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get promotions",
        operationId = "promotionsList",
        description = """Gets all promotions associated with an ad account ID that can be
applied to an ad group. Can be either internally-saved promotions or external
promotions imported from a commerce integration.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = PromotionsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/promotions"
        value = [PATH_PROMOTIONS_LIST],
        produces = ["application/json"]
    )
    fun promotionsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?
    ): ResponseEntity<PromotionsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update promotions",
        operationId = "promotionsUpdate",
        description = """Update multiple promotions.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = PromotionsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/promotions"
        value = [PATH_PROMOTIONS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun promotionsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=30)  @RequestBody promotionBatchUpdate: kotlin.collections.List<PromotionBatchUpdate>
    ): ResponseEntity<PromotionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete ads data for ad account in API Sandbox",
        operationId = "sandboxDelete",
        description = """Delete an ad account and all the ads data associated with that account.
A string message is returned indicating the status of the delete operation.

Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).
Go to /docs/developer-tools/sandbox/ for more information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = kotlin.String::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/ad_accounts/{ad_account_id}/sandbox"
        value = [PATH_SANDBOX_DELETE],
        produces = ["application/json"]
    )
    fun sandboxDelete(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create schedules",
        operationId = "schedulesCreate",
        description = """Batch create schedules""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = SchedulesCreate200ResponseInner::class)))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(array = ArraySchema(schema = Schema(implementation = Schedule::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/schedules"
        value = [PATH_SCHEDULES_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun schedulesCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody scheduleCreate: kotlin.collections.List<ScheduleCreate>
    ): ResponseEntity<List<SchedulesCreate200ResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Schedules",
        operationId = "schedulesList",
        description = """Get schedules for a specific advertiser""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = SchedulesList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/schedules"
        value = [PATH_SCHEDULES_LIST],
        produces = ["application/json"]
    )
    fun schedulesList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @NotNull @Size(min=1) @Parameter(description = "List of Entity IDs, must be associated with the Ad Accound ID provided in the path.", required = true) @Valid @RequestParam(value = "entity_ids", required = true) entityIds: kotlin.collections.List<kotlin.String>,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?,
        @Parameter(description = "Filter schedules by status (one or more)") @Valid @RequestParam(value = "schedule_statuses", required = false) scheduleStatuses: kotlin.collections.List<ScheduleStatus>?,
        @Parameter(description = "Filter schedules by a type", schema = Schema(allowableValues = ["CAMPAIGN_BUDGET_CHANGE", "CAMPAIGN_BID_MULTIPLIERS"])) @Valid @RequestParam(value = "schedule_type", required = false) scheduleType: ScheduleType?
    ): ResponseEntity<SchedulesList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update schedules",
        operationId = "schedulesUpdate",
        description = """Update one or more schedules""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = SchedulesCreate200ResponseInner::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/schedules"
        value = [PATH_SCHEDULES_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun schedulesUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody scheduleBatchUpdate: kotlin.collections.List<ScheduleBatchUpdate>
    ): ResponseEntity<List<SchedulesCreate200ResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Salesforce account details including bill-to information.",
        operationId = "ssioAccountsGet",
        description = """  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.
  - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = SSIOAccount::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ssio/accounts"
        value = [PATH_SSIO_ACCOUNTS_GET],
        produces = ["application/json"]
    )
    fun ssioAccountsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String
    ): ResponseEntity<SSIOAccount> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create insertion order through SSIO.",
        operationId = "ssioInsertionOrderCreate",
        description = """  Create insertion order through SSIO for `ad_account_id`.
  - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = SSIOInsertionOrder::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = SSIOInsertionOrder::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/ssio/insertion_orders"
        value = [PATH_SSIO_INSERTION_ORDER_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun ssioInsertionOrderCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody ssIOInsertionOrderCreate: SSIOInsertionOrderCreate
    ): ResponseEntity<SSIOInsertionOrder> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Edit insertion order through SSIO.",
        operationId = "ssioInsertionOrderEdit",
        description = """  Edit insertion order through SSIO for `ad_account_id`.
  - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = SSIOInsertionOrder::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/ssio/insertion_orders"
        value = [PATH_SSIO_INSERTION_ORDER_EDIT],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun ssioInsertionOrderEdit(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody ssIOInsertionOrderUpdate: SSIOInsertionOrderUpdate
    ): ResponseEntity<SSIOInsertionOrder> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get insertion order status by ad account id.",
        operationId = "ssioInsertionOrdersStatusGetByAdAccount",
        description = """  Get insertion order status for `ad_account_id`.
  - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = SsioInsertionOrdersStatusGetByAdAccount200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status"
        value = [PATH_SSIO_INSERTION_ORDERS_STATUS_GET_BY_AD_ACCOUNT],
        produces = ["application/json"]
    )
    fun ssioInsertionOrdersStatusGetByAdAccount(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<SsioInsertionOrdersStatusGetByAdAccount200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get insertion order status by pin order id.",
        operationId = "ssioInsertionOrdersStatusGetByPinOrderId",
        description = """  Get insertion order status for `pin_order_id`.
  - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = SSIOInsertionOrderStatusResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status"
        value = [PATH_SSIO_INSERTION_ORDERS_STATUS_GET_BY_PIN_ORDER_ID],
        produces = ["application/json"]
    )
    fun ssioInsertionOrdersStatusGetByPinOrderId(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "The pin order id associated with the ssio insertion order", required = true) @PathVariable("pin_order_id") pinOrderId: kotlin.String
    ): ResponseEntity<SSIOInsertionOrderStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Salesforce order lines by ad account id.",
        operationId = "ssioOrderLinesGetByAdAccount",
        description = """  Get Salesforce order lines for account id `ad_account_id`.
  - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = SsioOrderLinesGetByAdAccount200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/ssio/order_lines"
        value = [PATH_SSIO_ORDER_LINES_GET_BY_AD_ACCOUNT],
        produces = ["application/json"]
    )
    fun ssioOrderLinesGetByAdAccount(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "The pin order id associated with the SSIO insertion order") @Valid @RequestParam(value = "pin_order_id", required = false) pinOrderId: kotlin.String?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<SsioOrderLinesGetByAdAccount200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create targeting templates",
        operationId = "targetingTemplateCreate",
        description = """Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.

Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = TargetingTemplate::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = TargetingTemplate::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ad_accounts/{ad_account_id}/targeting_templates"
        value = [PATH_TARGETING_TEMPLATE_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun targetingTemplateCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody targetingTemplateCreate: TargetingTemplateCreate
    ): ResponseEntity<TargetingTemplate> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List targeting templates",
        operationId = "targetingTemplateList",
        description = """Get a list of the targeting templates in the specified `ad_account_id`""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = TargetingTemplateList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/targeting_templates"
        value = [PATH_TARGETING_TEMPLATE_LIST],
        produces = ["application/json"]
    )
    fun targetingTemplateList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?,
        @Parameter(description = "Include audience sizing in result or not", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "include_sizing", required = false, defaultValue = "false") includeSizing: kotlin.Boolean,
        @Parameter(description = "Search query. Can contain pin description keywords or comma-separated pin IDs.") @Valid @RequestParam(value = "search_query", required = false) searchQuery: kotlin.String?
    ): ResponseEntity<TargetingTemplateList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update targeting templates",
        operationId = "targetingTemplateUpdate",
        description = """Update the targeting template given advertiser ID and targeting template ID""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/targeting_templates"
        value = [PATH_TARGETING_TEMPLATE_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun targetingTemplateUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List templates",
        operationId = "templatesList",
        description = """Gets all Templates associated with an ad account ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = TemplatesList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/templates"
        value = [PATH_TEMPLATES_LIST],
        produces = ["application/json"]
    )
    fun templatesList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: PinterestLibPaginationOrder?
    ): ResponseEntity<TemplatesList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get terms of service",
        operationId = "termsOfServiceGet",
        description = """Get the text of the terms of service and see whether the advertiser has accepted the terms of service.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = TermsOfService::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ad_accounts/{ad_account_id}/terms_of_service"
        value = [PATH_TERMS_OF_SERVICE_GET],
        produces = ["application/json"]
    )
    fun termsOfServiceGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "Return HTML in TOS text.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "include_html", required = false, defaultValue = "false") includeHtml: kotlin.Boolean,
        @Parameter(description = "Request type.") @Valid @RequestParam(value = "tos_type", required = false) tosType: kotlin.String?
    ): ResponseEntity<TermsOfService> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update audience sharing between ad accounts",
        operationId = "updateAdAccountToAdAccountSharedAudience",
        description = """From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.

This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccountToAdAccountSharedAudience::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared"
        value = [PATH_UPDATE_AD_ACCOUNT_TO_AD_ACCOUNT_SHARED_AUDIENCE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateAdAccountToAdAccountSharedAudience(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
    ): ResponseEntity<AdAccountToAdAccountSharedAudience> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update audience sharing from an ad account to businesses",
        operationId = "updateAdAccountToBusinessSharedAudience",
        description = """From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.

This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccountToBusinessSharedAudience::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/ad_accounts/{ad_account_id}/audiences/businesses/shared"
        value = [PATH_UPDATE_AD_ACCOUNT_TO_BUSINESS_SHARED_AUDIENCE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateAdAccountToBusinessSharedAudience(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
    ): ResponseEntity<AdAccountToBusinessSharedAudience> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_AD_ACCOUNT_ANALYTICS: String = "/ad_accounts/{ad_account_id}/analytics"
        const val PATH_AD_ACCOUNT_TARGETING_ANALYTICS_GET: String = "/ad_accounts/{ad_account_id}/targeting_analytics"
        const val PATH_AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST: String = "/ad_accounts/{ad_account_id}/audiences/shared/accounts"
        const val PATH_AD_ACCOUNTS_CREATE: String = "/ad_accounts"
        const val PATH_AD_ACCOUNTS_GET: String = "/ad_accounts/{ad_account_id}"
        const val PATH_AD_ACCOUNTS_LIST: String = "/ad_accounts"
        const val PATH_AD_ACCOUNTS_SUBSCRIPTIONS_DEL_BY_ID: String = "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"
        const val PATH_AD_ACCOUNTS_SUBSCRIPTIONS_GET_BY_ID: String = "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"
        const val PATH_AD_ACCOUNTS_SUBSCRIPTIONS_GET_LIST: String = "/ad_accounts/{ad_account_id}/leads/subscriptions"
        const val PATH_AD_ACCOUNTS_SUBSCRIPTIONS_POST: String = "/ad_accounts/{ad_account_id}/leads/subscriptions"
        const val PATH_AD_GROUPS_ANALYTICS: String = "/ad_accounts/{ad_account_id}/ad_groups/analytics"
        const val PATH_AD_GROUPS_AUDIENCE_SIZING: String = "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing"
        const val PATH_AD_GROUPS_BID_FLOOR_GET: String = "/ad_accounts/{ad_account_id}/bid_floor"
        const val PATH_AD_GROUPS_CREATE: String = "/ad_accounts/{ad_account_id}/ad_groups"
        const val PATH_AD_GROUPS_DYNAMIC_TITLES_DOWNLOAD_CSV: String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv"
        const val PATH_AD_GROUPS_DYNAMIC_TITLES_GET_STATUS: String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status"
        const val PATH_AD_GROUPS_DYNAMIC_TITLES_GET_UPLOAD_URL: String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads"
        const val PATH_AD_GROUPS_DYNAMIC_TITLES_PROCESS_CSV: String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles"
        const val PATH_AD_GROUPS_GET: String = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}"
        const val PATH_AD_GROUPS_LIST: String = "/ad_accounts/{ad_account_id}/ad_groups"
        const val PATH_AD_GROUPS_TARGETING_ANALYTICS_GET: String = "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics"
        const val PATH_AD_GROUPS_UPDATE: String = "/ad_accounts/{ad_account_id}/ad_groups"
        const val PATH_AD_PINS_ANALYTICS: String = "/ad_accounts/{ad_account_id}/pins/analytics"
        const val PATH_AD_PREVIEWS_CREATE: String = "/ad_accounts/{ad_account_id}/ad_previews"
        const val PATH_AD_TARGETING_ANALYTICS_GET: String = "/ad_accounts/{ad_account_id}/ads/targeting_analytics"
        const val PATH_ADS_ANALYTICS: String = "/ad_accounts/{ad_account_id}/ads/analytics"
        const val PATH_ADS_CREATE: String = "/ad_accounts/{ad_account_id}/ads"
        const val PATH_ADS_CREDIT_REDEEM: String = "/ad_accounts/{ad_account_id}/ads_credit/redeem"
        const val PATH_ADS_CREDITS_DISCOUNTS_GET: String = "/ad_accounts/{ad_account_id}/ads_credit/discounts"
        const val PATH_ADS_GET: String = "/ad_accounts/{ad_account_id}/ads/{ad_id}"
        const val PATH_ADS_LIST: String = "/ad_accounts/{ad_account_id}/ads"
        const val PATH_ADS_UPDATE: String = "/ad_accounts/{ad_account_id}/ads"
        const val PATH_ADVERTISER_DEFINED_EVENTS_CREATE: String = "/ad_accounts/{ad_account_id}/advertiser_defined_events"
        const val PATH_ADVERTISER_DEFINED_EVENTS_DELETE: String = "/ad_accounts/{ad_account_id}/advertiser_defined_events"
        const val PATH_ADVERTISER_DEFINED_EVENTS_GET: String = "/ad_accounts/{ad_account_id}/advertiser_defined_events"
        const val PATH_ADVERTISER_DEFINED_EVENTS_UPDATE: String = "/ad_accounts/{ad_account_id}/advertiser_defined_events"
        const val PATH_ANALYTICS_CREATE_CONVERSION_PRODUCT_REPORT: String = "/ad_accounts/{ad_account_id}/reports/brand_category_sku"
        const val PATH_ANALYTICS_CREATE_MMM_REPORT: String = "/ad_accounts/{ad_account_id}/mmm_reports"
        const val PATH_ANALYTICS_CREATE_REPORT: String = "/ad_accounts/{ad_account_id}/reports"
        const val PATH_ANALYTICS_CREATE_TEMPLATE_REPORT: String = "/ad_accounts/{ad_account_id}/templates/{template_id}/reports"
        const val PATH_ANALYTICS_GET_CONVERSION_PRODUCT_REPORT: String = "/ad_accounts/{ad_account_id}/reports/brand_category_sku"
        const val PATH_ANALYTICS_GET_MMM_REPORT: String = "/ad_accounts/{ad_account_id}/mmm_reports"
        const val PATH_ANALYTICS_GET_REPORT: String = "/ad_accounts/{ad_account_id}/reports"
        const val PATH_AUDIENCE_INSIGHTS_GET: String = "/ad_accounts/{ad_account_id}/audience_insights"
        const val PATH_AUDIENCE_INSIGHTS_SCOPE_AND_TYPE_GET: String = "/ad_accounts/{ad_account_id}/insights/audiences"
        const val PATH_AUDIENCES_CREATE: String = "/ad_accounts/{ad_account_id}/audiences"
        const val PATH_AUDIENCES_GET: String = "/ad_accounts/{ad_account_id}/audiences/{audience_id}"
        const val PATH_AUDIENCES_LIST: String = "/ad_accounts/{ad_account_id}/audiences"
        const val PATH_AUDIENCES_UPDATE: String = "/ad_accounts/{ad_account_id}/audiences/{audience_id}"
        const val PATH_BILLING_INVOICE_DOWNLOAD_GET: String = "/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download"
        const val PATH_BILLING_INVOICES_GET: String = "/ad_accounts/{ad_account_id}/billing_invoices"
        const val PATH_BILLING_PROFILES_GET: String = "/ad_accounts/{ad_account_id}/billing_profiles"
        const val PATH_BULK_DOWNLOAD_CREATE: String = "/ad_accounts/{ad_account_id}/bulk/download"
        const val PATH_BULK_REQUEST_GET: String = "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}"
        const val PATH_BULK_UPSERT_CREATE: String = "/ad_accounts/{ad_account_id}/bulk/upsert"
        const val PATH_CAMPAIGN_AD_PREVIEW_CREATE: String = "/ad_accounts/{ad_account_id}/campaign_ad_preview"
        const val PATH_CAMPAIGN_AD_PREVIEW_DELETE: String = "/ad_accounts/{ad_account_id}/campaign_ad_preview"
        const val PATH_CAMPAIGN_AD_PREVIEW_READ: String = "/ad_accounts/{ad_account_id}/campaign_ad_preview"
        const val PATH_CAMPAIGN_TARGETING_ANALYTICS_GET: String = "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics"
        const val PATH_CAMPAIGNS_ANALYTICS: String = "/ad_accounts/{ad_account_id}/campaigns/analytics"
        const val PATH_CAMPAIGNS_CREATE: String = "/ad_accounts/{ad_account_id}/campaigns"
        const val PATH_CAMPAIGNS_GET: String = "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}"
        const val PATH_CAMPAIGNS_LIST: String = "/ad_accounts/{ad_account_id}/campaigns"
        const val PATH_CAMPAIGNS_UPDATE: String = "/ad_accounts/{ad_account_id}/campaigns"
        const val PATH_CONVERSION_DELETION_REQUEST_CREATE: String = "/ad_accounts/{ad_account_id}/conversion_deletion_requests"
        const val PATH_CONVERSION_DELETION_REQUEST_DELETE: String = "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}"
        const val PATH_CONVERSION_DELETION_REQUEST_GET: String = "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}"
        const val PATH_CONVERSION_DELETION_REQUEST_LIST: String = "/ad_accounts/{ad_account_id}/conversion_deletion_requests"
        const val PATH_CONVERSION_EQS_LIST: String = "/ad_accounts/{ad_account_id}/conversion_eqs"
        const val PATH_CONVERSION_TAGS_CREATE: String = "/ad_accounts/{ad_account_id}/conversion_tags"
        const val PATH_CONVERSION_TAGS_GET: String = "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}"
        const val PATH_CONVERSION_TAGS_LIST: String = "/ad_accounts/{ad_account_id}/conversion_tags"
        const val PATH_COUNTRY_KEYWORDS_METRICS_GET: String = "/ad_accounts/{ad_account_id}/keywords/metrics"
        const val PATH_CUSTOMER_LIST_UPLOADS_CREATE: String = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads"
        const val PATH_CUSTOMER_LIST_UPLOADS_GET: String = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}"
        const val PATH_CUSTOMER_LIST_UPLOADS_RUN: String = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run"
        const val PATH_CUSTOMER_LISTS_CREATE: String = "/ad_accounts/{ad_account_id}/customer_lists"
        const val PATH_CUSTOMER_LISTS_GET: String = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"
        const val PATH_CUSTOMER_LISTS_LIST: String = "/ad_accounts/{ad_account_id}/customer_lists"
        const val PATH_CUSTOMER_LISTS_UPDATE: String = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"
        const val PATH_CUSTOMER_SEGMENT_CREATE: String = "/ad_accounts/{ad_account_id}/customer_segments"
        const val PATH_CUSTOMER_SEGMENT_LIST: String = "/ad_accounts/{ad_account_id}/customer_segments"
        const val PATH_CUSTOMER_SEGMENT_UPDATE: String = "/ad_accounts/{ad_account_id}/customer_segments"
        const val PATH_EVENTS_CREATE: String = "/ad_accounts/{ad_account_id}/events"
        const val PATH_GET_AD_GROUPS_BY_PROMOTION_IDS_LIST: String = "/ad_accounts/{ad_account_id}/promotion_applied_entities"
        const val PATH_GET_CAMPAIGN_DELIVERY_ESTIMATES: String = "/ad_accounts/{ad_account_id}/campaigns/delivery_estimates"
        const val PATH_KEYWORDS_CREATE: String = "/ad_accounts/{ad_account_id}/keywords"
        const val PATH_KEYWORDS_GET: String = "/ad_accounts/{ad_account_id}/keywords"
        const val PATH_KEYWORDS_UPDATE: String = "/ad_accounts/{ad_account_id}/keywords"
        const val PATH_LABELS_APPLY: String = "/ad_accounts/{ad_account_id}/labels/{label_id}/apply"
        const val PATH_LABELS_CREATE: String = "/ad_accounts/{ad_account_id}/labels"
        const val PATH_LABELS_LIST: String = "/ad_accounts/{ad_account_id}/labels"
        const val PATH_LABELS_REMOVE: String = "/ad_accounts/{ad_account_id}/labels/{label_id}/remove"
        const val PATH_LABELS_UPDATE: String = "/ad_accounts/{ad_account_id}/labels"
        const val PATH_LEAD_FORM_GET: String = "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}"
        const val PATH_LEAD_FORM_TEST_CREATE: String = "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test"
        const val PATH_LEAD_FORMS_CREATE: String = "/ad_accounts/{ad_account_id}/lead_forms"
        const val PATH_LEAD_FORMS_LIST: String = "/ad_accounts/{ad_account_id}/lead_forms"
        const val PATH_LEAD_FORMS_UPDATE: String = "/ad_accounts/{ad_account_id}/lead_forms"
        const val PATH_LEADS_EXPORT_CREATE: String = "/ad_accounts/{ad_account_id}/leads_export"
        const val PATH_LEADS_EXPORT_GET: String = "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}"
        const val PATH_MSOT_EVENTS_CREATE: String = "/ad_accounts/{ad_account_id}/msot/events"
        const val PATH_OCPM_ELIGIBLE_CONVERSION_TAGS_GET: String = "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible"
        const val PATH_ORDER_LINES_GET: String = "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}"
        const val PATH_ORDER_LINES_LIST: String = "/ad_accounts/{ad_account_id}/order_lines"
        const val PATH_PAGE_VISIT_CONVERSION_TAGS_GET: String = "/ad_accounts/{ad_account_id}/conversion_tags/page_visit"
        const val PATH_PRODUCT_GROUP_PROMOTIONS_CREATE: String = "/ad_accounts/{ad_account_id}/product_group_promotions"
        const val PATH_PRODUCT_GROUP_PROMOTIONS_GET: String = "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}"
        const val PATH_PRODUCT_GROUP_PROMOTIONS_LIST: String = "/ad_accounts/{ad_account_id}/product_group_promotions"
        const val PATH_PRODUCT_GROUP_PROMOTIONS_UPDATE: String = "/ad_accounts/{ad_account_id}/product_group_promotions"
        const val PATH_PRODUCT_GROUPS_ANALYTICS: String = "/ad_accounts/{ad_account_id}/product_groups/analytics"
        const val PATH_PROMOTIONS_CREATE: String = "/ad_accounts/{ad_account_id}/promotions"
        const val PATH_PROMOTIONS_DELETE: String = "/ad_accounts/{ad_account_id}/promotions/{promotion_id}"
        const val PATH_PROMOTIONS_GET: String = "/ad_accounts/{ad_account_id}/promotions/{promotion_id}"
        const val PATH_PROMOTIONS_LIST: String = "/ad_accounts/{ad_account_id}/promotions"
        const val PATH_PROMOTIONS_UPDATE: String = "/ad_accounts/{ad_account_id}/promotions"
        const val PATH_SANDBOX_DELETE: String = "/ad_accounts/{ad_account_id}/sandbox"
        const val PATH_SCHEDULES_CREATE: String = "/ad_accounts/{ad_account_id}/schedules"
        const val PATH_SCHEDULES_LIST: String = "/ad_accounts/{ad_account_id}/schedules"
        const val PATH_SCHEDULES_UPDATE: String = "/ad_accounts/{ad_account_id}/schedules"
        const val PATH_SSIO_ACCOUNTS_GET: String = "/ad_accounts/{ad_account_id}/ssio/accounts"
        const val PATH_SSIO_INSERTION_ORDER_CREATE: String = "/ad_accounts/{ad_account_id}/ssio/insertion_orders"
        const val PATH_SSIO_INSERTION_ORDER_EDIT: String = "/ad_accounts/{ad_account_id}/ssio/insertion_orders"
        const val PATH_SSIO_INSERTION_ORDERS_STATUS_GET_BY_AD_ACCOUNT: String = "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status"
        const val PATH_SSIO_INSERTION_ORDERS_STATUS_GET_BY_PIN_ORDER_ID: String = "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status"
        const val PATH_SSIO_ORDER_LINES_GET_BY_AD_ACCOUNT: String = "/ad_accounts/{ad_account_id}/ssio/order_lines"
        const val PATH_TARGETING_TEMPLATE_CREATE: String = "/ad_accounts/{ad_account_id}/targeting_templates"
        const val PATH_TARGETING_TEMPLATE_LIST: String = "/ad_accounts/{ad_account_id}/targeting_templates"
        const val PATH_TARGETING_TEMPLATE_UPDATE: String = "/ad_accounts/{ad_account_id}/targeting_templates"
        const val PATH_TEMPLATES_LIST: String = "/ad_accounts/{ad_account_id}/templates"
        const val PATH_TERMS_OF_SERVICE_GET: String = "/ad_accounts/{ad_account_id}/terms_of_service"
        const val PATH_UPDATE_AD_ACCOUNT_TO_AD_ACCOUNT_SHARED_AUDIENCE: String = "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared"
        const val PATH_UPDATE_AD_ACCOUNT_TO_BUSINESS_SHARED_AUDIENCE: String = "/ad_accounts/{ad_account_id}/audiences/businesses/shared"
    }
}
