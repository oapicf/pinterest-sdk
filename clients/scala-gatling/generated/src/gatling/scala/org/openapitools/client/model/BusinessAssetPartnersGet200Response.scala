
package org.openapitools.client.model


case class BusinessAssetPartnersGet200Response (
    /* List of partners with permissions to the asset. */
    _items: List[UserSingleAssetBinding],
    _bookmark: Option[String]
)
object BusinessAssetPartnersGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
