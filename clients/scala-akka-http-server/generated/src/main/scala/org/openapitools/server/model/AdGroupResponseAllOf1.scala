package org.openapitools.server.model


/**
 * @param campaignId Campaign ID of the ad group. for example: ''626736533506''
 * @param billableEvent  for example: ''null''
 * @param id Ad group ID. for example: ''2680060704746''
 * @param `type` Always \"adgroup\". for example: ''null''
 * @param adAccountId Advertiser ID. for example: ''549755885175''
 * @param createdTime Ad group creation time. Unix timestamp in seconds. for example: ''1476477189''
 * @param updatedTime Ad group last update time. Unix timestamp in seconds. for example: ''1476477189''
*/
final case class AdGroupResponseAllOf1 (
  campaignId: Option[String],
  billableEvent: Option[ActionType],
  id: Option[String],
  `type`: Option[String],
  adAccountId: Option[String],
  createdTime: Option[Int],
  updatedTime: Option[Int]
)

