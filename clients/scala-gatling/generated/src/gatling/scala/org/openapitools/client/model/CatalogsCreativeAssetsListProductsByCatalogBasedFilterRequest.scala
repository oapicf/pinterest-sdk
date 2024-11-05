
package org.openapitools.client.model


case class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest (
    _catalogType: String,
    /* Catalog id pertaining to the creative assets product group. */
    _catalogId: String,
    _filters: CatalogsCreativeAssetsProductGroupFilters
)
object CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest {
    def toStringBody(var_catalogType: Object, var_catalogId: Object, var_filters: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"catalogId":$var_catalogId,"filters":$var_filters
        | }
        """.stripMargin
}
