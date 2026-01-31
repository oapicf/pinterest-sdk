package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountOwner;
import org.openapitools.model.BusinessAccessRole;
import org.openapitools.model.Country;
import org.openapitools.model.Currency;

@Canonical
class AdAccount {
    
    Country country
    /*  Creation time. Unix timestamp in seconds. */
    Integer createdTime
    
    Currency currency
    
    String id
    /* Ad account name. */
    String name
    /* Ad account owner */
    AdAccountOwner owner
    
    List<BusinessAccessRole> permissions = new ArrayList<>()
    
    Integer updatedTime
}
