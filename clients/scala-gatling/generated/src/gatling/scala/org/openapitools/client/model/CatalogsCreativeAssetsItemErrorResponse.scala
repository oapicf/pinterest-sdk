
package org.openapitools.client.model


case class CatalogsCreativeAssetsItemErrorResponse (
    _catalogType: CatalogsType,
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: Option[String],
    /* Array with the errors for the item id requested */
    _errors: Option[List[ItemValidationEvent]]
)
object CatalogsCreativeAssetsItemErrorResponse {
    def toStringBody(var_catalogType: Object, var_creativeAssetsId: Object, var_errors: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"creativeAssetsId":$var_creativeAssetsId,"errors":$var_errors
        | }
        """.stripMargin
}
