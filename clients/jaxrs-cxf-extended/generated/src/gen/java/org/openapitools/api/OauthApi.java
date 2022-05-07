package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.OauthAccessTokenResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/oauth/token")
@Api(value = "/", description = "")
public interface OauthApi  {

    /**
     * Generate OAuth access token
     *
     * Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.
     *
     */
    @POST
    
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Generate OAuth access token", tags={ "oauth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = OauthAccessTokenResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public OauthAccessTokenResponse oauthToken(@Multipart(value = "grant_type")  String grantType);
}
