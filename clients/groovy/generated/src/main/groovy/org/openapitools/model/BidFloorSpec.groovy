package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ActionType;
import org.openapitools.model.BidFloorObjectiveType;
import org.openapitools.model.Country;
import org.openapitools.model.CreativeType;
import org.openapitools.model.Currency;
import org.openapitools.model.OptimizationGoalMetadata;

@Canonical
class BidFloorSpec {
    /* Ad group billable event type. */
    ActionType billableEvent
    /* List of ISO 3166-1 alpha-2 country codes. */
    List<Country> countries = new ArrayList<>()
    /* Creative type for the bid floor request. */
    CreativeType creativeType
    /* Currency for the bid floor value. */
    Currency currency
    /* Campaign objective type. */
    BidFloorObjectiveType objectiveType
    /* Optimization goal metadata. */
    OptimizationGoalMetadata optimizationGoalMetadata
}
