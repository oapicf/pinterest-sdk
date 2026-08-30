package model

import play.api.libs.json._

/**
  * Gender category for trends demographic distribution.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TrendsGender(
)

object TrendsGender {
  implicit lazy val trendsGenderJsonFormat: Format[TrendsGender] = Json.format[TrendsGender]
}

