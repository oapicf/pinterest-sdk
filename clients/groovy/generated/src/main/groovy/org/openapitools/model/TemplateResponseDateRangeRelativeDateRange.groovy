package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class TemplateResponseDateRangeRelativeDateRange {
    /* The end date of the date range */
    BigDecimal endDaysInPast
    /* The start date of the date range */
    BigDecimal startDaysInPast
    /* The date range type */
    String type
}
