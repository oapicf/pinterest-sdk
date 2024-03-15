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
    /* Ad group is ROAS optimized */
    Boolean isRoasOptimized

    enum LearningModeTypeEnum {
    
        NOT_ACTIVE("NOT_ACTIVE"),
        
        ACTIVE("ACTIVE"),
        
        NULL("null")
    
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
}
