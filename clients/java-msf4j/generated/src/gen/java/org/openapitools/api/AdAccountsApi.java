package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AdAccountsApiService;
import org.openapitools.api.factories.AdAccountsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import java.util.Date;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.openapitools.model.Paginated;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-08T00:31:37.849823Z[Etc/UTC]")
public class AdAccountsApi  {
   private final AdAccountsApiService delegate = AdAccountsApiServiceFactory.getAdAccountsApi();

    @GET
    @Path("/{ad_account_id}/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad account analytics", notes = "Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Map.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account analytics parameters.", response = Map.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Map.class, responseContainer = "List") })
    public Response adAccountAnalytics(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS") @QueryParam("columns") List<String> columns
,@ApiParam(value = "Granularity",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="1, 7, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
)
    throws NotFoundException {
        return delegate.adAccountAnalytics(adAccountId,startDate,endDate,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List ad accounts", notes = "Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.", response = Paginated.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = Paginated.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Paginated.class) })
    public Response adAccountsList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Include shared ad accounts", defaultValue="true") @DefaultValue("true") @QueryParam("include_shared_accounts") Boolean includeSharedAccounts
)
    throws NotFoundException {
        return delegate.adAccountsList(bookmark,pageSize,includeSharedAccounts);
    }
    @GET
    @Path("/{ad_account_id}/ad_groups/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad group analytics", notes = "Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Map.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account group analytics parameters.", response = Map.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Map.class, responseContainer = "List") })
    public Response adGroupsAnalytics(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "List of Ad group Ids to use to filter the results.",required=true) @QueryParam("ad_group_ids") List<String> adGroupIds
,@ApiParam(value = "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS") @QueryParam("columns") List<String> columns
,@ApiParam(value = "Granularity",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="1, 7, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
)
    throws NotFoundException {
        return delegate.adGroupsAnalytics(adAccountId,startDate,endDate,adGroupIds,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime);
    }
    @GET
    @Path("/{ad_account_id}/ad_groups")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List ad groups", notes = "Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Paginated.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Paginated.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account group parameters.", response = Paginated.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Paginated.class) })
    public Response adGroupsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids") List<String> campaignIds
,@ApiParam(value = "List of Ad group Ids to use to filter the results.") @QueryParam("ad_group_ids") List<String> adGroupIds
,@ApiParam(value = "Entity status", allowableValues="ACTIVE, PAUSED, ARCHIVED") @QueryParam("entity_statuses") List<String> entityStatuses
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Return interests as text names (if value is true) rather than topic IDs.", defaultValue="false") @DefaultValue("false") @QueryParam("translate_interests_to_names") Boolean translateInterestsToNames
)
    throws NotFoundException {
        return delegate.adGroupsList(adAccountId,campaignIds,adGroupIds,entityStatuses,pageSize,order,bookmark,translateInterestsToNames);
    }
    @GET
    @Path("/{ad_account_id}/ads/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad analytics", notes = "Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Map.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Map.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Map.class, responseContainer = "List") })
    public Response adsAnalytics(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "List of Ad Ids to use to filter the results.",required=true) @QueryParam("ad_ids") List<String> adIds
,@ApiParam(value = "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS") @QueryParam("columns") List<String> columns
,@ApiParam(value = "Granularity",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="1, 7, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
)
    throws NotFoundException {
        return delegate.adsAnalytics(adAccountId,startDate,endDate,adIds,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime);
    }
    @GET
    @Path("/{ad_account_id}/ads")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List ads", notes = "Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Paginated.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Paginated.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = Paginated.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Paginated.class) })
    public Response adsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids") List<String> campaignIds
,@ApiParam(value = "List of Ad group Ids to use to filter the results.") @QueryParam("ad_group_ids") List<String> adGroupIds
,@ApiParam(value = "List of Ad Ids to use to filter the results.") @QueryParam("ad_ids") List<String> adIds
,@ApiParam(value = "Entity status", allowableValues="ACTIVE, PAUSED, ARCHIVED") @QueryParam("entity_statuses") List<String> entityStatuses
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.adsList(adAccountId,campaignIds,adGroupIds,adIds,entityStatuses,pageSize,order,bookmark);
    }
    @POST
    @Path("/{ad_account_id}/reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create async request for an account analytics report", notes = "This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = AdsAnalyticsCreateAsyncResponse.class, authorizations = {
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
    @GET
    @Path("/{ad_account_id}/reports")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get the account analytics report created by the async call", notes = "This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = AdsAnalyticsGetAsyncResponse.class, authorizations = {
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
    @Path("/{ad_account_id}/campaigns/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get campaign analytics", notes = "Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Map.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account campaign analytics parameters.", response = Map.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Map.class, responseContainer = "List") })
    public Response campaignsAnalytics(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "List of Campaign Ids to use to filter the results.",required=true) @QueryParam("campaign_ids") List<String> campaignIds
,@ApiParam(value = "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS") @QueryParam("columns") List<String> columns
,@ApiParam(value = "Granularity",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="1, 7, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
)
    throws NotFoundException {
        return delegate.campaignsAnalytics(adAccountId,startDate,endDate,campaignIds,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime);
    }
    @GET
    @Path("/{ad_account_id}/campaigns")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List campaigns", notes = "Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Paginated.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Paginated.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account campaign parameters.", response = Paginated.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Paginated.class) })
    public Response campaignsList(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids") List<String> campaignIds
,@ApiParam(value = "Entity status", allowableValues="ACTIVE, PAUSED, ARCHIVED") @QueryParam("entity_statuses") List<String> entityStatuses
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order") String order
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.campaignsList(adAccountId,campaignIds,entityStatuses,pageSize,order,bookmark);
    }
    @GET
    @Path("/{ad_account_id}/product_groups/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product group analytics", notes = "Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Map.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Map.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Map.class, responseContainer = "List") })
    public Response productGroupsAnalytics(@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId
,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "List of Product group Ids to use to filter the results.",required=true) @QueryParam("product_group_ids") List<String> productGroupIds
,@ApiParam(value = "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true, allowableValues="AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS") @QueryParam("columns") List<String> columns
,@ApiParam(value = "Granularity",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") Granularity granularity
,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays
,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="1, 7, 30, 60", defaultValue="1") @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays
,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime
)
    throws NotFoundException {
        return delegate.productGroupsAnalytics(adAccountId,startDate,endDate,productGroupIds,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime);
    }
}
