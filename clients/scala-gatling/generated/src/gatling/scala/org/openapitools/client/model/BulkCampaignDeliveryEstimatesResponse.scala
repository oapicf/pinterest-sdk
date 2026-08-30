
package org.openapitools.client.model


case class BulkCampaignDeliveryEstimatesResponse (
    /* Per-campaign delivery estimate results, in the same order as the request. */
    _data: List[BulkCampaignDeliveryEstimatesItem]
)
object BulkCampaignDeliveryEstimatesResponse {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
