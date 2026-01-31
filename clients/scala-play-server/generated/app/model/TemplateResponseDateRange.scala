package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TemplateResponse_date_range.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TemplateResponseDateRange(
  absoluteDateRange: Option[TemplateResponseDateRangeAbsoluteDateRange],
  dynamicDateRange: Option[TemplateResponseDateRangeDynamicDateRange],
  relativeDateRange: Option[TemplateResponseDateRangeRelativeDateRange]
)

object TemplateResponseDateRange {
  implicit lazy val templateResponseDateRangeJsonFormat: Format[TemplateResponseDateRange] = Json.format[TemplateResponseDateRange]
}

