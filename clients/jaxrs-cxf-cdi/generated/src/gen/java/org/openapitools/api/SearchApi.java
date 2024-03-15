package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.SearchUserBoardsGet200Response;
import org.openapitools.api.SearchApiService;

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
@Path("/search")
@RequestScoped

@Api(description = "the search API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-14T23:04:18.835425768Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class SearchApi  {

  @Context SecurityContext securityContext;

  @Inject SearchApiService delegate;


    @GET
    @Path("/partner/pins")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Search pins by a given search term", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.", response = SearchPartnerPins200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "search" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SearchPartnerPins200Response.class),
        @ApiResponse(code = 400, message = "Invalid pins", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response searchPartnerPins( @NotNull @ApiParam(value = "Search term to look up pins.",required=true)  @QueryParam("term") String term,  @NotNull @ApiParam(value = "Two letter country code (ISO 3166-1 alpha-2)",required=true)  @QueryParam("country_code") String countryCode, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark, @ApiParam(value = "Search locale.")  @QueryParam("locale") String locale,  @Min(1) @Max(50)@ApiParam(value = "Max search result size", defaultValue="10") @DefaultValue("10")  @QueryParam("limit") Integer limit) {
        return delegate.searchPartnerPins(term, countryCode, bookmark, locale, limit, securityContext);
    }

    @GET
    @Path("/boards")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Search user's boards", notes = "Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.", response = SearchUserBoardsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:read_secret", description = "See your secret boards") })
         }, tags={ "search" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = SearchUserBoardsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response searchUserBoardsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.")  @QueryParam("query") String query) {
        return delegate.searchUserBoardsGet(adAccountId, bookmark, pageSize, query, securityContext);
    }

    @GET
    @Path("/pins")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Search user's Pins", notes = "Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.", response = PinsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:read_secret", description = "See your secret boards"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "pins:read_secret", description = "See your secret Pins") })
         }, tags={ "search" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PinsList200Response.class),
        @ApiResponse(code = 404, message = "User not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response searchUserPinsList( @NotNull @ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.",required=true)  @QueryParam("query") String query,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.searchUserPinsList(query, adAccountId, bookmark, securityContext);
    }
}
