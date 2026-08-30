package org.openapitools.server.model


/**
 * Bulk campaign delivery estimates response.
 *
 * @param data Per-campaign delivery estimate results, in the same order as the request. for example: ''null''
*/
final case class BulkCampaignDeliveryEstimatesResponse (
  data: Seq[BulkCampaignDeliveryEstimatesItem]
)

