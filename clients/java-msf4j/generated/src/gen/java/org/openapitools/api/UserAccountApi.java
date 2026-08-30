package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UserAccountApiService;
import org.openapitools.api.factories.UserAccountApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import org.openapitools.model.BoardsList200Response;
import java.util.Date;
import org.openapitools.model.FollowUser;
import org.openapitools.model.FollowUserCreate;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import java.util.List;
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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/user_account")


@io.swagger.annotations.Api(description = "the user_account API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserAccountApi  {
   private final UserAccountApiService delegate = UserAccountApiServiceFactory.getUserAccountApi();

    @GET
    @Path("/following/boards")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List following boards", notes = "Get a list of the boards a user follows. The request returns a board summary object array.", response = BoardsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = BoardsList200Response.class) })
    public Response boardsUserFollowsList(@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", defaultValue="false") @DefaultValue("false") @QueryParam("explicit_following") Boolean explicitFollowing
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.boardsUserFollowsList(adAccountId,explicitFollowing,bookmark,pageSize);
    }
    @POST
    @Path("/following/{username}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Follow user", notes = "**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.", response = FollowUser.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = FollowUser.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = FollowUser.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = FollowUser.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = FollowUser.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = FollowUser.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = FollowUser.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = FollowUser.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = FollowUser.class) })
    public Response followUserUpdate(@ApiParam(value = "A valid username",required=true) @PathParam("username") String username
,@ApiParam(value = "" ,required=true) FollowUserCreate followUserCreate
)
    throws NotFoundException {
        return delegate.followUserUpdate(username,followUserCreate);
    }
    @GET
    @Path("/followers")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List followers", notes = "Get a list of your followers.", response = FollowersList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = FollowersList200Response.class) })
    public Response followersList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.followersList(bookmark,pageSize);
    }
    @GET
    @Path("/businesses")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List linked businesses", notes = "Get a list of your linked business accounts.", response = LinkedBusiness.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LinkedBusiness.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = LinkedBusiness.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = LinkedBusiness.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = LinkedBusiness.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = LinkedBusiness.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = LinkedBusiness.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = LinkedBusiness.class, responseContainer = "List") })
    public Response linkedBusinessAccountsGet()
    throws NotFoundException {
        return delegate.linkedBusinessAccountsGet();
    }
    @DELETE
    @Path("/websites")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Unverify website", notes = "Unverify a website verified by the signed-in user.", response = UserWebsite.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "Resource deleted successfully.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = UserWebsite.class) })
    public Response unverifyWebsiteDelete(@ApiParam(value = "Website with path or domain only",required=true) @QueryParam("website") String website
)
    throws NotFoundException {
        return delegate.unverifyWebsiteDelete(website);
    }
    @GET
    @Path("/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user account analytics", notes = "Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = AnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = AnalyticsMetricsResponse.class, responseContainer = "Map") })
    public Response userAccountAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH") @QueryParam("from_claimed_content") String fromClaimedContent
,@ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("pin_format") String pinFormat
,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("app_types") String appTypes
,@ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues="ALL, PAID, ORGANIC", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("content_type") String contentType
,@ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues="ALL, YOUR_PINS, OTHER_PINS", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("source") String source
,@ApiParam(value = "Metric types to get data for, default is all.") @QueryParam("metric_types") List<QuerymetrictypesItems> metricTypes
,@ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues="NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT", defaultValue="NO_SPLIT") @DefaultValue("NO_SPLIT") @QueryParam("split_field") String splitField
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.userAccountAnalytics(startDate,endDate,fromClaimedContent,pinFormat,appTypes,contentType,source,metricTypes,splitField,adAccountId);
    }
    @GET
    @Path("/analytics/top_pins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user account top pins analytics", notes = "Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = TopPinsAnalyticsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TopPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = TopPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = TopPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = TopPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = TopPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = TopPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = TopPinsAnalyticsResponse.class) })
    public Response userAccountAnalyticsTopPins(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Specify sorting order for metrics",required=true, allowableValues="ENGAGEMENT, SAVE, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK") @QueryParam("sort_by") TopPinsSortBy sortBy
,@ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH") @QueryParam("from_claimed_content") String fromClaimedContent
,@ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("pin_format") String pinFormat
,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("app_types") String appTypes
,@ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues="ALL, PAID, ORGANIC", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("content_type") String contentType
,@ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues="ALL, YOUR_PINS, OTHER_PINS", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("source") String source
,@ApiParam(value = "Metric types to get data for, default is all.") @QueryParam("metric_types") List<QuerymetrictypesItems> metricTypes
,@ApiParam(value = "Number of pins to include, default is 10. Max is 50.", defaultValue="10") @DefaultValue("10") @QueryParam("num_of_pins") Integer numOfPins
,@ApiParam(value = "Get metrics for pins created in the last \"n\" days.", allowableValues="30") @QueryParam("created_in_last_n_days") BigDecimal createdInLastNDays
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.userAccountAnalyticsTopPins(startDate,endDate,sortBy,fromClaimedContent,pinFormat,appTypes,contentType,source,metricTypes,numOfPins,createdInLastNDays,adAccountId);
    }
    @GET
    @Path("/analytics/top_video_pins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user account top video pins analytics", notes = "Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = TopVideoPinsAnalyticsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TopVideoPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = TopVideoPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = TopVideoPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = TopVideoPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = TopVideoPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = TopVideoPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = TopVideoPinsAnalyticsResponse.class) })
    public Response userAccountAnalyticsTopVideoPins(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Specify sorting order for video metrics",required=true, allowableValues="SAVE, IMPRESSION, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START") @QueryParam("sort_by") TopVideoPinsSortBy sortBy
,@ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH") @QueryParam("from_claimed_content") String fromClaimedContent
,@ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("pin_format") String pinFormat
,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("app_types") String appTypes
,@ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues="ALL, PAID, ORGANIC", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("content_type") String contentType
,@ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues="ALL, YOUR_PINS, OTHER_PINS", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("source") String source
,@ApiParam(value = "Metric types to get video data for, default is all.") @QueryParam("metric_types") List<QueryvideopinmetrictypesItems> metricTypes
,@ApiParam(value = "Number of pins to include, default is 10. Max is 50.", defaultValue="10") @DefaultValue("10") @QueryParam("num_of_pins") Integer numOfPins
,@ApiParam(value = "Get metrics for pins created in the last \"n\" days.", allowableValues="30") @QueryParam("created_in_last_n_days") BigDecimal createdInLastNDays
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.userAccountAnalyticsTopVideoPins(startDate,endDate,sortBy,fromClaimedContent,pinFormat,appTypes,contentType,source,metricTypes,numOfPins,createdInLastNDays,adAccountId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user account", notes = "Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.", response = Account.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = Account.class) })
    public Response userAccountGet(@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.userAccountGet(adAccountId);
    }
    @GET
    @Path("/following")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List following", notes = "Get a list of who a certain user follows.", response = FollowersList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = FollowersList200Response.class) })
    public Response userFollowingGet(@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", defaultValue="false") @DefaultValue("false") @QueryParam("explicit_following") Boolean explicitFollowing
,@ApiParam(value = "Thrift param specifying what type of followees will be kept. Default to include all followees.", allowableValues="ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("feed_type") UserFollowingFeedType feedType
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.userFollowingGet(adAccountId,explicitFollowing,feedType,bookmark,pageSize);
    }
    @GET
    @Path("/websites")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user websites", notes = "Get user websites, claimed or not", response = UserWebsitesGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsitesGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = UserWebsitesGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = UserWebsitesGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = UserWebsitesGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = UserWebsitesGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = UserWebsitesGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = UserWebsitesGet200Response.class) })
    public Response userWebsitesGet(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.userWebsitesGet(bookmark,pageSize);
    }
    @POST
    @Path("/websites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Verify website", notes = "Verify a website as a signed-in user.", response = UserWebsite.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = UserWebsite.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = UserWebsite.class) })
    public Response verifyWebsiteUpdate(@ApiParam(value = "" ,required=true) UserWebsiteCreate userWebsiteCreate
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.verifyWebsiteUpdate(userWebsiteCreate,adAccountId);
    }
    @GET
    @Path("/websites/verification")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user verification code for website claiming", notes = "Get verification code for user to install on the website to claim it.", response = UserWebsiteVerification.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsiteVerification.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = UserWebsiteVerification.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = UserWebsiteVerification.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = UserWebsiteVerification.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = UserWebsiteVerification.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = UserWebsiteVerification.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = UserWebsiteVerification.class) })
    public Response websiteVerificationGet(@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.websiteVerificationGet(adAccountId);
    }
}
