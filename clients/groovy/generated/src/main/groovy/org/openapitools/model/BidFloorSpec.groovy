package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ActionType;
import org.openapitools.model.Country;
import org.openapitools.model.CreativeType;
import org.openapitools.model.Currency;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.OptimizationGoalMetadata;

@Canonical
class BidFloorSpec {
    
    List<Country> countries = new ArrayList<>()
    
    Currency currency
    
    ObjectiveType objectiveType
    
    ActionType billableEvent
    
    OptimizationGoalMetadata optimizationGoalMetadata
    
    CreativeType creativeType
}
