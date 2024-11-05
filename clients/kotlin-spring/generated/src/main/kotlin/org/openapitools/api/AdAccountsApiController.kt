package org.openapitools.api

import org.openapitools.model.AdAccount
import org.openapitools.model.AdAccountAnalyticsResponseInner
import org.openapitools.model.AdAccountCreateRequest
import org.openapitools.model.AdAccountCreateSubscriptionRequest
import org.openapitools.model.AdAccountCreateSubscriptionResponse
import org.openapitools.model.AdAccountGetSubscriptionResponse
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.model.AdAccountsList200Response
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response
import org.openapitools.model.AdArrayResponse
import org.openapitools.model.AdCreateRequest
import org.openapitools.model.AdGroupArrayResponse
import org.openapitools.model.AdGroupAudienceSizingRequest
import org.openapitools.model.AdGroupAudienceSizingResponse
import org.openapitools.model.AdGroupCreateRequest
import org.openapitools.model.AdGroupResponse
import org.openapitools.model.AdGroupUpdateRequest
import org.openapitools.model.AdGroupsAnalyticsResponseInner
import org.openapitools.model.AdGroupsList200Response
import org.openapitools.model.AdPreviewRequest
import org.openapitools.model.AdPreviewURLResponse
import org.openapitools.model.AdResponse
import org.openapitools.model.AdUpdateRequest
import org.openapitools.model.AdsAnalyticsAdTargetingType
import org.openapitools.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.model.AdsAnalyticsResponseInner
import org.openapitools.model.AdsAnalyticsTargetingType
import org.openapitools.model.AdsCreditRedeemRequest
import org.openapitools.model.AdsCreditRedeemResponse
import org.openapitools.model.AdsCreditsDiscountsGet200Response
import org.openapitools.model.AdsList200Response
import org.openapitools.model.Audience
import org.openapitools.model.AudienceAccountType
import org.openapitools.model.AudienceCreateCustomRequest
import org.openapitools.model.AudienceCreateRequest
import org.openapitools.model.AudienceDefinitionResponse
import org.openapitools.model.AudienceInsightType
import org.openapitools.model.AudienceInsightsResponse
import org.openapitools.model.AudienceUpdateRequest
import org.openapitools.model.AudiencesList200Response
import org.openapitools.model.BidFloor
import org.openapitools.model.BidFloorRequest
import org.openapitools.model.BillingProfilesGet200Response
import org.openapitools.model.BulkDownloadRequest
import org.openapitools.model.BulkDownloadResponse
import org.openapitools.model.BulkUpsertRequest
import org.openapitools.model.BulkUpsertResponse
import org.openapitools.model.BulkUpsertStatusResponse
import org.openapitools.model.BusinessSharedAudience
import org.openapitools.model.BusinessSharedAudienceResponse
import org.openapitools.model.CampaignCreateRequest
import org.openapitools.model.CampaignCreateResponse
import org.openapitools.model.CampaignResponse
import org.openapitools.model.CampaignUpdateRequest
import org.openapitools.model.CampaignUpdateResponse
import org.openapitools.model.CampaignsAnalyticsResponseInner
import org.openapitools.model.CampaignsList200Response
import org.openapitools.model.ConversionApiResponse
import org.openapitools.model.ConversionEventResponse
import org.openapitools.model.ConversionEvents
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.ConversionTagCreate
import org.openapitools.model.ConversionTagListResponse
import org.openapitools.model.ConversionTagResponse
import org.openapitools.model.CreateMMMReportRequest
import org.openapitools.model.CreateMMMReportResponse
import org.openapitools.model.CustomerList
import org.openapitools.model.CustomerListRequest
import org.openapitools.model.CustomerListUpdateRequest
import org.openapitools.model.CustomerListsList200Response
import org.openapitools.model.DetailedError
import org.openapitools.model.Error
import org.openapitools.model.GetMMMReportResponse
import org.openapitools.model.Granularity
import org.openapitools.model.KeywordUpdateBody
import org.openapitools.model.KeywordsGet200Response
import org.openapitools.model.KeywordsMetricsArrayResponse
import org.openapitools.model.KeywordsRequest
import org.openapitools.model.KeywordsResponse
import org.openapitools.model.LeadFormArrayResponse
import org.openapitools.model.LeadFormCreateRequest
import org.openapitools.model.LeadFormResponse
import org.openapitools.model.LeadFormTestRequest
import org.openapitools.model.LeadFormTestResponse
import org.openapitools.model.LeadFormUpdateRequest
import org.openapitools.model.LeadFormsList200Response
import org.openapitools.model.LeadsExportCreateRequest
import org.openapitools.model.LeadsExportCreateResponse
import org.openapitools.model.LeadsExportResponseData
import org.openapitools.model.MatchType
import org.openapitools.model.MetricsResponse
import org.openapitools.model.OrderLine
import org.openapitools.model.OrderLinesList200Response
import org.openapitools.model.PageVisitConversionTagsGet200Response
import org.openapitools.model.ProductGroupAnalyticsResponseInner
import org.openapitools.model.ProductGroupPromotionCreateRequest
import org.openapitools.model.ProductGroupPromotionResponse
import org.openapitools.model.ProductGroupPromotionUpdateRequest
import org.openapitools.model.ProductGroupPromotionsList200Response
import org.openapitools.model.SSIOAccountResponse
import org.openapitools.model.SSIOCreateInsertionOrderRequest
import org.openapitools.model.SSIOCreateInsertionOrderResponse
import org.openapitools.model.SSIOEditInsertionOrderRequest
import org.openapitools.model.SSIOEditInsertionOrderResponse
import org.openapitools.model.SSIOInsertionOrderStatusResponse
import org.openapitools.model.SharedAudience
import org.openapitools.model.SharedAudienceResponse
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response
import org.openapitools.model.TargetingTemplateCreate
import org.openapitools.model.TargetingTemplateGetResponseData
import org.openapitools.model.TargetingTemplateList200Response
import org.openapitools.model.TargetingTemplateUpdateRequest
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
        description = """Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(array = ArraySchema(schema = Schema(implementation = AdAccountAnalyticsResponseInner::class)))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account analytics parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/analytics"],
        produces = ["application/json"]
    )
    fun adAccountAnalytics(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned", required = true, schema = Schema(allowableValues = ["SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE"])) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,@Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: kotlin.Int,@Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String): ResponseEntity<List<AdAccountAnalyticsResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get targeting analytics for an ad account",
        operationId = "adAccountTargetingAnalyticsGet",
        description = """Get targeting analytics for an ad account.
