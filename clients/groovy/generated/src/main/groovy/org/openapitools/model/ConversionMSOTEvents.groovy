package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Currency;

@Canonical
class ConversionMSOTEvents {
    /* Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. */
    List<Long> actionTimestamps = new ArrayList<>()
    /* The ID of the ad group that was attributed to the conversion event. */
    String adGroupId

    enum AttributionModelEnum {
    
        FIRST_TOUCH("first_touch"),
        
        LAST_TOUCH("last_touch"),
        
        MULTI_TOUCH("multi_touch")
    
        private final String value
    
        AttributionModelEnum(String value) {
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

    /* The attribution model used to attribute the conversion event. */
    AttributionModelEnum attributionModel

    enum AttributionScopeEnum {
    
        VIEW("view"),
        
        ENGAGEMENT("engagement"),
        
        CLICK("click")
    
        private final String value
    
        AttributionScopeEnum(String value) {
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

    /* Ad event type. */
    AttributionScopeEnum attributionScope
    /* Credit given to the attributed ad actions. Allowed values are > 0 and <= 1. */
    Double attributionScore
    /* The ID of the campaign that was attributed to the conversion event. */
    String campaignId
    
    Currency currency
    /* A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. */
    String eventId

    enum EventNameEnum {
    
        ADD_TO_CART("add_to_cart"),
        
        CHECKOUT("checkout"),
        
        LEAD("lead"),
        
        SIGNUP("signup")
    
        private final String value
    
        EventNameEnum(String value) {
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

    /* Type of user event. */
    EventNameEnum eventName
    /* The time when the event occurred. Unix timestamp in seconds. */
    Long eventTimestamp
    /* Total number of ad events including other non-Pinterest ad platforms. */
    Integer totalEventTouchpoints
    /* Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p> */
    Integer totalEvents
    /* Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'. */
    Double value
}
