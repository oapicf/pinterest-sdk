
package org.openapitools.client.model


case class CatalogsCreativeAssetsItemsPostFilter (
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    _catalogId: Option[String],
    _catalogType: String,
    _creativeAssetsIds: List[String]
)
object CatalogsCreativeAssetsItemsPostFilter {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_creativeAssetsIds: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"creativeAssetsIds":$var_creativeAssetsIds
        | }
        """.stripMargin
}
