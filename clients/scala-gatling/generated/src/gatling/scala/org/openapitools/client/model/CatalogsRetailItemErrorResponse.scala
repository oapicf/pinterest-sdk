
package org.openapitools.client.model


case class CatalogsRetailItemErrorResponse (
    _catalogType: CatalogsType,
    /* Array with the errors for the item id requested */
    _errors: List[ItemValidationEvent],
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String]
)
object CatalogsRetailItemErrorResponse {
    def toStringBody(var_catalogType: Object, var_errors: Object, var_itemId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"errors":$var_errors,"itemId":$var_itemId
        | }
        """.stripMargin
}
