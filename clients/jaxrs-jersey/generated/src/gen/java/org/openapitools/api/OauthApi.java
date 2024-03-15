package org.openapitools.api;

import org.openapitools.api.OauthApiService;
import org.openapitools.api.factories.OauthApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import org.openapitools.model.OauthAccessTokenResponse;

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

@Path("/oauth/token")


@io.swagger.annotations.Api(description = "the oauth API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OauthApi  {
   private final OauthApiService delegate;

   public OauthApi(@Context ServletConfig servletContext) {
      OauthApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OauthApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OauthApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = OauthApiServiceFactory.getOauthApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Generate OAuth access token", notes = "Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = OauthAccessTokenResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basic")
    }, tags={ "oauth", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = OauthAccessTokenResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response oauthToken(@ApiParam(value = "", required=true, allowableValues="authorization_code, refresh_token")  @FormParam("grant_type")  String grantType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.oauthToken(grantType, securityContext);
    }
}
