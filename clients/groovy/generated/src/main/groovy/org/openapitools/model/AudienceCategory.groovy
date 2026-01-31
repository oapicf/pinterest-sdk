package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AudienceSubcategory;

@Canonical
class AudienceCategory {
    /* Interest ID. */
    String id
    /* Interest affinity index. */
    BigDecimal index
    /* Interest unique key (same as ID). */
    String key
    /* Interest name. */
    String name
    /* Interest's percent of category's total audience. */
    BigDecimal ratio
    /* Subcategory interest distribution */
    List<AudienceSubcategory> subcategories = new ArrayList<>()
}
