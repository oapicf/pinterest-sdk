package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.OauthAccessTokenResponse;

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
@Path("/oauth/token")
@Api(description = "the oauth API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OauthApi {

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Generate OAuth access token", notes = "Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication-and-scopes/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  <strong>Grant type <i>client_credentials</i> and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.</strong>", response = OauthAccessTokenResponse.class, authorizations = {
        
        @Authorization(value = "basic")
         }, tags={ "oauth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = OauthAccessTokenResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response oauthToken(@FormParam(value = "grant_type")  String grantType) {
        return Response.ok().entity("magic!").build();
    }
}
