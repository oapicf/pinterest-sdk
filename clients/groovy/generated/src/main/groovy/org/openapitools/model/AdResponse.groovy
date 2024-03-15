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
import org.openapitools.model.PinPromotionSummaryStatus;

@Canonical
class AdResponse {
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
    /* Pin ID. */
    String pinId
    /* The ID of the advertiser that this ad belongs to. */
    String adAccountId
    /* ID of the ad campaign that contains this ad. */
    String campaignId
    /* Destination URL template for all items within a collections drawer. */
    String collectionItemsDestinationUrlTemplate
    /* Pin creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* The ID of this ad. */
    String id

    enum RejectedReasonsEnum {
    
        HASHTAGS("HASHTAGS"),
        
        PROMOTIONS_AND_PRICES("PROMOTIONS_AND_PRICES"),
        
        TARGETING("TARGETING"),
        
        LANDING_PAGE("LANDING_PAGE"),
        
        CAPS_AND_SYMBOLS("CAPS_AND_SYMBOLS"),
        
        SHOCKING("SHOCKING"),
        
        WEIGHT_LOSS("WEIGHT_LOSS"),
        
        PROHIBITED_PRODUCT("PROHIBITED_PRODUCT"),
        
        AUTHENTICITY("AUTHENTICITY"),
        
        NUDITY("NUDITY"),
        
        CONFUSING_DESIGN("CONFUSING_DESIGN"),
        
        URGENCY("URGENCY"),
        
        RATINGS("RATINGS"),
        
        APP("APP"),
        
        ALCOHOL("ALCOHOL"),
        
        CONTESTS("CONTESTS"),
        
        POLITICAL("POLITICAL"),
        
        OTHER("OTHER"),
        
        IMAGE("IMAGE"),
        
        NAR("NAR"),
        
        INCONSISTENT("INCONSISTENT"),
        
        CLICKBAIT("CLICKBAIT"),
        
        NO_DESCRIPTION("NO_DESCRIPTION"),
        
        LOW_QUALITY("LOW_QUALITY"),
        
        EXAGGERATED_CLAIMS("EXAGGERATED_CLAIMS"),
        
        PINTEREST_BRAND("PINTEREST_BRAND"),
        
        ALCOHOL_NO_SALE("ALCOHOL_NO_SALE"),
        
        LANDING_PAGE_SPEED("LANDING_PAGE_SPEED"),
        
        LANDING_PAGE_HARDWALL("LANDING_PAGE_HARDWALL"),
        
        LANDING_PAGE_BROKEN("LANDING_PAGE_BROKEN"),
        
        LANDING_PAGE_QUALITY("LANDING_PAGE_QUALITY"),
        
        OUT_OF_STOCK("OUT_OF_STOCK"),
        
        IMAGE_LOW_QUALITY("IMAGE_LOW_QUALITY"),
        
        IMAGE_BUSY("IMAGE_BUSY"),
        
        IMAGE_POORLY_EDITED("IMAGE_POORLY_EDITED"),
        
        IMAGE_BEFORE_AFTER("IMAGE_BEFORE_AFTER"),
        
        UGC("UGC"),
        
        FAKE_BUTTONS("FAKE_BUTTONS"),
        
        WEAPONS("WEAPONS"),
        
        SENSITIVE("SENSITIVE"),
        
        UNACCEPTABLE_BUSINESS("UNACCEPTABLE_BUSINESS"),
        
        SUSPICIOUS_CLAIMS("SUSPICIOUS_CLAIMS"),
        
        PHARMA("PHARMA"),
        
        SUSPICIOUS_SUPPLEMENTS("SUSPICIOUS_SUPPLEMENTS"),
        
        ILLEGAL_RECREATIONAL_DRUG("ILLEGAL_RECREATIONAL_DRUG"),
        
        LOW_QUALITY_LANDING_PAGE("LOW_QUALITY_LANDING_PAGE"),
        
        RESTRICTED_HEALTHCARE("RESTRICTED_HEALTHCARE"),
        
        INCONSISTENT_LANG_FR("INCONSISTENT_LANG_FR")
    
        private final String value
    
        RejectedReasonsEnum(String value) {
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

    /* Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
    List<RejectedReasonsEnum> rejectedReasons
    /* Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
    List<String> rejectionLabels

    enum ReviewStatusEnum {
    
        OTHER("OTHER"),
        
        PENDING("PENDING"),
        
        REJECTED("REJECTED"),
        
        APPROVED("APPROVED")
    
        private final String value
    
        ReviewStatusEnum(String value) {
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

    /* Ad review status */
    ReviewStatusEnum reviewStatus
    /* Always \"ad\". */
    String type
    /* Last update time. Unix timestamp in seconds. */
    Integer updatedTime
    /* Ad summary status */
    PinPromotionSummaryStatus summaryStatus
}
