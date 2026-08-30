
package org.openapitools.client.model

import java.util.HashMap

case class ScheduleBidOptionsGenderMultipliers (
    _GENDER: Option[TargetingSpecGender]
)
object ScheduleBidOptionsGenderMultipliers {
    def toStringBody(var_GENDER: Object) =
        s"""
        | {
        | "GENDER":$var_GENDER
        | }
        """.stripMargin
}
