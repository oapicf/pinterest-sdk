package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class QuizPinResult {
    
    String androidDeepLink
    
    String destinationUrl
    
    String iosDeepLink
    
    String organicPinId
    
    BigDecimal resultId
}
