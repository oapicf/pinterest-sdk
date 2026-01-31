
package org.openapitools.client.model


case class BusinessPartnerAssetAccessGet200Response (
    _bookmark: Option[String],
    /* List assets on which you granted access to your partner or assets on which your partner has granted you access. */
    _items: List[GetPartnerAssetsResponse]
)
object BusinessPartnerAssetAccessGet200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
