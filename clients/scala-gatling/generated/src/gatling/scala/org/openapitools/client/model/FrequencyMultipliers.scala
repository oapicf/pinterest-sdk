
package org.openapitools.client.model

import java.util.HashMap

case class FrequencyMultipliers (
    /* Impression count identifier. */
    _IMPRESSION_COUNT: Option[String]
)
object FrequencyMultipliers {
    def toStringBody(var_IMPRESSION_COUNT: Object) =
        s"""
        | {
        | "IMPRESSION_COUNT":$var_IMPRESSION_COUNT
        | }
        """.stripMargin
}
