package org.openapitools.api.interfaces;

import org.openapitools.model.ConversionAccessToken;
import org.openapitools.model.OauthAccessToken;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.TokenGrantType;
import org.openapitools.model.TokenTypeHint;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface OauthService {

    /**
     * Generate OAuth access token for conversion API
     * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
     *
     * @return ConversionAccessToken
     */
    ConversionAccessToken oauthConversionToken(
    );

    /**
     * Generate OAuth access token
     * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
     *
     * @param grantType  (required)
     * @param code  (optional)
     * @param continuousRefresh   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. (optional)
     * @param redirectUri  (optional)
     * @param refreshToken  (optional)
     * @param scope  (optional)
     * @return OauthAccessToken
     */
    OauthAccessToken oauthToken(
        TokenGrantType grantType,
        String code,
        String continuousRefresh,
        String redirectUri,
        String refreshToken,
        String scope
    );

    /**
     * Revoke a token
     * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
     *
     * @param token The token to revoke. (required)
     * @param tokenTypeHint The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. (optional)
     * @return void
     */
    void tokenRevoke(
        String token,
        TokenTypeHint tokenTypeHint
    );
}
