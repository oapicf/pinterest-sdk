
package org.openapitools.client.model


case class CatalogsCreativeAssetsProduct (
    _catalogType: String,
    _metadata: CatalogsCreativeAssetsProductMetadata,
    _pin: Pin
)
object CatalogsCreativeAssetsProduct {
    def toStringBody(var_catalogType: Object, var_metadata: Object, var_pin: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"metadata":$var_metadata,"pin":$var_pin
        | }
        """.stripMargin
}
