package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AppsflyerPlatform;

@Canonical
class AppsflyerAudience {
    /* The ID of the audience container */
    String containerId
    /* The name of the audience */
    String name
    /* The platform of the audience */
    AppsflyerPlatform platform
}
