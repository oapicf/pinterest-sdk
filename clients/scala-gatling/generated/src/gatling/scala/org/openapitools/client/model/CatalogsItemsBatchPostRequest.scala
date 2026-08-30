
package org.openapitools.client.model


case class CatalogsItemsBatchPostRequest (
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    _catalogId: Option[String],
    _catalogType: String,
    _country: Country,
    /* Array with catalogs items */
    _items: List[ItemDeleteBatchRecord],
    /* We recommend using the CatalogsLocale values. */
    _language: String,
    _operation: String
)
object CatalogsItemsBatchPostRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_country: Object, var_items: Object, var_language: Object, var_operation: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"items":$var_items,"language":$var_language,"operation":$var_operation
        | }
        """.stripMargin
}
