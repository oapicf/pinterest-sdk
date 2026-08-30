
package org.openapitools.client.model


case class CatalogsHotelItemErrorResponse (
    _catalogType: String,
    /* Array with the errors for the item id requested */
    _errors: List[ItemValidationEvent],
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String],
    /* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
    _itemResponseKind: String
)
object CatalogsHotelItemErrorResponse {
    def toStringBody(var_catalogType: Object, var_errors: Object, var_hotelId: Object, var_itemResponseKind: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"errors":$var_errors,"hotelId":$var_hotelId,"itemResponseKind":$var_itemResponseKind
        | }
        """.stripMargin
}
