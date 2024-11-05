
package org.openapitools.client.model


case class CatalogsRetailProduct (
    _catalogType: String,
    _metadata: CatalogsRetailProductMetadata,
    _pin: Pin
)
object CatalogsRetailProduct {
    def toStringBody(var_catalogType: Object, var_metadata: Object, var_pin: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"metadata":$var_metadata,"pin":$var_pin
        | }
        """.stripMargin
}
