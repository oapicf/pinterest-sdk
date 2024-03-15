package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityStatus;

@Canonical
class ConversionTagResponse {
    /* Ad account ID. */
    String adAccountId
    /* Tag code snippet. */
    String codeSnippet
    
    EnhancedMatchStatusType enhancedMatchStatus
    /* Tag ID. */
    String id
    /* Time for the last event fired. */
    BigDecimal lastFiredTimeMs
    /* Conversion tag name. */
    String name
    
    EntityStatus status
    /* Version number. */
    String version
    
    ConversionTagConfigs configs
}
