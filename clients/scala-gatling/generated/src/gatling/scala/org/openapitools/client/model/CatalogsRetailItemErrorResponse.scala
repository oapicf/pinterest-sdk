
package org.openapitools.client.model


case class CatalogsRetailItemErrorResponse (
    _catalogType: CatalogsType,
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String],
    /* Array with the errors for the item id requested */
    _errors: Option[List[ItemValidationEvent]]
)
object CatalogsRetailItemErrorResponse {
    def toStringBody(var_catalogType: Object, var_itemId: Object, var_errors: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"itemId":$var_itemId,"errors":$var_errors
        | }
        """.stripMargin
}
