/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AnalyticsMetricsResponse;
import com.prokarma.pkmst.model.Error;
import org.threeten.bp.LocalDate;
import com.prokarma.pkmst.model.Pin;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-07T06:39:36.253940Z[Etc/UTC]")
@Api(value = "Pins", description = "the Pins API")
public interface PinsApi {

    @ApiOperation(value = "Get Pin analytics", notes = "Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.", response = AnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "pins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pins/{pin_id}/analytics",
        produces = { "application/json" }
    )
    ResponseEntity<Map<String, AnalyticsMetricsResponse>> pinsAnalytics(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD", required = true)  @RequestParam(value = "start_date", required = true) LocalDate startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD", required = true)  @RequestParam(value = "end_date", required = true) LocalDate endDate,@ApiParam(value = "Pin metric types to get data for, default is all.", required = true, allowableValues = "IMPRESSION, SAVE, PIN_CLICK, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW")  @RequestParam(value = "metric_types", required = true) List<String> metricTypes,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues = "ALL, MOBILE, TABLET, WEB", defaultValue = "ALL")  @RequestParam(value = "app_types", required = false, defaultValue="ALL") String appTypes,@ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues = "NO_SPLIT, APP_TYPE", defaultValue = "NO_SPLIT")  @RequestParam(value = "split_field", required = false, defaultValue="NO_SPLIT") String splitField,@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Create Pin", notes = "Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.", response = Pin.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins") })
         }, tags={ "pins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful pin creation.", response = Pin.class),
        @ApiResponse(code = 400, message = "Invalid Pin parameters response", response = Error.class),
        @ApiResponse(code = 403, message = "The Pin's image is too small, too large or is broken", response = Error.class),
        @ApiResponse(code = 404, message = "Board or section not found", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pins",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<Pin> pinsCreate(@ApiParam(value = "Create a new Pin." ,required=true )   @RequestBody Pin pin, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Delete Pin", notes = "Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins") })
         }, tags={ "pins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully deleted Pin"),
        @ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/pins/{pin_id}",
        produces = { "application/json" }
    )
    ResponseEntity<Void> pinsDelete(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get Pin", notes = "Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.", response = Pin.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "pins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Pin.class),
        @ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pins/{pin_id}",
        produces = { "application/json" }
    )
    ResponseEntity<Pin> pinsGet(@ApiParam(value = "Unique identifier of a Pin.",required=true ) @PathVariable("pin_id") String pinId,@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}