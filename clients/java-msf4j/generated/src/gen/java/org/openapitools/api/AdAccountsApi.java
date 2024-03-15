package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AdAccountsApiService;
import org.openapitools.api.factories.AdAccountsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AdAccount;
import org.openapitools.model.AdAccountAnalyticsResponseInner;
import org.openapitools.model.AdAccountCreateRequest;
import org.openapitools.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.model.AdAccountGetSubscriptionResponse;
import org.openapitools.model.AdAccountsCatalogsProductGroupsList200Response;
import org.openapitools.model.AdAccountsList200Response;
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.model.AdArrayResponse;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdGroupArrayResponse;
import org.openapitools.model.AdGroupAudienceSizingRequest;
import org.openapitools.model.AdGroupAudienceSizingResponse;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.AdGroupResponse;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdResponse;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.AdsAnalyticsResponseInner;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.AdsCreditRedeemRequest;
import org.openapitools.model.AdsCreditRedeemResponse;
import org.openapitools.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.model.AdsList200Response;
import org.openapitools.model.Audience;
import org.openapitools.model.AudienceCreateCustomRequest;
import org.openapitools.model.AudienceCreateRequest;
import org.openapitools.model.AudienceDefinitionResponse;
import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceInsightsResponse;
import org.openapitools.model.AudienceUpdateRequest;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorRequest;
import org.openapitools.model.BillingProfilesGet200Response;
import org.openapitools.model.BulkDownloadRequest;
import org.openapitools.model.BulkDownloadResponse;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.BulkUpsertStatusResponse;
import org.openapitools.model.CampaignCreateRequest;
import org.openapitools.model.CampaignCreateResponse;
import org.openapitools.model.CampaignResponse;
import org.openapitools.model.CampaignUpdateRequest;
import org.openapitools.model.CampaignUpdateResponse;
import org.openapitools.model.CampaignsAnalyticsResponseInner;
import org.openapitools.model.CampaignsList200Response;
import org.openapitools.model.ConversionApiResponse;
import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionEvents;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagListResponse;
import org.openapitools.model.ConversionTagResponse;
import org.openapitools.model.CreateMMMReportRequest;
import org.openapitools.model.CreateMMMReportResponse;
import org.openapitools.model.CustomerList;
import org.openapitools.model.CustomerListRequest;
import org.openapitools.model.CustomerListUpdateRequest;
import org.openapitools.model.CustomerListsList200Response;
import java.util.Date;
import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;
import org.openapitools.model.GetMMMReportResponse;
import org.openapitools.model.Granularity;
import org.openapitools.model.KeywordUpdateBody;
import org.openapitools.model.KeywordsGet200Response;
import org.openapitools.model.KeywordsMetricsArrayResponse;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.KeywordsResponse;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormsList200Response;
import java.util.List;
import java.util.Map;
import org.openapitools.model.MatchType;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLinesList200Response;
import org.openapitools.model.PageVisitConversionTagsGet200Response;
import org.openapitools.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ProductGroupPromotionResponse;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ProductGroupPromotionsList200Response;
import org.openapitools.model.SSIOAccountResponse;
import org.openapitools.model.SSIOCreateInsertionOrderRequest;
import org.openapitools.model.SSIOCreateInsertionOrderResponse;
import org.openapitools.model.SSIOEditInsertionOrderRequest;
import org.openapitools.model.SSIOEditInsertionOrderResponse;
import org.openapitools.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response;
import org.openapitools.model.TemplatesList200Response;
import org.openapitools.model.TermsOfService;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/ad_accounts")


