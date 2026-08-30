
package org.openapitools.client.model

import java.util.HashMap

case class GenderMultipliers (
    /* Gender identifier. */
    _GENDER: Option[TargetingSpecGender]
)
object GenderMultipliers {
    def toStringBody(var_GENDER: Object) =
        s"""
        | {
        | "GENDER":$var_GENDER
        | }
        """.stripMargin
}
