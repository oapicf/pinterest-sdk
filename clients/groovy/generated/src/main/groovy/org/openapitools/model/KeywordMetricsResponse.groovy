package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.KeywordMetrics;

@Canonical
class KeywordMetricsResponse {
    /* Keyword name, e.g., \"keyword\":\"fashion outfits\" */
    String keyword
    
    KeywordMetrics metrics
}
