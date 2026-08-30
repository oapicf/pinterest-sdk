package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupAudienceSizingCreativeTypes;
import org.openapitools.model.AdGroupAudienceSizingKeyword;
import org.openapitools.model.AdgroupPlacementGroupType;
import org.openapitools.model.TargetingSpecOptimal;

@Canonical
class AdGroupAudienceSizingCreate {
    /* Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). */
    Boolean autoTargetingEnabled = true
    /* Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
    List<AdGroupAudienceSizingCreativeTypes> creativeTypes
    /* Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
    List<AdGroupAudienceSizingKeyword> keywords
    /* [Placement group](/docs/redoc/#section/Placement-group). */
    AdgroupPlacementGroupType placementGroup
    /* Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. */
    List<String> productGroupIds
    
    TargetingSpecOptimal targetingSpec
}
