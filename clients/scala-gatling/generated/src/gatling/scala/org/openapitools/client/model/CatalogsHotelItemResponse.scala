
package org.openapitools.client.model


case class CatalogsHotelItemResponse (
    _catalogType: CatalogsType,
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String],
    /* The pins mapped to the item */
    _pins: Option[List[Pin]],
    _attributes: Option[CatalogsHotelAttributes]
)
object CatalogsHotelItemResponse {
    def toStringBody(var_catalogType: Object, var_hotelId: Object, var_pins: Object, var_attributes: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"hotelId":$var_hotelId,"pins":$var_pins,"attributes":$var_attributes
        | }
        """.stripMargin
}
