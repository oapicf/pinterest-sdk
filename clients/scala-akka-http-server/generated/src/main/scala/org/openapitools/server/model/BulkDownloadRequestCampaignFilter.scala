package org.openapitools.server.model


/**
 * @param campaignStatus  for example: ''null''
 * @param endTime Unix UTC timestamp. for example: ''1622848072''
 * @param name Campaign name for example: ''campaign name''
 * @param objectiveType  for example: ''null''
 * @param startTime Unix UTC timestamp. for example: ''1622848072''
*/
final case class BulkDownloadRequestCampaignFilter (
  campaignStatus: Option[Seq[CampaignSummaryStatus]] = None,
  endTime: Option[String] = None,
  name: Option[String] = None,
  objectiveType: Option[Seq[ObjectiveType]] = None,
  startTime: Option[String] = None
)

