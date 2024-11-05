package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreativeAssetsProduct;
import org.openapitools.model.CatalogsCreativeAssetsProductMetadata;
import org.openapitools.model.CatalogsHotelProduct;
import org.openapitools.model.CatalogsRetailProduct;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Pin;

@Canonical
class CatalogsProduct {
    
    CatalogsType catalogType
    
    CatalogsCreativeAssetsProductMetadata metadata
    
    Pin pin
}
