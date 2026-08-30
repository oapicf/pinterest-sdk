package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SearchApiService;
import org.openapitools.api.factories.SearchApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SearchPartnerPins200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/search")


@io.swagger.annotations.Api(description = "the search API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SearchApi  {
   private final SearchApiService delegate = SearchApiServiceFactory.getSearchApi();

    @GET
    @Path("/partner/pins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search pins by a given search term", notes = "**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.", response = SearchPartnerPins200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "search", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SearchPartnerPins200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = SearchPartnerPins200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = SearchPartnerPins200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = SearchPartnerPins200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = SearchPartnerPins200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = SearchPartnerPins200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = SearchPartnerPins200Response.class) })
    public Response searchPartnerPins(@ApiParam(value = "Search term to look up pins.",required=true) @QueryParam("term") String term
,@ApiParam(value = "Two letter country code (ISO 3166-1 alpha-2)",required=true) @QueryParam("country_code") String countryCode
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Search locale.") @QueryParam("locale") String locale
,@ApiParam(value = "Max search result size", defaultValue="10") @DefaultValue("10") @QueryParam("limit") Integer limit
)
    throws NotFoundException {
        return delegate.searchPartnerPins(term,countryCode,bookmark,locale,limit);
    }
    @GET
    @Path("/boards")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search user's boards", notes = "Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.", response = BoardsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read_secret", description = "See your secret boards")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read_secret", description = "See your secret boards")
        })
    }, tags={ "search", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = BoardsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = BoardsList200Response.class) })
    public Response searchUserBoardsGet(@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.") @QueryParam("query") String query
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.searchUserBoardsGet(adAccountId,query,bookmark,pageSize);
    }
    @GET
    @Path("/pins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search user's Pins", notes = "Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.", response = PinsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read_secret", description = "See your secret boards"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read_secret", description = "See your secret Pins")
        })
    }, tags={ "search", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = PinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinsList200Response.class) })
    public Response searchUserPinsList(@ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.",required=true) @QueryParam("query") String query
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
)
    throws NotFoundException {
        return delegate.searchUserPinsList(query,adAccountId,bookmark);
    }
}
