package model

import play.api.libs.json._

/**
  * A request to exchange a refresh token for a new access token.
  * @param refreshOn Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class OauthAccessTokenRequestRefresh(
  grantType: OauthAccessTokenRequestRefresh.GrantType.Value,
  refreshToken: String,
  scope: Option[String],
  refreshOn: Option[Boolean]
)

object OauthAccessTokenRequestRefresh {
  implicit lazy val oauthAccessTokenRequestRefreshJsonFormat: Format[OauthAccessTokenRequestRefresh] = Json.format[OauthAccessTokenRequestRefresh]

  // noinspection TypeAnnotation
  object GrantType extends Enumeration {
    val AuthorizationCode = Value("authorization_code")
    val RefreshToken = Value("refresh_token")
    val ClientCredentials = Value("client_credentials")

    type GrantType = Value
    implicit lazy val GrantTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

