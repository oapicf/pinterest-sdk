
package org.openapitools.client.model


case class CampaignCreateResponse (
    _items: Option[List[CampaignCreateResponseItem]]
)
object CampaignCreateResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
