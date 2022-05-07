package org.openapitools.api;

import org.openapitools.model.*;

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
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/ad_accounts")


@io.swagger.annotations.Api(description = "the ad_accounts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-07T06:42:33.868481Z[Etc/UTC]")
public interface AdAccountsApi  {

    @GET
    @Path("/{ad_account_id}/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad account analytics", notes = "Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account analytics parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adAccountAnalytics( @Pattern(regexp="^\\d+$") @PathParam("ad_account_id") String adAccountId, @NotNull @QueryParam("start_date") Date startDate, @NotNull @QueryParam("end_date") Date endDate, @NotNull @QueryParam("columns") List<String> columns, @NotNull, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH" @QueryParam("granularity") Granularity granularity,, allowableValues="1, 7, 30, 60" @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays,, allowableValues="1, 7, 30, 60" @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays,, allowableValues="1, 7, 30, 60" @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays,, allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION" @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List ad accounts", notes = "Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.", response = Paginated.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = Paginated.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adAccountsList( @QueryParam("bookmark") String bookmark, @Min(1) @Max(100) @DefaultValue("25") @QueryParam("page_size") Integer pageSize, @DefaultValue("true") @QueryParam("include_shared_accounts") Boolean includeSharedAccounts,@Context SecurityContext securityContext);
    @GET
    @Path("/{ad_account_id}/ad_groups/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad group analytics", notes = "Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account group analytics parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsAnalytics( @Pattern(regexp="^\\d+$") @PathParam("ad_account_id") String adAccountId, @NotNull @QueryParam("start_date") Date startDate, @NotNull @QueryParam("end_date") Date endDate, @NotNull @Size(min=1,max=100) @QueryParam("ad_group_ids") List<String> adGroupIds, @NotNull @QueryParam("columns") List<String> columns, @NotNull, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH" @QueryParam("granularity") Granularity granularity,, allowableValues="1, 7, 30, 60" @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays,, allowableValues="1, 7, 30, 60" @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays,, allowableValues="1, 7, 30, 60" @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays,, allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION" @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime,@Context SecurityContext securityContext);
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
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account group parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsList( @Pattern(regexp="^\\d+$") @PathParam("ad_account_id") String adAccountId, @Size(min=1,max=100) @QueryParam("campaign_ids") List<String> campaignIds, @Size(min=1,max=100) @QueryParam("ad_group_ids") List<String> adGroupIds, @QueryParam("entity_statuses") List<String> entityStatuses, @Min(1) @Max(100) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,, allowableValues="ASCENDING, DESCENDING" @QueryParam("order") String order, @QueryParam("bookmark") String bookmark, @DefaultValue("false") @QueryParam("translate_interests_to_names") Boolean translateInterestsToNames,@Context SecurityContext securityContext);
    @GET
    @Path("/{ad_account_id}/ads/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad analytics", notes = "Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adsAnalytics( @Pattern(regexp="^\\d+$") @PathParam("ad_account_id") String adAccountId, @NotNull @QueryParam("start_date") Date startDate, @NotNull @QueryParam("end_date") Date endDate, @NotNull @Size(min=1,max=100) @QueryParam("ad_ids") List<String> adIds, @NotNull @QueryParam("columns") List<String> columns, @NotNull, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH" @QueryParam("granularity") Granularity granularity,, allowableValues="1, 7, 30, 60" @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays,, allowableValues="1, 7, 30, 60" @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays,, allowableValues="1, 7, 30, 60" @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays,, allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION" @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime,@Context SecurityContext securityContext);
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
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adsList( @Pattern(regexp="^\\d+$") @PathParam("ad_account_id") String adAccountId, @Size(min=1,max=100) @QueryParam("campaign_ids") List<String> campaignIds, @Size(min=1,max=100) @QueryParam("ad_group_ids") List<String> adGroupIds, @Size(min=1,max=100) @QueryParam("ad_ids") List<String> adIds, @QueryParam("entity_statuses") List<String> entityStatuses, @Min(1) @Max(100) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,, allowableValues="ASCENDING, DESCENDING" @QueryParam("order") String order, @QueryParam("bookmark") String bookmark,@Context SecurityContext securityContext);
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
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response analyticsCreateReport( @Pattern(regexp="^\\d+$") @PathParam("ad_account_id") String adAccountId,@ApiParam(value = "" ,required=true) @NotNull @Valid AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest,@Context SecurityContext securityContext);
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
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response analyticsGetReport( @Pattern(regexp="^\\d+$") @PathParam("ad_account_id") String adAccountId, @NotNull @QueryParam("token") String token,@Context SecurityContext securityContext);
    @GET
    @Path("/{ad_account_id}/campaigns/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get campaign analytics", notes = "Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account campaign analytics parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response campaignsAnalytics( @Pattern(regexp="^\\d+$") @PathParam("ad_account_id") String adAccountId, @NotNull @QueryParam("start_date") Date startDate, @NotNull @QueryParam("end_date") Date endDate, @NotNull @Size(min=1,max=100) @QueryParam("campaign_ids") List<String> campaignIds, @NotNull @QueryParam("columns") List<String> columns, @NotNull, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH" @QueryParam("granularity") Granularity granularity,, allowableValues="1, 7, 30, 60" @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays,, allowableValues="1, 7, 30, 60" @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays,, allowableValues="1, 7, 30, 60" @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays,, allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION" @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime,@Context SecurityContext securityContext);
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
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account campaign parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response campaignsList( @Pattern(regexp="^\\d+$") @PathParam("ad_account_id") String adAccountId, @Size(min=1,max=100) @QueryParam("campaign_ids") List<String> campaignIds, @QueryParam("entity_statuses") List<String> entityStatuses, @Min(1) @Max(100) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,, allowableValues="ASCENDING, DESCENDING" @QueryParam("order") String order, @QueryParam("bookmark") String bookmark,@Context SecurityContext securityContext);
    @GET
    @Path("/{ad_account_id}/product_groups/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product group analytics", notes = "Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response productGroupsAnalytics( @Pattern(regexp="^\\d+$") @PathParam("ad_account_id") String adAccountId, @NotNull @QueryParam("start_date") Date startDate, @NotNull @QueryParam("end_date") Date endDate, @NotNull @Size(min=1,max=100) @QueryParam("product_group_ids") List<String> productGroupIds, @NotNull @QueryParam("columns") List<String> columns, @NotNull, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH" @QueryParam("granularity") Granularity granularity,, allowableValues="1, 7, 30, 60" @DefaultValue("30") @QueryParam("click_window_days") Integer clickWindowDays,, allowableValues="1, 7, 30, 60" @DefaultValue("30") @QueryParam("engagement_window_days") Integer engagementWindowDays,, allowableValues="1, 7, 30, 60" @DefaultValue("1") @QueryParam("view_window_days") Integer viewWindowDays,, allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION" @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time") String conversionReportTime,@Context SecurityContext securityContext);
}
