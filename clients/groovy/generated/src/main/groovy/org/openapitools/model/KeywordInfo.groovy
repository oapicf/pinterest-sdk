package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class KeywordInfo {
    /* Keyword Name */
    String name
    /* MoM growth as a percentage, if there is no growth rate, this field is not present */
    BigDecimal pctGrowthMom
}
