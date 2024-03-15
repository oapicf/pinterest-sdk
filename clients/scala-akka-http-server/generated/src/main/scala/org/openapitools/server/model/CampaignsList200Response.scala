package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class CampaignsList200Response (
  items: Seq[CampaignResponse],
  bookmark: Option[String] = None
)