@io.swagger.annotations.Api(description = "the ad_accounts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdAccountsApi  {
   private final AdAccountsApiService delegate = AdAccountsApiServiceFactory.getAdAccountsApi();

    @GET
    @Path("/{ad_account_id}/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad account analytics", notes = "Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.", response = AdAccountAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdAccountAnalyticsResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account analytics parameters.", response = AdAccountAnalyticsResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdAccountAnalyticsResponseInner.class, responseContainer = "List") })
    public Response adAccountAnalytics(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE") @QueryParam("columns") List<String> columns
,@ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
)
    throws NotFoundException {
        return delegate.adAccountAnalytics(adAccountId,startDate,endDate,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime);
    }
    @GET
    @Path("/{ad_account_id}/targeting_analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get targeting analytics for an ad account", notes = "Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = MetricsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = MetricsResponse.class) })
    public Response adAccountTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.",required=true) @QueryParam("targeting_types") List<AdsAnalyticsTargetingType> targetingTypes
,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE") @QueryParam("columns") List<String> columns
,@ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
,@ApiParam(value = "List of types of attribution for the conversion report", allowableValues="INDIVIDUAL, HOUSEHOLD") @QueryParam("attribution_types") ConversionReportAttributionType attributionTypes
)
    throws NotFoundException {
        return delegate.adAccountTargetingAnalyticsGet(adAccountId,startDate,endDate,targetingTypes,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,attributionTypes);
    }
    @GET
    @Path("/{ad_account_id}/product_groups/catalogs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get catalog product groups", notes = "This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.", response = AdAccountsCatalogsProductGroupsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdAccountsCatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = AdAccountsCatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest.", response = AdAccountsCatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Merchant data not found.", response = AdAccountsCatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdAccountsCatalogsProductGroupsList200Response.class) })
    public Response adAccountsCatalogsProductGroupsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "The feed profile id whose catalog product groups we want to return.") @QueryParam("feed_profile_id") String feedProfileId
)
    throws NotFoundException {
        return delegate.adAccountsCatalogsProductGroupsList(adAccountId,feedProfileId);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create ad account", notes = "Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.", response = AdAccount.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdAccount.class) })
    public Response adAccountsCreate(@ApiParam(value = "Ad account to create." ,required=true) AdAccountCreateRequest adAccountCreateRequest
)
    throws NotFoundException {
        return delegate.adAccountsCreate(adAccountCreateRequest);
    }
    @GET
    @Path("/{ad_account_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad account", notes = "Get an ad account", response = AdAccount.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdAccount.class) })
    public Response adAccountsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.adAccountsGet(adAccountId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List ad accounts", notes = "Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.", response = AdAccountsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = AdAccountsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdAccountsList200Response.class) })
    public Response adAccountsList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Include shared ad accounts", defaultValue="true") @DefaultValue("true") @QueryParam("include_shared_accounts") Boolean includeSharedAccounts
)
    throws NotFoundException {
        return delegate.adAccountsList(bookmark,pageSize,includeSharedAccounts);
    }
    @DELETE
    @Path("/{ad_account_id}/leads/subscriptions/{subscription_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete lead ads subscription", notes = "Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Subscription deleted successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input parameters.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "You are not authorized to delete this subscription.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Subscription not found.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Void.class) })
    public Response adAccountsSubscriptionsDelById(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of a subscription.",required=true) @PathParam("subscription_id") String subscriptionId
)
    throws NotFoundException {
        return delegate.adAccountsSubscriptionsDelById(adAccountId,subscriptionId);
    }
    @GET
    @Path("/{ad_account_id}/leads/subscriptions/{subscription_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get lead ads subscription", notes = "Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = AdAccountGetSubscriptionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdAccountGetSubscriptionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input parameters.", response = AdAccountGetSubscriptionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Can't access this subscription.", response = AdAccountGetSubscriptionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Subscription not found.", response = AdAccountGetSubscriptionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = AdAccountGetSubscriptionResponse.class) })
    public Response adAccountsSubscriptionsGetById(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of a subscription.",required=true) @PathParam("subscription_id") String subscriptionId
)
    throws NotFoundException {
        return delegate.adAccountsSubscriptionsGetById(adAccountId,subscriptionId);
    }
    @GET
    @Path("/{ad_account_id}/leads/subscriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get lead ads subscriptions", notes = "Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = AdAccountsSubscriptionsGetList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdAccountsSubscriptionsGetList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Can't access this subscription.", response = AdAccountsSubscriptionsGetList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = AdAccountsSubscriptionsGetList200Response.class) })
    public Response adAccountsSubscriptionsGetList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.adAccountsSubscriptionsGetList(adAccountId,pageSize,bookmark);
    }
    @POST
    @Path("/{ad_account_id}/leads/subscriptions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create lead ads subscription", notes = "Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = AdAccountCreateSubscriptionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdAccountCreateSubscriptionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input parameters.", response = AdAccountCreateSubscriptionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Can't access this subscription.", response = AdAccountCreateSubscriptionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = AdAccountCreateSubscriptionResponse.class) })
    public Response adAccountsSubscriptionsPost(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Subscription to create." ,required=true) AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest
)
    throws NotFoundException {
        return delegate.adAccountsSubscriptionsPost(adAccountId,adAccountCreateSubscriptionRequest);
    }
    @GET
    @Path("/{ad_account_id}/ad_groups/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad group analytics", notes = "Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = AdGroupsAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdGroupsAnalyticsResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account group analytics parameters.", response = AdGroupsAnalyticsResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdGroupsAnalyticsResponseInner.class, responseContainer = "List") })
    public Response adGroupsAnalytics(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "List of Ad group Ids to use to filter the results.",required=true) @QueryParam("ad_group_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds
,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE") @QueryParam("columns") List<String> columns
,@ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
)
    throws NotFoundException {
        return delegate.adGroupsAnalytics(adAccountId,startDate,endDate,adGroupIds,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime);
    }
    @GET
    @Path("/{ad_account_id}/ad_groups/audience_sizing")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get audience sizing", notes = "Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.", response = AdGroupAudienceSizingResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdGroupAudienceSizingResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad group audience sizing parameters.", response = AdGroupAudienceSizingResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "No access to requested audience list or product group.", response = AdGroupAudienceSizingResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdGroupAudienceSizingResponse.class) })
    public Response adGroupsAudienceSizing(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "" ) AdGroupAudienceSizingRequest adGroupAudienceSizingRequest
)
    throws NotFoundException {
        return delegate.adGroupsAudienceSizing(adAccountId,adGroupAudienceSizingRequest);
    }
    @POST
    @Path("/{ad_account_id}/bid_floor")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get bid floors", notes = "List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.", response = BidFloor.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BidFloor.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = BidFloor.class) })
    public Response adGroupsBidFloorGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Parameters to get bid_floor info" ,required=true) BidFloorRequest bidFloorRequest
)
    throws NotFoundException {
        return delegate.adGroupsBidFloorGet(adAccountId,bidFloorRequest);
    }
    @POST
    @Path("/{ad_account_id}/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create ad groups", notes = "Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.", response = AdGroupArrayResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdGroupArrayResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdGroupArrayResponse.class) })
    public Response adGroupsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of ad groups to create, size limit [1, 30]." ,required=true) List<AdGroupCreateRequest> adGroupCreateRequest
)
    throws NotFoundException {
        return delegate.adGroupsCreate(adAccountId,adGroupCreateRequest);
    }
    @GET
    @Path("/{ad_account_id}/ad_groups/{ad_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad group", notes = "Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.", response = AdGroupResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdGroupResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdGroupResponse.class) })
    public Response adGroupsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of an ad group.",required=true) @PathParam("ad_group_id") String adGroupId
)
    throws NotFoundException {
        return delegate.adGroupsGet(adAccountId,adGroupId);
    }
    @GET
    @Path("/{ad_account_id}/ad_groups")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List ad groups", notes = "List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.", response = AdGroupsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account group parameters.", response = AdGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdGroupsList200Response.class) })
    public Response adGroupsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
