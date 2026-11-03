package model

import play.api.libs.json._

/**
  * The type of token to revoke.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TokenTypeHint(
)

object TokenTypeHint {
  implicit lazy val tokenTypeHintJsonFormat: Format[TokenTypeHint] = Json.format[TokenTypeHint]
}

