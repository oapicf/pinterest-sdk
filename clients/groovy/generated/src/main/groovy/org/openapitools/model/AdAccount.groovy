package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdAccountOwner;
import org.openapitools.model.Country;
import org.openapitools.model.Currency;

@Canonical
class AdAccount {
    
    String id
    
    String name
    
    AdAccountOwner owner
    
    Country country
    
    Currency currency
}
