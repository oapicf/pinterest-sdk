package api

import play.api.libs.json._
import model.ConversionAccessToken
import model.Error
import model.OauthAccessToken
import model.TokenGrantType
import model.TokenTypeHint

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait OauthApi {
  /**
    * Generate OAuth access token for conversion API
    * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
    */
  def oauthConversionToken(): ConversionAccessToken

  /**
    * Generate OAuth access token
    * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
    * @param continuousRefresh   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.
    */
  def oauthToken(grantType: TokenGrantType, code: Option[String], continuousRefresh: Option[String], redirectUri: Option[String], refreshToken: Option[String], scope: Option[String]): OauthAccessToken

  /**
    * Revoke a token
    * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
    * @param token The token to revoke.
    * @param tokenTypeHint The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
    */
  def tokenRevoke(token: String, tokenTypeHint: Option[TokenTypeHint]): Unit
}
