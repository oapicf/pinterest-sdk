package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class QualityComponentIssue {
    /* Unique identifier for the issue check. */
    String id
    /* Human-readable name of the issue. */
    String name
    /* Detailed reason for the issue. */
    String reason
}
