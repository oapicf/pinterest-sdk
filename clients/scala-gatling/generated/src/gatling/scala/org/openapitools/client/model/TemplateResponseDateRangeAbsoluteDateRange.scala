
package org.openapitools.client.model


case class TemplateResponseDateRangeAbsoluteDateRange (
    /* The date range type */
    _type: Option[String],
    /* The start date of the date range */
    _startDate: Option[Number],
    /* The end date of the date range */
    _endDate: Option[Number]
)
object TemplateResponseDateRangeAbsoluteDateRange {
    def toStringBody(var_type: Object, var_startDate: Object, var_endDate: Object) =
        s"""
        | {
        | "type":$var_type,"startDate":$var_startDate,"endDate":$var_endDate
        | }
        """.stripMargin
}
