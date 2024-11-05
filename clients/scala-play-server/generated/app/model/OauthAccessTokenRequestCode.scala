package model

import play.api.libs.json._

/**
  * A request to exchange an authorization code for an access token.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class OauthAccessTokenRequestCode(
  grantType: OauthAccessTokenRequestCode.GrantType.Value,
  code: String,
  redirectUri: String
)

object OauthAccessTokenRequestCode {
  implicit lazy val oauthAccessTokenRequestCodeJsonFormat: Format[OauthAccessTokenRequestCode] = Json.format[OauthAccessTokenRequestCode]

  // noinspection TypeAnnotation
  object GrantType extends Enumeration {
    val AuthorizationCode = Value("authorization_code")
    val RefreshToken = Value("refresh_token")
    val ClientCredentials = Value("client_credentials")

    type GrantType = Value
    implicit lazy val GrantTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

