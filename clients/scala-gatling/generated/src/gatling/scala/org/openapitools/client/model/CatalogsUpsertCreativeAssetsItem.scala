
package org.openapitools.client.model


case class CatalogsUpsertCreativeAssetsItem (
    _attributes: CatalogsCreativeAssetsAttributes,
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: String,
    _operation: String
)
object CatalogsUpsertCreativeAssetsItem {
    def toStringBody(var_attributes: Object, var_creativeAssetsId: Object, var_operation: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"creativeAssetsId":$var_creativeAssetsId,"operation":$var_operation
        | }
        """.stripMargin
}
