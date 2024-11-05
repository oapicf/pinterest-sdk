
package org.openapitools.client.model


case class CatalogsCreativeAssetsBatchItem (
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: String,
    _operation: String,
    _attributes: CatalogsUpdatableCreativeAssetsAttributes
)
object CatalogsCreativeAssetsBatchItem {
    def toStringBody(var_creativeAssetsId: Object, var_operation: Object, var_attributes: Object) =
        s"""
        | {
        | "creativeAssetsId":$var_creativeAssetsId,"operation":$var_operation,"attributes":$var_attributes
        | }
        """.stripMargin
}