,@ApiParam(value = "List of Ad group Ids to use to filter the results.") @QueryParam("ad_group_ids") List<@Pattern(regexp = "^\\d+$")String> adGroupIds
,@ApiParam(value = "Entity status", allowableValues="ACTIVE, PAUSED, ARCHIVED, DRAFT, DELETED_DRAFT") @QueryParam("entity_statuses") List<String> entityStatuses
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Return interests as text names (if value is true) rather than topic IDs.", defaultValue="false") @DefaultValue("false") @QueryParam("translate_interests_to_names") Boolean translateInterestsToNames
)
    throws NotFoundException {
        return delegate.adGroupsList(adAccountId,campaignIds,adGroupIds,entityStatuses,pageSize,order,bookmark,translateInterestsToNames);
    }
    @GET
    @Path("/{ad_account_id}/ad_groups/targeting_analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get targeting analytics for ad groups", notes = "Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = MetricsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = MetricsResponse.class) })
    public Response adGroupsTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Ad group Ids to use to filter the results.",required=true) @QueryParam("ad_group_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.",required=true) @QueryParam("targeting_types") List<AdsAnalyticsTargetingType> targetingTypes
,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE") @QueryParam("columns") List<String> columns
,@ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
,@ApiParam(value = "List of types of attribution for the conversion report", allowableValues="INDIVIDUAL, HOUSEHOLD") @QueryParam("attribution_types") ConversionReportAttributionType attributionTypes
)
    throws NotFoundException {
        return delegate.adGroupsTargetingAnalyticsGet(adAccountId,adGroupIds,startDate,endDate,targetingTypes,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,attributionTypes);
    }
    @PATCH
    @Path("/{ad_account_id}/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update ad groups", notes = "Update multiple existing ad groups.", response = AdGroupArrayResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdGroupArrayResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdGroupArrayResponse.class) })
    public Response adGroupsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of ad groups to update, size limit [1, 30]." ,required=true) List<AdGroupUpdateRequest> adGroupUpdateRequest
)
    throws NotFoundException {
        return delegate.adGroupsUpdate(adAccountId,adGroupUpdateRequest);
    }
    @POST
    @Path("/{ad_account_id}/ad_previews")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create ad preview with pin or image", notes = "Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.", response = AdPreviewURLResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful ad preview creation.", response = AdPreviewURLResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid Pin parameters response", response = AdPreviewURLResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdPreviewURLResponse.class) })
    public Response adPreviewsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Create ad preview with pin or image." ,required=true) AdPreviewRequest adPreviewRequest
)
    throws NotFoundException {
        return delegate.adPreviewsCreate(adAccountId,adPreviewRequest);
    }
    @GET
    @Path("/{ad_account_id}/ads/targeting_analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get targeting analytics for ads", notes = "Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = MetricsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = MetricsResponse.class) })
    public Response adTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Ad Ids to use to filter the results.",required=true) @QueryParam("ad_ids") List<@Pattern(regexp = "^\\d+$")String> adIds
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.",required=true) @QueryParam("targeting_types") List<AdsAnalyticsTargetingType> targetingTypes
,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE") @QueryParam("columns") List<String> columns
,@ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
,@ApiParam(value = "List of types of attribution for the conversion report", allowableValues="INDIVIDUAL, HOUSEHOLD") @QueryParam("attribution_types") ConversionReportAttributionType attributionTypes
)
    throws NotFoundException {
        return delegate.adTargetingAnalyticsGet(adAccountId,adIds,startDate,endDate,targetingTypes,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,attributionTypes);
    }
    @GET
    @Path("/{ad_account_id}/ads/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad analytics", notes = "Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = AdsAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdsAnalyticsResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = AdsAnalyticsResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdsAnalyticsResponseInner.class, responseContainer = "List") })
    public Response adsAnalytics(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "List of Ad Ids to use to filter the results.",required=true) @QueryParam("ad_ids") List<@Pattern(regexp = "^\\d+$")String> adIds
,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE") @QueryParam("columns") List<String> columns
,@ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
)
    throws NotFoundException {
        return delegate.adsAnalytics(adAccountId,startDate,endDate,adIds,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime);
    }
    @POST
    @Path("/{ad_account_id}/ads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create ads", notes = "Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.", response = AdArrayResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdArrayResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdArrayResponse.class) })
    public Response adsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of ads to create, size limit [1, 30]." ,required=true) List<AdCreateRequest> adCreateRequest
)
    throws NotFoundException {
        return delegate.adsCreate(adAccountId,adCreateRequest);
    }
    @POST
    @Path("/{ad_account_id}/ads_credit/redeem")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Redeem ad credits", notes = "Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = AdsCreditRedeemResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc."),
            @io.swagger.annotations.AuthorizationScope(scope = "billing:write", description = "Create, update, or delete billing data, billing profiles, etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully redeemed ad credits.", response = AdsCreditRedeemResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error thrown when unable to redeem offer code.", response = AdsCreditRedeemResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdsCreditRedeemResponse.class) })
    public Response adsCreditRedeem(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Redeem ad credits request." ,required=true) AdsCreditRedeemRequest adsCreditRedeemRequest
)
    throws NotFoundException {
        return delegate.adsCreditRedeem(adAccountId,adsCreditRedeemRequest);
    }
    @GET
    @Path("/{ad_account_id}/ads_credit/discounts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ads credit discounts", notes = "Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = AdsCreditsDiscountsGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @io.swagger.annotations.AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdsCreditsDiscountsGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = AdsCreditsDiscountsGet200Response.class) })
    public Response adsCreditsDiscountsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.adsCreditsDiscountsGet(adAccountId,bookmark,pageSize);
    }
    @GET
    @Path("/{ad_account_id}/ads/{ad_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad", notes = "Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.", response = AdResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdResponse.class) })
    public Response adsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of an ad.",required=true) @PathParam("ad_id") String adId
)
    throws NotFoundException {
        return delegate.adsGet(adAccountId,adId);
    }
    @GET
    @Path("/{ad_account_id}/ads")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List ads", notes = "List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.", response = AdsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = AdsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdsList200Response.class) })
    public Response adsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
