package model

import play.api.libs.json._

/**
  * A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class OauthAccessTokenResponseEverlastingRefresh(
  responseType: Option[OauthAccessTokenResponseEverlastingRefresh.ResponseType.Value],
  accessToken: String,
  tokenType: String,
  expiresIn: Int,
  scope: String,
  refreshToken: String,
  refreshTokenExpiresIn: Int,
  refreshTokenExpiresAt: Int
)

object OauthAccessTokenResponseEverlastingRefresh {
  implicit lazy val oauthAccessTokenResponseEverlastingRefreshJsonFormat: Format[OauthAccessTokenResponseEverlastingRefresh] = Json.format[OauthAccessTokenResponseEverlastingRefresh]

  // noinspection TypeAnnotation
  object ResponseType extends Enumeration {
    val AuthorizationCode = Value("authorization_code")
    val RefreshToken = Value("refresh_token")
    val ClientCredentials = Value("client_credentials")

    type ResponseType = Value
    implicit lazy val ResponseTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

