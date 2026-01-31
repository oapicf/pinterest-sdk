package model

import play.api.libs.json._

/**
  * A successful OAuth client token response for the client token flow.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OauthAccessTokenResponseClientCredentials(
  accessToken: String,
  expiresIn: Int,
  responseType: Option[OauthAccessTokenResponseClientCredentials.ResponseType.Value],
  scope: String,
  tokenType: String
)

object OauthAccessTokenResponseClientCredentials {
  implicit lazy val oauthAccessTokenResponseClientCredentialsJsonFormat: Format[OauthAccessTokenResponseClientCredentials] = Json.format[OauthAccessTokenResponseClientCredentials]

  // noinspection TypeAnnotation
  object ResponseType extends Enumeration {
    val AuthorizationCode = Value("authorization_code")
    val RefreshToken = Value("refresh_token")
    val ClientCredentials = Value("client_credentials")

    type ResponseType = Value
    implicit lazy val ResponseTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

