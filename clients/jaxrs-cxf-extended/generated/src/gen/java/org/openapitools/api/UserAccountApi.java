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
import org.openapitools.model.UserAccountFollowedInterests200Response;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserWebsite;
import org.openapitools.model.UserWebsiteCreate;
import org.openapitools.model.UserWebsiteVerification;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

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
    @ApiOperation(value = "List following boards", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BoardsList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public BoardsList200Response boardsUserFollowsList(@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("explicit_following") @DefaultValue("false") Boolean explicitFollowing, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize);

    /**
     * Follow user
     *
     * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
     *
     */
    @POST
    @Path("/user_account/following/{username}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Follow user", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = FollowUser.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = FollowUser.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public FollowUser followUserUpdate(@PathParam("username") @Pattern(regexp="(?!^\\d+$)^.+$") String username, @Valid FollowUserCreate followUserCreate);

    /**
     * List followers
     *
     * Get a list of your followers.
     *
     */
    @GET
    @Path("/user_account/followers")
    @Produces({ "application/json" })
    @ApiOperation(value = "List followers", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = FollowersList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public FollowersList200Response followersList(@QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize);

    /**
     * List linked businesses
     *
     * Get a list of your linked business accounts.
     *
     */
    @GET
    @Path("/user_account/businesses")
    @Produces({ "application/json" })
    @ApiOperation(value = "List linked businesses", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = LinkedBusiness.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<LinkedBusiness> linkedBusinessAccountsGet();

    /**
     * Unverify website
     *
     * Unverify a website verified by the signed-in user.
     *
     */
    @DELETE
    @Path("/user_account/websites")
    @Produces({ "application/json" })
    @ApiOperation(value = "Unverify website", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsite.class),
        @ApiResponse(code = 204, message = "Resource deleted successfully."),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public UserWebsite unverifyWebsiteDelete(@QueryParam("website") @NotNull String website);

    /**
     * Get user account analytics
     *
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    @GET
    @Path("/user_account/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account analytics", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Map<String, AnalyticsMetricsResponse> userAccountAnalytics(@QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("from_claimed_content") @DefaultValue("BOTH") String fromClaimedContent, @QueryParam("pin_format") @DefaultValue("ALL") String pinFormat, @QueryParam("app_types") @DefaultValue("ALL") String appTypes, @QueryParam("content_type") @DefaultValue("ALL") String contentType, @QueryParam("source") @DefaultValue("ALL") String source, @QueryParam("metric_types") List<QuerymetrictypesItems> metricTypes, @QueryParam("split_field") @DefaultValue("NO_SPLIT") String splitField, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * Get user account top pins analytics
     *
     * Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    @GET
    @Path("/user_account/analytics/top_pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account top pins analytics", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = TopPinsAnalyticsResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public TopPinsAnalyticsResponse userAccountAnalyticsTopPins(@QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("sort_by") @NotNull TopPinsSortBy sortBy, @QueryParam("from_claimed_content") @DefaultValue("BOTH") String fromClaimedContent, @QueryParam("pin_format") @DefaultValue("ALL") String pinFormat, @QueryParam("app_types") @DefaultValue("ALL") String appTypes, @QueryParam("content_type") @DefaultValue("ALL") String contentType, @QueryParam("source") @DefaultValue("ALL") String source, @QueryParam("metric_types") List<QuerymetrictypesItems> metricTypes, @QueryParam("num_of_pins") @Min(1) @Max(50) @DefaultValue("10") Integer numOfPins, @QueryParam("created_in_last_n_days") BigDecimal createdInLastNDays, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * Get user account top video pins analytics
     *
     * Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    @GET
    @Path("/user_account/analytics/top_video_pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account top video pins analytics", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = TopVideoPinsAnalyticsResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(@QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("sort_by") @NotNull TopVideoPinsSortBy sortBy, @QueryParam("from_claimed_content") @DefaultValue("BOTH") String fromClaimedContent, @QueryParam("pin_format") @DefaultValue("ALL") String pinFormat, @QueryParam("app_types") @DefaultValue("ALL") String appTypes, @QueryParam("content_type") @DefaultValue("ALL") String contentType, @QueryParam("source") @DefaultValue("ALL") String source, @QueryParam("metric_types") List<QueryvideopinmetrictypesItems> metricTypes, @QueryParam("num_of_pins") @Min(1) @Max(50) @DefaultValue("10") Integer numOfPins, @QueryParam("created_in_last_n_days") BigDecimal createdInLastNDays, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * List following interests
     *
     * Get a list of a user&#39;s following interests in one place.
     *
     */
    @GET
    @Path("/users/{username}/interests/follow")
    @Produces({ "application/json" })
    @ApiOperation(value = "List following interests", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UserAccountFollowedInterests200Response.class),
        @ApiResponse(code = 400, message = "The server could not understand the request due to invalid syntax.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Access is unauthorized.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The server cannot find the requested resource.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = PinterestLibError.class) })
    public UserAccountFollowedInterests200Response userAccountFollowedInterests(@PathParam("username") @Pattern(regexp="(?!^\\d+$)^.+$") String username, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize);

    /**
     * Get user account
     *
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information.
     *
     */
    @GET
    @Path("/user_account")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = Account.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Account userAccountGet(@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * List following
     *
     * Get a list of who a certain user follows.
     *
     */
    @GET
    @Path("/user_account/following")
    @Produces({ "application/json" })
    @ApiOperation(value = "List following", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = FollowersList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public FollowersList200Response userFollowingGet(@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("explicit_following") @DefaultValue("false") Boolean explicitFollowing, @QueryParam("feed_type") @DefaultValue("ALL") UserFollowingFeedType feedType, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize);

    /**
     * Get user websites
     *
     * Get user websites, claimed or not
     *
     */
    @GET
    @Path("/user_account/websites")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user websites", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsitesGet200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public UserWebsitesGet200Response userWebsitesGet(@QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize);

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
    @ApiOperation(value = "Verify website", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsite.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = UserWebsite.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public UserWebsite verifyWebsiteUpdate(@Valid UserWebsiteCreate userWebsiteCreate, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * Get user verification code for website claiming
     *
     * Get verification code for user to install on the website to claim it.
     *
     */
    @GET
    @Path("/user_account/websites/verification")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user verification code for website claiming", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UserWebsiteVerification.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public UserWebsiteVerification websiteVerificationGet(@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);
}
