
package org.openapitools.client.model


case class TemplateResponseDateRange (
    _dynamicDateRange: Option[TemplateResponseDateRangeDynamicDateRange],
    _relativeDateRange: Option[TemplateResponseDateRangeRelativeDateRange],
    _absoluteDateRange: Option[TemplateResponseDateRangeAbsoluteDateRange]
)
object TemplateResponseDateRange {
    def toStringBody(var_dynamicDateRange: Object, var_relativeDateRange: Object, var_absoluteDateRange: Object) =
        s"""
        | {
        | "dynamicDateRange":$var_dynamicDateRange,"relativeDateRange":$var_relativeDateRange,"absoluteDateRange":$var_absoluteDateRange
        | }
        """.stripMargin
}
