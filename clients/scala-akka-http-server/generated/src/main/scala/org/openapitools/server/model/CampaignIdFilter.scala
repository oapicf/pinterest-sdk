package org.openapitools.server.model


/**
 * @param campaignIds List of campaign ids for example: ''["12345678"]''
*/
final case class CampaignIdFilter (
  campaignIds: Option[Seq[String]] = None
)

