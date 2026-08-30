package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AppsflyerAudienceSyncCreate {
    /* The container ID of the audience */
    String containerId
    /* The pre-signed URL for SHA256 hashed GAID/IDFA file */
    String urlAdidSha256
    /* The pre-signed URL for SHA256 hashed email file */
    String urlEmailSha256
}
