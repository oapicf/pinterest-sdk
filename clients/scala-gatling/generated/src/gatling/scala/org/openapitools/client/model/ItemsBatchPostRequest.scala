
package org.openapitools.client.model


case class ItemsBatchPostRequest (
    _catalogType: CatalogsType,
    _country: Country,
    _language: Language,
    /* Array with catalogs items */
    _items: List[ItemDeleteBatchRecord],
    /* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    _catalogId: Option[String],
    _operation: BatchOperation
)
object ItemsBatchPostRequest {
    def toStringBody(var_catalogType: Object, var_country: Object, var_language: Object, var_items: Object, var_catalogId: Object, var_operation: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"country":$var_country,"language":$var_language,"items":$var_items,"catalogId":$var_catalogId,"operation":$var_operation
        | }
        """.stripMargin
}
