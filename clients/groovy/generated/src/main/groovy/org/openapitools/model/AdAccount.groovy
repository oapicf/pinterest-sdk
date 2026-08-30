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
    /* The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. */
    String timeZone
    
    Integer updatedTime
}
