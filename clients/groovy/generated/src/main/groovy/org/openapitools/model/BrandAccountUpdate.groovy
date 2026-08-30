package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BrandAccountProfileImageUpdate;
import org.openapitools.model.Country;

@Canonical
class BrandAccountUpdate {
    /* Brand Account about information */
    String about
    
    Country country
    /* Brand Account name */
    String name
    
    BrandAccountProfileImageUpdate profileImage
    /* Brand Account username */
    String username
    /* Brand Account website */
    String website
}
