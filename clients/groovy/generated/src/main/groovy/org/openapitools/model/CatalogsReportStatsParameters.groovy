package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsHotelReportStatsParameters;
import org.openapitools.model.CatalogsHotelReportStatsParametersReport;
import org.openapitools.model.CatalogsRetailReportStatsParameters;

@Canonical
class CatalogsReportStatsParameters {

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
    
    CatalogsHotelReportStatsParametersReport report
}
