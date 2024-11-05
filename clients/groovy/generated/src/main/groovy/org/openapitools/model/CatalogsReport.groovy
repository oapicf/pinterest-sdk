package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CatalogsReport {

    enum ReportStatusEnum {
    
        FINISHED("FINISHED"),
        
        IN_PROGRESS("IN_PROGRESS")
    
        private final String value
    
        ReportStatusEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    ReportStatusEnum reportStatus
    /* URL to download the report */
    String url
    /* Size of the report in bytes */
    BigDecimal size
}
