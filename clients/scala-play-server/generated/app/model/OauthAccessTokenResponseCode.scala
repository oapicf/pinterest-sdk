package model

import play.api.libs.json._

/**
  * A successful OAuth access token response for the authorization code flow.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class OauthAccessTokenResponseCode(
  responseType: Option[OauthAccessTokenResponseCode.ResponseType.Value],
  accessToken: String,
  tokenType: String,
  expiresIn: Int,
  scope: String,
  refreshToken: String,
  refreshTokenExpiresIn: Int
)

object OauthAccessTokenResponseCode {
  implicit lazy val oauthAccessTokenResponseCodeJsonFormat: Format[OauthAccessTokenResponseCode] = Json.format[OauthAccessTokenResponseCode]

  // noinspection TypeAnnotation
  object ResponseType extends Enumeration {
    val AuthorizationCode = Value("authorization_code")
    val RefreshToken = Value("refresh_token")
    val ClientCredentials = Value("client_credentials")

    type ResponseType = Value
    implicit lazy val ResponseTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

