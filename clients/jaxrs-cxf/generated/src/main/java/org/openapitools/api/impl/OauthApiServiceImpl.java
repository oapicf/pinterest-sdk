package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ConversionAccessToken;
import org.openapitools.model.OauthAccessToken;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.TokenGrantType;
import org.openapitools.model.TokenTypeHint;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class OauthApiServiceImpl implements OauthApi {
    /**
     * Generate OAuth access token for conversion API
     *
     * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
     *
     */
    public ConversionAccessToken oauthConversionToken() {
        // TODO: Implement...

        return null;
    }

    /**
     * Generate OAuth access token
     *
     * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
     *
     */
    public OauthAccessToken oauthToken(TokenGrantType grantType, String code, String continuousRefresh, String redirectUri, String refreshToken, String scope) {
        // TODO: Implement...

        return null;
    }

    /**
     * Revoke a token
     *
     * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
     *
     */
    public void tokenRevoke(String token, TokenTypeHint tokenTypeHint) {
        // TODO: Implement...

        
    }

}
