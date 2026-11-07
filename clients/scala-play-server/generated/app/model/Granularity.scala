package model

import play.api.libs.json._

/**
  * Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class Granularity(
)

object Granularity {
  implicit lazy val granularityJsonFormat: Format[Granularity] = Json.format[Granularity]
}

