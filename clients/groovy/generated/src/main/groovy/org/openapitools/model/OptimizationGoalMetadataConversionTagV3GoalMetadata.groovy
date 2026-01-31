package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows;

@Canonical
class OptimizationGoalMetadataConversionTagV3GoalMetadata {
    
    OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows

    enum ConversionEventEnum {
    
        PAGE_VISIT("PAGE_VISIT"),
        
        SIGNUP("SIGNUP"),
        
        CHECKOUT("CHECKOUT"),
        
        CUSTOM("CUSTOM"),
        
        VIEW_CATEGORY("VIEW_CATEGORY"),
        
        SEARCH("SEARCH"),
        
        ADD_TO_CART("ADD_TO_CART"),
        
        WATCH_VIDEO("WATCH_VIDEO"),
        
        LEAD("LEAD"),
        
        APP_INSTALL("APP_INSTALL")
    
        private final String value
    
        ConversionEventEnum(String value) {
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

    
    ConversionEventEnum conversionEvent
    
    String conversionTagId
    
    String cpaGoalValueInMicroCurrency
    /* Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>. */
    Boolean isRoasOptimized

    enum LearningModeTypeEnum {
    
        NOT_ACTIVE("NOT_ACTIVE"),
        
        ACTIVE("ACTIVE")
    
        private final String value
    
        LearningModeTypeEnum(String value) {
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

    /* Conversion learning model type */
    LearningModeTypeEnum learningModeType
    /* Event name for custom or standard events mapped to an oCPM model */
    String reportingEvent
}
