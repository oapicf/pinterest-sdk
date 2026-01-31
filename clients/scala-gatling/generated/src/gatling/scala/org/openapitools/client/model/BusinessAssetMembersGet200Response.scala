
package org.openapitools.client.model


case class BusinessAssetMembersGet200Response (
    _bookmark: Option[String],
    /* List of members with permissions to the asset. */
    _items: List[UserSingleAssetBinding]
)
object BusinessAssetMembersGet200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
