package model

import play.api.libs.json._

/**
  * The dynamic date range of the template
  * @param `type` The date range type
  * @param range The dynamic range type
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TemplateResponseDateRangeDynamicDateRange(
  `type`: Option[String],
  range: Option[TemplateResponseDateRangeDynamicDateRange.Range.Value]
)

object TemplateResponseDateRangeDynamicDateRange {
  implicit lazy val templateResponseDateRangeDynamicDateRangeJsonFormat: Format[TemplateResponseDateRangeDynamicDateRange] = Json.format[TemplateResponseDateRangeDynamicDateRange]

  // noinspection TypeAnnotation
  object Range extends Enumeration {
    val YEARTODATE = Value("YEAR_TO_DATE")
    val QUARTERTODATE = Value("QUARTER_TO_DATE")
    val MONTHTODATE = Value("MONTH_TO_DATE")
    val LASTMONTH = Value("LAST_MONTH")

    type Range = Value
    implicit lazy val RangeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

