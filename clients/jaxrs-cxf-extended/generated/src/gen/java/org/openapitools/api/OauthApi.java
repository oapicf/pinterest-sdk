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
     * Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;&#39;/docs/getting-started/authentication/&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
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
