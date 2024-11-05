
package org.openapitools.client.model


case class ItemResponseAnyOf1 (
    _catalogType: CatalogsType,
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String],
    /* Array with the errors for the item id requested */
    _errors: Option[List[ItemValidationEvent]],
    /* The catalog hotel id in the merchant namespace */
    _hotelId: Option[String],
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: Option[String]
)
object ItemResponseAnyOf1 {
    def toStringBody(var_catalogType: Object, var_itemId: Object, var_errors: Object, var_hotelId: Object, var_creativeAssetsId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"itemId":$var_itemId,"errors":$var_errors,"hotelId":$var_hotelId,"creativeAssetsId":$var_creativeAssetsId
        | }
        """.stripMargin
}
