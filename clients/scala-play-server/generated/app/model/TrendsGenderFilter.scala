package model

import play.api.libs.json._

/**
  * Gender category for trends demographic distribution.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TrendsGenderFilter(
)

object TrendsGenderFilter {
  implicit lazy val trendsGenderFilterJsonFormat: Format[TrendsGenderFilter] = Json.format[TrendsGenderFilter]
}

