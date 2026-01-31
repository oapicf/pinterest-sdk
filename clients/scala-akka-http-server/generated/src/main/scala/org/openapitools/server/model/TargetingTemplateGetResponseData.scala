package org.openapitools.server.model


/**
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. for example: ''null''
 * @param keywords  for example: ''[{value=cats, match_type=EXACT_NEGATIVE}]''
 * @param name targeting template name for example: ''Gaming''
 * @param placementGroup  for example: ''null''
 * @param targetingAttributes  for example: ''null''
 * @param trackingUrls  for example: ''null''
 * @param adAccountId The ID of the advertiser that this targeting template belongs to. for example: ''549755885175''
 * @param createdTime Targeting template created time. Unix timestamp in seconds. for example: ''1432744744''
 * @param id Targeting template ID. for example: ''643''
 * @param sizing  for example: ''null''
 * @param status Indicate targeting template is active or Deleted for example: ''ACTIVE''
 * @param updatedTime Targeting template updated time.Unix timestamp in seconds. for example: ''1432744744''
 * @param valid Inform if the targeting template is valid (ex. would be false if has revoked audience) for example: ''true''
*/
final case class TargetingTemplateGetResponseData (
  autoTargetingEnabled: Option[Boolean] = None,
  keywords: Option[Seq[TargetingTemplateKeyword]] = None,
  name: Option[String] = None,
  placementGroup: Option[PlacementGroupType] = None,
  targetingAttributes: Option[TargetingSpec] = None,
  trackingUrls: Option[TrackingUrls] = None,
  adAccountId: Option[String] = None,
  createdTime: Option[Int] = None,
  id: Option[String] = None,
  sizing: Option[TargetingTemplateAudienceSizing] = None,
  status: Option[String] = None,
  updatedTime: Option[Int] = None,
  valid: Option[Boolean] = None
)

