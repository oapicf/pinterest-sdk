
package org.openapitools.client.model


case class CatalogsHotelItemResponse (
    _attributes: Option[CatalogsHotelAttributes],
    _catalogType: CatalogsType,
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String],
    /* The pins mapped to the item */
    _pins: Option[List[Pin]]
)
object CatalogsHotelItemResponse {
    def toStringBody(var_attributes: Object, var_catalogType: Object, var_hotelId: Object, var_pins: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"catalogType":$var_catalogType,"hotelId":$var_hotelId,"pins":$var_pins
        | }
        """.stripMargin
}
