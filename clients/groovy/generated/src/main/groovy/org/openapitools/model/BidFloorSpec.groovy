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
    
    ActionType billableEvent
    
    List<Country> countries = new ArrayList<>()
    
    CreativeType creativeType
    
    Currency currency
    
    ObjectiveType objectiveType
    
    OptimizationGoalMetadata optimizationGoalMetadata
}
