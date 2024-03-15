
package org.openapitools.client.model


case class CatalogsItemsUpdateBatchRequest (
    _country: Country,
    _language: Language,
    _operation: BatchOperation,
    /* Array with catalogs items */
    _items: List[ItemUpdateBatchRecord]
)
object CatalogsItemsUpdateBatchRequest {
    def toStringBody(var_country: Object, var_language: Object, var_operation: Object, var_items: Object) =
        s"""
        | {
        | "country":$var_country,"language":$var_language,"operation":$var_operation,"items":$var_items
        | }
        """.stripMargin
}
