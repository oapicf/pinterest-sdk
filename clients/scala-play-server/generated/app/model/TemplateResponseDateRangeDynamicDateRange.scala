package model

import play.api.libs.json._

/**
  * The dynamic date range of the template
  * @param range The dynamic range type
  * @param `type` The date range type
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TemplateResponseDateRangeDynamicDateRange(
  range: Option[TemplateResponseDateRangeDynamicDateRange.Range.Value],
  `type`: Option[String]
)

object TemplateResponseDateRangeDynamicDateRange {
  implicit lazy val templateResponseDateRangeDynamicDateRangeJsonFormat: Format[TemplateResponseDateRangeDynamicDateRange] = Json.format[TemplateResponseDateRangeDynamicDateRange]

  // noinspection TypeAnnotation
  object Range extends Enumeration {
    val YEARTODATE = Value("YEAR_TO_DATE")
    val QUARTERTODATE = Value("QUARTER_TO_DATE")
    val MONTHTODATE = Value("MONTH_TO_DATE")
    val LASTMONTH = Value("LAST_MONTH")
    val LASTQUARTER = Value("LAST_QUARTER")

    type Range = Value
    implicit lazy val RangeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

