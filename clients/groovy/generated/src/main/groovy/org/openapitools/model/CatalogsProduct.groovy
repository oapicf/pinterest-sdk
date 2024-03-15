package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductMetadata;
import org.openapitools.model.Pin;

@Canonical
class CatalogsProduct {
    
    CatalogsProductMetadata metadata
    
    Pin pin
}