,@ApiParam(value = "List of Ad group Ids to use to filter the results.") @QueryParam("ad_group_ids") List<@Pattern(regexp = "^\\d+$")String> adGroupIds
,@ApiParam(value = "List of Ad Ids to use to filter the results.") @QueryParam("ad_ids") List<@Pattern(regexp = "^\\d+$")String> adIds
,@ApiParam(value = "Entity status", allowableValues="ACTIVE, PAUSED, ARCHIVED, DRAFT, DELETED_DRAFT") @QueryParam("entity_statuses") List<String> entityStatuses
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.adsList(adAccountId,campaignIds,adGroupIds,adIds,entityStatuses,pageSize,order,bookmark);
    }
    @PATCH
    @Path("/{ad_account_id}/ads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update ads", notes = "Update multiple existing ads", response = AdArrayResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdArrayResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdArrayResponse.class) })
    public Response adsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of ads to update, size limit [1, 30]" ,required=true) List<AdUpdateRequest> adUpdateRequest
)
    throws NotFoundException {
        return delegate.adsUpdate(adAccountId,adUpdateRequest);
    }
    @POST
    @Path("/{ad_account_id}/mmm_reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a request for a Marketing Mix Modeling (MMM) report", notes = "This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.", response = CreateMMMReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CreateMMMReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics mmm parameters", response = CreateMMMReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CreateMMMReportResponse.class) })
    public Response analyticsCreateMmmReport(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "" ,required=true) CreateMMMReportRequest createMMMReportRequest
)
    throws NotFoundException {
        return delegate.analyticsCreateMmmReport(adAccountId,createMMMReportRequest);
    }
    @POST
    @Path("/{ad_account_id}/reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create async request for an account analytics report", notes = "This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.", response = AdsAnalyticsCreateAsyncResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdsAnalyticsCreateAsyncResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = AdsAnalyticsCreateAsyncResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdsAnalyticsCreateAsyncResponse.class) })
    public Response analyticsCreateReport(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "" ,required=true) AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest
)
    throws NotFoundException {
        return delegate.analyticsCreateReport(adAccountId,adsAnalyticsCreateAsyncRequest);
    }
    @POST
    @Path("/{ad_account_id}/templates/{template_id}/reports")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create async request for an analytics report using a template", notes = "This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.", response = AdsAnalyticsCreateAsyncResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdsAnalyticsCreateAsyncResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics template parameters.", response = AdsAnalyticsCreateAsyncResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdsAnalyticsCreateAsyncResponse.class) })
    public Response analyticsCreateTemplateReport(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of a template.",required=true) @PathParam("template_id") String templateId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.") @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.") @QueryParam("end_date") Date endDate
,@ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
)
    throws NotFoundException {
        return delegate.analyticsCreateTemplateReport(adAccountId,templateId,startDate,endDate,granularity);
    }
    @GET
    @Path("/{ad_account_id}/mmm_reports")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get advertiser Marketing Mix Modeling (MMM) report.", notes = "Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.", response = GetMMMReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = GetMMMReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = GetMMMReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = GetMMMReportResponse.class) })
    public Response analyticsGetMmmReport(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Token returned from the post request creation call",required=true) @QueryParam("token") String token
)
    throws NotFoundException {
        return delegate.analyticsGetMmmReport(adAccountId,token);
    }
    @GET
    @Path("/{ad_account_id}/reports")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get the account analytics report created by the async call", notes = "This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = AdsAnalyticsGetAsyncResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdsAnalyticsGetAsyncResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = AdsAnalyticsGetAsyncResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AdsAnalyticsGetAsyncResponse.class) })
    public Response analyticsGetReport(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Token returned from the post request creation call",required=true) @QueryParam("token") String token
)
    throws NotFoundException {
        return delegate.analyticsGetReport(adAccountId,token);
    }
    @GET
    @Path("/{ad_account_id}/audience_insights")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get audience insights", notes = "Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.", response = AudienceInsightsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "audience_insights", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AudienceInsightsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AudienceInsightsResponse.class) })
    public Response audienceInsightsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Type of audience insights.",required=true, allowableValues="YOUR_TOTAL_AUDIENCE, YOUR_ENGAGED_AUDIENCE, PINTEREST_TOTAL_AUDIENCE", defaultValue="YOUR_TOTAL_AUDIENCE") @DefaultValue("YOUR_TOTAL_AUDIENCE") @QueryParam("audience_insight_type") AudienceInsightType audienceInsightType
)
    throws NotFoundException {
        return delegate.audienceInsightsGet(adAccountId,audienceInsightType);
    }
    @GET
    @Path("/{ad_account_id}/insights/audiences")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get audience insights scope and type", notes = "Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.", response = AudienceDefinitionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "audience_insights", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AudienceDefinitionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AudienceDefinitionResponse.class) })
    public Response audienceInsightsScopeAndTypeGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.audienceInsightsScopeAndTypeGet(adAccountId);
    }
    @POST
    @Path("/{ad_account_id}/audiences")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create audience", notes = "Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.", response = Audience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "audiences", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Audience.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Audience.class) })
    public Response audiencesCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of ads to create, size limit [1, 30]" ,required=true) AudienceCreateRequest audienceCreateRequest
)
    throws NotFoundException {
        return delegate.audiencesCreate(adAccountId,audienceCreateRequest);
    }
    @POST
    @Path("/{ad_account_id}/audiences/custom")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create custom audience", notes = "Create a custom audience and find the audiences you want your ads to reach.", response = Audience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "audiences", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Audience.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Audience.class) })
    public Response audiencesCreateCustom(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Custom audience to create." ,required=true) AudienceCreateCustomRequest audienceCreateCustomRequest
)
    throws NotFoundException {
        return delegate.audiencesCreateCustom(adAccountId,audienceCreateCustomRequest);
    }
    @GET
    @Path("/{ad_account_id}/audiences/{audience_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get audience", notes = "Get a specific audience given the audience ID.", response = Audience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "audiences", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Audience.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Audience not found.", response = Audience.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Audience.class) })
    public Response audiencesGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of an audience",required=true) @PathParam("audience_id") String audienceId
)
    throws NotFoundException {
        return delegate.audiencesGet(adAccountId,audienceId);
    }
    @GET
    @Path("/{ad_account_id}/audiences")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List audiences", notes = "Get list of audiences for the ad account.", response = AudiencesList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "audiences", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AudiencesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account audience parameters.", response = AudiencesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AudiencesList200Response.class) })
    public Response audiencesList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "<strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type.", allowableValues="OWNED, RECEIVED", defaultValue="OWNED") @DefaultValue("OWNED") @QueryParam("ownership_type") String ownershipType
)
    throws NotFoundException {
        return delegate.audiencesList(adAccountId,bookmark,order,pageSize,ownershipType);
    }
    @PATCH
    @Path("/{ad_account_id}/audiences/{audience_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update audience", notes = "Update (edit or remove) an existing targeting audience.", response = Audience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "audiences", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Audience.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Audience.class) })
    public Response audiencesUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of an audience",required=true) @PathParam("audience_id") String audienceId
