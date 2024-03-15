package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class AudienceDemographicValue {
    /* Unique key for demographic item */
    String key
    /* Display name for demographic */
    String name
    /* Value of demographic item as a percent of total audience */
    BigDecimal ratio
}
