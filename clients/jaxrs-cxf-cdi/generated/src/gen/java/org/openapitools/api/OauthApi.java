package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.OauthAccessTokenResponse;
import org.openapitools.api.OauthApiService;

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
@Path("/oauth/token")
@RequestScoped

@Api(description = "the oauth API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-14T23:04:18.835425768Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class OauthApi  {

  @Context SecurityContext securityContext;

  @Inject OauthApiService delegate;


    @POST
    
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Generate OAuth access token", notes = "Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = OauthAccessTokenResponse.class, authorizations = {
        
        @Authorization(value = "basic")
         }, tags={ "oauth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = OauthAccessTokenResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response oauthToken(@FormParam(value = "grant_type")  String grantType) {
        return delegate.oauthToken(grantType, securityContext);
    }
}
