
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductGroupUpdateRequest (
    _catalogType: Option[String],
    _description: Option[String],
    _filters: Option[CatalogsCreativeAssetsProductGroupFilters],
    _name: Option[String]
)
object CatalogsCreativeAssetsProductGroupUpdateRequest {
    def toStringBody(var_catalogType: Object, var_description: Object, var_filters: Object, var_name: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"description":$var_description,"filters":$var_filters,"name":$var_name
        | }
        """.stripMargin
}