,@ApiParam(value = "The audience to be updated." ) AudienceUpdateRequest audienceUpdateRequest
)
    throws NotFoundException {
        return delegate.audiencesUpdate(adAccountId,audienceId,audienceUpdateRequest);
    }
    @GET
    @Path("/{ad_account_id}/billing_profiles")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get billing profiles", notes = "Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = BillingProfilesGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @io.swagger.annotations.AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BillingProfilesGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = BillingProfilesGet200Response.class) })
    public Response billingProfilesGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Return active billing profiles, if false return all billing profiles.",required=true) @QueryParam("is_active") Boolean isActive
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.billingProfilesGet(adAccountId,isActive,bookmark,pageSize);
    }
    @POST
    @Path("/{ad_account_id}/bulk/download")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get advertiser entities in bulk", notes = "Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.", response = BulkDownloadResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "bulk", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BulkDownloadResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = BulkDownloadResponse.class) })
    public Response bulkDownloadCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Parameters to get ad entities in bulk" ,required=true) BulkDownloadRequest bulkDownloadRequest
)
    throws NotFoundException {
        return delegate.bulkDownloadCreate(adAccountId,bulkDownloadRequest);
    }
    @GET
    @Path("/{ad_account_id}/bulk/{bulk_request_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Download advertiser entities in bulk", notes = "Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).", response = BulkUpsertStatusResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "bulk", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BulkUpsertStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = BulkUpsertStatusResponse.class) })
    public Response bulkRequestGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of a bulk upsert request.",required=true) @PathParam("bulk_request_id") String bulkRequestId
,@ApiParam(value = "if set to True then attach the errors/details to all the requests", defaultValue="false") @DefaultValue("false") @QueryParam("include_details") Boolean includeDetails
)
    throws NotFoundException {
        return delegate.bulkRequestGet(adAccountId,bulkRequestId,includeDetails);
    }
    @POST
    @Path("/{ad_account_id}/bulk/upsert")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create/update ad entities in bulk", notes = "Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.", response = BulkUpsertResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "bulk", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BulkUpsertResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = BulkUpsertResponse.class) })
    public Response bulkUpsertCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Parameters to get create/update ad entities in bulk" ,required=true) BulkUpsertRequest bulkUpsertRequest
)
    throws NotFoundException {
        return delegate.bulkUpsertCreate(adAccountId,bulkUpsertRequest);
    }
    @GET
    @Path("/{ad_account_id}/campaigns/targeting_analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get targeting analytics for campaigns", notes = "Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = MetricsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = MetricsResponse.class) })
    public Response campaignTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Campaign Ids to use to filter the results.",required=true) @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.",required=true) @QueryParam("targeting_types") List<AdsAnalyticsTargetingType> targetingTypes
,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE") @QueryParam("columns") List<String> columns
,@ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
,@ApiParam(value = "List of types of attribution for the conversion report", allowableValues="INDIVIDUAL, HOUSEHOLD") @QueryParam("attribution_types") ConversionReportAttributionType attributionTypes
)
    throws NotFoundException {
        return delegate.campaignTargetingAnalyticsGet(adAccountId,campaignIds,startDate,endDate,targetingTypes,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,attributionTypes);
    }
    @GET
    @Path("/{ad_account_id}/campaigns/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get campaign analytics", notes = "Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = CampaignsAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CampaignsAnalyticsResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account campaign analytics parameters.", response = CampaignsAnalyticsResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CampaignsAnalyticsResponseInner.class, responseContainer = "List") })
    public Response campaignsAnalytics(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "List of Campaign Ids to use to filter the results.",required=true) @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE") @QueryParam("columns") List<String> columns
