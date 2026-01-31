package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AdAccountOwner {
    /* The owning account's user ID. */
    String id
    /* Public username for the user account */
    String username
}
