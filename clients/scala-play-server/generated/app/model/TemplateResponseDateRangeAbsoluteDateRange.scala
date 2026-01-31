package model

import play.api.libs.json._

/**
  * The absolute date range of the template
  * @param endDate The end date of the date range
  * @param startDate The start date of the date range
  * @param `type` The date range type
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TemplateResponseDateRangeAbsoluteDateRange(
  endDate: Option[BigDecimal],
  startDate: Option[BigDecimal],
  `type`: Option[String]
)

object TemplateResponseDateRangeAbsoluteDateRange {
  implicit lazy val templateResponseDateRangeAbsoluteDateRangeJsonFormat: Format[TemplateResponseDateRangeAbsoluteDateRange] = Json.format[TemplateResponseDateRangeAbsoluteDateRange]
}

