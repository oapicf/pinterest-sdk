package model

import play.api.libs.json._

/**
  * The type of OAuth grant being requested.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TokenGrantType(
)

object TokenGrantType {
  implicit lazy val tokenGrantTypeJsonFormat: Format[TokenGrantType] = Json.format[TokenGrantType]
}

