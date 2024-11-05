
package org.openapitools.client.model

import java.util.HashMap

case class PlacementMultipliers (
    _PLACEMENT: Option[String]
)
object PlacementMultipliers {
    def toStringBody(var_PLACEMENT: Object) =
        s"""
        | {
        | "PLACEMENT":$var_PLACEMENT
        | }
        """.stripMargin
}
