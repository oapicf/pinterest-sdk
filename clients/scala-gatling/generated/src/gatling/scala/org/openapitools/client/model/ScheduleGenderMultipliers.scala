
package org.openapitools.client.model

import java.util.HashMap

case class ScheduleGenderMultipliers (
    _GENDER: Option[TargetingSpecGender]
)
object ScheduleGenderMultipliers {
    def toStringBody(var_GENDER: Object) =
        s"""
        | {
        | "GENDER":$var_GENDER
        | }
        """.stripMargin
}
