
package org.openapitools.client.model


case class CatalogsCreativeAssetsItemsFilter (
    _catalogType: String,
    _creativeAssetsIds: List[String],
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    _catalogId: Option[String]
)
object CatalogsCreativeAssetsItemsFilter {
    def toStringBody(var_catalogType: Object, var_creativeAssetsIds: Object, var_catalogId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"creativeAssetsIds":$var_creativeAssetsIds,"catalogId":$var_catalogId
        | }
        """.stripMargin
}
