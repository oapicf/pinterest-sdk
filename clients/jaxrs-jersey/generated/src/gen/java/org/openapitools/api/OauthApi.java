package org.openapitools.api;

import org.openapitools.model.*;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-07-01T12:00:52.037403Z[Etc/UTC]")
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

    @POST
    
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Generate OAuth access token", notes = "Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.", response = OauthAccessTokenResponse.class, tags={ "oauth", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = OauthAccessTokenResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response oauthToken(@ApiParam(value = "", required=true, allowableValues="authorization_code, refresh_token")  @FormParam("grant_type")  String grantType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.oauthToken(grantType, securityContext);
    }
}
