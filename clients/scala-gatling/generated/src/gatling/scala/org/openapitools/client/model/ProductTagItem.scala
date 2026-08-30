
package org.openapitools.client.model


case class ProductTagItem (
    /* Pin ID of the product pin to tag onto the hero pin. */
    _pinId: String
)
object ProductTagItem {
    def toStringBody(var_pinId: Object) =
        s"""
        | {
        | "pinId":$var_pinId
        | }
        """.stripMargin
}
