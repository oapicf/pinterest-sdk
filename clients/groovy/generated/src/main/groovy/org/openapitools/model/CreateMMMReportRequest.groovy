package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.TargetingAdvertiserCountry;

@Canonical
class CreateMMMReportRequest {
    /* Name of the Marketing Mix Modeling (MMM) report */
    String reportName
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    String startDate
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    String endDate

    enum GranularityEnum {
    
        DAY("DAY"),
        
        WEEK("WEEK")
    
        private final String value
    
        GranularityEnum(String value) {
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

    /* DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly. */
    GranularityEnum granularity

    enum LevelEnum {
    
        CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
        
        AD_GROUP_TARGETING("AD_GROUP_TARGETING")
    
        private final String value
    
        LevelEnum(String value) {
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

    /* Level of the report */
    LevelEnum level
    /* List of targeting types */
    List<MMMReportingTargetingType> targetingTypes = new ArrayList<>()
    /* Metric and entity columns */
    List<MMMReportingColumn> columns = new ArrayList<>()
    /* A List of countries for filtering */
    List<TargetingAdvertiserCountry> countries = new ArrayList<>()
}
