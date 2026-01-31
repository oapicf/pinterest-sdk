
package org.openapitools.client.model


case class CatalogsRetailItemsPostFilter (
    /* Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog */
    _catalogId: Option[String],
    _catalogType: String,
    _itemIds: List[String]
)
object CatalogsRetailItemsPostFilter {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_itemIds: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"itemIds":$var_itemIds
        | }
        """.stripMargin
}
