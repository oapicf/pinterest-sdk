package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UserSummary {
    /* Username */
    String username
    /* Always \"user\" */
    String type
}
