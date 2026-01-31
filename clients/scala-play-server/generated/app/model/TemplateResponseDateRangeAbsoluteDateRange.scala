package model

import play.api.libs.json._

/**
  * The absolute date range of the template
  * @param `type` The date range type
  * @param startDate The start date of the date range
  * @param endDate The end date of the date range
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TemplateResponseDateRangeAbsoluteDateRange(
  `type`: Option[String],
  startDate: Option[BigDecimal],
  endDate: Option[BigDecimal]
)

object TemplateResponseDateRangeAbsoluteDateRange {
  implicit lazy val templateResponseDateRangeAbsoluteDateRangeJsonFormat: Format[TemplateResponseDateRangeAbsoluteDateRange] = Json.format[TemplateResponseDateRangeAbsoluteDateRange]
}

