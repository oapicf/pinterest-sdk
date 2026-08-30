
package org.openapitools.client.model


case class CatalogsHotelListProductsByCatalogBasedFilterRequest (
    /* Catalog ID pertaining to the product group. */
    _catalogId: String,
    _catalogType: String,
    _filters: CatalogsHotelProductGroupFilters
)
object CatalogsHotelListProductsByCatalogBasedFilterRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_filters: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"filters":$var_filters
        | }
        """.stripMargin
}
