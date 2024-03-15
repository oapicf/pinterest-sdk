package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedCredentials {
    /* The required password for downloading a feed. */
    String password
    /* The required username for downloading a feed. */
    String username
}