For the requested account and metrics, the response will include the requested metric information
(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/>
- The token's user_account must either be the Owner of the specified ad account, or have one
of the necessary roles granted to them via
<a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = MetricsResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/targeting_analytics"],
        produces = ["application/json"]
    )
    fun adAccountTargetingAnalyticsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Size(min=1,max=15) @Parameter(description = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true) @Valid @RequestParam(value = "targeting_types", required = true) targetingTypes: kotlin.collections.List<AdsAnalyticsTargetingType>,@NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned", required = true, schema = Schema(allowableValues = ["SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE"])) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,@Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: kotlin.Int,@Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,@Parameter(description = "List of types of attribution for the conversion report", schema = Schema(allowableValues = ["INDIVIDUAL", "HOUSEHOLD"])) @Valid @RequestParam(value = "attribution_types", required = false) attributionTypes: ConversionReportAttributionType?): ResponseEntity<MetricsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List accounts with access to an audience owned by an ad account",
        operationId = "adAccountsAudiencesSharedAccountsList",
        description = """List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdAccountsAudiencesSharedAccountsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account audiences shared accounts parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Shared accounts not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/audiences/shared/accounts"],
        produces = ["application/json"]
    )
    fun adAccountsAudiencesSharedAccountsList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of the audience to use to filter the results.", required = true) @Valid @RequestParam(value = "audience_id", required = true) audienceId: kotlin.String,@NotNull @Parameter(description = "Filter accounts by account type.", required = true, schema = Schema(allowableValues = ["AD_ACCOUNT", "BUSINESS_ACCOUNT"], defaultValue = "AD_ACCOUNT")) @Valid @RequestParam(value = "account_type", required = true, defaultValue = "AD_ACCOUNT") accountType: AudienceAccountType,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create ad account",
        operationId = "adAccountsCreate",
        description = """Create a new ad account. Different ad accounts can support different currencies, payment methods, etc.
An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/>
You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/>
For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/create-an-advertiser-account">Create an advertiser account</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdAccount::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adAccountsCreate(@Parameter(description = "Ad account to create.", required = true) @Valid @RequestBody adAccountCreateRequest: AdAccountCreateRequest): ResponseEntity<AdAccount> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ad account",
        operationId = "adAccountsGet",
        description = """Get an ad account""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdAccount::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}"],
        produces = ["application/json"]
    )
    fun adAccountsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String): ResponseEntity<AdAccount> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List ad accounts",
        operationId = "adAccountsList",
        description = """Get a list of the ad_accounts that the "operation user_account" has access to.
