
package org.openapitools.client.model


case class CatalogsCreativeAssetsBatchRequest (
    _catalogType: String,
    _country: Country,
    _language: CatalogsItemsRequestLanguage,
    /* Array with creative assets item operations */
    _items: List[CatalogsCreativeAssetsBatchItem],
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    _catalogId: Option[String]
)
object CatalogsCreativeAssetsBatchRequest {
    def toStringBody(var_catalogType: Object, var_country: Object, var_language: Object, var_items: Object, var_catalogId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"country":$var_country,"language":$var_language,"items":$var_items,"catalogId":$var_catalogId
        | }
        """.stripMargin
}
