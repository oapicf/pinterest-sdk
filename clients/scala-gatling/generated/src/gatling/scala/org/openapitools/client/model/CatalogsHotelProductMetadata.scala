
package org.openapitools.client.model


case class CatalogsHotelProductMetadata (
    /* The user-created unique ID that represents the hotel item. */
    _hotelId: String
)
object CatalogsHotelProductMetadata {
    def toStringBody(var_hotelId: Object) =
        s"""
        | {
        | "hotelId":$var_hotelId
        | }
        """.stripMargin
}
