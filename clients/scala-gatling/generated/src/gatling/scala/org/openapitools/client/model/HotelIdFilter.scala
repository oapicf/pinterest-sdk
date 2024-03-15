
package org.openapitools.client.model


case class HotelIdFilter (
    _HOTEL_ID: CatalogsProductGroupMultipleStringCriteria
)
object HotelIdFilter {
    def toStringBody(var_HOTEL_ID: Object) =
        s"""
        | {
        | "HOTEL_ID":$var_HOTEL_ID
        | }
        """.stripMargin
}
