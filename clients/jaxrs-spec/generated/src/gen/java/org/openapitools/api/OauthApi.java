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

@Path("/oauth/token")
@Api(description = "the oauth API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class OauthApi {

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Generate OAuth access token", notes = "Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.", response = OauthAccessTokenResponse.class, tags={ "oauth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = OauthAccessTokenResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response oauthToken(@FormParam(value = "grant_type")  String grantType) {
        return Response.ok().entity("magic!").build();
    }
}
