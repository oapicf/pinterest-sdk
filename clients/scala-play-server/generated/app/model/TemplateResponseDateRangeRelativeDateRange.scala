package model

import play.api.libs.json._

/**
  * The relative date range of the template
  * @param `type` The date range type
  * @param startDaysInPast The start date of the date range
  * @param endDaysInPast The end date of the date range
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TemplateResponseDateRangeRelativeDateRange(
  `type`: Option[String],
  startDaysInPast: Option[BigDecimal],
  endDaysInPast: Option[BigDecimal]
)

object TemplateResponseDateRangeRelativeDateRange {
  implicit lazy val templateResponseDateRangeRelativeDateRangeJsonFormat: Format[TemplateResponseDateRangeRelativeDateRange] = Json.format[TemplateResponseDateRangeRelativeDateRange]
}

