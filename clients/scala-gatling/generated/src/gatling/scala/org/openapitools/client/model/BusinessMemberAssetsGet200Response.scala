
package org.openapitools.client.model


case class BusinessMemberAssetsGet200Response (
    /* List asset permissions the given member was granted. */
    _items: List[AssetIdPermissions],
    _bookmark: Option[String]
)
object BusinessMemberAssetsGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