,@ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
)
    throws NotFoundException {
        return delegate.campaignsAnalytics(adAccountId,startDate,endDate,campaignIds,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime);
    }
    @POST
    @Path("/{ad_account_id}/campaigns")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create campaigns", notes = "Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>", response = CampaignCreateResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = CampaignCreateResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CampaignCreateResponse.class) })
    public Response campaignsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Array of campaigns." ,required=true) List<@Valid CampaignCreateRequest> campaignCreateRequest
)
    throws NotFoundException {
        return delegate.campaignsCreate(adAccountId,campaignCreateRequest);
    }
    @GET
    @Path("/{ad_account_id}/campaigns/{campaign_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get campaign", notes = "Get a specific campaign given the campaign ID.", response = CampaignResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CampaignResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CampaignResponse.class) })
    public Response campaignsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Campaign ID, must be associated with the ad account ID provided in the path.",required=true) @PathParam("campaign_id") String campaignId
)
    throws NotFoundException {
        return delegate.campaignsGet(adAccountId,campaignId);
    }
    @GET
    @Path("/{ad_account_id}/campaigns")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List campaigns", notes = "Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = CampaignsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CampaignsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account campaign parameters.", response = CampaignsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CampaignsList200Response.class) })
    public Response campaignsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
,@ApiParam(value = "Entity status", allowableValues="ACTIVE, PAUSED, ARCHIVED, DRAFT, DELETED_DRAFT") @QueryParam("entity_statuses") List<String> entityStatuses
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.campaignsList(adAccountId,campaignIds,entityStatuses,pageSize,order,bookmark);
    }
    @PATCH
    @Path("/{ad_account_id}/campaigns")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update campaigns", notes = "Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>", response = CampaignUpdateResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = CampaignUpdateResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CampaignUpdateResponse.class) })
    public Response campaignsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Array of campaigns." ,required=true) List<@Valid CampaignUpdateRequest> campaignUpdateRequest
)
    throws NotFoundException {
        return delegate.campaignsUpdate(adAccountId,campaignUpdateRequest);
    }
    @POST
    @Path("/{ad_account_id}/conversion_tags")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create conversion tag", notes = "Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>", response = ConversionTagResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ConversionTagResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ConversionTagResponse.class) })
    public Response conversionTagsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Conversion Tag to create" ,required=true) ConversionTagCreate conversionTagCreate
)
    throws NotFoundException {
        return delegate.conversionTagsCreate(adAccountId,conversionTagCreate);
    }
    @GET
    @Path("/{ad_account_id}/conversion_tags/{conversion_tag_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get conversion tag", notes = "Get information about an existing conversion tag.", response = ConversionTagResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ConversionTagResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ConversionTagResponse.class) })
    public Response conversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Id of the conversion tag.",required=true) @PathParam("conversion_tag_id") String conversionTagId
)
    throws NotFoundException {
        return delegate.conversionTagsGet(adAccountId,conversionTagId);
    }
    @GET
    @Path("/{ad_account_id}/conversion_tags")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get conversion tags", notes = "List conversion tags associated with an ad account.", response = ConversionTagListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ConversionTagListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ConversionTagListResponse.class) })
    public Response conversionTagsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Filter out deleted tags.", defaultValue="false") @DefaultValue("false") @QueryParam("filter_deleted") Boolean filterDeleted
)
    throws NotFoundException {
        return delegate.conversionTagsList(adAccountId,filterDeleted);
    }
    @GET
    @Path("/{ad_account_id}/keywords/metrics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get country's keyword metrics", notes = "See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).", response = KeywordsMetricsArrayResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = KeywordsMetricsArrayResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = KeywordsMetricsArrayResponse.class) })
    public Response countryKeywordsMetricsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Two letter country code (ISO 3166-1 alpha-2)",required=true) @QueryParam("country_code") String countryCode
,@ApiParam(value = "Comma-separated keywords",required=true) @QueryParam("keywords") List<String> keywords
)
    throws NotFoundException {
        return delegate.countryKeywordsMetricsGet(adAccountId,countryCode,keywords);
    }
    @POST
    @Path("/{ad_account_id}/customer_lists")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create customer lists", notes = "<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>", response = CustomerList.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_lists", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CustomerList.class) })
    public Response customerListsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Parameters to get Customer lists info" ,required=true) CustomerListRequest customerListRequest
)
    throws NotFoundException {
        return delegate.customerListsCreate(adAccountId,customerListRequest);
    }
    @GET
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get customer list", notes = "Gets a specific customer list given the customer list ID.", response = CustomerList.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_lists", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CustomerList.class) })
    public Response customerListsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of a customer list",required=true) @PathParam("customer_list_id") String customerListId
)
    throws NotFoundException {
        return delegate.customerListsGet(adAccountId,customerListId);
    }
    @GET
    @Path("/{ad_account_id}/customer_lists")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get customer lists", notes = "<p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>", response = CustomerListsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_lists", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CustomerListsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CustomerListsList200Response.class) })
    public Response customerListsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.customerListsList(adAccountId,pageSize,order,bookmark);
    }
    @PATCH
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update customer list", notes = "<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>", response = CustomerList.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_lists", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CustomerList.class) })
    public Response customerListsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of a customer list",required=true) @PathParam("customer_list_id") String customerListId
,@ApiParam(value = "" ,required=true) CustomerListUpdateRequest customerListUpdateRequest
)
    throws NotFoundException {
        return delegate.customerListsUpdate(adAccountId,customerListId,customerListUpdateRequest);
    }
    @POST
    @Path("/{ad_account_id}/events")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Send conversions", notes = "The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details. - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)", response = ConversionApiResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "conversion_token")
    }, tags={ "conversion_events", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ConversionApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request was invalid.", response = ConversionApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not authorized to send conversion events", response = ConversionApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized access.", response = ConversionApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "Not all events were successfully processed.", response = ConversionApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.", response = ConversionApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "The endpoint has been ramped down and is currently not accepting any traffic.", response = ConversionApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected errors", response = ConversionApiResponse.class) })
    public Response eventsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Conversion events." ,required=true) ConversionEvents conversionEvents
,@ApiParam(value = "Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.") @QueryParam("test") Boolean test
)
    throws NotFoundException {
        return delegate.eventsCreate(adAccountId,conversionEvents,test);
    }
    @POST
    @Path("/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create keywords", notes = "<p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>", response = KeywordsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = KeywordsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = KeywordsResponse.class) })
    public Response keywordsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "" ,required=true) KeywordsRequest keywordsRequest
)
    throws NotFoundException {
        return delegate.keywordsCreate(adAccountId,keywordsRequest);
    }
    @GET
    @Path("/{ad_account_id}/keywords")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get keywords", notes = "<p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>", response = KeywordsGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = KeywordsGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = KeywordsGet200Response.class) })
    public Response keywordsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Campaign Id to use to filter the results.") @QueryParam("campaign_id") String campaignId