- This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = AdAccountsList200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts"],
        produces = ["application/json"]
    )
    fun adAccountsList(@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Include shared ad accounts", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "include_shared_accounts", required = false, defaultValue = "true") includeSharedAccounts: kotlin.Boolean): ResponseEntity<AdAccountsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete lead ads subscription",
        operationId = "adAccountsSubscriptionsDelById",
        description = """Delete an existing lead ads webhook subscription by ID.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>""",
        responses = [
            ApiResponse(responseCode = "204", description = "Subscription deleted successfully"),
            ApiResponse(responseCode = "400", description = "Invalid input parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "You are not authorized to delete this subscription.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Subscription not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"],
        produces = ["application/json"]
    )
    fun adAccountsSubscriptionsDelById(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a subscription.", required = true) @PathVariable("subscription_id") subscriptionId: kotlin.String): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get lead ads subscription",
        operationId = "adAccountsSubscriptionsGetById",
        description = """Get a specific lead ads subscription record.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdAccountGetSubscriptionResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid input parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Can't access this subscription.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Subscription not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"],
        produces = ["application/json"]
    )
    fun adAccountsSubscriptionsGetById(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a subscription.", required = true) @PathVariable("subscription_id") subscriptionId: kotlin.String): ResponseEntity<AdAccountGetSubscriptionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get lead ads subscriptions",
        operationId = "adAccountsSubscriptionsGetList",
        description = """Get the advertiser's list of lead ads subscriptions.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdAccountsSubscriptionsGetList200Response::class))]),
            ApiResponse(responseCode = "403", description = "Can't access this subscription.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/leads/subscriptions"],
        produces = ["application/json"]
    )
    fun adAccountsSubscriptionsGetList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<AdAccountsSubscriptionsGetList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create lead ads subscription",
        operationId = "adAccountsSubscriptionsPost",
        description = """Create a lead ads webhook subscription.
Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.
- Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.
- For data security, egress lead data is encrypted with AES-256-GCM.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdAccountCreateSubscriptionResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid input parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Can't access this subscription.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/leads/subscriptions"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adAccountsSubscriptionsPost(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Subscription to create.", required = true) @Valid @RequestBody adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest): ResponseEntity<AdAccountCreateSubscriptionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ad group analytics",
        operationId = "adGroupsAnalytics",
        description = """Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(array = ArraySchema(schema = Schema(implementation = AdGroupsAnalyticsResponseInner::class)))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account group analytics parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ad_groups/analytics"],
        produces = ["application/json"]
    )
    fun adGroupsAnalytics(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Size(min=1,max=100) @Parameter(description = "List of Ad group Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "ad_group_ids", required = true) adGroupIds: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned", required = true, schema = Schema(allowableValues = ["SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE"])) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,@Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: kotlin.Int,@Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String): ResponseEntity<List<AdGroupsAnalyticsResponseInner>> {
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
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdGroupAudienceSizingResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad group audience sizing parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "No access to requested audience list or product group.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/ad_groups/audience_sizing"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adGroupsAudienceSizing(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "") @Valid @RequestBody(required = false) adGroupAudienceSizingRequest: AdGroupAudienceSizingRequest?): ResponseEntity<AdGroupAudienceSizingResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get bid floors",
        operationId = "adGroupsBidFloorGet",
        description = """List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/>
<p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p>
<p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’ s profile.</p>
<p><strong>Equivalency equations</strong>, using dollars as an example currency:</p>
<ul>
  <li>$1 = 1,000,000 microdollars</li>
  <li>1 microdollar = $0.000001 </li>
</ul>
<p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p>
<ul>
  <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>
  <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li>
 </ul>
For more on bid floors see <a class="reference external" href="https://help.pinterest.com/en/business/article/set-your-bid"> Set your bid</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BidFloor::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/bid_floor"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adGroupsBidFloorGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Parameters to get bid_floor info", required = true) @Valid @RequestBody bidFloorRequest: BidFloorRequest): ResponseEntity<BidFloor> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create ad groups",
        operationId = "adGroupsCreate",
        description = """Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href="https://help.pinterest.com/en/business/article/campaign-structure" target="_blank"> click here</a>.</p>
<strong>Note:</strong>
- 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/>
<p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p>
<p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p>
 <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p>
<ul>
  <li>$1 = 1,000,000 microdollars</li>
  <li>1 microdollar = $0.000001 </li>
</ul>
<p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p>
<ul>
  <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>
  <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li>
</ul>
- Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.
- Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdGroupArrayResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/ad_groups"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adGroupsCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "List of ad groups to create, size limit [1, 30].", required = true) @Valid@Size(min=1,max=30)  @RequestBody adGroupCreateRequest: kotlin.collections.List<AdGroupCreateRequest>): ResponseEntity<AdGroupArrayResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ad group",
        operationId = "adGroupsGet",
        description = """Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will
contain additional information from the Ad Review process.
For more information about our policies and rejection reasons see the <a href="https://www.pinterest.com/_/_/policy/advertising-guidelines/" target="_blank">Pinterest advertising standards</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdGroupResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}"],
        produces = ["application/json"]
    )
    fun adGroupsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad group.", required = true) @PathVariable("ad_group_id") adGroupId: kotlin.String): ResponseEntity<AdGroupResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List ad groups",
        operationId = "adGroupsList",
        description = """List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/>
<strong>Note:</strong><p/>
Provide only campaign_id or ad_group_id. Do not provide both.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdGroupsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account group parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ad_groups"],
        produces = ["application/json"]
    )
    fun adGroupsList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Size(min=1,max=100) @Parameter(description = "List of Campaign Ids to use to filter the results.") @Valid @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?,@Size(min=1,max=100) @Parameter(description = "List of Ad group Ids to use to filter the results.") @Valid @RequestParam(value = "ad_group_ids", required = false) adGroupIds: kotlin.collections.List<kotlin.String>?,@Parameter(description = "Entity status", schema = Schema(allowableValues = ["ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT"])) @Valid @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<kotlin.String>,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Parameter(description = "Return interests as text names (if value is true) rather than topic IDs.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "translate_interests_to_names", required = false, defaultValue = "false") translateInterestsToNames: kotlin.Boolean): ResponseEntity<AdGroupsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get targeting analytics for ad groups",
        operationId = "adGroupsTargetingAnalyticsGet",
        description = """Get targeting analytics for one or more ad groups.
For the requested ad group(s) and metrics, the response will include the requested metric information
(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/>
- The token's user_account must either be the Owner of the specified ad account, or have one
of the necessary roles granted to them via
<a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = MetricsResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics"],
        produces = ["application/json"]
    )
    fun adGroupsTargetingAnalyticsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Size(min=1,max=100) @Parameter(description = "List of Ad group Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "ad_group_ids", required = true) adGroupIds: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Size(min=1,max=15) @Parameter(description = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true) @Valid @RequestParam(value = "targeting_types", required = true) targetingTypes: kotlin.collections.List<AdsAnalyticsTargetingType>,@NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned", required = true, schema = Schema(allowableValues = ["SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE"])) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,@Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: kotlin.Int,@Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,@Parameter(description = "List of types of attribution for the conversion report", schema = Schema(allowableValues = ["INDIVIDUAL", "HOUSEHOLD"])) @Valid @RequestParam(value = "attribution_types", required = false) attributionTypes: ConversionReportAttributionType?): ResponseEntity<MetricsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update ad groups",
        operationId = "adGroupsUpdate",
        description = """Update multiple existing ad groups.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdGroupArrayResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/ad_groups"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adGroupsUpdate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "List of ad groups to update, size limit [1, 30].", required = true) @Valid@Size(min=1,max=30)  @RequestBody adGroupUpdateRequest: kotlin.collections.List<AdGroupUpdateRequest>): ResponseEntity<AdGroupArrayResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create ad preview with pin or image",
        operationId = "adPreviewsCreate",
        description = """Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/>
If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href="https://help.pinterest.com/en/business/article/promoted-pins-overview" target="_blank">Ads Overview</a>.) <p/>
You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful ad preview creation.", content = [Content(schema = Schema(implementation = AdPreviewURLResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid Pin parameters response", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/ad_previews"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adPreviewsCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Create ad preview with pin or image.", required = true) @Valid @RequestBody adPreviewRequest: AdPreviewRequest): ResponseEntity<AdPreviewURLResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get targeting analytics for ads",
        operationId = "adTargetingAnalyticsGet",
        description = """Get targeting analytics for one or more ads. For the requested ad(s) and metrics,
the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type
(e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/>
- The token's user_account must either be the Owner of the specified ad account, or have one
of the necessary roles granted to them via
<a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = MetricsResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ads/targeting_analytics"],
        produces = ["application/json"]
    )
    fun adTargetingAnalyticsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Size(min=1,max=100) @Parameter(description = "List of Ad Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "ad_ids", required = true) adIds: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Size(min=1,max=14) @Parameter(description = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true) @Valid @RequestParam(value = "targeting_types", required = true) targetingTypes: kotlin.collections.List<AdsAnalyticsAdTargetingType>,@NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned", required = true, schema = Schema(allowableValues = ["SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE"])) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,@Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: kotlin.Int,@Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,@Parameter(description = "List of types of attribution for the conversion report", schema = Schema(allowableValues = ["INDIVIDUAL", "HOUSEHOLD"])) @Valid @RequestParam(value = "attribution_types", required = false) attributionTypes: ConversionReportAttributionType?): ResponseEntity<MetricsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ad analytics",
        operationId = "adsAnalytics",
        description = """Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
- The request must contain either ad_ids or both campaign_ids and pin_ids.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(array = ArraySchema(schema = Schema(implementation = AdsAnalyticsResponseInner::class)))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account ads analytics parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ads/analytics"],
        produces = ["application/json"]
    )
    fun adsAnalytics(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned", required = true, schema = Schema(allowableValues = ["SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE"])) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,@Size(min=1,max=100) @Parameter(description = "List of Ad Ids to use to filter the results.") @Valid @RequestParam(value = "ad_ids", required = false) adIds: kotlin.collections.List<kotlin.String>?,@Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: kotlin.Int,@Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,@Size(min=1,max=100) @Parameter(description = "List of Pin IDs.") @Valid @RequestParam(value = "pin_ids", required = false) pinIds: kotlin.collections.List<kotlin.String>?,@Size(min=1,max=100) @Parameter(description = "List of Campaign Ids to use to filter the results.") @Valid @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?): ResponseEntity<List<AdsAnalyticsResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create ads",
        operationId = "adsCreate",
        description = """Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdArrayResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/ads"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adsCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "List of ads to create, size limit [1, 30].", required = true) @Valid@Size(min=1,max=30)  @RequestBody adCreateRequest: kotlin.collections.List<AdCreateRequest>): ResponseEntity<AdArrayResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Redeem ad credits",
        operationId = "adsCreditRedeem",
        description = """Redeem ads credit on behalf of the ad account id and apply it towards billing.

<strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successfully redeemed ad credits.", content = [Content(schema = Schema(implementation = AdsCreditRedeemResponse::class))]),
            ApiResponse(responseCode = "400", description = "Error thrown when unable to redeem offer code.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write", "billing:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/ads_credit/redeem"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adsCreditRedeem(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Redeem ad credits request.", required = true) @Valid @RequestBody adsCreditRedeemRequest: AdsCreditRedeemRequest): ResponseEntity<AdsCreditRedeemResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ads credit discounts",
        operationId = "adsCreditsDiscountsGet",
        description = """Returns the list of discounts applied to the account.

<strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdsCreditsDiscountsGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read", "billing:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ads_credit/discounts"],
        produces = ["application/json"]
    )
    fun adsCreditsDiscountsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<AdsCreditsDiscountsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get ad",
        operationId = "adsGet",
        description = """Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will
contain additional information from the Ad Review process.
For more information about our policies and rejection reasons see the <a href="https://www.pinterest.com/_/_/policy/advertising-guidelines/" target="_blank">Pinterest advertising standards</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ads/{ad_id}"],
        produces = ["application/json"]
    )
    fun adsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad.", required = true) @PathVariable("ad_id") adId: kotlin.String): ResponseEntity<AdResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List ads",
        operationId = "adsList",
        description = """List ads that meet the filters provided:
  - Listed campaign ids or ad group ids or ad ids
  - Listed entity statuses <p/>
