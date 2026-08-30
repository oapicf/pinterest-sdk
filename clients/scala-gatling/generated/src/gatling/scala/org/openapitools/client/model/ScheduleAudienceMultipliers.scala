
package org.openapitools.client.model

import java.util.HashMap

case class ScheduleAudienceMultipliers (
    _AUDIENCE_ID: Option[String]
)
object ScheduleAudienceMultipliers {
    def toStringBody(var_AUDIENCE_ID: Object) =
        s"""
        | {
        | "AUDIENCE_ID":$var_AUDIENCE_ID
        | }
        """.stripMargin
}
