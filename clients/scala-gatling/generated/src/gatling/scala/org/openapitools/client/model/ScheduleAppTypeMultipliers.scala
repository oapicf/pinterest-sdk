
package org.openapitools.client.model

import java.util.HashMap

case class ScheduleAppTypeMultipliers (
    _APP_TYPE: Option[TargetingSpecAppType]
)
object ScheduleAppTypeMultipliers {
    def toStringBody(var_APP_TYPE: Object) =
        s"""
        | {
        | "APP_TYPE":$var_APP_TYPE
        | }
        """.stripMargin
}
