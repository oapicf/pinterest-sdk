
package org.openapitools.client.model

import java.time.LocalDate
import java.util.HashMap

case class ProductGroupAnalyticsResponseInner (
    /* The ID of the product group that this metrics belongs to. */
    _PRODUCT_GROUP_ID: String,
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    _DATE: Option[LocalDate]
)
object ProductGroupAnalyticsResponseInner {
    def toStringBody(var_PRODUCT_GROUP_ID: Object, var_DATE: Object) =
        s"""
        | {
        | "PRODUCT_GROUP_ID":$var_PRODUCT_GROUP_ID,"DATE":$var_DATE
        | }
        """.stripMargin
}
