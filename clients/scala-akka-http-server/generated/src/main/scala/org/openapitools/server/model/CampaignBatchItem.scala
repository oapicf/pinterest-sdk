package org.openapitools.server.model


/**
 * Item in a batch campaign response.
 *
 * @param data Campaign data on success. for example: ''null''
 * @param exceptions Exceptions on failure. for example: ''null''
*/
final case class CampaignBatchItem (
  data: Option[CampaignBatchResponseData] = None,
  exceptions: Option[Seq[Exception]] = None
)

