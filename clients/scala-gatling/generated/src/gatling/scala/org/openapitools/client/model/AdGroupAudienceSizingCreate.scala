
package org.openapitools.client.model


case class AdGroupAudienceSizingCreate (
    /* Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). */
    _autoTargetingEnabled: Option[Boolean],
    /* Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
    _creativeTypes: Option[List[AdGroupAudienceSizingCreativeTypes]],
    /* Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
    _keywords: Option[List[AdGroupAudienceSizingKeyword]],
    /* [Placement group](/docs/redoc/#section/Placement-group). */
    _placementGroup: Option[AdgroupPlacementGroupType],
    /* Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. */
    _productGroupIds: Option[List[String]],
    _targetingSpec: Option[TargetingSpecOptimal]
)
object AdGroupAudienceSizingCreate {
    def toStringBody(var_autoTargetingEnabled: Object, var_creativeTypes: Object, var_keywords: Object, var_placementGroup: Object, var_productGroupIds: Object, var_targetingSpec: Object) =
        s"""
        | {
        | "autoTargetingEnabled":$var_autoTargetingEnabled,"creativeTypes":$var_creativeTypes,"keywords":$var_keywords,"placementGroup":$var_placementGroup,"productGroupIds":$var_productGroupIds,"targetingSpec":$var_targetingSpec
        | }
        """.stripMargin
}
