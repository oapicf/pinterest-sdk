package model

import play.api.libs.json._

/**
  * The relative date range of the template
  * @param endDaysInPast The end date of the date range
  * @param startDaysInPast The start date of the date range
  * @param `type` The date range type
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TemplateResponseDateRangeRelativeDateRange(
  endDaysInPast: Option[BigDecimal],
  startDaysInPast: Option[BigDecimal],
  `type`: Option[String]
)

object TemplateResponseDateRangeRelativeDateRange {
  implicit lazy val templateResponseDateRangeRelativeDateRangeJsonFormat: Format[TemplateResponseDateRangeRelativeDateRange] = Json.format[TemplateResponseDateRangeRelativeDateRange]
}

