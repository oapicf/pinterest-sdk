/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Account;
import com.prokarma.pkmst.model.AnalyticsMetricsResponse;
import com.prokarma.pkmst.model.BoardsUserFollowsList200Response;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.FollowUserRequest;
import com.prokarma.pkmst.model.FollowersList200Response;
import com.prokarma.pkmst.model.LinkedBusiness;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import com.prokarma.pkmst.model.TopPinsAnalyticsResponse;
import com.prokarma.pkmst.model.TopVideoPinsAnalyticsResponse;
import com.prokarma.pkmst.model.UserAccountFollowedInterests200Response;
import com.prokarma.pkmst.model.UserFollowingFeedType;
import com.prokarma.pkmst.model.UserFollowingGet200Response;
import com.prokarma.pkmst.model.UserSummary;
import com.prokarma.pkmst.model.UserWebsiteSummary;
import com.prokarma.pkmst.model.UserWebsiteVerificationCode;
import com.prokarma.pkmst.model.UserWebsiteVerifyRequest;
import com.prokarma.pkmst.model.UserWebsitesGet200Response;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Api(value = "UserAccount", description = "the UserAccount API")
public interface UserAccountApi {

    @ApiOperation(value = "List following boards", notes = "Get a list of the boards a user follows. The request returns a board summary object array.", response = BoardsUserFollowsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BoardsUserFollowsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid user id", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user_account/following/boards",
        produces = { "application/json" }
    )
    ResponseEntity<BoardsUserFollowsList200Response> boardsUserFollowsList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,@ApiParam(value = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", defaultValue = "false")  @RequestParam(value = "explicit_following", required = false, defaultValue="false") Boolean explicitFollowing,@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Follow user", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.", response = UserSummary.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserSummary.class),
        @ApiResponse(code = 404, message = "User not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user_account/following/{username}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<UserSummary> followUserUpdate(@ApiParam(value = "A valid username",required=true ) @PathVariable("username") String username,@ApiParam(value = "Follow a user." ,required=true )   @RequestBody FollowUserRequest followUserRequest, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "List followers", notes = "Get a list of your followers.", response = FollowersList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = FollowersList200Response.class),
        @ApiResponse(code = 400, message = "Invalid user id", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user_account/followers",
        produces = { "application/json" }
    )
    ResponseEntity<FollowersList200Response> followersList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "List linked businesses", notes = "Get a list of your linked business accounts.", response = LinkedBusiness.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LinkedBusiness.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user_account/businesses",
        produces = { "application/json" }
    )
    ResponseEntity<List<LinkedBusiness>> linkedBusinessAccountsGet( @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Unverify website", notes = "Unverifu a website verified by the signed-in user.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully unverified website"),
        @ApiResponse(code = 404, message = "Website not in user list.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user_account/websites",
        produces = { "application/json" }
    )
    ResponseEntity<Void> unverifyWebsiteDelete(@ApiParam(value = "Website with path or domain only", required = true)  @RequestParam(value = "website", required = true) String website, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get user account analytics", notes = "Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = AnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 400, message = "Invalid user accounts analytics parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user_account/analytics",
        produces = { "application/json" }
    )
    ResponseEntity<Map<String, AnalyticsMetricsResponse>> userAccountAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,@ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues = "OTHER, CLAIMED, BOTH", defaultValue = "BOTH")  @RequestParam(value = "from_claimed_content", required = false, defaultValue="BOTH") String fromClaimedContent,@ApiParam(value = "Pin formats to get data for, default is all.", allowableValues = "ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue = "ALL")  @RequestParam(value = "pin_format", required = false, defaultValue="ALL") String pinFormat,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,@ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues = "ALL, PAID, ORGANIC", defaultValue = "ALL")  @RequestParam(value = "content_type", required = false, defaultValue="ALL") String contentType,@ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues = "ALL, YOUR_PINS, OTHER_PINS", defaultValue = "ALL")  @RequestParam(value = "source", required = false, defaultValue="ALL") String source,@ApiParam(value = "Metric types to get data for, default is all. ", allowableValues = "ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE")  @RequestParam(value = "metric_types", required = false) List<String> metricTypes,@ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues = "NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT", defaultValue = "NO_SPLIT")  @RequestParam(value = "split_field", required = false, defaultValue="NO_SPLIT") String splitField,@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get user account top pins analytics", notes = "Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = TopPinsAnalyticsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TopPinsAnalyticsResponse.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user_account/analytics/top_pins",
        produces = { "application/json" }
    )
    ResponseEntity<TopPinsAnalyticsResponse> userAccountAnalyticsTopPins(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,@ApiParam(value = "Specify sorting order for metrics", required = true, allowableValues = "ENGAGEMENT, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE")  @RequestParam(value = "sort_by", required = true) String sortBy,@ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues = "OTHER, CLAIMED, BOTH", defaultValue = "BOTH")  @RequestParam(value = "from_claimed_content", required = false, defaultValue="BOTH") String fromClaimedContent,@ApiParam(value = "Pin formats to get data for, default is all.", allowableValues = "ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue = "ALL")  @RequestParam(value = "pin_format", required = false, defaultValue="ALL") String pinFormat,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,@ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues = "ALL, PAID, ORGANIC", defaultValue = "ALL")  @RequestParam(value = "content_type", required = false, defaultValue="ALL") String contentType,@ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues = "ALL, YOUR_PINS, OTHER_PINS", defaultValue = "ALL")  @RequestParam(value = "source", required = false, defaultValue="ALL") String source,@ApiParam(value = "Metric types to get data for, default is all. ", allowableValues = "ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE")  @RequestParam(value = "metric_types", required = false) List<String> metricTypes,@ApiParam(value = "Number of pins to include, default is 10. Max is 50.", defaultValue = "10")  @RequestParam(value = "num_of_pins", required = false, defaultValue="10") Integer numOfPins,@ApiParam(value = "Get metrics for pins created in the last \"n\" days.", allowableValues = "30")  @RequestParam(value = "created_in_last_n_days", required = false) Integer createdInLastNDays,@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get user account top video pins analytics", notes = "Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = TopVideoPinsAnalyticsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TopVideoPinsAnalyticsResponse.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user_account/analytics/top_video_pins",
        produces = { "application/json" }
    )
    ResponseEntity<TopVideoPinsAnalyticsResponse> userAccountAnalyticsTopVideoPins(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,@ApiParam(value = "Specify sorting order for video metrics", required = true, allowableValues = "IMPRESSION, SAVE, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START")  @RequestParam(value = "sort_by", required = true) String sortBy,@ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues = "OTHER, CLAIMED, BOTH", defaultValue = "BOTH")  @RequestParam(value = "from_claimed_content", required = false, defaultValue="BOTH") String fromClaimedContent,@ApiParam(value = "Pin formats to get data for, default is all.", allowableValues = "ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA", defaultValue = "ALL")  @RequestParam(value = "pin_format", required = false, defaultValue="ALL") String pinFormat,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,@ApiParam(value = "Filter to paid or organic data. Default is all.", allowableValues = "ALL, PAID, ORGANIC", defaultValue = "ALL")  @RequestParam(value = "content_type", required = false, defaultValue="ALL") String contentType,@ApiParam(value = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", allowableValues = "ALL, YOUR_PINS, OTHER_PINS", defaultValue = "ALL")  @RequestParam(value = "source", required = false, defaultValue="ALL") String source,@ApiParam(value = "Metric types to get video data for, default is all. ", allowableValues = "IMPRESSION, SAVE, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START, OUTBOUND_CLICK")  @RequestParam(value = "metric_types", required = false) List<String> metricTypes,@ApiParam(value = "Number of pins to include, default is 10. Max is 50.", defaultValue = "10")  @RequestParam(value = "num_of_pins", required = false, defaultValue="10") Integer numOfPins,@ApiParam(value = "Get metrics for pins created in the last \"n\" days.", allowableValues = "30")  @RequestParam(value = "created_in_last_n_days", required = false) Integer createdInLastNDays,@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "List following interests", notes = "Get a list of a user's following interests in one place.", response = UserAccountFollowedInterests200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserAccountFollowedInterests200Response.class),
        @ApiResponse(code = 400, message = "Invalid parameters", response = Error.class),
        @ApiResponse(code = 401, message = "Authorization failed", response = Error.class),
        @ApiResponse(code = 404, message = "User not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{username}/interests/follow",
        produces = { "application/json" }
    )
    ResponseEntity<UserAccountFollowedInterests200Response> userAccountFollowedInterests(@ApiParam(value = "A valid username",required=true ) @PathVariable("username") String username,@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get user account", notes = "Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.", response = Account.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Account.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user_account",
        produces = { "application/json" }
    )
    ResponseEntity<Account> userAccountGet(@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "List following", notes = "Get a list of who a certain user follows.", response = UserFollowingGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = UserFollowingGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user_account/following",
        produces = { "application/json" }
    )
    ResponseEntity<UserFollowingGet200Response> userFollowingGet(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,@ApiParam(value = "Thrift param specifying what type of followees will be kept. Default to include all followees.", allowableValues = "ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY", defaultValue = "ALL")  @RequestParam(value = "feed_type", required = false, defaultValue="ALL") UserFollowingFeedType feedType,@ApiParam(value = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", defaultValue = "false")  @RequestParam(value = "explicit_following", required = false, defaultValue="false") Boolean explicitFollowing,@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get user websites", notes = "Get user websites, claimed or not", response = UserWebsitesGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserWebsitesGet200Response.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user website list.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user_account/websites",
        produces = { "application/json" }
    )
    ResponseEntity<UserWebsitesGet200Response> userWebsitesGet(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Verify website", notes = "Verify a website as a signed-in user.", response = UserWebsiteSummary.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:write", description = "Update your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserWebsiteSummary.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user_account/websites",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<UserWebsiteSummary> verifyWebsiteUpdate(@ApiParam(value = "Verify a website." ,required=true )   @RequestBody UserWebsiteVerifyRequest userWebsiteVerifyRequest,@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get user verification code for website claiming", notes = "Get verification code for user to install on the website to claim it.", response = UserWebsiteVerificationCode.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserWebsiteVerificationCode.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user verification code for website claiming.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user_account/websites/verification",
        produces = { "application/json" }
    )
    ResponseEntity<UserWebsiteVerificationCode> websiteVerificationGet(@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
