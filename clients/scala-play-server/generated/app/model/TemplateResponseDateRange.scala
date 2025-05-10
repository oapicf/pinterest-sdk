package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TemplateResponse_date_range.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class TemplateResponseDateRange(
  dynamicDateRange: Option[TemplateResponseDateRangeDynamicDateRange],
  relativeDateRange: Option[TemplateResponseDateRangeRelativeDateRange],
  absoluteDateRange: Option[TemplateResponseDateRangeAbsoluteDateRange]
)

object TemplateResponseDateRange {
  implicit lazy val templateResponseDateRangeJsonFormat: Format[TemplateResponseDateRange] = Json.format[TemplateResponseDateRange]
}

