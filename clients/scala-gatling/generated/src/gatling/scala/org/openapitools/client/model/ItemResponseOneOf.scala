
package org.openapitools.client.model


case class ItemResponseOneOf (
    _catalogType: CatalogsType,
    _attributes: Option[CatalogsCreativeAssetsAttributes],
    /* The catalog retail item id in the merchant namespace */
    _itemId: Option[String],
    /* The pins mapped to the item */
    _pins: Option[List[Pin]],
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String],
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: Option[String]
)
object ItemResponseOneOf {
    def toStringBody(var_catalogType: Object, var_attributes: Object, var_itemId: Object, var_pins: Object, var_hotelId: Object, var_creativeAssetsId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"attributes":$var_attributes,"itemId":$var_itemId,"pins":$var_pins,"hotelId":$var_hotelId,"creativeAssetsId":$var_creativeAssetsId
        | }
        """.stripMargin
}
