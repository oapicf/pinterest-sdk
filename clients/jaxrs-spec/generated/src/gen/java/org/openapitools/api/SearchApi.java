package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.SearchUserBoardsGet200Response;

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
@Path("/search")
@Api(description = "the search API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SearchApi {

    @GET
    @Path("/partner/pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Search pins by a given search term", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.", response = SearchPartnerPins200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "search" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SearchPartnerPins200Response.class),
        @ApiResponse(code = 400, message = "Invalid pins", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response searchPartnerPins(@QueryParam("term") @NotNull  @ApiParam("Search term to look up pins.")  String term,@QueryParam("country_code") @NotNull  @ApiParam("Two letter country code (ISO 3166-1 alpha-2)")  String countryCode,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("locale")  @ApiParam("Search locale.")  String locale,@QueryParam("limit") @Min(1) @Max(50) @DefaultValue("10")  @ApiParam("Max search result size")  Integer limit) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/boards")
    @Produces({ "application/json" })
    @ApiOperation(value = "Search user's boards", notes = "Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.", response = SearchUserBoardsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:read_secret", description = "See your secret boards") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:read_secret", description = "See your secret boards") })
         }, tags={ "search" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = SearchUserBoardsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response searchUserBoardsGet(@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("query")  @ApiParam("Search query. Can contain pin description keywords or comma-separated pin IDs.")  String query) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Search user's Pins", notes = "Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.", response = PinsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:read_secret", description = "See your secret boards"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "pins:read_secret", description = "See your secret Pins") })
         }, tags={ "search" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PinsList200Response.class),
        @ApiResponse(code = 404, message = "User not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response searchUserPinsList(@QueryParam("query") @NotNull  @ApiParam("Search query. Can contain pin description keywords or comma-separated pin IDs.")  String query,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }
}
