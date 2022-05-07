package org.openapitools.server.model


/**
 * @param id Campaign ID. for example: ''549755885175''
 * @param adAccountId Campaign's Advertiser ID. for example: ''549755885175''
 * @param name Campaign name. for example: ''ACME Tools''
 * @param status  for example: ''null''
 * @param lifetimeSpendCap Campaign total spending cap. for example: ''1432744744''
 * @param dailySpendCap Campaign daily spending cap. for example: ''1432744744''
 * @param orderLineId Order line ID that appears on the invoice. for example: ''549755885175''
 * @param trackingUrls  for example: ''null''
 * @param startTime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. for example: ''1580865126''
 * @param endTime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. for example: ''1644023526''
 * @param objectiveType  for example: ''null''
 * @param createdTime Campaign creation time. Unix timestamp in seconds. for example: ''1432744744''
 * @param updatedTime UTC timestamp. Last update time. for example: ''1432744744''
 * @param `type` Always \"campaign\". for example: ''campaign''
*/
final case class CampaignResponse (
  id: String,
  adAccountId: String,
  name: Option[String],
  status: Option[EntityStatus],
  lifetimeSpendCap: Option[Int],
  dailySpendCap: Option[Int],
  orderLineId: Option[String],
  trackingUrls: Option[TrackingUrls],
  startTime: Option[Int],
  endTime: Option[Int],
  objectiveType: Option[ObjectiveType],
  createdTime: Option[Int],
  updatedTime: Option[Int],
  `type`: Option[String]
)

