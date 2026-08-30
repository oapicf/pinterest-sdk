
package org.openapitools.client.model


case class CatalogsCreativeAssetsItemErrorResponse (
    _catalogType: String,
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: Option[String],
    /* Array with the errors for the item id requested */
    _errors: List[ItemValidationEvent],
    /* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
    _itemResponseKind: String
)
object CatalogsCreativeAssetsItemErrorResponse {
    def toStringBody(var_catalogType: Object, var_creativeAssetsId: Object, var_errors: Object, var_itemResponseKind: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"creativeAssetsId":$var_creativeAssetsId,"errors":$var_errors,"itemResponseKind":$var_itemResponseKind
        | }
        """.stripMargin
}
