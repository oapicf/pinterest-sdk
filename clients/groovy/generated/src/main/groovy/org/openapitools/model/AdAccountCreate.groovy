package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Country;
import org.openapitools.model.Currency;

@Canonical
class AdAccountCreate {
    
    Country country
    
    Currency currency
    /* Ad account name. */
    String name
    /* Advertiser's owning user ID. */
    String ownerUserId
}
