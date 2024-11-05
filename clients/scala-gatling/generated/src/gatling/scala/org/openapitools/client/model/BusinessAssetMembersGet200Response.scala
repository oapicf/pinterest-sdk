
package org.openapitools.client.model


case class BusinessAssetMembersGet200Response (
    /* List of members with permissions to the asset. */
    _items: List[UserSingleAssetBinding],
    _bookmark: Option[String]
)
object BusinessAssetMembersGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
