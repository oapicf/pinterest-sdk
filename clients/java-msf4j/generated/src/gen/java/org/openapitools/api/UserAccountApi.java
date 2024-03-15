package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UserAccountApiService;
import org.openapitools.api.factories.UserAccountApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.BoardsUserFollowsList200Response;
import java.util.Date;
import org.openapitools.model.Error;
import org.openapitools.model.FollowUserRequest;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import java.util.List;
import java.util.Map;
import org.openapitools.model.TopPinsAnalyticsResponse;
import org.openapitools.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserFollowingGet200Response;
import org.openapitools.model.UserSummary;
import org.openapitools.model.UserWebsiteSummary;
import org.openapitools.model.UserWebsiteVerificationCode;
import org.openapitools.model.UserWebsiteVerifyRequest;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserAccountApi  {
   private final UserAccountApiService delegate = UserAccountApiServiceFactory.getUserAccountApi();

    @GET
    @Path("/following/boards")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List following boards", notes = "Get a list of the boards a user follows. The request returns a board summary object array.", response = BoardsUserFollowsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BoardsUserFollowsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid user id", response = BoardsUserFollowsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = BoardsUserFollowsList200Response.class) })
    public Response boardsUserFollowsList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", defaultValue="false") @DefaultValue("false") @QueryParam("explicit_following") Boolean explicitFollowing
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.boardsUserFollowsList(bookmark,pageSize,explicitFollowing,adAccountId);
    }
    @POST
    @Path("/following/{username}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Follow user", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.", response = UserSummary.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = UserSummary.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = UserSummary.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = UserSummary.class) })
    public Response followUserUpdate(@ApiParam(value = "A valid username",required=true) @PathParam("username") String username
,@ApiParam(value = "Follow a user." ,required=true) FollowUserRequest followUserRequest
)
    throws NotFoundException {
        return delegate.followUserUpdate(username,followUserRequest);
    }
    @GET
    @Path("/followers")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List followers", notes = "Get a list of your followers.", response = FollowersList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid user id", response = FollowersList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = FollowersList200Response.class) })
    public Response followersList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
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
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = LinkedBusiness.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = LinkedBusiness.class, responseContainer = "List") })
    public Response linkedBusinessAccountsGet()
    throws NotFoundException {
        return delegate.linkedBusinessAccountsGet();
    }
    @DELETE
    @Path("/websites")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Unverify website", notes = "Unverifu a website verified by the signed-in user.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successfully unverified website", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Website not in user list.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid user accounts analytics parameters.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AnalyticsMetricsResponse.class, responseContainer = "Map") })
    public Response userAccountAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH") @QueryParam("from_claimed_content") String fromClaimedContent
,@ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA, PRODUCT, REGULAR, VIDEO", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("pin_format") String pinFormat
,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("app_types") String appTypes
,@ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues="ALL, PAID, ORGANIC", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("content_type") String contentType
,@ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues="ALL, YOUR_PINS, OTHER_PINS", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("source") String source
,@ApiParam(value = "Metric types to get data for, default is all. ", allowableValues="ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE") @QueryParam("metric_types") List<String> metricTypes
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
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = TopPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = TopPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TopPinsAnalyticsResponse.class) })
    public Response userAccountAnalyticsTopPins(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Specify sorting order for metrics",required=true, allowableValues="ENGAGEMENT, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE") @QueryParam("sort_by") String sortBy
,@ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH") @QueryParam("from_claimed_content") String fromClaimedContent
,@ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA, PRODUCT, REGULAR, VIDEO", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("pin_format") String pinFormat
,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("app_types") String appTypes
,@ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues="ALL, PAID, ORGANIC", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("content_type") String contentType
,@ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues="ALL, YOUR_PINS, OTHER_PINS", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("source") String source
,@ApiParam(value = "Metric types to get data for, default is all. ", allowableValues="ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE") @QueryParam("metric_types") List<String> metricTypes
,@ApiParam(value = "Number of pins to include, default is 10. Max is 50.", defaultValue="10") @DefaultValue("10") @QueryParam("num_of_pins") Integer numOfPins
,@ApiParam(value = "Get metrics for pins created in the last \"n\" days.", allowableValues="30") @QueryParam("created_in_last_n_days") Integer createdInLastNDays
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
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = TopVideoPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = TopVideoPinsAnalyticsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TopVideoPinsAnalyticsResponse.class) })
    public Response userAccountAnalyticsTopVideoPins(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Specify sorting order for video metrics",required=true, allowableValues="IMPRESSION, SAVE, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START") @QueryParam("sort_by") String sortBy
,@ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH") @QueryParam("from_claimed_content") String fromClaimedContent
,@ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA, PRODUCT, REGULAR, VIDEO", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("pin_format") String pinFormat
,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("app_types") String appTypes
,@ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues="ALL, PAID, ORGANIC", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("content_type") String contentType
,@ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues="ALL, YOUR_PINS, OTHER_PINS", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("source") String source
,@ApiParam(value = "Metric types to get video data for, default is all. ", allowableValues="IMPRESSION, SAVE, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START, OUTBOUND_CLICK") @QueryParam("metric_types") List<String> metricTypes
,@ApiParam(value = "Number of pins to include, default is 10. Max is 50.", defaultValue="10") @DefaultValue("10") @QueryParam("num_of_pins") Integer numOfPins
,@ApiParam(value = "Get metrics for pins created in the last \"n\" days.", allowableValues="30") @QueryParam("created_in_last_n_days") Integer createdInLastNDays
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.userAccountAnalyticsTopVideoPins(startDate,endDate,sortBy,fromClaimedContent,pinFormat,appTypes,contentType,source,metricTypes,numOfPins,createdInLastNDays,adAccountId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user account", notes = "Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.", response = Account.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access the user account.", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Account.class) })
    public Response userAccountGet(@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.userAccountGet(adAccountId);
    }
    @GET
    @Path("/following")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List following", notes = "Get a list of who a certain user follows.", response = UserFollowingGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = UserFollowingGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = UserFollowingGet200Response.class) })
    public Response userFollowingGet(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Thrift param specifying what type of followees will be kept. Default to include all followees.", allowableValues="ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("feed_type") UserFollowingFeedType feedType
,@ApiParam(value = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", defaultValue="false") @DefaultValue("false") @QueryParam("explicit_following") Boolean explicitFollowing
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.userFollowingGet(bookmark,pageSize,feedType,explicitFollowing,adAccountId);
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = UserWebsitesGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access the user website list.", response = UserWebsitesGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = UserWebsitesGet200Response.class) })
    public Response userWebsitesGet(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.userWebsitesGet(bookmark,pageSize);
    }
    @POST
    @Path("/websites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Verify website", notes = "Verify a website as a signed-in user.", response = UserWebsiteSummary.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = UserWebsiteSummary.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = UserWebsiteSummary.class) })
    public Response verifyWebsiteUpdate(@ApiParam(value = "Verify a website." ,required=true) UserWebsiteVerifyRequest userWebsiteVerifyRequest
)
    throws NotFoundException {
        return delegate.verifyWebsiteUpdate(userWebsiteVerifyRequest);
    }
    @GET
    @Path("/websites/verification")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user verification code for website claiming", notes = "Get verification code for user to install on the website to claim it.", response = UserWebsiteVerificationCode.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = UserWebsiteVerificationCode.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access the user verification code for website claiming.", response = UserWebsiteVerificationCode.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = UserWebsiteVerificationCode.class) })
    public Response websiteVerificationGet()
    throws NotFoundException {
        return delegate.websiteVerificationGet();
    }
}
