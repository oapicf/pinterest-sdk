
package org.openapitools.client.model


case class AdPreviewCreateFromPin (
    /* Pin ID. */
    _pinId: String
)
object AdPreviewCreateFromPin {
    def toStringBody(var_pinId: Object) =
        s"""
        | {
        | "pinId":$var_pinId
        | }
        """.stripMargin
}
