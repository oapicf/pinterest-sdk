
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductMetadata (
    /* The user-created unique ID that represents the creative assets item. */
    _creativeAssetsId: String,
    _visibility: CreativeAssetsVisibilityType
)
object CatalogsCreativeAssetsProductMetadata {
    def toStringBody(var_creativeAssetsId: Object, var_visibility: Object) =
        s"""
        | {
        | "creativeAssetsId":$var_creativeAssetsId,"visibility":$var_visibility
        | }
        """.stripMargin
}
