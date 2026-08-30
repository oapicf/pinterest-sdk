package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceAccountType;

@Canonical
class SharedAudienceAccount {
    /* Account ID (ad account or business ID). */
    String accountId
    /* Account name. */
    String accountName
    /* account type */
    AudienceAccountType accountType
    /* Epoch timestamp in seconds for the shared audience event */
    Integer sharedOnTimestamp
}
