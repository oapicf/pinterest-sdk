package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;

@Canonical
class ConversionTagCommon {
    /* Tag code snippet. */
    String codeSnippet
    
    ConversionTagConfigs configs
    /* The enhanced match status of the tag */
    EnhancedMatchStatusType enhancedMatchStatus
    /* Tag ID. */
    String id
    /* Time for the last event fired. */
    BigDecimal lastFiredTimeMs
    /* Conversion tag name. */
    String name
    /* Version number. */
    String version
}
