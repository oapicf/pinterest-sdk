package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class AudienceSubcategory {
    /* Interest unique key (same as ID). */
    String key
    /* Subinterest name. */
    String name
    /* Subinterest's percent of category's total audience. */
    BigDecimal ratio
    /* Subinterest affinity index. */
    BigDecimal index
    /* Subinterest ID. */
    String id
}
