
package org.openapitools.client.model


case class AdGroupAudienceSizingRequest (
    /* Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    /* Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
    _creativeTypes: Option[List[String]],
    /* Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
    _keywords: Option[List[AdGroupAudienceSizingRequestKeywordsInner]],
    /* <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. */
    _placementGroup: Option[PlacementGroupType],
    /* Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. */
    _productGroupIds: Option[List[String]],
    _targetingSpec: Option[TargetingSpec]
)
object AdGroupAudienceSizingRequest {
    def toStringBody(var_autoTargetingEnabled: Object, var_creativeTypes: Object, var_keywords: Object, var_placementGroup: Object, var_productGroupIds: Object, var_targetingSpec: Object) =
        s"""
        | {
        | "autoTargetingEnabled":$var_autoTargetingEnabled,"creativeTypes":$var_creativeTypes,"keywords":$var_keywords,"placementGroup":$var_placementGroup,"productGroupIds":$var_productGroupIds,"targetingSpec":$var_targetingSpec
        | }
        """.stripMargin
}
