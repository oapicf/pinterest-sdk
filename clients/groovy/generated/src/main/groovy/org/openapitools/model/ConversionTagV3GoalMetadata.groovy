package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AttributionWindows;
import org.openapitools.model.ConversionEvent;

@Canonical
class ConversionTagV3GoalMetadata {
    
    AttributionWindows attributionWindows
    
    ConversionEvent conversionEvent
    
    String conversionTagId
    
    String cpaGoalValueInMicroCurrency
    /* Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). */
    Boolean isRoasOptimized
    /* Event name for custom or standard events mapped to an oCPM model */
    String reportingEvent
}
