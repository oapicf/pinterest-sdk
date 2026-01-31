
package org.openapitools.client.model


case class CatalogsItemsCreateBatchRequest (
    _country: Country,
    /* Array with catalogs items */
    _items: List[ItemCreateBatchRecord],
    /* We recommend using the CatalogsLocale values. */
    _language: String,
    _operation: BatchOperation
)
object CatalogsItemsCreateBatchRequest {
    def toStringBody(var_country: Object, var_items: Object, var_language: Object, var_operation: Object) =
        s"""
        | {
        | "country":$var_country,"items":$var_items,"language":$var_language,"operation":$var_operation
        | }
        """.stripMargin
}
