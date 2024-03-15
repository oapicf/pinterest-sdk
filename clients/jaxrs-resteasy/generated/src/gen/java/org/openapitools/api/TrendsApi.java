package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TrendsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendingKeywordsResponse;
import org.openapitools.model.TrendsSupportedRegion;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/trends/keywords/{region}/top/{trend_type}")


@io.swagger.annotations.Api(description = "the trends API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TrendsApi  {

    @Inject TrendsApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List trending keywords", notes = "<p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.", response = TrendingKeywordsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = TrendingKeywordsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid trending keywords request parameters", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response trendingKeywordsList( @PathParam("region") TrendsSupportedRegion region, @PathParam("trend_type") TrendType trendType, @QueryParam("interests") List<String> interests, @QueryParam("genders") List<String> genders, @QueryParam("ages") List<String> ages, @DefaultValue("false") @QueryParam("normalize_against_group") Boolean normalizeAgainstGroup, @Min(1) @Max(50) @DefaultValue("50") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.trendingKeywordsList(region,trendType,interests,genders,ages,normalizeAgainstGroup,limit,securityContext);
    }
}
