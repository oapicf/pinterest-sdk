package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsHotelReportParameters;
import org.openapitools.model.CatalogsHotelReportParametersReport;
import org.openapitools.model.CatalogsRetailReportParameters;
import org.openapitools.model.CatalogsType;

@Canonical
class CatalogsReportParameters {
    
    CatalogsType catalogType
    
    CatalogsHotelReportParametersReport report
}
