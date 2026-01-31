
package org.openapitools.client.model


case class CatalogsHotelItemErrorResponse (
    _catalogType: CatalogsType,
    /* Array with the errors for the item id requested */
    _errors: List[ItemValidationEvent],
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String]
)
object CatalogsHotelItemErrorResponse {
    def toStringBody(var_catalogType: Object, var_errors: Object, var_hotelId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"errors":$var_errors,"hotelId":$var_hotelId
        | }
        """.stripMargin
}
