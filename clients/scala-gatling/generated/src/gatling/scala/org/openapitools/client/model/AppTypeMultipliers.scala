
package org.openapitools.client.model

import java.util.HashMap

case class AppTypeMultipliers (
    _APP_TYPE: Option[TargetingSpecAppType]
)
object AppTypeMultipliers {
    def toStringBody(var_APP_TYPE: Object) =
        s"""
        | {
        | "APP_TYPE":$var_APP_TYPE
        | }
        """.stripMargin
}
