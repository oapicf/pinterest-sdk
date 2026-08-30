
package org.openapitools.client.model


case class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest (
    /* Catalog ID pertaining to the product group. */
    _catalogId: String,
    _catalogType: String,
    _filters: CatalogsCreativeAssetsProductGroupFilters
)
object CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_filters: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"filters":$var_filters
        | }
        """.stripMargin
}
