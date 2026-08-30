
package org.openapitools.client.model


case class CatalogsItemsPostFilters (
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    _catalogId: Option[String],
    _catalogType: String,
    _itemIds: List[String],
    _hotelIds: List[String],
    _creativeAssetsIds: List[String]
)
object CatalogsItemsPostFilters {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_itemIds: Object, var_hotelIds: Object, var_creativeAssetsIds: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"itemIds":$var_itemIds,"hotelIds":$var_hotelIds,"creativeAssetsIds":$var_creativeAssetsIds
        | }
        """.stripMargin
}
