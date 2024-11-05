
package org.openapitools.client.model


case class CatalogsHotelListProductsByCatalogBasedFilterRequest (
    _catalogType: String,
    /* Catalog id pertaining to the hotel product group. */
    _catalogId: String,
    _filters: CatalogsHotelProductGroupFilters
)
object CatalogsHotelListProductsByCatalogBasedFilterRequest {
    def toStringBody(var_catalogType: Object, var_catalogId: Object, var_filters: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"catalogId":$var_catalogId,"filters":$var_filters
        | }
        """.stripMargin
}
