package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdCommonQuizPinData;
import org.openapitools.model.AdCommonTrackingUrls;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;

@Canonical
class AdUpdateRequest {
    /* ID of the ad group that contains the ad. */
    String adGroupId
    /* Deep link URL for Android devices. Not currently available. Using this field will generate an error. */
    String androidDeepLink
    /* Comma-separated deep links for the carousel pin on Android. */
    List<String> carouselAndroidDeepLinks
    /* Comma-separated destination URLs for the carousel pin to promote. */
    List<String> carouselDestinationUrls
    /* Comma-separated deep links for the carousel pin on iOS. */
    List<String> carouselIosDeepLinks
    /* Tracking url for the ad clicks. */
    String clickTrackingUrl
    
    CreativeType creativeType
    /* Destination URL. */
    String destinationUrl
    /* Deep link URL for iOS devices. Not currently available. Using this field will generate an error. */
    String iosDeepLink
    /* Is original pin deleted? */
    Boolean isPinDeleted
    /* Is pin repinnable? */
    Boolean isRemovable
    /* Name of the ad - 255 chars max. */
    String name
    
    EntityStatus status
    
    AdCommonTrackingUrls trackingUrls
    /* Tracking URL for ad impressions. */
    String viewTrackingUrl
    /* Lead form ID for lead ad generation. */
    String leadFormId
    
    GridClickType gridClickType

    enum CustomizableCtaTypeEnum {
    
        GET_OFFER("GET_OFFER"),
        
        LEARN_MORE("LEARN_MORE"),
        
        ORDER_NOW("ORDER_NOW"),
        
        SHOP_NOW("SHOP_NOW"),
        
        SIGN_UP("SIGN_UP"),
        
        SUBSCRIBE("SUBSCRIBE"),
        
        BUY_NOW("BUY_NOW"),
        
        CONTACT_US("CONTACT_US"),
        
        GET_QUOTE("GET_QUOTE"),
        
        VISIT_WEBSITE("VISIT_WEBSITE"),
        
        APPLY_NOW("APPLY_NOW"),
        
        BOOK_NOW("BOOK_NOW"),
        
        REQUEST_DEMO("REQUEST_DEMO"),
        
        REGISTER_NOW("REGISTER_NOW"),
        
        FIND_A_DEALER("FIND_A_DEALER"),
        
        ADD_TO_CART("ADD_TO_CART"),
        
        WATCH_NOW("WATCH_NOW"),
        
        READ_MORE("READ_MORE"),
        
        NULL("null")
    
        private final String value
    
        CustomizableCtaTypeEnum(String value) {
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

    /* Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) */
    CustomizableCtaTypeEnum customizableCtaType
    
    AdCommonQuizPinData quizPinData
    /* The ID of this ad. */
    String id
    /* Pin ID. This field may only be updated for draft ads. */
    String pinId
}