If no filter is provided, all ads in the ad account are returned. <p/>
<strong>Note:</strong><p/>
Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/>
Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information.
For more, see <a href="https://policy.pinterest.com/en/advertising-guidelines">Pinterest advertising standards</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account ads parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ads"],
        produces = ["application/json"]
    )
    fun adsList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Size(min=1,max=100) @Parameter(description = "List of Campaign Ids to use to filter the results.") @Valid @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?,@Size(min=1,max=100) @Parameter(description = "List of Ad group Ids to use to filter the results.") @Valid @RequestParam(value = "ad_group_ids", required = false) adGroupIds: kotlin.collections.List<kotlin.String>?,@Size(min=1,max=100) @Parameter(description = "List of Ad Ids to use to filter the results.") @Valid @RequestParam(value = "ad_ids", required = false) adIds: kotlin.collections.List<kotlin.String>?,@Parameter(description = "Entity status", schema = Schema(allowableValues = ["ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT"])) @Valid @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<kotlin.String>,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<AdsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update ads",
        operationId = "adsUpdate",
        description = """Update multiple existing ads""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdArrayResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/ads"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adsUpdate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "List of ads to update, size limit [1, 30]", required = true) @Valid@Size(min=1,max=30)  @RequestBody adUpdateRequest: kotlin.collections.List<AdUpdateRequest>): ResponseEntity<AdArrayResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a request for a Marketing Mix Modeling (MMM) report",
        operationId = "analyticsCreateMmmReport",
        description = """This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download
the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CreateMMMReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account ads analytics mmm parameters", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/mmm_reports"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun analyticsCreateMmmReport(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody createMMMReportRequest: CreateMMMReportRequest): ResponseEntity<CreateMMMReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create async request for an account analytics report",
        operationId = "analyticsCreateReport",
        description = """This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
- If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days.
- If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdsAnalyticsCreateAsyncResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account ads analytics parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/reports"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun analyticsCreateReport(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest): ResponseEntity<AdsAnalyticsCreateAsyncResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create async request for an analytics report using a template",
        operationId = "analyticsCreateTemplateReport",
        description = """This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the
template. It returns a token that you can use to download the report when it is ready.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdsAnalyticsCreateAsyncResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account ads analytics template parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/templates/{template_id}/reports"],
        produces = ["application/json"]
    )
    fun analyticsCreateTemplateReport(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of a template.", required = true) @PathVariable("template_id") templateId: kotlin.String,@Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.") @Valid @RequestParam(value = "start_date", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate?,@Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.") @Valid @RequestParam(value = "end_date", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate?,@Parameter(description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = false) granularity: Granularity?): ResponseEntity<AdsAnalyticsCreateAsyncResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get advertiser Marketing Mix Modeling (MMM) report.",
        operationId = "analyticsGetMmmReport",
        description = """Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the
create mmm report endpoint.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = GetMMMReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account ads analytics parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/mmm_reports"],
        produces = ["application/json"]
    )
    fun analyticsGetMmmReport(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Token returned from the post request creation call", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String): ResponseEntity<GetMMMReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get the account analytics report created by the async call",
        operationId = "analyticsGetReport",
        description = """This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdsAnalyticsGetAsyncResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account ads analytics parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/reports"],
        produces = ["application/json"]
    )
    fun analyticsGetReport(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Token returned from the post request creation call", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String): ResponseEntity<AdsAnalyticsGetAsyncResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get audience insights",
        operationId = "audienceInsightsGet",
        description = """Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the
ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's
total audience.<p/>
<a href="https://help.pinterest.com/en/business/article/audience-insights" target="_blank">Learn more about Audience Insights</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AudienceInsightsResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/audience_insights"],
        produces = ["application/json"]
    )
    fun audienceInsightsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Type of audience insights.", required = true, schema = Schema(allowableValues = ["YOUR_TOTAL_AUDIENCE", "YOUR_ENGAGED_AUDIENCE", "PINTEREST_TOTAL_AUDIENCE"], defaultValue = "YOUR_TOTAL_AUDIENCE")) @Valid @RequestParam(value = "audience_insight_type", required = true, defaultValue = "YOUR_TOTAL_AUDIENCE") audienceInsightType: AudienceInsightType): ResponseEntity<AudienceInsightsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get audience insights scope and type",
        operationId = "audienceInsightsScopeAndTypeGet",
        description = """Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AudienceDefinitionResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/insights/audiences"],
        produces = ["application/json"]
    )
    fun audienceInsightsScopeAndTypeGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String): ResponseEntity<AudienceDefinitionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create audience",
        operationId = "audiencesCreate",
        description = """Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with
the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude
specific audience_ids when you create an ad group. <p/>
For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/audience-targeting" target="_blank">Audience targeting</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = Audience::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/audiences"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun audiencesCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "List of ads to create, size limit [1, 30]", required = true) @Valid @RequestBody audienceCreateRequest: AudienceCreateRequest): ResponseEntity<Audience> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create custom audience",
        operationId = "audiencesCreateCustom",
        description = """Create a custom audience and find the audiences you want your ads to reach.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = Audience::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/audiences/custom"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun audiencesCreateCustom(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Custom audience to create.", required = true) @Valid @RequestBody audienceCreateCustomRequest: AudienceCreateCustomRequest): ResponseEntity<Audience> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get audience",
        operationId = "audiencesGet",
        description = """Get a specific audience given the audience ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = Audience::class))]),
            ApiResponse(responseCode = "404", description = "Audience not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/audiences/{audience_id}"],
        produces = ["application/json"]
    )
    fun audiencesGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an audience", required = true) @PathVariable("audience_id") audienceId: kotlin.String): ResponseEntity<Audience> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List audiences",
        operationId = "audiencesList",
        description = """Get list of audiences for the ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AudiencesList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account audience parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/audiences"],
        produces = ["application/json"]
    )
    fun audiencesList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Filter audiences by ownership type.", schema = Schema(allowableValues = ["OWNED", "RECEIVED"], defaultValue = "OWNED")) @Valid @RequestParam(value = "ownership_type", required = false, defaultValue = "OWNED") ownershipType: kotlin.String): ResponseEntity<AudiencesList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update audience",
        operationId = "audiencesUpdate",
        description = """Update (edit or remove) an existing targeting audience.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = Audience::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/audiences/{audience_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun audiencesUpdate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an audience", required = true) @PathVariable("audience_id") audienceId: kotlin.String,@Parameter(description = "The audience to be updated.") @Valid @RequestBody(required = false) audienceUpdateRequest: AudienceUpdateRequest?): ResponseEntity<Audience> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get billing profiles",
        operationId = "billingProfilesGet",
        description = """Get billing profiles in the advertiser account.

<strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BillingProfilesGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read", "billing:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/billing_profiles"],
        produces = ["application/json"]
    )
    fun billingProfilesGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Return active billing profiles, if false return all billing profiles.", required = true) @Valid @RequestParam(value = "is_active", required = true) isActive: kotlin.Boolean,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<BillingProfilesGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get advertiser entities in bulk",
        operationId = "bulkDownloadCreate",
        description = """Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads,
and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused,
only active entities will return data.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BulkDownloadResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/bulk/download"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun bulkDownloadCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Parameters to get ad entities in bulk", required = true) @Valid @RequestBody bulkDownloadRequest: BulkDownloadRequest): ResponseEntity<BulkDownloadResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Download advertiser entities in bulk",
        operationId = "bulkRequestGet",
        description = """Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the
new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BulkUpsertStatusResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}"],
        produces = ["application/json"]
    )
    fun bulkRequestGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Unique identifier of a bulk upsert request.", required = true) @PathVariable("bulk_request_id") bulkRequestId: kotlin.String,@Parameter(description = "if set to True then attach the errors/details to all the requests", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "include_details", required = false, defaultValue = "false") includeDetails: kotlin.Boolean): ResponseEntity<BulkUpsertStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create/update ad entities in bulk",
        operationId = "bulkUpsertCreate",
        description = """Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords.
Note that this request will be processed asynchronously; the response will include a <code>request_id</code>
that can be used to obtain the status of the request.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BulkUpsertResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/bulk/upsert"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun bulkUpsertCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Parameters to get create/update ad entities in bulk", required = true) @Valid @RequestBody bulkUpsertRequest: BulkUpsertRequest): ResponseEntity<BulkUpsertResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get targeting analytics for campaigns",
        operationId = "campaignTargetingAnalyticsGet",
        description = """Get targeting analytics for one or more campaigns.
For the requested account and metrics, the response will include the requested metric information
(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/>
- The token's user_account must either be the Owner of the specified ad account, or have one
of the necessary roles granted to them via
<a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = MetricsResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/campaigns/targeting_analytics"],
        produces = ["application/json"]
    )
    fun campaignTargetingAnalyticsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Size(min=1,max=100) @Parameter(description = "List of Campaign Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "campaign_ids", required = true) campaignIds: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Size(min=1,max=14) @Parameter(description = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true) @Valid @RequestParam(value = "targeting_types", required = true) targetingTypes: kotlin.collections.List<AdsAnalyticsCampaignTargetingType>,@NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned", required = true, schema = Schema(allowableValues = ["SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE"])) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,@Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: kotlin.Int,@Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String,@Parameter(description = "List of types of attribution for the conversion report", schema = Schema(allowableValues = ["INDIVIDUAL", "HOUSEHOLD"])) @Valid @RequestParam(value = "attribution_types", required = false) attributionTypes: ConversionReportAttributionType?): ResponseEntity<MetricsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get campaign analytics",
        operationId = "campaignsAnalytics",
        description = """Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(array = ArraySchema(schema = Schema(implementation = CampaignsAnalyticsResponseInner::class)))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account campaign analytics parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/campaigns/analytics"],
        produces = ["application/json"]
    )
    fun campaignsAnalytics(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Size(min=1,max=100) @Parameter(description = "List of Campaign Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "campaign_ids", required = true) campaignIds: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned", required = true, schema = Schema(allowableValues = ["SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE"])) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,@Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: kotlin.Int,@Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String): ResponseEntity<List<CampaignsAnalyticsResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create campaigns",
        operationId = "campaignsCreate",
        description = """Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.
For more, see <a href="https://help.pinterest.com/en/business/article/set-up-your-campaign/">Set up your campaign</a>. <p/>
<strong>Note:</strong>
- The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/>
<p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p>
<p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p>
 <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p>
<ul>
  <li>$1 = 1,000,000 microdollars</li>
  <li>1 microdollar = $0.000001 </li>
</ul>
<p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p>
<ul>
  <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>
  <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li>
</ul>""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = CampaignCreateResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/campaigns"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun campaignsCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Array of campaigns.", required = true) @Valid@Size(min=1,max=30)  @RequestBody campaignCreateRequest: kotlin.collections.List<CampaignCreateRequest>): ResponseEntity<CampaignCreateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get campaign",
        operationId = "campaignsGet",
        description = """Get a specific campaign given the campaign ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CampaignResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/campaigns/{campaign_id}"],
        produces = ["application/json"]
    )
    fun campaignsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Campaign ID, must be associated with the ad account ID provided in the path.", required = true) @PathVariable("campaign_id") campaignId: kotlin.String): ResponseEntity<CampaignResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List campaigns",
        operationId = "campaignsList",
        description = """Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CampaignsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account campaign parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/campaigns"],
        produces = ["application/json"]
    )
    fun campaignsList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Size(min=1,max=100) @Parameter(description = "List of Campaign Ids to use to filter the results.") @Valid @RequestParam(value = "campaign_ids", required = false) campaignIds: kotlin.collections.List<kotlin.String>?,@Parameter(description = "Entity status", schema = Schema(allowableValues = ["ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT"])) @Valid @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<kotlin.String>,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<CampaignsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update campaigns",
        operationId = "campaignsUpdate",
        description = """Update multiple ad campaigns based on campaign_ids. <p/>
<strong>Note:</strong><p/>
 - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/>
<p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p>
<p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’ s profile.</p>
<p><strong>Equivalency equations</strong>, using dollars as an example currency:</p>
<ul>
  <li>$1 = 1,000,000 microdollars</li>
  <li>1 microdollar = $0.000001 </li>
</ul>
<p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p>
<ul>
  <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>
  <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li>
</ul>""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = CampaignUpdateResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/campaigns"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun campaignsUpdate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Array of campaigns.", required = true) @Valid@Size(min=1,max=30)  @RequestBody campaignUpdateRequest: kotlin.collections.List<CampaignUpdateRequest>): ResponseEntity<CampaignUpdateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create conversion tag",
        operationId = "conversionTagsCreate",
        description = """Create a conversion tag, also known as <a href="https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag" target="_blank">Pinterest tag</a>, with the option to enable enhanced match.<p/>
