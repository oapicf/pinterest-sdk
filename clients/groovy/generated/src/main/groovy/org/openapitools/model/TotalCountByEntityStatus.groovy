package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class TotalCountByEntityStatus {
    /* Count of ACTIVE assets */
    Integer ACTIVE
    /* Count of ARCHIVED assets */
    Integer ARCHIVED
    /* Count of PAUSED assets */
    Integer PAUSED
}
