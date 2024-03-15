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
    
    String id
    
    String name
    
    AdAccountOwner owner
    
    Country country
    
    Currency currency
    
    List<BusinessAccessRole> permissions
    /* Creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* Last update time. Unix timestamp in seconds. */
    Integer updatedTime
}
