
package org.openapitools.client.model


case class CatalogsRetailItemsPostFilter (
    _catalogType: String,
    _itemIds: List[String],
    /* Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog */
    _catalogId: Option[String]
)
object CatalogsRetailItemsPostFilter {
    def toStringBody(var_catalogType: Object, var_itemIds: Object, var_catalogId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"itemIds":$var_itemIds,"catalogId":$var_catalogId
        | }
        """.stripMargin
}
