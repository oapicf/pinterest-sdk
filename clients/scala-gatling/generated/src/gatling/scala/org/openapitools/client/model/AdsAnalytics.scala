
package org.openapitools.client.model

import java.time.LocalDate

case class AdsAnalytics (
    _AD_ID: String,
    _DATE: Option[LocalDate]
)
object AdsAnalytics {
    def toStringBody(var_AD_ID: Object, var_DATE: Object) =
        s"""
        | {
        | "AD_ID":$var_AD_ID,"DATE":$var_DATE
        | }
        """.stripMargin
}
