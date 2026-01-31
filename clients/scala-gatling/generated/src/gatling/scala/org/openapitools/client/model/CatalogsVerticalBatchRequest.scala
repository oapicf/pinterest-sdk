
package org.openapitools.client.model


case class CatalogsVerticalBatchRequest (
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    _catalogId: Option[String],
    _catalogType: String,
    _country: Country,
    /* Array with creative assets item operations */
    _items: List[CatalogsCreativeAssetsBatchItem],
    /* We recommend using the CatalogsLocale values. */
    _language: String
)
object CatalogsVerticalBatchRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_country: Object, var_items: Object, var_language: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"items":$var_items,"language":$var_language
        | }
        """.stripMargin
}
