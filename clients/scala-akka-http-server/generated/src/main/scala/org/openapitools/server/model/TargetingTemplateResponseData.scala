package org.openapitools.server.model


/**
 * @param name targeting template name for example: ''Gaming''
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. for example: ''null''
 * @param targetingAttributes  for example: ''null''
 * @param placementGroup  for example: ''null''
 * @param keywords  for example: ''[{value=cats, match_type=EXACT_NEGATIVE}]''
 * @param trackingUrls  for example: ''null''
 * @param id Targeting template ID. for example: ''643''
 * @param createdTime Targeting template created time. Unix timestamp in seconds. for example: ''1432744744''
 * @param updatedTime Targeting template updated time.Unix timestamp in seconds. for example: ''1432744744''
 * @param adAccountId The ID of the advertiser that this targeting template belongs to. for example: ''549755885175''
 * @param status Indicate targeting template is active or Deleted for example: ''ACTIVE''
 * @param sizing  for example: ''null''
*/
final case class TargetingTemplateResponseData (
  name: Option[String] = None,
  autoTargetingEnabled: Option[Boolean] = None,
  targetingAttributes: Option[TargetingSpec] = None,
  placementGroup: Option[PlacementGroupType] = None,
  keywords: Option[Seq[TargetingTemplateKeyword]] = None,
  trackingUrls: Option[TrackingUrls] = None,
  id: Option[String] = None,
  createdTime: Option[Int] = None,
  updatedTime: Option[Int] = None,
  adAccountId: Option[String] = None,
  status: Option[String] = None,
  sizing: Option[TargetingTemplateAudienceSizing] = None
)

