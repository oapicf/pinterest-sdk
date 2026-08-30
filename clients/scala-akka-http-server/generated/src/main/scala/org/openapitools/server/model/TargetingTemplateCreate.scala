package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). for example: ''null''
 * @param keywords  for example: ''null''
 * @param name targeting template name for example: ''null''
 * @param placementGroup  for example: ''null''
 * @param targetingAttributes targeting profile attributes for example: ''null''
 * @param trackingUrls  for example: ''null''
*/
final case class TargetingTemplateCreate (
  autoTargetingEnabled: Option[Boolean] = None,
  keywords: Option[Seq[TargetingTemplateKeyword]] = None,
  name: String,
  placementGroup: Option[PlacementGroupType] = None,
  targetingAttributes: TargetingSpecOptimal,
  trackingUrls: Option[TrackingUrls] = None
)

