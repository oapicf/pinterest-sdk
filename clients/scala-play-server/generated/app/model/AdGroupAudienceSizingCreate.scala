package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
  * @param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  * @param placementGroup [Placement group](/docs/redoc/#section/Placement-group).
  * @param productGroupIds Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdGroupAudienceSizingCreate(
  autoTargetingEnabled: Option[Boolean],
  creativeTypes: Option[List[AdGroupAudienceSizingCreativeTypes]],
  keywords: Option[List[AdGroupAudienceSizingKeyword]],
  placementGroup: Option[AdgroupPlacementGroupType],
  productGroupIds: Option[List[String]],
  targetingSpec: Option[TargetingSpecOptimal]
)

object AdGroupAudienceSizingCreate {
  implicit lazy val adGroupAudienceSizingCreateJsonFormat: Format[AdGroupAudienceSizingCreate] = Json.format[AdGroupAudienceSizingCreate]
}

