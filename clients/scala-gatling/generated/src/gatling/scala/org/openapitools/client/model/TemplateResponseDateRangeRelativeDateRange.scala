
package org.openapitools.client.model


case class TemplateResponseDateRangeRelativeDateRange (
    /* The end date of the date range */
    _endDaysInPast: Option[Number],
    /* The start date of the date range */
    _startDaysInPast: Option[Number],
    /* The date range type */
    _type: Option[String]
)
object TemplateResponseDateRangeRelativeDateRange {
    def toStringBody(var_endDaysInPast: Object, var_startDaysInPast: Object, var_type: Object) =
        s"""
        | {
        | "endDaysInPast":$var_endDaysInPast,"startDaysInPast":$var_startDaysInPast,"type":$var_type
        | }
        """.stripMargin
}