The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/>
For more information, see:<p/>
<a class="reference external" href="https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag">Set up the Pinterest tag</a><p/>
<a class="reference external" href="/docs/api-features/pinterest-tag/">Pinterest Tag</a><p/>
<a class="reference external" href="/docs/api-features/pinterest-tag/#enhanced-match">Enhanced match</a>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = ConversionTagResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/conversion_tags"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun conversionTagsCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Conversion Tag to create", required = true) @Valid @RequestBody conversionTagCreate: ConversionTagCreate): ResponseEntity<ConversionTagResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get conversion tag",
        operationId = "conversionTagsGet",
        description = """Get information about an existing conversion tag.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = ConversionTagResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}"],
        produces = ["application/json"]
    )
    fun conversionTagsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Id of the conversion tag.", required = true) @PathVariable("conversion_tag_id") conversionTagId: kotlin.String): ResponseEntity<ConversionTagResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get conversion tags",
        operationId = "conversionTagsList",
        description = """List conversion tags associated with an ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = ConversionTagListResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/conversion_tags"],
        produces = ["application/json"]
    )
    fun conversionTagsList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Filter out deleted tags.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "filter_deleted", required = false, defaultValue = "false") filterDeleted: kotlin.Boolean): ResponseEntity<ConversionTagListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get country's keyword metrics",
        operationId = "countryKeywordsMetricsGet",
        description = """See keyword metrics for a specified country, aggregated across all of Pinterest.
(Definitions are available from the "Get delivery metrics definitions"
<a href="/docs/api/v5/#operation/delivery_metrics/get">API endpoint</a>).""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = KeywordsMetricsArrayResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/keywords/metrics"],
        produces = ["application/json"]
    )
    fun countryKeywordsMetricsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Two letter country code (ISO 3166-1 alpha-2)", required = true) @Valid @RequestParam(value = "country_code", required = true) countryCode: kotlin.String,@NotNull @Size(min=1,max=2000) @Parameter(description = "Comma-separated keywords", required = true) @Valid @RequestParam(value = "keywords", required = true) keywords: kotlin.collections.List<kotlin.String>): ResponseEntity<KeywordsMetricsArrayResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create customer lists",
        operationId = "customerListsCreate",
        description = """<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p>
<p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href="https://help.pinterest.com/en/business/article/audience-targeting" target="_blank">Audience targeting</a>
or the <a href="/docs/api-features/targeting-overview/" target="_blank">Audiences</a> section of the ads management guide.<p/>
 <p><b>Please review our <u><a href="https://help.pinterest.com/en/business/article/audience-targeting#section-13341" target="_blank">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p>
<p>When you create a customer list, the system scans the list for existing Pinterest accounts;
the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process
is complete. The filtered list – containing only the Pinterest accounts that were included in your starting
list – is what will be used to create the audience.</p>
<p>Note that once you have created your customer list, you must convert it into an audience (of the “ CUSTOMER_LIST” type)
using the <a href="#operation/create_audience_handler">create audience endpoint</a> before it can be used.</p>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CustomerList::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/customer_lists"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun customerListsCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Parameters to get Customer lists info", required = true) @Valid @RequestBody customerListRequest: CustomerListRequest): ResponseEntity<CustomerList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get customer list",
        operationId = "customerListsGet",
        description = """Gets a specific customer list given the customer list ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CustomerList::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"],
        produces = ["application/json"]
    )
    fun customerListsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of a customer list", required = true) @PathVariable("customer_list_id") customerListId: kotlin.String): ResponseEntity<CustomerList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get customer lists",
        operationId = "customerListsList",
        description = """<p>Get a set of customer lists including id and name based on the filters provided.</p>
<p>(Customer lists are a type of audience.) For more information, see
<a href="https://help.pinterest.com/en/business/article/audience-targeting" target="_blank">Audience targeting</a>
 or the <a href="/docs/api-features/targeting-overview/" target="_blank">Audiences</a>
section of the ads management guide.</p>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CustomerListsList200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/customer_lists"],
        produces = ["application/json"]
    )
    fun customerListsList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<CustomerListsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update customer list",
        operationId = "customerListsUpdate",
        description = """<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p>
<p>When you add records to an existing customer list, the system scans the additions for existing Pinterest
accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records
 to add will be deleted when the matching process is complete.</p>
<p>For more information, see <a href="https://help.pinterest.com/en/business/article/audience-targeting" target="_blank">Audience targeting</a>
or the <a href="/docs/api-features/targeting-overview/" target="_blank">Audiences</a>
section of the ads management guide.</p>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CustomerList::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun customerListsUpdate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of a customer list", required = true) @PathVariable("customer_list_id") customerListId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody customerListUpdateRequest: CustomerListUpdateRequest): ResponseEntity<CustomerList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Send conversions",
        operationId = "eventsCreate",
        description = """The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object.
- This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href="/docs/api-features/conversion-overview/">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>).
- The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.)
- This endpoint has a rate limit of 5,000 calls per minute per ad account.
- If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = ConversionApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request was invalid.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Not authorized to send conversion events", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "422", description = "Not all events were successfully processed.", content = [Content(schema = Schema(implementation = DetailedError::class))]),
            ApiResponse(responseCode = "429", description = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "503", description = "The endpoint has been ramped down and is currently not accepting any traffic.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected errors", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]),SecurityRequirement(name = "conversion_token") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/events"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun eventsCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Conversion events.", required = true) @Valid @RequestBody conversionEvents: ConversionEvents,@Parameter(description = "Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.") @Valid @RequestParam(value = "test", required = false) test: kotlin.Boolean?): ResponseEntity<ConversionApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create keywords",
        operationId = "keywordsCreate",
        description = """<p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target="_blank" href="https://help.pinterest.com/en/business/article/keyword-targeting">Keyword targeting</a>.</p>
<p><b>Notes:</b></p> <ul style="list-style-type: square;"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target="_blank" href="/docs/api-features/targeting-overview/">match type enums</a>.</p>
<p><b>Returns:</b></p> <ul style="list-style-type: square;"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class="last literal-block"> { "keywords": [], "errors": [ { "data": { "archived": null, "match_type": "EXACT", "parent_type": null, "value": "foobar", "parent_id": null, "type": "keyword", "id": null }, "error_messages": [ "Advertisers and Campaigns only accept excluded targeting attributes." ] } } </pre></li> </ul>
<p><b>Rate limit</b>: <a href="/docs/reference/rate-limits/">WRITE</a>.</p>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = KeywordsResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/keywords"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun keywordsCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody keywordsRequest: KeywordsRequest): ResponseEntity<KeywordsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get keywords",
        operationId = "keywordsGet",
        description = """<p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p>
<p>For more information, see <a target="_blank" href="https://help.pinterest.com/en/business/article/keyword-targeting">Keyword targeting</a>.</p>
<p><b>Notes:</b></p> <ul style="list-style-type: square;"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target="_blank" href="/docs/api-features/targeting-overview/">match type enums</a>.</p>
<p><b>Returns:</b></p> <ul style="list-style-type: square;"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class="last literal-block"> { "keywords": [], "errors": [ { "data": { "archived": null, "match_type": "EXACT", "parent_type": null, "value": "foobar", "parent_id": null, "type": "keyword", "id": null }, "error_messages": [ "Advertisers and Campaigns only accept excluded targeting attributes." ] } } </pre></li> </ul>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = KeywordsGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/keywords"],
        produces = ["application/json"]
    )
    fun keywordsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Campaign Id to use to filter the results.") @Valid @RequestParam(value = "campaign_id", required = false) campaignId: kotlin.String?,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Ad group Id.") @Valid @RequestParam(value = "ad_group_id", required = false) adGroupId: kotlin.String?,@Size(min=1,max=5) @Parameter(description = "Keyword <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type</a>") @Valid @RequestParam(value = "match_types", required = false) matchTypes: kotlin.collections.List<MatchType>?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<KeywordsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update keywords",
        operationId = "keywordsUpdate",
        description = """<p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = KeywordsResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/keywords"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun keywordsUpdate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody keywordUpdateBody: KeywordUpdateBody): ResponseEntity<KeywordsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get lead form by id",
        operationId = "leadFormGet",
        description = """<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>

