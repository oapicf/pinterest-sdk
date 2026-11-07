package model

import play.api.libs.json._

/**
  * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AttributionMatchType(
)

object AttributionMatchType {
  implicit lazy val attributionMatchTypeJsonFormat: Format[AttributionMatchType] = Json.format[AttributionMatchType]
}

