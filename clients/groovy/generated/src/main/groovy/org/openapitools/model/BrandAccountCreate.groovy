package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BrandAccountProfileImage;
import org.openapitools.model.Country;

@Canonical
class BrandAccountCreate {
    /* Brand Account about information */
    String about
    
    Country country
    /* Brand Account name */
    String name
    
    BrandAccountProfileImage profileImage
    /* Brand Account username */
    String username
    /* Brand Account website */
    String website
}
