
package org.openapitools.client.model


case class BusinessPartnerAssetAccessGet200Response (
    _bookmark: Option[String],
    _items: List[BaseBusinessAssets]
)
object BusinessPartnerAssetAccessGet200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
