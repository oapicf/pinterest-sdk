package model

import play.api.libs.json._

/**
  * A request to exchange an authorization code for an access token.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
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

    type GrantType = Value
    implicit lazy val GrantTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

