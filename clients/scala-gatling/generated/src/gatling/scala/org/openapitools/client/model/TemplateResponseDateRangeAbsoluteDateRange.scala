
package org.openapitools.client.model


case class TemplateResponseDateRangeAbsoluteDateRange (
    /* The end date of the date range */
    _endDate: Option[Number],
    /* The start date of the date range */
    _startDate: Option[Number],
    /* The date range type */
    _type: Option[String]
)
object TemplateResponseDateRangeAbsoluteDateRange {
    def toStringBody(var_endDate: Object, var_startDate: Object, var_type: Object) =
        s"""
        | {
        | "endDate":$var_endDate,"startDate":$var_startDate,"type":$var_type
        | }
        """.stripMargin
}
