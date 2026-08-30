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
    /* The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. */
    String timeZone
}
