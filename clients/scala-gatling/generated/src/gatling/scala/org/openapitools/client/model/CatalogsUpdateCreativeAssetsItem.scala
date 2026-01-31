
package org.openapitools.client.model


case class CatalogsUpdateCreativeAssetsItem (
    _attributes: CatalogsUpdatableCreativeAssetsAttributes,
    /* The catalog creative assets item id in the merchant namespace */
    _creativeAssetsId: String,
    _operation: String
)
object CatalogsUpdateCreativeAssetsItem {
    def toStringBody(var_attributes: Object, var_creativeAssetsId: Object, var_operation: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"creativeAssetsId":$var_creativeAssetsId,"operation":$var_operation
        | }
        """.stripMargin
}
