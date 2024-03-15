package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.SearchUserBoardsGet200Response;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/search")


@io.swagger.annotations.Api(description = "the search API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface SearchApi  {

    @GET
    @Path("/partner/pins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search pins by a given search term", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.", response = SearchPartnerPins200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "search", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = SearchPartnerPins200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid pins", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response searchPartnerPins( @NotNull @QueryParam("term") String term, @NotNull @QueryParam("country_code") String countryCode, @QueryParam("bookmark") String bookmark, @QueryParam("locale") String locale, @Min(1) @Max(50) @DefaultValue("10") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext);
    @GET
    @Path("/boards")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search user's boards", notes = "Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.", response = SearchUserBoardsGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read_secret", description = "See your secret boards")
        })
    }, tags={ "search", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = SearchUserBoardsGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response searchUserBoardsGet( @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize, @QueryParam("query") String query,@Context SecurityContext securityContext);
    @GET
    @Path("/pins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search user's Pins", notes = "Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.", response = PinsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read_secret", description = "See your secret boards"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read_secret", description = "See your secret Pins")
        })
    }, tags={ "search", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = PinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response searchUserPinsList( @NotNull @QueryParam("query") String query, @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark,@Context SecurityContext securityContext);
}
