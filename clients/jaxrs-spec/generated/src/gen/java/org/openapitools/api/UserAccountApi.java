package org.openapitools.api;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.BoardsUserFollowsList200Response;
import org.openapitools.model.Error;
import org.openapitools.model.FollowUserRequest;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import org.joda.time.LocalDate;
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

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/user_account")
@Api(description = "the user_account API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserAccountApi {

    @GET
    @Path("/following/boards")
    @Produces({ "application/json" })
    @ApiOperation(value = "List following boards", notes = "Get a list of the boards a user follows. The request returns a board summary object array.", response = BoardsUserFollowsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BoardsUserFollowsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid user id", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsUserFollowsList(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("explicit_following") @DefaultValue("false")  @ApiParam("Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.")  Boolean explicitFollowing,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/following/{username}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Follow user", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.", response = UserSummary.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserSummary.class),
        @ApiResponse(code = 404, message = "User not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response followUserUpdate(@PathParam("username") @Pattern(regexp="(?!^\\d+$)^.+$") @ApiParam("A valid username") String username,@Valid @NotNull FollowUserRequest followUserRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/followers")
    @Produces({ "application/json" })
    @ApiOperation(value = "List followers", notes = "Get a list of your followers.", response = FollowersList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = FollowersList200Response.class),
        @ApiResponse(code = 400, message = "Invalid user id", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response followersList(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/businesses")
    @Produces({ "application/json" })
    @ApiOperation(value = "List linked businesses", notes = "Get a list of your linked business accounts.", response = LinkedBusiness.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LinkedBusiness.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response linkedBusinessAccountsGet() {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/websites")
    @Produces({ "application/json" })
    @ApiOperation(value = "Unverify website", notes = "Unverifu a website verified by the signed-in user.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully unverified website", response = Void.class),
        @ApiResponse(code = 404, message = "Website not in user list.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response unverifyWebsiteDelete(@QueryParam("website") @NotNull  @ApiParam("Website with path or domain only")  String website) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account analytics", notes = "Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = AnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 400, message = "Invalid user accounts analytics parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response userAccountAnalytics(@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("from_claimed_content") @DefaultValue("BOTH")  @ApiParam("Filter on Pins that match your claimed domain.")  String fromClaimedContent,@QueryParam("pin_format") @DefaultValue("ALL")  @ApiParam("Pin formats to get data for, default is all.")  String pinFormat,@QueryParam("app_types") @DefaultValue("ALL")  @ApiParam("Apps or devices to get data for, default is all.")  String appTypes,@QueryParam("content_type") @DefaultValue("ALL")  @ApiParam("Filter to paid or organic data. Default is all.")  String contentType,@QueryParam("source") @DefaultValue("ALL")  @ApiParam("Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")  String source,@QueryParam("metric_types")  @ApiParam("Metric types to get data for, default is all. ")  List<String> metricTypes,@QueryParam("split_field") @DefaultValue("NO_SPLIT")  @ApiParam("How to split the data into groups. Not including this param means data won&#39;t be split.")  String splitField,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/analytics/top_pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account top pins analytics", notes = "Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = TopPinsAnalyticsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TopPinsAnalyticsResponse.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response userAccountAnalyticsTopPins(@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("sort_by") @NotNull  @ApiParam("Specify sorting order for metrics")  String sortBy,@QueryParam("from_claimed_content") @DefaultValue("BOTH")  @ApiParam("Filter on Pins that match your claimed domain.")  String fromClaimedContent,@QueryParam("pin_format") @DefaultValue("ALL")  @ApiParam("Pin formats to get data for, default is all.")  String pinFormat,@QueryParam("app_types") @DefaultValue("ALL")  @ApiParam("Apps or devices to get data for, default is all.")  String appTypes,@QueryParam("content_type") @DefaultValue("ALL")  @ApiParam("Filter to paid or organic data. Default is all.")  String contentType,@QueryParam("source") @DefaultValue("ALL")  @ApiParam("Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")  String source,@QueryParam("metric_types")  @ApiParam("Metric types to get data for, default is all. ")  List<String> metricTypes,@QueryParam("num_of_pins") @Min(1) @Max(50) @DefaultValue("10")  @ApiParam("Number of pins to include, default is 10. Max is 50.")  Integer numOfPins,@QueryParam("created_in_last_n_days")  @ApiParam("Get metrics for pins created in the last \&quot;n\&quot; days.")  Integer createdInLastNDays,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/analytics/top_video_pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account top video pins analytics", notes = "Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = TopVideoPinsAnalyticsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TopVideoPinsAnalyticsResponse.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response userAccountAnalyticsTopVideoPins(@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("sort_by") @NotNull  @ApiParam("Specify sorting order for video metrics")  String sortBy,@QueryParam("from_claimed_content") @DefaultValue("BOTH")  @ApiParam("Filter on Pins that match your claimed domain.")  String fromClaimedContent,@QueryParam("pin_format") @DefaultValue("ALL")  @ApiParam("Pin formats to get data for, default is all.")  String pinFormat,@QueryParam("app_types") @DefaultValue("ALL")  @ApiParam("Apps or devices to get data for, default is all.")  String appTypes,@QueryParam("content_type") @DefaultValue("ALL")  @ApiParam("Filter to paid or organic data. Default is all.")  String contentType,@QueryParam("source") @DefaultValue("ALL")  @ApiParam("Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")  String source,@QueryParam("metric_types")  @ApiParam("Metric types to get video data for, default is all. ")  List<String> metricTypes,@QueryParam("num_of_pins") @Min(1) @Max(50) @DefaultValue("10")  @ApiParam("Number of pins to include, default is 10. Max is 50.")  Integer numOfPins,@QueryParam("created_in_last_n_days")  @ApiParam("Get metrics for pins created in the last \&quot;n\&quot; days.")  Integer createdInLastNDays,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account", notes = "Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.", response = Account.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Account.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response userAccountGet(@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/following")
    @Produces({ "application/json" })
    @ApiOperation(value = "List following", notes = "Get a list of who a certain user follows.", response = UserFollowingGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = UserFollowingGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response userFollowingGet(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("feed_type") @DefaultValue("ALL")  @ApiParam("Thrift param specifying what type of followees will be kept. Default to include all followees.")  UserFollowingFeedType feedType,@QueryParam("explicit_following") @DefaultValue("false")  @ApiParam("Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.")  Boolean explicitFollowing,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/websites")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user websites", notes = "Get user websites, claimed or not", response = UserWebsitesGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserWebsitesGet200Response.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user website list.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response userWebsitesGet(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/websites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Verify website", notes = "Verify a website as a signed-in user.", response = UserWebsiteSummary.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserWebsiteSummary.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response verifyWebsiteUpdate(@Valid @NotNull UserWebsiteVerifyRequest userWebsiteVerifyRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/websites/verification")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user verification code for website claiming", notes = "Get verification code for user to install on the website to claim it.", response = UserWebsiteVerificationCode.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserWebsiteVerificationCode.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user verification code for website claiming.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response websiteVerificationGet() {
        return Response.ok().entity("magic!").build();
    }
}
