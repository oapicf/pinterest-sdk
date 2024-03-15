package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Country;

@Canonical
class AdAccountCreateRequest {
    
    Country country
    /* Ad Account name. */
    String name
    /* Advertiser's owning user ID. */
    String ownerUserId
}