,@ApiParam(value = "Ad group Id.") @QueryParam("ad_group_id") String adGroupId
,@ApiParam(value = "Keyword <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type</a>") @QueryParam("match_types") List<MatchType> matchTypes
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.keywordsGet(adAccountId,campaignId,adGroupId,matchTypes,pageSize,bookmark);
    }
    @PATCH
    @Path("/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update keywords", notes = "<p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>", response = KeywordsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = KeywordsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = KeywordsResponse.class) })
    public Response keywordsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "" ,required=true) KeywordUpdateBody keywordUpdateBody
)
    throws NotFoundException {
        return delegate.keywordsUpdate(adAccountId,keywordUpdateBody);
    }
    @GET
    @Path("/{ad_account_id}/lead_forms/{lead_form_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get lead form by id", notes = "Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = LeadFormResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_forms", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = LeadFormResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = LeadFormResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The lead form ID for the given ad account ID does not exist.", response = LeadFormResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = LeadFormResponse.class) })
    public Response leadFormGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of a lead form.",required=true) @PathParam("lead_form_id") String leadFormId
)
    throws NotFoundException {
        return delegate.leadFormGet(adAccountId,leadFormId);
    }
    @POST
    @Path("/{ad_account_id}/lead_forms/{lead_form_id}/test")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create lead form test data", notes = "Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = LeadFormTestResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_forms", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = LeadFormTestResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = LeadFormTestResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Lead not found.", response = LeadFormTestResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = LeadFormTestResponse.class) })
    public Response leadFormTestCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of a lead form.",required=true) @PathParam("lead_form_id") String leadFormId
,@ApiParam(value = "Subscription to create." ,required=true) LeadFormTestRequest leadFormTestRequest
)
    throws NotFoundException {
        return delegate.leadFormTestCreate(adAccountId,leadFormId,leadFormTestRequest);
    }
    @GET
    @Path("/{ad_account_id}/lead_forms")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get lead forms", notes = "Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = LeadFormsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_forms", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = LeadFormsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = LeadFormsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = LeadFormsList200Response.class) })
    public Response leadFormsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.leadFormsList(adAccountId,pageSize,order,bookmark);
    }
    @GET
    @Path("/{ad_account_id}/conversion_tags/ocpm_eligible")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Ocpm eligible conversion tags", notes = "Get Ocpm eligible conversion tag events for an ad account.", response = List.class, responseContainer = "Map", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = List.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected errors", response = List.class, responseContainer = "Map") })
    public Response ocpmEligibleConversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.ocpmEligibleConversionTagsGet(adAccountId);
    }
    @GET
    @Path("/{ad_account_id}/order_lines/{order_line_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get order line", notes = "Get a specific existing order line associated with an ad account.", response = OrderLine.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "order_lines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = OrderLine.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = OrderLine.class) })
    public Response orderLinesGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of an order line.",required=true) @PathParam("order_line_id") String orderLineId
)
    throws NotFoundException {
        return delegate.orderLinesGet(adAccountId,orderLineId);
    }
    @GET
    @Path("/{ad_account_id}/order_lines")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get order lines", notes = "List existing order lines associated with an ad account.", response = OrderLinesList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "order_lines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = OrderLinesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = OrderLinesList200Response.class) })
    public Response orderLinesList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.orderLinesList(adAccountId,pageSize,order,bookmark);
    }
    @GET
    @Path("/{ad_account_id}/conversion_tags/page_visit")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get page visit conversion tags", notes = "Get all page visit conversion tag events for an ad account.", response = PageVisitConversionTagsGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = PageVisitConversionTagsGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = PageVisitConversionTagsGet200Response.class) })
    public Response pageVisitConversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.pageVisitConversionTagsGet(adAccountId,pageSize,order,bookmark);
    }
    @POST
    @Path("/{ad_account_id}/product_group_promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create product group promotions", notes = "Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')", response = ProductGroupPromotionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_group_promotions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ProductGroupPromotionResponse.class) })
    public Response productGroupPromotionsCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Product Group Promotions to create, size limit [1, 30]." ,required=true) ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest
)
    throws NotFoundException {
        return delegate.productGroupPromotionsCreate(adAccountId,productGroupPromotionCreateRequest);
    }
    @GET
    @Path("/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a product group promotion by id", notes = "Get a product group promotion by id", response = ProductGroupPromotionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_group_promotions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ProductGroupPromotionResponse.class) })
    public Response productGroupPromotionsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Unique identifier of a product group promotion",required=true) @PathParam("product_group_promotion_id") String productGroupPromotionId
)
    throws NotFoundException {
        return delegate.productGroupPromotionsGet(adAccountId,productGroupPromotionId);
    }
    @GET
    @Path("/{ad_account_id}/product_group_promotions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product group promotions", notes = "List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.", response = ProductGroupPromotionsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_group_promotions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ProductGroupPromotionsList200Response.class) })
    public Response productGroupPromotionsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Product group promotion Ids.") @QueryParam("product_group_promotion_ids") List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds
