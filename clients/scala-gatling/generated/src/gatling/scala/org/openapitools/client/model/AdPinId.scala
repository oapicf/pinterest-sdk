
package org.openapitools.client.model


case class AdPinId (
    /* Pin ID. */
    _pinId: Option[String]
)
object AdPinId {
    def toStringBody(var_pinId: Object) =
        s"""
        | {
        | "pinId":$var_pinId
        | }
        """.stripMargin
}
