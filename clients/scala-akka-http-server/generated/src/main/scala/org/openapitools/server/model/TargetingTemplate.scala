package org.openapitools.server.model


/**
 * @param adAccountId The ID of the advertiser that this targeting template belongs to. for example: ''null''
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). for example: ''null''
 * @param createdTime Targeting template created time. Unix timestamp in seconds. for example: ''null''
 * @param id Targeting template ID. for example: ''null''
 * @param keywords  for example: ''null''
 * @param name targeting template name for example: ''null''
 * @param placementGroup  for example: ''null''
 * @param sizing  for example: ''null''
 * @param status Indicate targeting template is active or Deleted for example: ''null''
 * @param targetingAttributes targeting profile attributes for example: ''null''
 * @param trackingUrls  for example: ''null''
 * @param updatedTime Targeting template updated time.Unix timestamp in seconds. for example: ''null''
 * @param valid Inform if the targeting template is valid (ex. would be false if has revoked audience) for example: ''null''
*/
final case class TargetingTemplate (
  adAccountId: Option[String] = None,
  autoTargetingEnabled: Option[Boolean] = None,
  createdTime: Option[Int] = None,
  id: Option[String] = None,
  keywords: Option[Seq[TargetingTemplateKeyword]] = None,
  name: String,
  placementGroup: Option[PlacementGroupType] = None,
  sizing: Option[TargetingTemplateAudienceSizing] = None,
  status: Option[TargetingTemplateStatus] = None,
  targetingAttributes: TargetingSpecOptimal,
  trackingUrls: Option[TrackingUrls] = None,
  updatedTime: Option[Int] = None,
  valid: Option[Boolean] = None
)