,@ApiParam(value = "Entity status", allowableValues="ACTIVE, PAUSED, ARCHIVED, DRAFT, DELETED_DRAFT") @QueryParam("entity_statuses") List<String> entityStatuses
,@ApiParam(value = "Ad group Id.") @QueryParam("ad_group_id") String adGroupId
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.productGroupPromotionsList(adAccountId,productGroupPromotionIds,entityStatuses,adGroupId,pageSize,order,bookmark);
    }
    @PATCH
    @Path("/{ad_account_id}/product_group_promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update product group promotions", notes = "Update multiple existing Product Group Promotions (by product_group_id)", response = ProductGroupPromotionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_group_promotions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ProductGroupPromotionResponse.class) })
    public Response productGroupPromotionsUpdate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Parameters to update Product group promotions" ,required=true) ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest
)
    throws NotFoundException {
        return delegate.productGroupPromotionsUpdate(adAccountId,productGroupPromotionUpdateRequest);
    }
    @GET
    @Path("/{ad_account_id}/product_groups/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product group analytics", notes = "Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = ProductGroupAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_group_promotions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ProductGroupAnalyticsResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = ProductGroupAnalyticsResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ProductGroupAnalyticsResponseInner.class, responseContainer = "List") })
    public Response productGroupsAnalytics(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "List of Product group Ids to use to filter the results.",required=true) @QueryParam("product_group_ids") List<@Pattern(regexp = "^\\d+$")String> productGroupIds
,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE") @QueryParam("columns") List<String> columns
,@ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
)
    throws NotFoundException {
        return delegate.productGroupsAnalytics(adAccountId,startDate,endDate,productGroupIds,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime);
    }
    @DELETE
    @Path("/{ad_account_id}/sandbox")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete ads data for ad account in API Sandbox", notes = "Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account id.", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = String.class) })
    public Response sandboxDelete(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.sandboxDelete(adAccountId);
    }
    @GET
    @Path("/{ad_account_id}/ssio/accounts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Salesforce account details including bill-to information.", notes = "Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SSIOAccountResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = SSIOAccountResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request parameter.", response = SSIOAccountResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = SSIOAccountResponse.class) })
    public Response ssioAccountsGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.ssioAccountsGet(adAccountId);
    }
    @POST
    @Path("/{ad_account_id}/ssio/insertion_orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create insertion order through SSIO.", notes = "Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SSIOCreateInsertionOrderResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = SSIOCreateInsertionOrderResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = SSIOCreateInsertionOrderResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = SSIOCreateInsertionOrderResponse.class) })
    public Response ssioInsertionOrderCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Order line to create." ,required=true) SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest
)
    throws NotFoundException {
        return delegate.ssioInsertionOrderCreate(adAccountId,ssIOCreateInsertionOrderRequest);
    }
    @PATCH
    @Path("/{ad_account_id}/ssio/insertion_orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit insertion order through SSIO.", notes = "Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SSIOEditInsertionOrderResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = SSIOEditInsertionOrderResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = SSIOEditInsertionOrderResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = SSIOEditInsertionOrderResponse.class) })
    public Response ssioInsertionOrderEdit(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Order line to create." ,required=true) SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest
)
    throws NotFoundException {
        return delegate.ssioInsertionOrderEdit(adAccountId,ssIOEditInsertionOrderRequest);
    }
    @GET
    @Path("/{ad_account_id}/ssio/insertion_orders/status")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get insertion order status by ad account id.", notes = "Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SsioInsertionOrdersStatusGetByAdAccount200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = SsioInsertionOrdersStatusGetByAdAccount200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request parameter.", response = SsioInsertionOrdersStatusGetByAdAccount200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = SsioInsertionOrdersStatusGetByAdAccount200Response.class) })
    public Response ssioInsertionOrdersStatusGetByAdAccount(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.ssioInsertionOrdersStatusGetByAdAccount(adAccountId,bookmark,pageSize);
    }
    @GET
    @Path("/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get insertion order status by pin order id.", notes = "Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SSIOInsertionOrderStatusResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = SSIOInsertionOrderStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request parameter.", response = SSIOInsertionOrderStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = SSIOInsertionOrderStatusResponse.class) })
    public Response ssioInsertionOrdersStatusGetByPinOrderId(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "The pin order id associated with the ssio insertion order",required=true) @PathParam("pin_order_id") String pinOrderId
)
    throws NotFoundException {
        return delegate.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId,pinOrderId);
    }
    @GET
    @Path("/{ad_account_id}/ssio/order_lines")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Salesforce order lines by ad account id.", notes = "Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SsioOrderLinesGetByAdAccount200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = SsioOrderLinesGetByAdAccount200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request parameter.", response = SsioOrderLinesGetByAdAccount200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = SsioOrderLinesGetByAdAccount200Response.class) })
    public Response ssioOrderLinesGetByAdAccount(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The pin order id associated with the ssio insertino order") @QueryParam("pin_order_id") String pinOrderId
)
    throws NotFoundException {
        return delegate.ssioOrderLinesGetByAdAccount(adAccountId,bookmark,pageSize,pinOrderId);
    }
    @GET
    @Path("/{ad_account_id}/templates")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List templates", notes = "Gets all Templates associated with an ad account ID.", response = TemplatesList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = TemplatesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account template parameters.", response = TemplatesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TemplatesList200Response.class) })
    public Response templatesList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.templatesList(adAccountId,pageSize,order,bookmark);
    }
    @GET
    @Path("/{ad_account_id}/terms_of_service")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get terms of service", notes = "Get the text of the terms of service and see whether the advertiser has accepted the terms of service.", response = TermsOfService.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "terms_of_service", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = TermsOfService.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TermsOfService.class) })
    public Response termsOfServiceGet(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Return HTML in TOS text.", defaultValue="false") @DefaultValue("false") @QueryParam("include_html") Boolean includeHtml
,@ApiParam(value = "Request type.") @QueryParam("tos_type") String tosType
)
    throws NotFoundException {
        return delegate.termsOfServiceGet(adAccountId,includeHtml,tosType);
    }
}
