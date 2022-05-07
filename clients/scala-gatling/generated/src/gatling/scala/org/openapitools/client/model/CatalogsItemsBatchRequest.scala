
package org.openapitools.client.model


case class CatalogsItemsBatchRequest (
    _country: Option[Country],
    _language: Option[Language],
    _operation: Option[BatchOperation],
    /* Array with catalogs items */
    _items: Option[List[ItemBatchRecord]]
)
object CatalogsItemsBatchRequest {
    def toStringBody(var_country: Object, var_language: Object, var_operation: Object, var_items: Object) =
        s"""
        | {
        | "country":$var_country,"language":$var_language,"operation":$var_operation,"items":$var_items
        | }
        """.stripMargin
}
