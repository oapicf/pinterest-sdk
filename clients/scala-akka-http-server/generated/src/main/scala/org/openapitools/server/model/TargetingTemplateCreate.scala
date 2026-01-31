package org.openapitools.server.model


/**
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. for example: ''null''
 * @param keywords  for example: ''[{value=cats, match_type=EXACT_NEGATIVE}]''
 * @param name Name of targeting template. for example: ''Gaming''
 * @param placementGroup  for example: ''null''
 * @param targetingAttributes  for example: ''null''
 * @param trackingUrls  for example: ''null''
*/
final case class TargetingTemplateCreate (
  autoTargetingEnabled: Option[Boolean] = None,
  keywords: Option[Seq[TargetingTemplateKeyword]] = None,
  name: String,
  placementGroup: Option[PlacementGroupType] = None,
  targetingAttributes: TargetingSpec,
  trackingUrls: Option[TrackingUrls] = None
)

