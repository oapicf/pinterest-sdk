package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PinterestLibError;

@Canonical
class CatalogsLocalStoresCreate200ResponseInnerDataOneOf {
    /* The ID of the local store. */
    String id
    
    PinterestLibError exceptions
}
