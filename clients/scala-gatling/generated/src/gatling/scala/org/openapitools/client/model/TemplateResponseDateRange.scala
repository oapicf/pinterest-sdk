
package org.openapitools.client.model


case class TemplateResponseDateRange (
    _absoluteDateRange: Option[TemplateResponseDateRangeAbsoluteDateRange],
    _dynamicDateRange: Option[TemplateResponseDateRangeDynamicDateRange],
    _relativeDateRange: Option[TemplateResponseDateRangeRelativeDateRange]
)
object TemplateResponseDateRange {
    def toStringBody(var_absoluteDateRange: Object, var_dynamicDateRange: Object, var_relativeDateRange: Object) =
        s"""
        | {
        | "absoluteDateRange":$var_absoluteDateRange,"dynamicDateRange":$var_dynamicDateRange,"relativeDateRange":$var_relativeDateRange
        | }
        """.stripMargin
}
