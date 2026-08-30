package model

import play.api.libs.json._

/**
  * Quiz ad tie breaker type, default is RANDOM
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TieBreakerType(
)

object TieBreakerType {
  implicit lazy val tieBreakerTypeJsonFormat: Format[TieBreakerType] = Json.format[TieBreakerType]
}

