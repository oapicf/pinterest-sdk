
package org.openapitools.client.model


case class CatalogsHotelItemErrorResponse (
    _catalogType: CatalogsType,
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String],
    /* Array with the errors for the item id requested */
    _errors: Option[List[ItemValidationEvent]]
)
object CatalogsHotelItemErrorResponse {
    def toStringBody(var_catalogType: Object, var_hotelId: Object, var_errors: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"hotelId":$var_hotelId,"errors":$var_errors
        | }
        """.stripMargin
}
