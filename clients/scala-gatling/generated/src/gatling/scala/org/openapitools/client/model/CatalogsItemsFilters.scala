
package org.openapitools.client.model


case class CatalogsItemsFilters (
    _catalogType: CatalogsType,
    _itemIds: List[String],
    /* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    _catalogId: Option[String],
    _hotelIds: List[String]
)
object CatalogsItemsFilters {
    def toStringBody(var_catalogType: Object, var_itemIds: Object, var_catalogId: Object, var_hotelIds: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"itemIds":$var_itemIds,"catalogId":$var_catalogId,"hotelIds":$var_hotelIds
        | }
        """.stripMargin
}
