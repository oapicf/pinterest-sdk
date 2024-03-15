package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OptimizationGoalMetadataConversionTagV3GoalMetadata;
import org.openapitools.model.OptimizationGoalMetadataFrequencyGoalMetadata;
import org.openapitools.model.OptimizationGoalMetadataScrollupGoalMetadata;

@Canonical
class AdGroupCommonOptimizationGoalMetadata {
    
    OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata
    
    OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata
    
    OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata
}
