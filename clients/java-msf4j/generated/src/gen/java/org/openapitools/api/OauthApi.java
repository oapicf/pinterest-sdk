package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.OauthApiService;
import org.openapitools.api.factories.OauthApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import org.openapitools.model.OauthAccessTokenResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/oauth/token")


@io.swagger.annotations.Api(description = "the oauth API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-08T00:31:37.849823Z[Etc/UTC]")
public class OauthApi  {
   private final OauthApiService delegate = OauthApiServiceFactory.getOauthApi();

    @POST
    
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Generate OAuth access token", notes = "Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.", response = OauthAccessTokenResponse.class, tags={ "oauth", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = OauthAccessTokenResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = OauthAccessTokenResponse.class) })
    public Response oauthToken(@ApiParam(value = "", required=true, allowableValues="authorization_code, refresh_token")  @FormParam("grant_type")  String grantType
)
    throws NotFoundException {
        return delegate.oauthToken(grantType);
    }
}
