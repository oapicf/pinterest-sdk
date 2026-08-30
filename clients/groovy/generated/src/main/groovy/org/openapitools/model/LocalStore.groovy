package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Country;

@Canonical
class LocalStore {
    /* Primary address line of the store. */
    String addressPrimary
    /* Secondary address line of the store. */
    String addressSecondary
    /* City where the store is located. */
    String city
    /* Country code where the store is located. */
    Country country
    /* Creation timestamp */
    Date createdAt
    /* The ID of the local store. */
    String id
    /* Geographic latitude coordinate of the store. */
    Float latitude
    /* Geographic longitude coordinate of the store. */
    Float longitude
    /* The name of the local store. */
    String name
    /* Postal or ZIP code of the store. */
    String postalCode
    /* State or region code where the store is located. */
    String region
    /* Merchant provided code for the local store. Unique within the merchant's catalog. */
    String storeCode
    /* Last update timestamp */
    Date updatedAt
}
