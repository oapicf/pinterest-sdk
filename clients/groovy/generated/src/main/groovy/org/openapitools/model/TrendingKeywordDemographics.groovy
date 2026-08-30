package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrendsAgeDistribution;
import org.openapitools.model.TrendsGenderDistribution;

@Canonical
class TrendingKeywordDemographics {
    
    TrendsAgeDistribution ageDistribution
    
    TrendsGenderDistribution genderDistribution
}
