package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GetMMMReportResponseData {

    enum ReportStatusEnum {
    
        DOES_NOT_EXIST("DOES_NOT_EXIST"),
        
        FINISHED("FINISHED"),
        
        IN_PROGRESS("IN_PROGRESS"),
        
        EXPIRED("EXPIRED"),
        
        FAILED("FAILED"),
        
        CANCELLED("CANCELLED")
    
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
    
    String url
    
    BigDecimal size
}
