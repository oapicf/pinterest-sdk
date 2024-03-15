
package org.openapitools.client.model


case class CatalogsDeleteHotelItem (
    /* The catalog hotel id in the merchant namespace */
    _hotelId: String,
    _operation: String
)
object CatalogsDeleteHotelItem {
    def toStringBody(var_hotelId: Object, var_operation: Object) =
        s"""
        | {
        | "hotelId":$var_hotelId,"operation":$var_operation
        | }
        """.stripMargin
}
