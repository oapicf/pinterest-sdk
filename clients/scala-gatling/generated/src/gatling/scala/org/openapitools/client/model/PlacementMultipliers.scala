
package org.openapitools.client.model

import java.util.HashMap

case class PlacementMultipliers (
    /* Placement type identifier. */
    _PLACEMENT: Option[PlacementType]
)
object PlacementMultipliers {
    def toStringBody(var_PLACEMENT: Object) =
        s"""
        | {
        | "PLACEMENT":$var_PLACEMENT
        | }
        """.stripMargin
}
