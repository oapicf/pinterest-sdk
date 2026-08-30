package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.IneligibleProductTagReason;

@Canonical
class IneligibleProductTagErrorItem {
    /* Reason why the pin is ineligible for tagging. */
    IneligibleProductTagReason errorMessage
    /* Pin ID that failed eligibility check. */
    String pinId
}
