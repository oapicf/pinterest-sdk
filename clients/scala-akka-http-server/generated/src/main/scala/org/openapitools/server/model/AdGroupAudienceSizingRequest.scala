package org.openapitools.server.model


/**
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. for example: ''true''
 * @param placementGroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. for example: ''null''
 * @param creativeTypes Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. for example: ''null''
 * @param targetingSpec  for example: ''null''
 * @param productGroupIds Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. for example: ''null''
 * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted. for example: ''null''
*/
final case class AdGroupAudienceSizingRequest (
  autoTargetingEnabled: Option[Boolean] = None,
  placementGroup: Option[PlacementGroupType] = None,
  creativeTypes: Option[Seq[String]] = None,
  targetingSpec: Option[TargetingSpec] = None,
  productGroupIds: Option[Seq[String]] = None,
  keywords: Option[Seq[AdGroupAudienceSizingRequestKeywordsInner]] = None
)

