package model

import play.api.libs.json._

/**
  * The type of token to revoke.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TokenTypeHint(
)

object TokenTypeHint {
  implicit lazy val tokenTypeHintJsonFormat: Format[TokenTypeHint] = Json.format[TokenTypeHint]
}

