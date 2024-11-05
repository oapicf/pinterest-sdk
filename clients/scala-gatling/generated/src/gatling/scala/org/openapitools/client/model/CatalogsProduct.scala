
package org.openapitools.client.model


case class CatalogsProduct (
    _catalogType: CatalogsType,
    _metadata: CatalogsCreativeAssetsProductMetadata,
    _pin: Pin
)
object CatalogsProduct {
    def toStringBody(var_catalogType: Object, var_metadata: Object, var_pin: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"metadata":$var_metadata,"pin":$var_pin
        | }
        """.stripMargin
}
