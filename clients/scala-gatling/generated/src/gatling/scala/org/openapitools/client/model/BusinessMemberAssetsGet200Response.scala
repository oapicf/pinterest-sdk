
package org.openapitools.client.model


case class BusinessMemberAssetsGet200Response (
    _bookmark: Option[String],
    /* List asset permissions the given member was granted. */
    _items: List[AssetIdPermissions]
)
object BusinessMemberAssetsGet200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
