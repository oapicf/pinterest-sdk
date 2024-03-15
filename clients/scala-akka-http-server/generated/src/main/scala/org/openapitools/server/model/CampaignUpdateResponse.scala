package org.openapitools.server.model


/**
 * @param items  for example: ''null''
*/
final case class CampaignUpdateResponse (
  items: Option[Seq[CampaignCreateResponseItem]] = None
)

