package model

import play.api.libs.json._

/**
  * A successful OAuth access token response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class OauthAccessTokenResponse(
  responseType: Option[OauthAccessTokenResponse.ResponseType.Value],
  accessToken: String,
  tokenType: String,
  expiresIn: Int,
  scope: String
)

object OauthAccessTokenResponse {
  implicit lazy val oauthAccessTokenResponseJsonFormat: Format[OauthAccessTokenResponse] = Json.format[OauthAccessTokenResponse]

  // noinspection TypeAnnotation
  object ResponseType extends Enumeration {
    val AuthorizationCode = Value("authorization_code")
    val RefreshToken = Value("refresh_token")

    type ResponseType = Value
    implicit lazy val ResponseTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

