package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param exceptions  for example: ''null''
*/
final case class CampaignCreateResponseItem (
  data: Option[CampaignCreateResponseData] = None,
  exceptions: Option[Seq[Exception]] = None
)

