package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Country;
import org.openapitools.model.ImageBase64;

@Canonical
class BrandAccountsCreateRequest {
    /* Brand Account name */
    String name
    /* Brand Account username */
    String username
    
    Country country
    /* Brand Account about information */
    String about
    /* Brand Account website */
    String website
    
    ImageBase64 profileImage
}
