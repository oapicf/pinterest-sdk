
package org.openapitools.client.model

import java.time.LocalDate

case class ProductGroupAnalyticsItems (
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    _DATE: Option[LocalDate],
    /* The ID of the product group that this metrics belongs to. */
    _PRODUCT_GROUP_ID: String
)
object ProductGroupAnalyticsItems {
    def toStringBody(var_DATE: Object, var_PRODUCT_GROUP_ID: Object) =
        s"""
        | {
        | "DATE":$var_DATE,"PRODUCT_GROUP_ID":$var_PRODUCT_GROUP_ID
        | }
        """.stripMargin
}
