package model

import play.api.libs.json._

/**
  * Gender category for trends demographic distribution.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TrendsGenderFilter(
)

object TrendsGenderFilter {
  implicit lazy val trendsGenderFilterJsonFormat: Format[TrendsGenderFilter] = Json.format[TrendsGenderFilter]
}

