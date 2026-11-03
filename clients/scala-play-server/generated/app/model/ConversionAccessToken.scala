package model

import play.api.libs.json._

/**
  * A successful conversion access token response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionAccessToken(
  accessToken: String,
  tokenType: Option[String]
)

object ConversionAccessToken {
  implicit lazy val conversionAccessTokenJsonFormat: Format[ConversionAccessToken] = Json.format[ConversionAccessToken]
}

