package org.openapitools.api;

import org.openapitools.api.SearchApiService;
import org.openapitools.api.factories.SearchApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.SearchUserBoardsGet200Response;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/search")


@io.swagger.annotations.Api(description = "the search API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SearchApi  {
   private final SearchApiService delegate;

   public SearchApi(@Context ServletConfig servletContext) {
      SearchApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SearchApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SearchApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = SearchApiServiceFactory.getSearchApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response searchPartnerPins(@ApiParam(value = "Search term to look up pins.", required = true) @QueryParam("term") @NotNull  String term,@ApiParam(value = "Two letter country code (ISO 3166-1 alpha-2)", required = true) @QueryParam("country_code") @NotNull  String countryCode,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Search locale.") @QueryParam("locale")  String locale,@ApiParam(value = "Max search result size", defaultValue = "10") @DefaultValue("10") @QueryParam("limit")  @Min(1) @Max(50) Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchPartnerPins(term, countryCode, bookmark, locale, limit, securityContext);
    }
    @javax.ws.rs.GET
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response searchUserBoardsGet(@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.") @QueryParam("query")  String query,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchUserBoardsGet(adAccountId, bookmark, pageSize, query, securityContext);
    }
    @javax.ws.rs.GET
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response searchUserPinsList(@ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.", required = true) @QueryParam("query") @NotNull  String query,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchUserPinsList(query, adAccountId, bookmark, securityContext);
    }
}
