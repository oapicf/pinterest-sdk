
package org.openapitools.client.model


case class CatalogsUpdateCreativeAssetsItem (
    /* The catalog creative assets item id in the merchant namespace */
    _creativeAssetsId: String,
    _operation: String,
    _attributes: CatalogsUpdatableCreativeAssetsAttributes
)
object CatalogsUpdateCreativeAssetsItem {
    def toStringBody(var_creativeAssetsId: Object, var_operation: Object, var_attributes: Object) =
        s"""
        | {
        | "creativeAssetsId":$var_creativeAssetsId,"operation":$var_operation,"attributes":$var_attributes
        | }
        """.stripMargin
}
