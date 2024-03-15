
package org.openapitools.client.model


case class CatalogsProduct (
    _metadata: CatalogsProductMetadata,
    _pin: Pin
)
object CatalogsProduct {
    def toStringBody(var_metadata: Object, var_pin: Object) =
        s"""
        | {
        | "metadata":$var_metadata,"pin":$var_pin
        | }
        """.stripMargin
}
