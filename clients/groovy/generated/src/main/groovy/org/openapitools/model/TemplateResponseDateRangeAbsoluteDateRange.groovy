package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class TemplateResponseDateRangeAbsoluteDateRange {
    /* The date range type */
    String type
    /* The start date of the date range */
    BigDecimal startDate
    /* The end date of the date range */
    BigDecimal endDate
}
