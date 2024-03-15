package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsHotelAddress {
    /* Primary street address of hotel. */
    String addr1
    /* City where the hotel is located. */
    String city
    /* State, county, province, where the hotel is located. */
    String region
    /* Country where the hotel is located. */
    String country
    /* Required for countries with a postal code system. Postal or zip code of the hotel. */
    String postalCode
}
