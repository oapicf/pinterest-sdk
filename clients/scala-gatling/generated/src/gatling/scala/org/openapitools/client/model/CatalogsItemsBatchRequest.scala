
package org.openapitools.client.model


case class CatalogsItemsBatchRequest (
    _country: Country,
    /* Array with catalogs items */
    _items: List[ItemDeleteBatchRecord],
    /* We recommend using the CatalogsLocale values. */
    _language: String,
    _operation: String
)
object CatalogsItemsBatchRequest {
    def toStringBody(var_country: Object, var_items: Object, var_language: Object, var_operation: Object) =
        s"""
        | {
        | "country":$var_country,"items":$var_items,"language":$var_language,"operation":$var_operation
        | }
        """.stripMargin
}
