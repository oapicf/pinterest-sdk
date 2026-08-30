
package org.openapitools.client.model


case class CatalogsHotelItemResponse (
    _attributes: Option[CatalogsHotelAttributes],
    _catalogType: String,
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String],
    /* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
    _itemResponseKind: String,
    /* The pins mapped to the item */
    _pins: Option[List[Pin]]
)
object CatalogsHotelItemResponse {
    def toStringBody(var_attributes: Object, var_catalogType: Object, var_hotelId: Object, var_itemResponseKind: Object, var_pins: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"catalogType":$var_catalogType,"hotelId":$var_hotelId,"itemResponseKind":$var_itemResponseKind,"pins":$var_pins
        | }
        """.stripMargin
}
