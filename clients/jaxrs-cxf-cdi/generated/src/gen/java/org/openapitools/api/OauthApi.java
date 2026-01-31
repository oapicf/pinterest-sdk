package org.openapitools.api;

import org.openapitools.model.ConversionAccessTokenResponse;
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
@Path("/oauth")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-31T04:54:28.741368951Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class OauthApi  {

  @Context SecurityContext securityContext;

  @Inject OauthApiService delegate;


    @POST
    @Path("/conversion_token")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Generate OAuth access token for conversion API", notes = "Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.", response = ConversionAccessTokenResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "oauth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = ConversionAccessTokenResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response oauthConversionToken() {
        return delegate.oauthConversionToken(securityContext);
    }

    @POST
    @Path("/token")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Generate OAuth access token", notes = "Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.", response = OauthAccessTokenResponse.class, authorizations = {
        
        @Authorization(value = "basic")
         }, tags={ "oauth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = OauthAccessTokenResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response oauthToken(@FormParam(value = "grant_type")  String grantType) {
        return delegate.oauthToken(grantType, securityContext);
    }

    @POST
    @Path("/token/revoke")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Revoke a token", notes = "Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.", response = Void.class, authorizations = {
        
        @Authorization(value = "basic")
         }, tags={ "oauth" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful token revocation. No content is returned.", response = Void.class),
        @ApiResponse(code = 401, message = "Client authentication error.", response = Error.class),
        @ApiResponse(code = 403, message = "Client is not allowed to revoke token.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response tokenRevoke(@FormParam(value = "token")  String token, @FormParam(value = "token_type_hint")  String tokenTypeHint) {
        return delegate.tokenRevoke(token, tokenTypeHint, securityContext);
    }
}
