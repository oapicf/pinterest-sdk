package org.openapitools.api;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.BoardsUserFollowsList200Response;
import org.openapitools.model.Error;
import org.openapitools.model.FollowUserRequest;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import org.joda.time.LocalDate;
import org.openapitools.model.TopPinsAnalyticsResponse;
import org.openapitools.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.model.UserAccountFollowedInterests200Response;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserFollowingGet200Response;
import org.openapitools.model.UserSummary;
import org.openapitools.model.UserWebsiteSummary;
import org.openapitools.model.UserWebsiteVerificationCode;
import org.openapitools.model.UserWebsiteVerifyRequest;
import org.openapitools.model.UserWebsitesGet200Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface UserAccountApi  {

    /**
     * List following boards
     *
     * Get a list of the boards a user follows. The request returns a board summary object array.
     *
     */
    @GET
    @Path("/user_account/following/boards")
    @Produces({ "application/json" })
    @ApiOperation(value = "List following boards", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BoardsUserFollowsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid user id", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BoardsUserFollowsList200Response boardsUserFollowsList(@QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("explicit_following") @DefaultValue("false")Boolean explicitFollowing, @QueryParam("ad_account_id") String adAccountId);

    /**
     * Follow user
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.
     *
     */
    @POST
    @Path("/user_account/following/{username}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Follow user", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserSummary.class),
        @ApiResponse(code = 404, message = "User not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UserSummary followUserUpdate(@PathParam("username") String username, FollowUserRequest followUserRequest);

    /**
     * List followers
     *
     * Get a list of your followers.
     *
     */
    @GET
    @Path("/user_account/followers")
    @Produces({ "application/json" })
    @ApiOperation(value = "List followers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = FollowersList200Response.class),
        @ApiResponse(code = 400, message = "Invalid user id", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public FollowersList200Response followersList(@QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * List linked businesses
     *
     * Get a list of your linked business accounts.
     *
     */
    @GET
    @Path("/user_account/businesses")
    @Produces({ "application/json" })
    @ApiOperation(value = "List linked businesses", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LinkedBusiness.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<LinkedBusiness> linkedBusinessAccountsGet();

    /**
     * Unverify website
     *
     * Unverifu a website verified by the signed-in user.
     *
     */
    @DELETE
    @Path("/user_account/websites")
    @Produces({ "application/json" })
    @ApiOperation(value = "Unverify website", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully unverified website"),
        @ApiResponse(code = 404, message = "Website not in user list.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public void unverifyWebsiteDelete(@QueryParam("website") String website);

    /**
     * Get user account analytics
     *
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    @GET
    @Path("/user_account/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account analytics", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 400, message = "Invalid user accounts analytics parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Map<String, AnalyticsMetricsResponse> userAccountAnalytics(@QueryParam("start_date") LocalDate startDate, @QueryParam("end_date") LocalDate endDate, @QueryParam("from_claimed_content") @DefaultValue("BOTH")String fromClaimedContent, @QueryParam("pin_format") @DefaultValue("ALL")String pinFormat, @QueryParam("app_types") @DefaultValue("ALL")String appTypes, @QueryParam("content_type") @DefaultValue("ALL")String contentType, @QueryParam("source") @DefaultValue("ALL")String source, @QueryParam("metric_types") List<String> metricTypes, @QueryParam("split_field") @DefaultValue("NO_SPLIT")String splitField, @QueryParam("ad_account_id") String adAccountId);

    /**
     * Get user account top pins analytics
     *
     * Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    @GET
    @Path("/user_account/analytics/top_pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account top pins analytics", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TopPinsAnalyticsResponse.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public TopPinsAnalyticsResponse userAccountAnalyticsTopPins(@QueryParam("start_date") LocalDate startDate, @QueryParam("end_date") LocalDate endDate, @QueryParam("sort_by") String sortBy, @QueryParam("from_claimed_content") @DefaultValue("BOTH")String fromClaimedContent, @QueryParam("pin_format") @DefaultValue("ALL")String pinFormat, @QueryParam("app_types") @DefaultValue("ALL")String appTypes, @QueryParam("content_type") @DefaultValue("ALL")String contentType, @QueryParam("source") @DefaultValue("ALL")String source, @QueryParam("metric_types") List<String> metricTypes, @QueryParam("num_of_pins") @DefaultValue("10")Integer numOfPins, @QueryParam("created_in_last_n_days") Integer createdInLastNDays, @QueryParam("ad_account_id") String adAccountId);

    /**
     * Get user account top video pins analytics
     *
     * Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    @GET
    @Path("/user_account/analytics/top_video_pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account top video pins analytics", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TopVideoPinsAnalyticsResponse.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(@QueryParam("start_date") LocalDate startDate, @QueryParam("end_date") LocalDate endDate, @QueryParam("sort_by") String sortBy, @QueryParam("from_claimed_content") @DefaultValue("BOTH")String fromClaimedContent, @QueryParam("pin_format") @DefaultValue("ALL")String pinFormat, @QueryParam("app_types") @DefaultValue("ALL")String appTypes, @QueryParam("content_type") @DefaultValue("ALL")String contentType, @QueryParam("source") @DefaultValue("ALL")String source, @QueryParam("metric_types") List<String> metricTypes, @QueryParam("num_of_pins") @DefaultValue("10")Integer numOfPins, @QueryParam("created_in_last_n_days") Integer createdInLastNDays, @QueryParam("ad_account_id") String adAccountId);

    /**
     * List following interests
     *
     * Get a list of a user&#39;s following interests in one place.
     *
     */
    @GET
    @Path("/users/{username}/interests/follow")
    @Produces({ "application/json" })
    @ApiOperation(value = "List following interests", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserAccountFollowedInterests200Response.class),
        @ApiResponse(code = 400, message = "Invalid parameters", response = Error.class),
        @ApiResponse(code = 401, message = "Authorization failed", response = Error.class),
        @ApiResponse(code = 404, message = "User not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UserAccountFollowedInterests200Response userAccountFollowedInterests(@PathParam("username") String username, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Get user account
     *
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     *
     */
    @GET
    @Path("/user_account")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Account.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Account userAccountGet(@QueryParam("ad_account_id") String adAccountId);

    /**
     * List following
     *
     * Get a list of who a certain user follows.
     *
     */
    @GET
    @Path("/user_account/following")
    @Produces({ "application/json" })
    @ApiOperation(value = "List following", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = UserFollowingGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UserFollowingGet200Response userFollowingGet(@QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("feed_type") @DefaultValue("ALL")UserFollowingFeedType feedType, @QueryParam("explicit_following") @DefaultValue("false")Boolean explicitFollowing, @QueryParam("ad_account_id") String adAccountId);

    /**
     * Get user websites
     *
     * Get user websites, claimed or not
     *
     */
    @GET
    @Path("/user_account/websites")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user websites", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserWebsitesGet200Response.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user website list.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UserWebsitesGet200Response userWebsitesGet(@QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Verify website
     *
     * Verify a website as a signed-in user.
     *
     */
    @POST
    @Path("/user_account/websites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Verify website", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserWebsiteSummary.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UserWebsiteSummary verifyWebsiteUpdate(UserWebsiteVerifyRequest userWebsiteVerifyRequest, @QueryParam("ad_account_id") String adAccountId);

    /**
     * Get user verification code for website claiming
     *
     * Get verification code for user to install on the website to claim it.
     *
     */
    @GET
    @Path("/user_account/websites/verification")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user verification code for website claiming", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserWebsiteVerificationCode.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user verification code for website claiming.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UserWebsiteVerificationCode websiteVerificationGet(@QueryParam("ad_account_id") String adAccountId);
}
