package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TemplateResponseDateRangeAbsoluteDateRange;
import org.openapitools.model.TemplateResponseDateRangeDynamicDateRange;
import org.openapitools.model.TemplateResponseDateRangeRelativeDateRange;

@Canonical
class TemplateResponseDateRange {
    
    TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange
    
    TemplateResponseDateRangeDynamicDateRange dynamicDateRange
    
    TemplateResponseDateRangeRelativeDateRange relativeDateRange
}
