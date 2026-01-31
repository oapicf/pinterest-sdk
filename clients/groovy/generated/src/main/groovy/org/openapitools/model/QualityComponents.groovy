package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.model.QualityComponentDetails;

@Canonical
class QualityComponents {
    
    Map<String, QualityComponentDetails> advertiserExternalId = new HashMap<>()
    
    Map<String, QualityComponentDetails> clickIdEpik = new HashMap<>()
    /* Dedup components. */
    Map<String, QualityComponentDetails> externalEventId = new HashMap<>()
    /* User matching identifiers. */
    Map<String, QualityComponentDetails> hashedEmail = new HashMap<>()
    
    Map<String, QualityComponentDetails> hashedMaid = new HashMap<>()
    
    Map<String, QualityComponentDetails> ipAddress = new HashMap<>()
    
    Map<String, QualityComponentDetails> orderId = new HashMap<>()
    
    Map<String, QualityComponentDetails> orderValue = new HashMap<>()
    /* Product/event metadata. */
    Map<String, QualityComponentDetails> productId = new HashMap<>()
    
    Map<String, QualityComponentDetails> sourceUrl = new HashMap<>()
    
    Map<String, QualityComponentDetails> userAgent = new HashMap<>()
}
