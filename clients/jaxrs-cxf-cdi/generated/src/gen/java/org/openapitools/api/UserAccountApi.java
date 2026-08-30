package org.openapitools.api;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.FollowUser;
import org.openapitools.model.FollowUserCreate;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import org.joda.time.LocalDate;
import java.util.Map;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.QuerymetrictypesItems;
import org.openapitools.model.QueryvideopinmetrictypesItems;
import org.openapitools.model.TopPinsAnalyticsResponse;
import org.openapitools.model.TopPinsSortBy;
import org.openapitools.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.model.TopVideoPinsSortBy;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserWebsite;
import org.openapitools.model.UserWebsiteCreate;
import org.openapitools.model.UserWebsiteVerification;
import org.openapitools.model.UserWebsitesGet200Response;
import org.openapitools.api.UserAccountApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/user_account")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-30T09:54:04.171825690Z[Etc/UTC]", comments = "Generator version: 7.24.0")

public class UserAccountApi  {

  @Context SecurityContext securityContext;

  @Inject UserAccountApiService delegate;


    @GET
    @Path("/following/boards")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List following boards", notes = "Get a list of the boards a user follows. The request returns a board summary object array.", response = BoardsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BoardsList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response boardsUserFollowsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId, @ApiParam(value = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", defaultValue="false") @DefaultValue("false")  @QueryParam("explicit_following") Boolean explicitFollowing, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize, securityContext);
    }

    @POST
    @Path("/following/{username}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Follow user", notes = "**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.", response = FollowUser.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = FollowUser.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = FollowUser.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response followUserUpdate( @Pattern(regexp="(?!^\\d+$)^.+$")@ApiParam(value = "A valid username",required=true) @PathParam("username") String username, @ApiParam(value = "" ,required=true) FollowUserCreate followUserCreate) {
        return delegate.followUserUpdate(username, followUserCreate, securityContext);
    }

    @GET
    @Path("/followers")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List followers", notes = "Get a list of your followers.", response = FollowersList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = FollowersList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response followersList(@ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.followersList(bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/businesses")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List linked businesses", notes = "Get a list of your linked business accounts.", response = LinkedBusiness.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = LinkedBusiness.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response linkedBusinessAccountsGet() {
        return delegate.linkedBusinessAccountsGet(securityContext);
    }

    @DELETE
    @Path("/websites")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Unverify website", notes = "Unverify a website verified by the signed-in user.", response = UserWebsite.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsite.class),
        @ApiResponse(code = 204, message = "Resource deleted successfully.", response = Void.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response unverifyWebsiteDelete( @NotNull @ApiParam(value = "Website with path or domain only",required=true)  @QueryParam("website") String website) {
        return delegate.unverifyWebsiteDelete(website, securityContext);
    }

    @GET
    @Path("/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account analytics", notes = "Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = AnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response userAccountAnalytics( @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate, @ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH")  @QueryParam("from_claimed_content") String fromClaimedContent, @ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("pin_format") String pinFormat, @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("app_types") String appTypes, @ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues="ALL, PAID, ORGANIC", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("content_type") String contentType, @ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues="ALL, YOUR_PINS, OTHER_PINS", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("source") String source, @ApiParam(value = "Metric types to get data for, default is all.")  @QueryParam("metric_types") List<QuerymetrictypesItems> metricTypes, @ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues="NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT", defaultValue="NO_SPLIT") @DefaultValue("NO_SPLIT")  @QueryParam("split_field") String splitField,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId, securityContext);
    }

    @GET
    @Path("/analytics/top_pins")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account top pins analytics", notes = "Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = TopPinsAnalyticsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = TopPinsAnalyticsResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response userAccountAnalyticsTopPins( @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull @ApiParam(value = "Specify sorting order for metrics",required=true, allowableValues="ENGAGEMENT, SAVE, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK")  @QueryParam("sort_by") TopPinsSortBy sortBy, @ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH")  @QueryParam("from_claimed_content") String fromClaimedContent, @ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("pin_format") String pinFormat, @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("app_types") String appTypes, @ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues="ALL, PAID, ORGANIC", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("content_type") String contentType, @ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues="ALL, YOUR_PINS, OTHER_PINS", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("source") String source, @ApiParam(value = "Metric types to get data for, default is all.")  @QueryParam("metric_types") List<QuerymetrictypesItems> metricTypes,  @Min(1) @Max(50)@ApiParam(value = "Number of pins to include, default is 10. Max is 50.", defaultValue="10") @DefaultValue("10")  @QueryParam("num_of_pins") Integer numOfPins, @ApiParam(value = "Get metrics for pins created in the last \"n\" days.", allowableValues="30")  @QueryParam("created_in_last_n_days") BigDecimal createdInLastNDays,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, securityContext);
    }

    @GET
    @Path("/analytics/top_video_pins")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account top video pins analytics", notes = "Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = TopVideoPinsAnalyticsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = TopVideoPinsAnalyticsResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response userAccountAnalyticsTopVideoPins( @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull @ApiParam(value = "Specify sorting order for video metrics",required=true, allowableValues="SAVE, IMPRESSION, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START")  @QueryParam("sort_by") TopVideoPinsSortBy sortBy, @ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH")  @QueryParam("from_claimed_content") String fromClaimedContent, @ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("pin_format") String pinFormat, @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("app_types") String appTypes, @ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues="ALL, PAID, ORGANIC", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("content_type") String contentType, @ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues="ALL, YOUR_PINS, OTHER_PINS", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("source") String source, @ApiParam(value = "Metric types to get video data for, default is all.")  @QueryParam("metric_types") List<QueryvideopinmetrictypesItems> metricTypes,  @Min(1) @Max(50)@ApiParam(value = "Number of pins to include, default is 10. Max is 50.", defaultValue="10") @DefaultValue("10")  @QueryParam("num_of_pins") Integer numOfPins, @ApiParam(value = "Get metrics for pins created in the last \"n\" days.", allowableValues="30")  @QueryParam("created_in_last_n_days") BigDecimal createdInLastNDays,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account", notes = "Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.", response = Account.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = Account.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response userAccountGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.userAccountGet(adAccountId, securityContext);
    }

    @GET
    @Path("/following")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List following", notes = "Get a list of who a certain user follows.", response = FollowersList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = FollowersList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response userFollowingGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId, @ApiParam(value = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", defaultValue="false") @DefaultValue("false")  @QueryParam("explicit_following") Boolean explicitFollowing, @ApiParam(value = "Thrift param specifying what type of followees will be kept. Default to include all followees.", allowableValues="ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("feed_type") UserFollowingFeedType feedType, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/websites")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user websites", notes = "Get user websites, claimed or not", response = UserWebsitesGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsitesGet200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response userWebsitesGet(@ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.userWebsitesGet(bookmark, pageSize, securityContext);
    }

    @POST
    @Path("/websites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Verify website", notes = "Verify a website as a signed-in user.", response = UserWebsite.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsite.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = UserWebsite.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response verifyWebsiteUpdate(@ApiParam(value = "" ,required=true) UserWebsiteCreate userWebsiteCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.verifyWebsiteUpdate(userWebsiteCreate, adAccountId, securityContext);
    }

    @GET
    @Path("/websites/verification")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user verification code for website claiming", notes = "Get verification code for user to install on the website to claim it.", response = UserWebsiteVerification.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsiteVerification.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response websiteVerificationGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.websiteVerificationGet(adAccountId, securityContext);
    }
}
