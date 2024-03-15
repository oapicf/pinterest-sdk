package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.GetMMMReportResponseData;

@Canonical
class GetMMMReportResponse {
    
    BigDecimal code
    
    GetMMMReportResponseData data
    
    String message
    
    String status
}
