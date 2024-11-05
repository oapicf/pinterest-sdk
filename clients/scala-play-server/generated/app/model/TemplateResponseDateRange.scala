package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TemplateResponse_date_range.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TemplateResponseDateRange(
  dynamicDateRange: Option[TemplateResponseDateRangeDynamicDateRange],
  relativeDateRange: Option[TemplateResponseDateRangeRelativeDateRange],
  absoluteDateRange: Option[TemplateResponseDateRangeAbsoluteDateRange]
)

object TemplateResponseDateRange {
  implicit lazy val templateResponseDateRangeJsonFormat: Format[TemplateResponseDateRange] = Json.format[TemplateResponseDateRange]
}

