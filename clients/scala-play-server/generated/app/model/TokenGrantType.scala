package model

import play.api.libs.json._

/**
  * The type of OAuth grant being requested.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TokenGrantType(
)

object TokenGrantType {
  implicit lazy val tokenGrantTypeJsonFormat: Format[TokenGrantType] = Json.format[TokenGrantType]
}

