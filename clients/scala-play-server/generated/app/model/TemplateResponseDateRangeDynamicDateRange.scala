package model

import play.api.libs.json._

/**
  * The dynamic date range of the template
  * @param `type` The date range type
  * @param range The dynamic range type
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

