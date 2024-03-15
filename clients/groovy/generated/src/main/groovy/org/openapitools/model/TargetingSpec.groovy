package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TargetingSpecSHOPPINGRETARGETING;

@Canonical
class TargetingSpec {

    enum AGEBUCKETEnum {
    
        _18_24("18-24"),
        
        _21_("21+"),
        
        _25_34("25-34"),
        
        _35_44("35-44"),
        
        _45_49("45-49"),
        
        _50_54("50-54"),
        
        _55_64("55-64"),
        
        _65_("65+")
    
        private final String value
    
        AGEBUCKETEnum(String value) {
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

    /* Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. */
    List<AGEBUCKETEnum> AGE_BUCKET

    enum APPTYPEEnum {
    
        ANDROID_MOBILE("android_mobile"),
        
        ANDROID_TABLET("android_tablet"),
        
        IPAD("ipad"),
        
        IPHONE("iphone"),
        
        WEB("web"),
        
        WEB_MOBILE("web_mobile")
    
        private final String value
    
        APPTYPEEnum(String value) {
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

    /* Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. */
    List<APPTYPEEnum> APPTYPE
    /* Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. */
    List<String> AUDIENCE_EXCLUDE
    /* Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. */
    List<String> auDIENCEINCLUDEQuote

    enum GENDEREnum {
    
        UNKNOWN("unknown"),
        
        MALE("male"),
        
        FEMALE("female")
    
        private final String value
    
        GENDEREnum(String value) {
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

    /* Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. */
    List<GENDEREnum> GENDER
    /* Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**. */
    List<String> GEO
    /* Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. */
    List<String> INTEREST
    /* 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**. */
    List<String> LOCALE
    /* 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**. */
    List<String> LOCATION
    /* Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting */
    List<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING

    enum TARGETINGSTRATEGYEnum {
    
        CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
        
        FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
        
        RECONNECT_WITH_USERS("RECONNECT_WITH_USERS")
    
        private final String value
    
        TARGETINGSTRATEGYEnum(String value) {
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

    /*  */
    List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY
}
