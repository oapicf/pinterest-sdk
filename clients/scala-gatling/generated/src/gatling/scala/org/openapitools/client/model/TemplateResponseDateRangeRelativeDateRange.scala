
package org.openapitools.client.model


case class TemplateResponseDateRangeRelativeDateRange (
    /* The date range type */
    _type: Option[String],
    /* The start date of the date range */
    _startDaysInPast: Option[Number],
    /* The end date of the date range */
    _endDaysInPast: Option[Number]
)
object TemplateResponseDateRangeRelativeDateRange {
    def toStringBody(var_type: Object, var_startDaysInPast: Object, var_endDaysInPast: Object) =
        s"""
        | {
        | "type":$var_type,"startDaysInPast":$var_startDaysInPast,"endDaysInPast":$var_endDaysInPast
        | }
        """.stripMargin
}
