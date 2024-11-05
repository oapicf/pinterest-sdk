
package org.openapitools.client.model


case class ItemResponse (
    _catalogType: CatalogsType,
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String],
    /* The pins mapped to the item */
    _pins: Option[List[Pin]],
    _attributes: Option[CatalogsCreativeAssetsAttributes],
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String],
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: Option[String],
    /* Array with the errors for the item id requested */
    _errors: Option[List[ItemValidationEvent]]
)
object ItemResponse {
    def toStringBody(var_catalogType: Object, var_itemId: Object, var_pins: Object, var_attributes: Object, var_hotelId: Object, var_creativeAssetsId: Object, var_errors: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"itemId":$var_itemId,"pins":$var_pins,"attributes":$var_attributes,"hotelId":$var_hotelId,"creativeAssetsId":$var_creativeAssetsId,"errors":$var_errors
        | }
        """.stripMargin
}
