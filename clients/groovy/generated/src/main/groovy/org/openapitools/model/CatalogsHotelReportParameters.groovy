package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsHotelReportParametersReport;

@Canonical
class CatalogsHotelReportParameters {

    enum CatalogTypeEnum {
    
        HOTEL("HOTEL")
    
        private final String value
    
        CatalogTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    CatalogTypeEnum catalogType
    
    CatalogsHotelReportParametersReport report
}
