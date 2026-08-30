package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.OauthApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ConversionAccessToken;
import org.openapitools.model.OauthAccessToken;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.TokenGrantType;
import org.openapitools.model.TokenTypeHint;

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

@Path("/oauth")


@io.swagger.annotations.Api(description = "the oauth API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OauthApi  {

    @Inject OauthApiService service;

    @POST
    @Path("/conversion_token")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Generate OAuth access token for conversion API", notes = "Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.", response = ConversionAccessToken.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "oauth", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionAccessToken.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response oauthConversionToken(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.oauthConversionToken(securityContext);
    }
    @POST
    @Path("/token")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Generate OAuth access token", notes = "Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. ", response = OauthAccessToken.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basic")
    }, tags={ "oauth", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = OauthAccessToken.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = OauthAccessToken.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response oauthToken(@ApiParam(value = "", required=true, allowableValues="authorization_code, refresh_token, client_credentials") @FormParam("grant_type") TokenGrantType grantType,@ApiParam(value = "") @FormParam("code") String code,@ApiParam(value = "  If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.") @FormParam("continuous_refresh") String continuousRefresh,@ApiParam(value = "") @FormParam("redirect_uri") String redirectUri,@ApiParam(value = "") @FormParam("refresh_token") String refreshToken,@ApiParam(value = "") @FormParam("scope") String scope,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.oauthToken(grantType,code,continuousRefresh,redirectUri,refreshToken,scope,securityContext);
    }
    @POST
    @Path("/token/revoke")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Revoke a token", notes = "Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basic")
    }, tags={ "oauth", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response tokenRevoke(@ApiParam(value = "The token to revoke.", required=true) @FormParam("token") String token,@ApiParam(value = "The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.", allowableValues="access_token, refresh_token") @FormParam("token_type_hint") TokenTypeHint tokenTypeHint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.tokenRevoke(token,tokenTypeHint,securityContext);
    }
}
