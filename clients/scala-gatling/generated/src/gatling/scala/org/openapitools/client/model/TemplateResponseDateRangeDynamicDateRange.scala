
package org.openapitools.client.model


case class TemplateResponseDateRangeDynamicDateRange (
    /* The dynamic range type */
    _range: Option[String],
    /* The date range type */
    _type: Option[String]
)
object TemplateResponseDateRangeDynamicDateRange {
    def toStringBody(var_range: Object, var_type: Object) =
        s"""
        | {
        | "range":$var_range,"type":$var_type
        | }
        """.stripMargin
}
