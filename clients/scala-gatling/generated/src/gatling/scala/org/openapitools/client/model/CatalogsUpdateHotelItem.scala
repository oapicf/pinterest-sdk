
package org.openapitools.client.model


case class CatalogsUpdateHotelItem (
    /* The catalog hotel item id in the merchant namespace */
    _hotelId: String,
    _operation: String,
    _attributes: CatalogsUpdatableHotelAttributes
)
object CatalogsUpdateHotelItem {
    def toStringBody(var_hotelId: Object, var_operation: Object, var_attributes: Object) =
        s"""
        | {
        | "hotelId":$var_hotelId,"operation":$var_operation,"attributes":$var_attributes
        | }
        """.stripMargin
}