Gets a lead form given it's ID. It must also be associated with the provided ad account ID.

For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/lead-ads">Lead ads</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = LeadFormResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account lead forms parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "The lead form ID for the given ad account ID does not exist.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}"],
        produces = ["application/json"]
    )
    fun leadFormGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a lead form.", required = true) @PathVariable("lead_form_id") leadFormId: kotlin.String): ResponseEntity<LeadFormResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create lead form test data",
        operationId = "leadFormTestCreate",
        description = """Create lead form test data based on the list of answers provided as part of the body.
- List of answers should follow the questions creation order.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = LeadFormTestResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Lead not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun leadFormTestCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a lead form.", required = true) @PathVariable("lead_form_id") leadFormId: kotlin.String,@Parameter(description = "Subscription to create.", required = true) @Valid @RequestBody leadFormTestRequest: LeadFormTestRequest): ResponseEntity<LeadFormTestResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create lead forms",
        operationId = "leadFormsCreate",
        description = """<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>

Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.

For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/lead-ads">Lead ads</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = LeadFormArrayResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account lead forms parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/lead_forms"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun leadFormsCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "List of lead forms to create, size limit [1, 30].", required = true) @Valid@Size(min=1,max=30)  @RequestBody leadFormCreateRequest: kotlin.collections.List<LeadFormCreateRequest>): ResponseEntity<LeadFormArrayResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List lead forms",
        operationId = "leadFormsList",
        description = """<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>

List lead forms associated with an ad account ID.

For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/lead-ads">Lead ads</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = LeadFormsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account lead forms parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/lead_forms"],
        produces = ["application/json"]
    )
    fun leadFormsList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<LeadFormsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update lead forms",
        operationId = "leadFormsUpdate",
        description = """<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>

Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.

For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/lead-ads">Lead ads</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = LeadFormArrayResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account lead forms parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/lead_forms"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun leadFormsUpdate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "List of lead forms to update, size limit [1, 30].", required = true) @Valid@Size(min=1,max=30)  @RequestBody leadFormUpdateRequest: kotlin.collections.List<LeadFormUpdateRequest>): ResponseEntity<LeadFormArrayResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a request to export leads collected from a lead ad",
        operationId = "leadsExportCreate",
        description = """<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>

Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.

Note: Lead ad data will be available up to 30 days after the lead has been submitted.

For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/lead-ads">Lead ads</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = LeadsExportCreateResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account parameter.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/leads_export"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun leadsExportCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody leadsExportCreateRequest: LeadsExportCreateRequest): ResponseEntity<LeadsExportCreateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get the lead export from the lead export create call",
        operationId = "leadsExportGet",
        description = """<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>

Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.

Note: Lead ad data will be available up to 30 days after the lead has been submitted.

