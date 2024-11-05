package org.openapitools.server.model


/**
 * @param name targeting template name for example: ''Gaming''
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. for example: ''null''
 * @param targetingAttributes  for example: ''null''
 * @param placementGroup  for example: ''null''
 * @param keywords  for example: ''[{"value":"cats","match_type":"EXACT_NEGATIVE"}]''
 * @param trackingUrls  for example: ''null''
*/
final case class TargetingTemplateCommon (
  name: Option[String] = None,
  autoTargetingEnabled: Option[Boolean] = None,
  targetingAttributes: Option[TargetingSpec] = None,
  placementGroup: Option[PlacementGroupType] = None,
  keywords: Option[Seq[TargetingTemplateKeyword]] = None,
  trackingUrls: Option[TrackingUrls] = None
)

