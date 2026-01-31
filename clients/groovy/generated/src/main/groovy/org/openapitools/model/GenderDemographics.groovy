package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class GenderDemographics {
    /* Percentage of female users */
    BigDecimal female
    /* Percentage of male users */
    BigDecimal male
    /* Percentage of users with unspecified gender */
    BigDecimal unspecified
}
