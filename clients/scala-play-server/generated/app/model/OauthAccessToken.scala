package model

import play.api.libs.json._

/**
  * Describes the valid schema for possible OAuth access token requests.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class OauthAccessToken(
  accessToken: String,
  expiresIn: Int,
  refreshToken: Option[String],
  refreshTokenExpiresAt: Option[Int],
  refreshTokenExpiresIn: Option[Int],
  responseType: Option[TokenGrantType],
  scope: Option[String],
  tokenType: String
)

object OauthAccessToken {
  implicit lazy val oauthAccessTokenJsonFormat: Format[OauthAccessToken] = Json.format[OauthAccessToken]
}

