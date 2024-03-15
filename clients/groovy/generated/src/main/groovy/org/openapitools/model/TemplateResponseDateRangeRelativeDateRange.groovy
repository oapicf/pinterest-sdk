package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class TemplateResponseDateRangeRelativeDateRange {
    /* The date range type */
    String type
    /* The start date of the date range */
    BigDecimal startDaysInPast
    /* The end date of the date range */
    BigDecimal endDaysInPast
}
