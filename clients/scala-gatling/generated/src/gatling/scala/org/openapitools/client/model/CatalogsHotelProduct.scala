
package org.openapitools.client.model


case class CatalogsHotelProduct (
    _catalogType: String,
    _metadata: CatalogsHotelProductMetadata,
    _pin: Pin
)
object CatalogsHotelProduct {
    def toStringBody(var_catalogType: Object, var_metadata: Object, var_pin: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"metadata":$var_metadata,"pin":$var_pin
        | }
        """.stripMargin
}
