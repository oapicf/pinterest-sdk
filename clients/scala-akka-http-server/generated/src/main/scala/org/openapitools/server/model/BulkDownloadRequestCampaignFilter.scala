package org.openapitools.server.model


/**
 * @param startTime Unix UTC timestamp. for example: ''1622848072''
 * @param endTime Unix UTC timestamp. for example: ''1622848072''
 * @param name Campaign name for example: ''campaign name''
 * @param campaignStatus  for example: ''null''
 * @param objectiveType  for example: ''null''
*/
final case class BulkDownloadRequestCampaignFilter (
  startTime: Option[String] = None,
  endTime: Option[String] = None,
  name: Option[String] = None,
  campaignStatus: Option[Seq[CampaignSummaryStatus]] = None,
  objectiveType: Option[Seq[ObjectiveType]] = None
)

