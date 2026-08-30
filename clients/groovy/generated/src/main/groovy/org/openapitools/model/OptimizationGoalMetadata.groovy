package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConversionTagV3GoalMetadata;
import org.openapitools.model.FrequencyGoalMetadata;
import org.openapitools.model.ScrollupGoalMetadata;

@Canonical
class OptimizationGoalMetadata {
    
    ConversionTagV3GoalMetadata conversionTagV3GoalMetadata
    
    FrequencyGoalMetadata frequencyGoalMetadata
    
    ScrollupGoalMetadata scrollupGoalMetadata
}
