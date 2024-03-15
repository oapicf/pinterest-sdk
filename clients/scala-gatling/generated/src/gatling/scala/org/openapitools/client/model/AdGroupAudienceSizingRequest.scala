
package org.openapitools.client.model


case class AdGroupAudienceSizingRequest (
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    /* <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. */
    _placementGroup: Option[PlacementGroupType],
    /* Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
    _creativeTypes: Option[List[String]],
    _targetingSpec: Option[TargetingSpec],
    /* Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. */
    _productGroupIds: Option[List[String]],
    /* Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
    _keywords: Option[List[AdGroupAudienceSizingRequestKeywordsInner]]
)
object AdGroupAudienceSizingRequest {
    def toStringBody(var_autoTargetingEnabled: Object, var_placementGroup: Object, var_creativeTypes: Object, var_targetingSpec: Object, var_productGroupIds: Object, var_keywords: Object) =
        s"""
        | {
        | "autoTargetingEnabled":$var_autoTargetingEnabled,"placementGroup":$var_placementGroup,"creativeTypes":$var_creativeTypes,"targetingSpec":$var_targetingSpec,"productGroupIds":$var_productGroupIds,"keywords":$var_keywords
        | }
        """.stripMargin
}
