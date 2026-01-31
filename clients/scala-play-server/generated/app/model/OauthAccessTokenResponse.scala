package model

import play.api.libs.json._

/**
  * A successful OAuth access token response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OauthAccessTokenResponse(
  accessToken: String,
  expiresIn: Int,
  responseType: Option[OauthAccessTokenResponse.ResponseType.Value],
  scope: String,
  tokenType: String
)

object OauthAccessTokenResponse {
  implicit lazy val oauthAccessTokenResponseJsonFormat: Format[OauthAccessTokenResponse] = Json.format[OauthAccessTokenResponse]

  // noinspection TypeAnnotation
  object ResponseType extends Enumeration {
    val AuthorizationCode = Value("authorization_code")
    val RefreshToken = Value("refresh_token")
    val ClientCredentials = Value("client_credentials")

    type ResponseType = Value
    implicit lazy val ResponseTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

