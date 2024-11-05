
package org.openapitools.client.model


case class CatalogsItemsFilters (
    _catalogType: CatalogsType,
    _itemIds: List[String],
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    _catalogId: Option[String],
    _hotelIds: List[String],
    _creativeAssetsIds: List[String]
)
object CatalogsItemsFilters {
    def toStringBody(var_catalogType: Object, var_itemIds: Object, var_catalogId: Object, var_hotelIds: Object, var_creativeAssetsIds: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"itemIds":$var_itemIds,"catalogId":$var_catalogId,"hotelIds":$var_hotelIds,"creativeAssetsIds":$var_creativeAssetsIds
        | }
        """.stripMargin
}
