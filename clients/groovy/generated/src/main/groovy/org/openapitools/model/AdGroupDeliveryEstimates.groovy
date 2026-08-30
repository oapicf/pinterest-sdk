package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupAudienceSizingCreativeTypes;
import org.openapitools.model.AdGroupDeliveryEstimatesKeywordsItems;
import org.openapitools.model.OptimizationGoalMetadata;
import org.openapitools.model.OptimizationType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpecOptimal;

@Canonical
class AdGroupDeliveryEstimates {
    
    Boolean autoTargetingEnabled
    /* Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
    List<AdGroupAudienceSizingCreativeTypes> creativeTypes = new ArrayList<>()
    /* Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
    List<AdGroupDeliveryEstimatesKeywordsItems> keywords
    /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. */
    Integer monthlyFrequencyCap
    
    OptimizationGoalMetadata optimizationGoalMetadata
    /* Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. */
    OptimizationType optimizationType
    
    PlacementGroupType placementGroup = PlacementGroupType.ALL
    /* [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. */
    List<String> productGroupIds = new ArrayList<>()
    
    TargetingSpecOptimal targetingSpec
}
