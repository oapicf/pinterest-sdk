
package org.openapitools.client.model


case class CampaignUpdateResponse (
    _items: Option[List[CampaignCreateResponseItem]]
)
object CampaignUpdateResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
