
package org.openapitools.client.model


case class BusinessPartnerAssetAccessGet200Response (
    /* List assets on which you granted access to your partner or assets on which your partner has granted you access. */
    _items: List[GetPartnerAssetsResponse],
    _bookmark: Option[String]
)
object BusinessPartnerAssetAccessGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