For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/lead-ads">Lead ads</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = LeadsExportResponseData::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account parameter.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Invalid leads export id parameter.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}"],
        produces = ["application/json"]
    )
    fun leadsExportGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Parameter(description = "lead_export_id token returned from the create a lead export endpoint", required = true) @PathVariable("leads_export_id") leadsExportId: kotlin.String): ResponseEntity<LeadsExportResponseData> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Ocpm eligible conversion tags",
        operationId = "ocpmEligibleConversionTagsGet",
        description = """Get Ocpm eligible conversion tag events for an ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = kotlin.collections.Map::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected errors", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible"],
        produces = ["application/json"]
    )
    fun ocpmEligibleConversionTagsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String): ResponseEntity<Map<String, kotlin.collections.List<ConversionEventResponse>>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get order line",
        operationId = "orderLinesGet",
        description = """Get a specific existing order line associated with an ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = OrderLine::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/order_lines/{order_line_id}"],
        produces = ["application/json"]
    )
    fun orderLinesGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an order line.", required = true) @PathVariable("order_line_id") orderLineId: kotlin.String): ResponseEntity<OrderLine> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get order lines",
        operationId = "orderLinesList",
        description = """List existing order lines associated with an ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = OrderLinesList200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/order_lines"],
        produces = ["application/json"]
    )
    fun orderLinesList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<OrderLinesList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get page visit conversion tags",
        operationId = "pageVisitConversionTagsGet",
        description = """Get all page visit conversion tag events for an ad account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = PageVisitConversionTagsGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/conversion_tags/page_visit"],
        produces = ["application/json"]
    )
    fun pageVisitConversionTagsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<PageVisitConversionTagsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create product group promotions",
        operationId = "productGroupPromotionsCreate",
        description = """Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = ProductGroupPromotionResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/product_group_promotions"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun productGroupPromotionsCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "List of Product Group Promotions to create, size limit [1, 30].", required = true) @Valid @RequestBody productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest): ResponseEntity<ProductGroupPromotionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get a product group promotion by id",
        operationId = "productGroupPromotionsGet",
        description = """Get a product group promotion by id""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = ProductGroupPromotionResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}"],
        produces = ["application/json"]
    )
    fun productGroupPromotionsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of a product group promotion", required = true) @PathVariable("product_group_promotion_id") productGroupPromotionId: kotlin.String): ResponseEntity<ProductGroupPromotionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get product group promotions",
        operationId = "productGroupPromotionsList",
        description = """List existing product group promotions associated with an ad account.

Include either ad_group_id or product_group_promotion_ids in your request.

<b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters.
Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = ProductGroupPromotionsList200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/product_group_promotions"],
        produces = ["application/json"]
    )
    fun productGroupPromotionsList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Size(min=1,max=100) @Parameter(description = "List of Product group promotion Ids.") @Valid @RequestParam(value = "product_group_promotion_ids", required = false) productGroupPromotionIds: kotlin.collections.List<kotlin.String>?,@Parameter(description = "Entity status", schema = Schema(allowableValues = ["ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT"])) @Valid @RequestParam(value = "entity_statuses", required = false) entityStatuses: kotlin.collections.List<kotlin.String>,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Ad group Id.") @Valid @RequestParam(value = "ad_group_id", required = false) adGroupId: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<ProductGroupPromotionsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update product group promotions",
        operationId = "productGroupPromotionsUpdate",
        description = """Update multiple existing Product Group Promotions (by product_group_id)""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = ProductGroupPromotionResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/product_group_promotions"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun productGroupPromotionsUpdate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Parameters to update Product group promotions", required = true) @Valid @RequestBody productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest): ResponseEntity<ProductGroupPromotionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get product group analytics",
        operationId = "productGroupsAnalytics",
        description = """Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(array = ArraySchema(schema = Schema(implementation = ProductGroupAnalyticsResponseInner::class)))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account ads analytics parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/product_groups/analytics"],
        produces = ["application/json"]
    )
    fun productGroupsAnalytics(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Size(min=1,max=100) @Parameter(description = "List of Product group Ids to use to filter the results.", required = true) @Valid @RequestParam(value = "product_group_ids", required = true) productGroupIds: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned", required = true, schema = Schema(allowableValues = ["SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE"])) @Valid @RequestParam(value = "columns", required = true) columns: kotlin.collections.List<kotlin.String>,@NotNull @Parameter(description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true, schema = Schema(allowableValues = ["TOTAL", "DAY", "HOUR", "WEEK", "MONTH"])) @Valid @RequestParam(value = "granularity", required = true) granularity: Granularity,@Parameter(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "click_window_days", required = false, defaultValue = "30") clickWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "30")) @Valid @RequestParam(value = "engagement_window_days", required = false, defaultValue = "30") engagementWindowDays: kotlin.Int,@Parameter(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", schema = Schema(allowableValues = ["0", "1", "7", "14", "30", "60"], defaultValue = "1")) @Valid @RequestParam(value = "view_window_days", required = false, defaultValue = "1") viewWindowDays: kotlin.Int,@Parameter(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", schema = Schema(allowableValues = ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION"], defaultValue = "TIME_OF_AD_ACTION")) @Valid @RequestParam(value = "conversion_report_time", required = false, defaultValue = "TIME_OF_AD_ACTION") conversionReportTime: kotlin.String): ResponseEntity<List<ProductGroupAnalyticsResponseInner>> {
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
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = kotlin.String::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account id.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/ad_accounts/{ad_account_id}/sandbox"],
        produces = ["application/json"]
    )
    fun sandboxDelete(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Salesforce account details including bill-to information.",
        operationId = "ssioAccountsGet",
        description = """Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = SSIOAccountResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request parameter.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ssio/accounts"],
        produces = ["application/json"]
    )
    fun ssioAccountsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String): ResponseEntity<SSIOAccountResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create insertion order through SSIO.",
        operationId = "ssioInsertionOrderCreate",
        description = """Create insertion order through SSIO for <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = SSIOCreateInsertionOrderResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/ssio/insertion_orders"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun ssioInsertionOrderCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Order line to create.", required = true) @Valid @RequestBody ssIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest): ResponseEntity<SSIOCreateInsertionOrderResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Edit insertion order through SSIO.",
        operationId = "ssioInsertionOrderEdit",
        description = """Edit insertion order through SSIO for <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = SSIOEditInsertionOrderResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/ssio/insertion_orders"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun ssioInsertionOrderEdit(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Order line to create.", required = true) @Valid @RequestBody ssIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest): ResponseEntity<SSIOEditInsertionOrderResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get insertion order status by ad account id.",
        operationId = "ssioInsertionOrdersStatusGetByAdAccount",
        description = """Get insertion order status for account id <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = SsioInsertionOrdersStatusGetByAdAccount200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request parameter.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ssio/insertion_orders/status"],
        produces = ["application/json"]
    )
    fun ssioInsertionOrdersStatusGetByAdAccount(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<SsioInsertionOrdersStatusGetByAdAccount200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get insertion order status by pin order id.",
        operationId = "ssioInsertionOrdersStatusGetByPinOrderId",
        description = """Get insertion order status for pin order id <code>pin_order_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = SSIOInsertionOrderStatusResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request parameter.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status"],
        produces = ["application/json"]
    )
    fun ssioInsertionOrdersStatusGetByPinOrderId(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "The pin order id associated with the ssio insertion order", required = true) @PathVariable("pin_order_id") pinOrderId: kotlin.String): ResponseEntity<SSIOInsertionOrderStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Salesforce order lines by ad account id.",
        operationId = "ssioOrderLinesGetByAdAccount",
        description = """Get Salesforce order lines for account id <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a>: Admin, Finance, Campaign.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = SsioOrderLinesGetByAdAccount200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request parameter.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/ssio/order_lines"],
        produces = ["application/json"]
    )
    fun ssioOrderLinesGetByAdAccount(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "The pin order id associated with the ssio insertino order") @Valid @RequestParam(value = "pin_order_id", required = false) pinOrderId: kotlin.String?): ResponseEntity<SsioOrderLinesGetByAdAccount200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create targeting templates",
        operationId = "targetingTemplateCreate",
        description = """<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,
 keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>
 <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse
  performance targeting from prior campaigns for new campaigns.</p>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = TargetingTemplateGetResponseData::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account id.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/ad_accounts/{ad_account_id}/targeting_templates"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun targetingTemplateCreate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "targeting template creation entity", required = true) @Valid @RequestBody targetingTemplateCreate: TargetingTemplateCreate): ResponseEntity<TargetingTemplateGetResponseData> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List targeting templates",
        operationId = "targetingTemplateList",
        description = """Get a list of the targeting templates in the specified <code>ad_account_id</code>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = TargetingTemplateList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account id.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/targeting_templates"],
        produces = ["application/json"]
    )
    fun targetingTemplateList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Parameter(description = "Include audience sizing in result or not", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "include_sizing", required = false, defaultValue = "false") includeSizing: kotlin.Boolean,@Parameter(description = "Search keyword for targeting templates") @Valid @RequestParam(value = "search_query", required = false) searchQuery: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<TargetingTemplateList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update targeting templates",
        operationId = "targetingTemplateUpdate",
        description = """<p>Update the targeting template given advertiser ID and targeting template ID</p>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success"),
            ApiResponse(responseCode = "400", description = "Invalid ad account id.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/targeting_templates"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun targetingTemplateUpdate(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Operation type and targeting template ID", required = true) @Valid @RequestBody targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List templates",
        operationId = "templatesList",
        description = """Gets all Templates associated with an ad account ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = TemplatesList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account template parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/templates"],
        produces = ["application/json"]
    )
    fun templatesList(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<TemplatesList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get terms of service",
        operationId = "termsOfServiceGet",
        description = """Get the text of the terms of service and see whether the advertiser has accepted the terms of service.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = TermsOfService::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ad_accounts/{ad_account_id}/terms_of_service"],
        produces = ["application/json"]
    )
    fun termsOfServiceGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "Return HTML in TOS text.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "include_html", required = false, defaultValue = "false") includeHtml: kotlin.Boolean,@Parameter(description = "Request type.") @Valid @RequestParam(value = "tos_type", required = false) tosType: kotlin.String?): ResponseEntity<TermsOfService> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update audience sharing between ad accounts",
        operationId = "updateAdAccountToAdAccountSharedAudience",
        description = """From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = SharedAudienceResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account id.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateAdAccountToAdAccountSharedAudience(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody sharedAudience: SharedAudience): ResponseEntity<SharedAudienceResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update audience sharing from an ad account to businesses",
        operationId = "updateAdAccountToBusinessSharedAudience",
        description = """From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BusinessSharedAudienceResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ad account id.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/ad_accounts/{ad_account_id}/audiences/businesses/shared"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateAdAccountToBusinessSharedAudience(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.", required = true) @PathVariable("ad_account_id") adAccountId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody businessSharedAudience: BusinessSharedAudience): ResponseEntity<BusinessSharedAudienceResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
