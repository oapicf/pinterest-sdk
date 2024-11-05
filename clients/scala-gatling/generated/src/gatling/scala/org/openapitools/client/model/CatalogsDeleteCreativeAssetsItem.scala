
package org.openapitools.client.model


case class CatalogsDeleteCreativeAssetsItem (
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: String,
    _operation: String
)
object CatalogsDeleteCreativeAssetsItem {
    def toStringBody(var_creativeAssetsId: Object, var_operation: Object) =
        s"""
        | {
        | "creativeAssetsId":$var_creativeAssetsId,"operation":$var_operation
        | }
        """.stripMargin
}
