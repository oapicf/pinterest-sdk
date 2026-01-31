package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.OverallStatusOptions;
import org.openapitools.model.QualityComponents;
import org.openapitools.model.SourcePlatformOptions;

@Canonical
class EventQualityScore {
    
    IngestionSourceOptions ingestionSource
    
    LookbackPeriodOptions lookbackPeriod
    
    OverallStatusOptions overallStatus
    
    QualityComponents qualityComponents
    
    SourcePlatformOptions sourcePlatform
}
