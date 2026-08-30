
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductGroupCreateRequest (
    /* Catalog ID pertaining to the product group. */
    _catalogId: String,
    _catalogType: String,
    _description: Option[String],
    _filters: CatalogsCreativeAssetsProductGroupFilters,
    _name: String
)
object CatalogsCreativeAssetsProductGroupCreateRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_description: Object, var_filters: Object, var_name: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"description":$var_description,"filters":$var_filters,"name":$var_name
        | }
        """.stripMargin
}
