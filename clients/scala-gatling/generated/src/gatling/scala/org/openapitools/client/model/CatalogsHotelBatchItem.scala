
package org.openapitools.client.model


case class CatalogsHotelBatchItem (
    _attributes: CatalogsUpdatableHotelAttributes,
    /* The catalog hotel id in the merchant namespace */
    _hotelId: String,
    _operation: String
)
object CatalogsHotelBatchItem {
    def toStringBody(var_attributes: Object, var_hotelId: Object, var_operation: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"hotelId":$var_hotelId,"operation":$var_operation
        | }
        """.stripMargin
}
