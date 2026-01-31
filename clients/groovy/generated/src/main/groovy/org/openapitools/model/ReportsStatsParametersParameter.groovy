package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsHotelReportStatsParameters;
import org.openapitools.model.CatalogsHotelReportStatsParametersReport;
import org.openapitools.model.CatalogsRetailReportStatsParameters;
import org.openapitools.model.CatalogsType;

@Canonical
class ReportsStatsParametersParameter {
    
    CatalogsType catalogType
    
    CatalogsHotelReportStatsParametersReport report
}
