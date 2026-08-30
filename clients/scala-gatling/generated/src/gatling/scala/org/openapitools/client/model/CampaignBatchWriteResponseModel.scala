
package org.openapitools.client.model


case class CampaignBatchWriteResponseModel (
    _items: List[CampaignBatchItem]
)
object CampaignBatchWriteResponseModel {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
