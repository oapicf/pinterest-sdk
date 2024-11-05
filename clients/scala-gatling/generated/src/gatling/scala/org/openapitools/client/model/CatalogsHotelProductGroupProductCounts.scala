
package org.openapitools.client.model


case class CatalogsHotelProductGroupProductCounts (
    _catalogType: String,
    _total: Number
)
object CatalogsHotelProductGroupProductCounts {
    def toStringBody(var_catalogType: Object, var_total: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"total":$var_total
        | }
        """.stripMargin
}
