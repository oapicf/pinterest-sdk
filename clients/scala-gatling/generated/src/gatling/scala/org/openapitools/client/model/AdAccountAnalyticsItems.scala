
package org.openapitools.client.model

import java.time.LocalDate

case class AdAccountAnalyticsItems (
    _AD_ACCOUNT_ID: String,
    _DATE: Option[LocalDate]
)
object AdAccountAnalyticsItems {
    def toStringBody(var_AD_ACCOUNT_ID: Object, var_DATE: Object) =
        s"""
        | {
        | "AD_ACCOUNT_ID":$var_AD_ACCOUNT_ID,"DATE":$var_DATE
        | }
        """.stripMargin
}
