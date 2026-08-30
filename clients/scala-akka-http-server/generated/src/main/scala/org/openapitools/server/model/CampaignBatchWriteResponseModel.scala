package org.openapitools.server.model


/**
 * Response model for batch campaign write operations.
 *
 * @param items  for example: ''null''
*/
final case class CampaignBatchWriteResponseModel (
  items: Seq[CampaignBatchItem]
)

