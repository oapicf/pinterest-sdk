package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). for example: ''null''
 * @param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. for example: ''null''
 * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted. for example: ''null''
 * @param placementGroup [Placement group](/docs/redoc/#section/Placement-group). for example: ''null''
 * @param productGroupIds Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. for example: ''null''
 * @param targetingSpec  for example: ''null''
*/
final case class AdGroupAudienceSizingCreate (
  autoTargetingEnabled: Option[Boolean] = None,
  creativeTypes: Option[Seq[AdGroupAudienceSizingCreativeTypes]] = None,
  keywords: Option[Seq[AdGroupAudienceSizingKeyword]] = None,
  placementGroup: Option[AdgroupPlacementGroupType] = None,
  productGroupIds: Option[Seq[String]] = None,
  targetingSpec: Option[TargetingSpecOptimal] = None
)

