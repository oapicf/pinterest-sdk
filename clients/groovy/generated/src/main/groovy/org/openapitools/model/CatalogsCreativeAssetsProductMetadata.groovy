package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreativeAssetsVisibilityType;

@Canonical
class CatalogsCreativeAssetsProductMetadata {
    /* The user-created unique ID that represents the creative assets item. */
    String creativeAssetsId
    
    CreativeAssetsVisibilityType visibility
}
