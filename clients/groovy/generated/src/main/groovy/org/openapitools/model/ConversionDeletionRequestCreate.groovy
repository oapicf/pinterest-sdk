package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConversionDeletionRequestTargets;

@Canonical
class ConversionDeletionRequestCreate {
    /* Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. */
    ConversionDeletionRequestTargets deletionTargets
}
