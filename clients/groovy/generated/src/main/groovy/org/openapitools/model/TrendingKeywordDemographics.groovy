package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrendingKeywordDemographicsAgeDistribution;
import org.openapitools.model.TrendingKeywordDemographicsGenderDistribution;

@Canonical
class TrendingKeywordDemographics {
    
    TrendingKeywordDemographicsAgeDistribution ageDistribution
    
    TrendingKeywordDemographicsGenderDistribution genderDistribution
}
