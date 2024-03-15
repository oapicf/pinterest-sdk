
package org.openapitools.client.model


case class TemplateResponseDateRangeDynamicDateRange (
    /* The date range type */
    _type: Option[String],
    /* The dynamic range type */
    _range: Option[String]
)
object TemplateResponseDateRangeDynamicDateRange {
    def toStringBody(var_type: Object, var_range: Object) =
        s"""
        | {
        | "type":$var_type,"range":$var_range
        | }
        """.stripMargin
}
