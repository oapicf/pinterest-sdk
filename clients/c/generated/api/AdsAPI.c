#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "AdsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum TARGETINGTYPES for AdsAPI_adTargetingAnalyticsGet

static char* adTargetingAnalyticsGet_TARGETINGTYPES_ToString(pinterest_rest_api_adTargetingAnalyticsGet_targeting_types_e TARGETINGTYPES){
    char *TARGETINGTYPESArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION", "QUIZ_RESULT", "AGE_BUCKET_AND_GENDER" };
    return TARGETINGTYPESArray[TARGETINGTYPES];
}

static pinterest_rest_api_adTargetingAnalyticsGet_targeting_types_e adTargetingAnalyticsGet_TARGETINGTYPES_FromString(char* TARGETINGTYPES){
    int stringToReturn = 0;
    char *TARGETINGTYPESArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION", "QUIZ_RESULT", "AGE_BUCKET_AND_GENDER" };
    size_t sizeofArray = sizeof(TARGETINGTYPESArray) / sizeof(TARGETINGTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(TARGETINGTYPES, TARGETINGTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adTargetingAnalyticsGet_TARGETINGTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adTargetingAnalyticsGet_TARGETINGTYPES_convertToJSON(pinterest_rest_api_adTargetingAnalyticsGet_targeting_types_e TARGETINGTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adTargetingAnalyticsGet_TARGETINGTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adTargetingAnalyticsGet_targeting_types_e adTargetingAnalyticsGet_TARGETINGTYPES_parseFromJSON(cJSON* TARGETINGTYPESJSON) {
    pinterest_rest_api_adTargetingAnalyticsGet_targeting_types_e TARGETINGTYPESVariable = 0;
    return TARGETINGTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum COLUMNS for AdsAPI_adTargetingAnalyticsGet

static char* adTargetingAnalyticsGet_COLUMNS_ToString(pinterest_rest_api_adTargetingAnalyticsGet_columns_e COLUMNS){
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "OUTBOUND_CTR_1", "CAMPAIGN_NAME", "CAMPAIGN_BRAND_LABEL", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_NAME", "AD_GROUP_BUDGET_TYPE", "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY", "AD_GROUP_ENTITY_STATUS", "AD_GROUP_BID_MULTIPLIER", "PROMO_ID", "PROMO_NAME", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "COLLECTION_PIN_ITEM_IMPRESSION_1", "COLLECTION_PIN_ITEM_IMPRESSION_2", "TOTAL_COLLECTION_PIN_ITEM_IMPRESSION", "COLLECTION_PIN_ITEM_CLICKTHROUGH_1", "COLLECTION_PIN_ITEM_CLICKTHROUGH_2", "TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "AD_NAME", "CAMPAIGN_LIFETIME_SPEND_CAP", "AD_GROUP_OPTIMIZATION", "CAMPAIGN_DAILY_SPEND_CAP", "CAMPAIGN_BUDGET_OPTIMIZATION", "IS_PREMIERE_CAMPAIGN", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_ADD_TO_WISHLIST", "TOTAL_SUBSCRIBE", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "PRODUCT_GROUP_AD_IMAGE_TAG", "PRODUCT_GROUP_AD_VIDEO_TAG", "VIDEO_3SEC_VIEWS_1", "VIDEO_15SEC_UNIQUE_VIEWS_1", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_15SEC_UNIQUE_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "VIDEO_SPEND_IN_DOLLAR", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "TOTAL_APP_INSTALL_CONVERSION_RATE", "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE", "INAPP_SKAN_APP_INSTALL", "INAPP_SKAN_ASSISTED_APP_INSTALL", "INAPP_SKAN_APP_INSTALL_COST_PER_ACTION", "INAPP_SKAN_APP_INSTALL_CONVERSION_RATE" };
    return COLUMNSArray[COLUMNS];
}

static pinterest_rest_api_adTargetingAnalyticsGet_columns_e adTargetingAnalyticsGet_COLUMNS_FromString(char* COLUMNS){
    int stringToReturn = 0;
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "OUTBOUND_CTR_1", "CAMPAIGN_NAME", "CAMPAIGN_BRAND_LABEL", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_NAME", "AD_GROUP_BUDGET_TYPE", "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY", "AD_GROUP_ENTITY_STATUS", "AD_GROUP_BID_MULTIPLIER", "PROMO_ID", "PROMO_NAME", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "COLLECTION_PIN_ITEM_IMPRESSION_1", "COLLECTION_PIN_ITEM_IMPRESSION_2", "TOTAL_COLLECTION_PIN_ITEM_IMPRESSION", "COLLECTION_PIN_ITEM_CLICKTHROUGH_1", "COLLECTION_PIN_ITEM_CLICKTHROUGH_2", "TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "AD_NAME", "CAMPAIGN_LIFETIME_SPEND_CAP", "AD_GROUP_OPTIMIZATION", "CAMPAIGN_DAILY_SPEND_CAP", "CAMPAIGN_BUDGET_OPTIMIZATION", "IS_PREMIERE_CAMPAIGN", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_ADD_TO_WISHLIST", "TOTAL_SUBSCRIBE", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "PRODUCT_GROUP_AD_IMAGE_TAG", "PRODUCT_GROUP_AD_VIDEO_TAG", "VIDEO_3SEC_VIEWS_1", "VIDEO_15SEC_UNIQUE_VIEWS_1", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_15SEC_UNIQUE_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "VIDEO_SPEND_IN_DOLLAR", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "TOTAL_APP_INSTALL_CONVERSION_RATE", "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE", "INAPP_SKAN_APP_INSTALL", "INAPP_SKAN_ASSISTED_APP_INSTALL", "INAPP_SKAN_APP_INSTALL_COST_PER_ACTION", "INAPP_SKAN_APP_INSTALL_CONVERSION_RATE" };
    size_t sizeofArray = sizeof(COLUMNSArray) / sizeof(COLUMNSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(COLUMNS, COLUMNSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adTargetingAnalyticsGet_COLUMNS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adTargetingAnalyticsGet_COLUMNS_convertToJSON(pinterest_rest_api_adTargetingAnalyticsGet_columns_e COLUMNS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adTargetingAnalyticsGet_COLUMNS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adTargetingAnalyticsGet_columns_e adTargetingAnalyticsGet_COLUMNS_parseFromJSON(cJSON* COLUMNSJSON) {
    pinterest_rest_api_adTargetingAnalyticsGet_columns_e COLUMNSVariable = 0;
    return COLUMNSVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdsAPI_adTargetingAnalyticsGet

static char* adTargetingAnalyticsGet__ToString(pinterest_rest_api_adTargetingAnalyticsGet_granularity_e ){
    char *Array[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    return Array[];
}

static pinterest_rest_api_adTargetingAnalyticsGet_granularity_e adTargetingAnalyticsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adTargetingAnalyticsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adTargetingAnalyticsGet_granularity_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adTargetingAnalyticsGet_granularity_e adTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adTargetingAnalyticsGet_granularity_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for AdsAPI_adTargetingAnalyticsGet

static char* adTargetingAnalyticsGet__ToString(pinterest_rest_api_adTargetingAnalyticsGet_click_window_days_e ){
    char *Array[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return Array[];
}

static pinterest_rest_api_adTargetingAnalyticsGet_click_window_days_e adTargetingAnalyticsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adTargetingAnalyticsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adTargetingAnalyticsGet_click_window_days_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adTargetingAnalyticsGet_click_window_days_e adTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adTargetingAnalyticsGet_click_window_days_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for AdsAPI_adTargetingAnalyticsGet

static char* adTargetingAnalyticsGet__ToString(pinterest_rest_api_adTargetingAnalyticsGet_engagement_window_days_e ){
    char *Array[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return Array[];
}

static pinterest_rest_api_adTargetingAnalyticsGet_engagement_window_days_e adTargetingAnalyticsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adTargetingAnalyticsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adTargetingAnalyticsGet_engagement_window_days_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adTargetingAnalyticsGet_engagement_window_days_e adTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adTargetingAnalyticsGet_engagement_window_days_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for AdsAPI_adTargetingAnalyticsGet

static char* adTargetingAnalyticsGet__ToString(pinterest_rest_api_adTargetingAnalyticsGet_view_window_days_e ){
    char *Array[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return Array[];
}

static pinterest_rest_api_adTargetingAnalyticsGet_view_window_days_e adTargetingAnalyticsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adTargetingAnalyticsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adTargetingAnalyticsGet_view_window_days_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adTargetingAnalyticsGet_view_window_days_e adTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adTargetingAnalyticsGet_view_window_days_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for AdsAPI_adTargetingAnalyticsGet

static char* adTargetingAnalyticsGet__ToString(pinterest_rest_api_adTargetingAnalyticsGet_conversion_report_time_e ){
    char *Array[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    return Array[];
}

static pinterest_rest_api_adTargetingAnalyticsGet_conversion_report_time_e adTargetingAnalyticsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adTargetingAnalyticsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adTargetingAnalyticsGet_conversion_report_time_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adTargetingAnalyticsGet_conversion_report_time_e adTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adTargetingAnalyticsGet_conversion_report_time_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum ATTRIBUTIONTYPES for AdsAPI_adTargetingAnalyticsGet

static char* adTargetingAnalyticsGet_ATTRIBUTIONTYPES_ToString(pinterest_rest_api_adTargetingAnalyticsGet_attribution_types_e ATTRIBUTIONTYPES){
    char *ATTRIBUTIONTYPESArray[] =  { "NULL", "INDIVIDUAL", "HOUSEHOLD" };
    return ATTRIBUTIONTYPESArray[ATTRIBUTIONTYPES];
}

static pinterest_rest_api_adTargetingAnalyticsGet_attribution_types_e adTargetingAnalyticsGet_ATTRIBUTIONTYPES_FromString(char* ATTRIBUTIONTYPES){
    int stringToReturn = 0;
    char *ATTRIBUTIONTYPESArray[] =  { "NULL", "INDIVIDUAL", "HOUSEHOLD" };
    size_t sizeofArray = sizeof(ATTRIBUTIONTYPESArray) / sizeof(ATTRIBUTIONTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ATTRIBUTIONTYPES, ATTRIBUTIONTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adTargetingAnalyticsGet_ATTRIBUTIONTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adTargetingAnalyticsGet_ATTRIBUTIONTYPES_convertToJSON(pinterest_rest_api_adTargetingAnalyticsGet_attribution_types_e ATTRIBUTIONTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adTargetingAnalyticsGet_ATTRIBUTIONTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adTargetingAnalyticsGet_attribution_types_e adTargetingAnalyticsGet_ATTRIBUTIONTYPES_parseFromJSON(cJSON* ATTRIBUTIONTYPESJSON) {
    pinterest_rest_api_adTargetingAnalyticsGet_attribution_types_e ATTRIBUTIONTYPESVariable = 0;
    return ATTRIBUTIONTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdsAPI_adTargetingAnalyticsGet

static char* adTargetingAnalyticsGet__ToString(pinterest_rest_api_adTargetingAnalyticsGet_reporting_timezone_e ){
    char *Array[] =  { "NULL", "PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE" };
    return Array[];
}

static pinterest_rest_api_adTargetingAnalyticsGet_reporting_timezone_e adTargetingAnalyticsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adTargetingAnalyticsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adTargetingAnalyticsGet_reporting_timezone_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adTargetingAnalyticsGet_reporting_timezone_e adTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adTargetingAnalyticsGet_reporting_timezone_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum COLUMNS for AdsAPI_adsAnalytics

static char* adsAnalytics_COLUMNS_ToString(pinterest_rest_api_adsAnalytics_columns_e COLUMNS){
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "OUTBOUND_CTR_1", "CAMPAIGN_NAME", "CAMPAIGN_BRAND_LABEL", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_NAME", "AD_GROUP_BUDGET_TYPE", "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY", "AD_GROUP_ENTITY_STATUS", "AD_GROUP_BID_MULTIPLIER", "PROMO_ID", "PROMO_NAME", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "COLLECTION_PIN_ITEM_IMPRESSION_1", "COLLECTION_PIN_ITEM_IMPRESSION_2", "TOTAL_COLLECTION_PIN_ITEM_IMPRESSION", "COLLECTION_PIN_ITEM_CLICKTHROUGH_1", "COLLECTION_PIN_ITEM_CLICKTHROUGH_2", "TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "AD_NAME", "CAMPAIGN_LIFETIME_SPEND_CAP", "AD_GROUP_OPTIMIZATION", "CAMPAIGN_DAILY_SPEND_CAP", "CAMPAIGN_BUDGET_OPTIMIZATION", "IS_PREMIERE_CAMPAIGN", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_ADD_TO_WISHLIST", "TOTAL_SUBSCRIBE", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "PRODUCT_GROUP_AD_IMAGE_TAG", "PRODUCT_GROUP_AD_VIDEO_TAG", "VIDEO_3SEC_VIEWS_1", "VIDEO_15SEC_UNIQUE_VIEWS_1", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_15SEC_UNIQUE_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "VIDEO_SPEND_IN_DOLLAR", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "TOTAL_APP_INSTALL_CONVERSION_RATE", "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE", "INAPP_SKAN_APP_INSTALL", "INAPP_SKAN_ASSISTED_APP_INSTALL", "INAPP_SKAN_APP_INSTALL_COST_PER_ACTION", "INAPP_SKAN_APP_INSTALL_CONVERSION_RATE" };
    return COLUMNSArray[COLUMNS];
}

static pinterest_rest_api_adsAnalytics_columns_e adsAnalytics_COLUMNS_FromString(char* COLUMNS){
    int stringToReturn = 0;
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "OUTBOUND_CTR_1", "CAMPAIGN_NAME", "CAMPAIGN_BRAND_LABEL", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_NAME", "AD_GROUP_BUDGET_TYPE", "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY", "AD_GROUP_ENTITY_STATUS", "AD_GROUP_BID_MULTIPLIER", "PROMO_ID", "PROMO_NAME", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "COLLECTION_PIN_ITEM_IMPRESSION_1", "COLLECTION_PIN_ITEM_IMPRESSION_2", "TOTAL_COLLECTION_PIN_ITEM_IMPRESSION", "COLLECTION_PIN_ITEM_CLICKTHROUGH_1", "COLLECTION_PIN_ITEM_CLICKTHROUGH_2", "TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "AD_NAME", "CAMPAIGN_LIFETIME_SPEND_CAP", "AD_GROUP_OPTIMIZATION", "CAMPAIGN_DAILY_SPEND_CAP", "CAMPAIGN_BUDGET_OPTIMIZATION", "IS_PREMIERE_CAMPAIGN", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_ADD_TO_WISHLIST", "TOTAL_SUBSCRIBE", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "PRODUCT_GROUP_AD_IMAGE_TAG", "PRODUCT_GROUP_AD_VIDEO_TAG", "VIDEO_3SEC_VIEWS_1", "VIDEO_15SEC_UNIQUE_VIEWS_1", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_15SEC_UNIQUE_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "VIDEO_SPEND_IN_DOLLAR", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "TOTAL_APP_INSTALL_CONVERSION_RATE", "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE", "INAPP_SKAN_APP_INSTALL", "INAPP_SKAN_ASSISTED_APP_INSTALL", "INAPP_SKAN_APP_INSTALL_COST_PER_ACTION", "INAPP_SKAN_APP_INSTALL_CONVERSION_RATE" };
    size_t sizeofArray = sizeof(COLUMNSArray) / sizeof(COLUMNSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(COLUMNS, COLUMNSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adsAnalytics_COLUMNS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adsAnalytics_COLUMNS_convertToJSON(pinterest_rest_api_adsAnalytics_columns_e COLUMNS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adsAnalytics_COLUMNS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adsAnalytics_columns_e adsAnalytics_COLUMNS_parseFromJSON(cJSON* COLUMNSJSON) {
    pinterest_rest_api_adsAnalytics_columns_e COLUMNSVariable = 0;
    return COLUMNSVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdsAPI_adsAnalytics

static char* adsAnalytics__ToString(pinterest_rest_api_adsAnalytics_granularity_e ){
    char *Array[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    return Array[];
}

static pinterest_rest_api_adsAnalytics_granularity_e adsAnalytics__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adsAnalytics__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adsAnalytics__convertToJSON(pinterest_rest_api_adsAnalytics_granularity_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adsAnalytics__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adsAnalytics_granularity_e adsAnalytics__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adsAnalytics_granularity_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum CLICKWINDOWDAYS for AdsAPI_adsAnalytics

static char* adsAnalytics_CLICKWINDOWDAYS_ToString(pinterest_rest_api_adsAnalytics_click_window_days_e CLICKWINDOWDAYS){
    char *CLICKWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return CLICKWINDOWDAYSArray[CLICKWINDOWDAYS];
}

static pinterest_rest_api_adsAnalytics_click_window_days_e adsAnalytics_CLICKWINDOWDAYS_FromString(char* CLICKWINDOWDAYS){
    int stringToReturn = 0;
    char *CLICKWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    size_t sizeofArray = sizeof(CLICKWINDOWDAYSArray) / sizeof(CLICKWINDOWDAYSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(CLICKWINDOWDAYS, CLICKWINDOWDAYSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adsAnalytics_CLICKWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adsAnalytics_CLICKWINDOWDAYS_convertToJSON(pinterest_rest_api_adsAnalytics_click_window_days_e CLICKWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adsAnalytics_CLICKWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adsAnalytics_click_window_days_e adsAnalytics_CLICKWINDOWDAYS_parseFromJSON(cJSON* CLICKWINDOWDAYSJSON) {
    pinterest_rest_api_adsAnalytics_click_window_days_e CLICKWINDOWDAYSVariable = 0;
    return CLICKWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum ENGAGEMENTWINDOWDAYS for AdsAPI_adsAnalytics

static char* adsAnalytics_ENGAGEMENTWINDOWDAYS_ToString(pinterest_rest_api_adsAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYS){
    char *ENGAGEMENTWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return ENGAGEMENTWINDOWDAYSArray[ENGAGEMENTWINDOWDAYS];
}

static pinterest_rest_api_adsAnalytics_engagement_window_days_e adsAnalytics_ENGAGEMENTWINDOWDAYS_FromString(char* ENGAGEMENTWINDOWDAYS){
    int stringToReturn = 0;
    char *ENGAGEMENTWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    size_t sizeofArray = sizeof(ENGAGEMENTWINDOWDAYSArray) / sizeof(ENGAGEMENTWINDOWDAYSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ENGAGEMENTWINDOWDAYS, ENGAGEMENTWINDOWDAYSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adsAnalytics_ENGAGEMENTWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adsAnalytics_ENGAGEMENTWINDOWDAYS_convertToJSON(pinterest_rest_api_adsAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adsAnalytics_ENGAGEMENTWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adsAnalytics_engagement_window_days_e adsAnalytics_ENGAGEMENTWINDOWDAYS_parseFromJSON(cJSON* ENGAGEMENTWINDOWDAYSJSON) {
    pinterest_rest_api_adsAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYSVariable = 0;
    return ENGAGEMENTWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum VIEWWINDOWDAYS for AdsAPI_adsAnalytics

static char* adsAnalytics_VIEWWINDOWDAYS_ToString(pinterest_rest_api_adsAnalytics_view_window_days_e VIEWWINDOWDAYS){
    char *VIEWWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return VIEWWINDOWDAYSArray[VIEWWINDOWDAYS];
}

static pinterest_rest_api_adsAnalytics_view_window_days_e adsAnalytics_VIEWWINDOWDAYS_FromString(char* VIEWWINDOWDAYS){
    int stringToReturn = 0;
    char *VIEWWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    size_t sizeofArray = sizeof(VIEWWINDOWDAYSArray) / sizeof(VIEWWINDOWDAYSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(VIEWWINDOWDAYS, VIEWWINDOWDAYSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adsAnalytics_VIEWWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adsAnalytics_VIEWWINDOWDAYS_convertToJSON(pinterest_rest_api_adsAnalytics_view_window_days_e VIEWWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adsAnalytics_VIEWWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adsAnalytics_view_window_days_e adsAnalytics_VIEWWINDOWDAYS_parseFromJSON(cJSON* VIEWWINDOWDAYSJSON) {
    pinterest_rest_api_adsAnalytics_view_window_days_e VIEWWINDOWDAYSVariable = 0;
    return VIEWWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum CONVERSIONREPORTTIME for AdsAPI_adsAnalytics

static char* adsAnalytics_CONVERSIONREPORTTIME_ToString(pinterest_rest_api_adsAnalytics_conversion_report_time_e CONVERSIONREPORTTIME){
    char *CONVERSIONREPORTTIMEArray[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    return CONVERSIONREPORTTIMEArray[CONVERSIONREPORTTIME];
}

static pinterest_rest_api_adsAnalytics_conversion_report_time_e adsAnalytics_CONVERSIONREPORTTIME_FromString(char* CONVERSIONREPORTTIME){
    int stringToReturn = 0;
    char *CONVERSIONREPORTTIMEArray[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    size_t sizeofArray = sizeof(CONVERSIONREPORTTIMEArray) / sizeof(CONVERSIONREPORTTIMEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(CONVERSIONREPORTTIME, CONVERSIONREPORTTIMEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adsAnalytics_CONVERSIONREPORTTIME_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adsAnalytics_CONVERSIONREPORTTIME_convertToJSON(pinterest_rest_api_adsAnalytics_conversion_report_time_e CONVERSIONREPORTTIME) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_report_time", adsAnalytics_CONVERSIONREPORTTIME_ToString(CONVERSIONREPORTTIME)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adsAnalytics_CONVERSIONREPORTTIME_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adsAnalytics_conversion_report_time_e adsAnalytics_CONVERSIONREPORTTIME_parseFromJSON(cJSON* CONVERSIONREPORTTIMEJSON) {
    pinterest_rest_api_adsAnalytics_conversion_report_time_e CONVERSIONREPORTTIMEVariable = 0;
    cJSON *CONVERSIONREPORTTIMEVar = cJSON_GetObjectItemCaseSensitive(CONVERSIONREPORTTIMEJSON, "conversion_report_time");
    if(!cJSON_IsString(CONVERSIONREPORTTIMEVar) || (CONVERSIONREPORTTIMEVar->valuestring == NULL))
    {
        goto end;
    }
    CONVERSIONREPORTTIMEVariable = adsAnalytics_CONVERSIONREPORTTIME_FromString(CONVERSIONREPORTTIMEVar->valuestring);
    return CONVERSIONREPORTTIMEVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdsAPI_adsAnalytics

static char* adsAnalytics__ToString(pinterest_rest_api_adsAnalytics_reporting_timezone_e ){
    char *Array[] =  { "NULL", "PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE" };
    return Array[];
}

static pinterest_rest_api_adsAnalytics_reporting_timezone_e adsAnalytics__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adsAnalytics__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adsAnalytics__convertToJSON(pinterest_rest_api_adsAnalytics_reporting_timezone_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adsAnalytics__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adsAnalytics_reporting_timezone_e adsAnalytics__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adsAnalytics_reporting_timezone_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for AdsAPI_adsList

static char* adsList__ToString(pinterest_rest_api_adsList_order_e ){
    char *Array[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return Array[];
}

static pinterest_rest_api_adsList_order_e adsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ASCENDING", "DESCENDING" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adsList__convertToJSON(pinterest_rest_api_adsList_order_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adsList_order_e adsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adsList_order_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum ENTITYSTATUSES for AdsAPI_adsList

static char* adsList_ENTITYSTATUSES_ToString(pinterest_rest_api_adsList_entity_statuses_e ENTITYSTATUSES){
    char *ENTITYSTATUSESArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return ENTITYSTATUSESArray[ENTITYSTATUSES];
}

static pinterest_rest_api_adsList_entity_statuses_e adsList_ENTITYSTATUSES_FromString(char* ENTITYSTATUSES){
    int stringToReturn = 0;
    char *ENTITYSTATUSESArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(ENTITYSTATUSESArray) / sizeof(ENTITYSTATUSESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ENTITYSTATUSES, ENTITYSTATUSESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function adsList_ENTITYSTATUSES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adsList_ENTITYSTATUSES_convertToJSON(pinterest_rest_api_adsList_entity_statuses_e ENTITYSTATUSES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adsList_ENTITYSTATUSES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adsList_entity_statuses_e adsList_ENTITYSTATUSES_parseFromJSON(cJSON* ENTITYSTATUSESJSON) {
    pinterest_rest_api_adsList_entity_statuses_e ENTITYSTATUSESVariable = 0;
    return ENTITYSTATUSESVariable;
end:
    return 0;
}
*/


// Create ad preview with pin or image
//
// Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
//
ad_preview_url_response_t*
AdsAPI_adPreviewsCreate(apiClient_t *apiClient, char *ad_account_id, ad_preview_request_t *ad_preview_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/ad_previews");

    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_ad_preview_request = NULL;
    if (ad_preview_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_ad_preview_request = ad_preview_request_convertToJSON(ad_preview_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_ad_preview_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 201) {
    //    printf("%s\n","Resource create operation completed successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    ad_preview_url_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_preview_url_response_parseFromJSON(AdsAPIlocalVarJSON);
        cJSON_Delete(AdsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if (localVarSingleItemJSON_ad_preview_request) {
        cJSON_Delete(localVarSingleItemJSON_ad_preview_request);
        localVarSingleItemJSON_ad_preview_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get targeting analytics for ads
//
// Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
//
metrics_response_t*
AdsAPI_adTargetingAnalyticsGet(apiClient_t *apiClient, char *ad_account_id, list_t *ad_ids, char start_date, char end_date, list_t *targeting_types, list_t *columns, granularity_e granularity, conversion_attribution_window_days_e click_window_days, conversion_attribution_window_days_e engagement_window_days, conversion_attribution_window_days_e view_window_days, conversion_report_time_type_e conversion_report_time, list_t *attribution_types, reporting_time_zone_e reporting_timezone, list_t *sort_columns, int *sort_ascending)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/ads/targeting_analytics");

    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    if (ad_ids)
    {
        list_addElement(localVarQueryParameters,ad_ids);
    }

    // query parameters
    char *keyQuery_start_date = NULL;
    char valueQuery_start_date ;
    keyValuePair_t *keyPairQuery_start_date = 0;
    if (start_date)
    {
        keyQuery_start_date = strdup("start_date");
        valueQuery_start_date = (start_date);
        keyPairQuery_start_date = keyValuePair_create(keyQuery_start_date, &valueQuery_start_date);
        list_addElement(localVarQueryParameters,keyPairQuery_start_date);
    }

    // query parameters
    char *keyQuery_end_date = NULL;
    char valueQuery_end_date ;
    keyValuePair_t *keyPairQuery_end_date = 0;
    if (end_date)
    {
        keyQuery_end_date = strdup("end_date");
        valueQuery_end_date = (end_date);
        keyPairQuery_end_date = keyValuePair_create(keyQuery_end_date, &valueQuery_end_date);
        list_addElement(localVarQueryParameters,keyPairQuery_end_date);
    }

    // query parameters
    if (targeting_types)
    {
        list_addElement(localVarQueryParameters,targeting_types);
    }

    // query parameters
    if (columns)
    {
        list_addElement(localVarQueryParameters,columns);
    }

    // query parameters
    char *keyQuery_granularity = NULL;
    granularity_e valueQuery_granularity ;
    keyValuePair_t *keyPairQuery_granularity = 0;
    if (granularity)
    {
        keyQuery_granularity = strdup("granularity");
        valueQuery_granularity = (granularity);
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, strdup(adTargetingAnalyticsGet__ToString(
        &valueQuery_granularity)));
        list_addElement(localVarQueryParameters,keyPairQuery_granularity);
    }

    // query parameters
    char *keyQuery_click_window_days = NULL;
    conversion_attribution_window_days_e valueQuery_click_window_days ;
    keyValuePair_t *keyPairQuery_click_window_days = 0;
    if (click_window_days)
    {
        keyQuery_click_window_days = strdup("click_window_days");
        valueQuery_click_window_days = (click_window_days);
        keyPairQuery_click_window_days = keyValuePair_create(keyQuery_click_window_days, strdup(adTargetingAnalyticsGet__ToString(
        &valueQuery_click_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_click_window_days);
    }

    // query parameters
    char *keyQuery_engagement_window_days = NULL;
    conversion_attribution_window_days_e valueQuery_engagement_window_days ;
    keyValuePair_t *keyPairQuery_engagement_window_days = 0;
    if (engagement_window_days)
    {
        keyQuery_engagement_window_days = strdup("engagement_window_days");
        valueQuery_engagement_window_days = (engagement_window_days);
        keyPairQuery_engagement_window_days = keyValuePair_create(keyQuery_engagement_window_days, strdup(adTargetingAnalyticsGet__ToString(
        &valueQuery_engagement_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_engagement_window_days);
    }

    // query parameters
    char *keyQuery_view_window_days = NULL;
    conversion_attribution_window_days_e valueQuery_view_window_days ;
    keyValuePair_t *keyPairQuery_view_window_days = 0;
    if (view_window_days)
    {
        keyQuery_view_window_days = strdup("view_window_days");
        valueQuery_view_window_days = (view_window_days);
        keyPairQuery_view_window_days = keyValuePair_create(keyQuery_view_window_days, strdup(adTargetingAnalyticsGet__ToString(
        &valueQuery_view_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_view_window_days);
    }

    // query parameters
    char *keyQuery_conversion_report_time = NULL;
    conversion_report_time_type_e valueQuery_conversion_report_time ;
    keyValuePair_t *keyPairQuery_conversion_report_time = 0;
    if (conversion_report_time)
    {
        keyQuery_conversion_report_time = strdup("conversion_report_time");
        valueQuery_conversion_report_time = (conversion_report_time);
        keyPairQuery_conversion_report_time = keyValuePair_create(keyQuery_conversion_report_time, strdup(adTargetingAnalyticsGet__ToString(
        &valueQuery_conversion_report_time)));
        list_addElement(localVarQueryParameters,keyPairQuery_conversion_report_time);
    }

    // query parameters
    if (attribution_types)
    {
        list_addElement(localVarQueryParameters,attribution_types);
    }

    // query parameters
    char *keyQuery_reporting_timezone = NULL;
    reporting_time_zone_e valueQuery_reporting_timezone ;
    keyValuePair_t *keyPairQuery_reporting_timezone = 0;
    if (reporting_timezone)
    {
        keyQuery_reporting_timezone = strdup("reporting_timezone");
        valueQuery_reporting_timezone = (reporting_timezone);
        keyPairQuery_reporting_timezone = keyValuePair_create(keyQuery_reporting_timezone, strdup(adTargetingAnalyticsGet__ToString(
        &valueQuery_reporting_timezone)));
        list_addElement(localVarQueryParameters,keyPairQuery_reporting_timezone);
    }

    // query parameters
    if (sort_columns)
    {
        list_addElement(localVarQueryParameters,sort_columns);
    }

    // query parameters
    char *keyQuery_sort_ascending = NULL;
    char * valueQuery_sort_ascending = NULL;
    keyValuePair_t *keyPairQuery_sort_ascending = 0;
    if (sort_ascending)
    {
        keyQuery_sort_ascending = strdup("sort_ascending");
        valueQuery_sort_ascending = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_sort_ascending, MAX_NUMBER_LENGTH, "%d", *sort_ascending);
        keyPairQuery_sort_ascending = keyValuePair_create(keyQuery_sort_ascending, valueQuery_sort_ascending);
        list_addElement(localVarQueryParameters,keyPairQuery_sort_ascending);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    metrics_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = metrics_response_parseFromJSON(AdsAPIlocalVarJSON);
        cJSON_Delete(AdsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if(keyQuery_start_date){
        free(keyQuery_start_date);
        keyQuery_start_date = NULL;
    }
    if(keyPairQuery_start_date){
        keyValuePair_free(keyPairQuery_start_date);
        keyPairQuery_start_date = NULL;
    }
    if(keyQuery_end_date){
        free(keyQuery_end_date);
        keyQuery_end_date = NULL;
    }
    if(keyPairQuery_end_date){
        keyValuePair_free(keyPairQuery_end_date);
        keyPairQuery_end_date = NULL;
    }
    if(keyQuery_granularity){
        free(keyQuery_granularity);
        keyQuery_granularity = NULL;
    }
    if(keyPairQuery_granularity){
        keyValuePair_free(keyPairQuery_granularity);
        keyPairQuery_granularity = NULL;
    }
    if(keyQuery_click_window_days){
        free(keyQuery_click_window_days);
        keyQuery_click_window_days = NULL;
    }
    if(keyPairQuery_click_window_days){
        keyValuePair_free(keyPairQuery_click_window_days);
        keyPairQuery_click_window_days = NULL;
    }
    if(keyQuery_engagement_window_days){
        free(keyQuery_engagement_window_days);
        keyQuery_engagement_window_days = NULL;
    }
    if(keyPairQuery_engagement_window_days){
        keyValuePair_free(keyPairQuery_engagement_window_days);
        keyPairQuery_engagement_window_days = NULL;
    }
    if(keyQuery_view_window_days){
        free(keyQuery_view_window_days);
        keyQuery_view_window_days = NULL;
    }
    if(keyPairQuery_view_window_days){
        keyValuePair_free(keyPairQuery_view_window_days);
        keyPairQuery_view_window_days = NULL;
    }
    if(keyQuery_conversion_report_time){
        free(keyQuery_conversion_report_time);
        keyQuery_conversion_report_time = NULL;
    }
    if(keyPairQuery_conversion_report_time){
        keyValuePair_free(keyPairQuery_conversion_report_time);
        keyPairQuery_conversion_report_time = NULL;
    }
    if(keyQuery_reporting_timezone){
        free(keyQuery_reporting_timezone);
        keyQuery_reporting_timezone = NULL;
    }
    if(keyPairQuery_reporting_timezone){
        keyValuePair_free(keyPairQuery_reporting_timezone);
        keyPairQuery_reporting_timezone = NULL;
    }
    if(keyQuery_sort_ascending){
        free(keyQuery_sort_ascending);
        keyQuery_sort_ascending = NULL;
    }
    if(valueQuery_sort_ascending){
        free(valueQuery_sort_ascending);
        valueQuery_sort_ascending = NULL;
    }
    if(keyPairQuery_sort_ascending){
        keyValuePair_free(keyPairQuery_sort_ascending);
        keyPairQuery_sort_ascending = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get ad analytics
//
//     Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
//
list_t*
AdsAPI_adsAnalytics(apiClient_t *apiClient, char start_date, char end_date, list_t *columns, granularity_e granularity, char *ad_account_id, list_t *pin_ids, list_t *ad_ids, double click_window_days, double engagement_window_days, double view_window_days, pinterest_rest_api_adsAnalytics_conversion_report_time_e conversion_report_time, list_t *campaign_ids, reporting_time_zone_e reporting_timezone)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/ads/analytics");

    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    if (pin_ids)
    {
        list_addElement(localVarQueryParameters,pin_ids);
    }

    // query parameters
    char *keyQuery_start_date = NULL;
    char valueQuery_start_date ;
    keyValuePair_t *keyPairQuery_start_date = 0;
    if (start_date)
    {
        keyQuery_start_date = strdup("start_date");
        valueQuery_start_date = (start_date);
        keyPairQuery_start_date = keyValuePair_create(keyQuery_start_date, &valueQuery_start_date);
        list_addElement(localVarQueryParameters,keyPairQuery_start_date);
    }

    // query parameters
    char *keyQuery_end_date = NULL;
    char valueQuery_end_date ;
    keyValuePair_t *keyPairQuery_end_date = 0;
    if (end_date)
    {
        keyQuery_end_date = strdup("end_date");
        valueQuery_end_date = (end_date);
        keyPairQuery_end_date = keyValuePair_create(keyQuery_end_date, &valueQuery_end_date);
        list_addElement(localVarQueryParameters,keyPairQuery_end_date);
    }

    // query parameters
    if (ad_ids)
    {
        list_addElement(localVarQueryParameters,ad_ids);
    }

    // query parameters
    if (columns)
    {
        list_addElement(localVarQueryParameters,columns);
    }

    // query parameters
    char *keyQuery_granularity = NULL;
    granularity_e valueQuery_granularity ;
    keyValuePair_t *keyPairQuery_granularity = 0;
    if (granularity)
    {
        keyQuery_granularity = strdup("granularity");
        valueQuery_granularity = (granularity);
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, strdup(adsAnalytics__ToString(
        &valueQuery_granularity)));
        list_addElement(localVarQueryParameters,keyPairQuery_granularity);
    }

    // query parameters
    char *keyQuery_click_window_days = NULL;
    double valueQuery_click_window_days ;
    keyValuePair_t *keyPairQuery_click_window_days = 0;
    if (click_window_days)
    {
        keyQuery_click_window_days = strdup("click_window_days");
        valueQuery_click_window_days = (click_window_days);
        keyPairQuery_click_window_days = keyValuePair_create(keyQuery_click_window_days, strdup(adsAnalytics_CLICKWINDOWDAYS_ToString(
        &valueQuery_click_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_click_window_days);
    }

    // query parameters
    char *keyQuery_engagement_window_days = NULL;
    double valueQuery_engagement_window_days ;
    keyValuePair_t *keyPairQuery_engagement_window_days = 0;
    if (engagement_window_days)
    {
        keyQuery_engagement_window_days = strdup("engagement_window_days");
        valueQuery_engagement_window_days = (engagement_window_days);
        keyPairQuery_engagement_window_days = keyValuePair_create(keyQuery_engagement_window_days, strdup(adsAnalytics_ENGAGEMENTWINDOWDAYS_ToString(
        &valueQuery_engagement_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_engagement_window_days);
    }

    // query parameters
    char *keyQuery_view_window_days = NULL;
    double valueQuery_view_window_days ;
    keyValuePair_t *keyPairQuery_view_window_days = 0;
    if (view_window_days)
    {
        keyQuery_view_window_days = strdup("view_window_days");
        valueQuery_view_window_days = (view_window_days);
        keyPairQuery_view_window_days = keyValuePair_create(keyQuery_view_window_days, strdup(adsAnalytics_VIEWWINDOWDAYS_ToString(
        &valueQuery_view_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_view_window_days);
    }

    // query parameters
    char *keyQuery_conversion_report_time = NULL;
    pinterest_rest_api_adsAnalytics_conversion_report_time_e valueQuery_conversion_report_time ;
    keyValuePair_t *keyPairQuery_conversion_report_time = 0;
    if (conversion_report_time)
    {
        keyQuery_conversion_report_time = strdup("conversion_report_time");
        valueQuery_conversion_report_time = (conversion_report_time);
        keyPairQuery_conversion_report_time = keyValuePair_create(keyQuery_conversion_report_time, strdup(adsAnalytics_CONVERSIONREPORTTIME_ToString(
        valueQuery_conversion_report_time)));
        list_addElement(localVarQueryParameters,keyPairQuery_conversion_report_time);
    }

    // query parameters
    if (campaign_ids)
    {
        list_addElement(localVarQueryParameters,campaign_ids);
    }

    // query parameters
    char *keyQuery_reporting_timezone = NULL;
    reporting_time_zone_e valueQuery_reporting_timezone ;
    keyValuePair_t *keyPairQuery_reporting_timezone = 0;
    if (reporting_timezone)
    {
        keyQuery_reporting_timezone = strdup("reporting_timezone");
        valueQuery_reporting_timezone = (reporting_timezone);
        keyPairQuery_reporting_timezone = keyValuePair_create(keyQuery_reporting_timezone, strdup(adsAnalytics__ToString(
        &valueQuery_reporting_timezone)));
        list_addElement(localVarQueryParameters,keyPairQuery_reporting_timezone);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(AdsAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, AdsAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( AdsAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
    }
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if(keyQuery_start_date){
        free(keyQuery_start_date);
        keyQuery_start_date = NULL;
    }
    if(keyPairQuery_start_date){
        keyValuePair_free(keyPairQuery_start_date);
        keyPairQuery_start_date = NULL;
    }
    if(keyQuery_end_date){
        free(keyQuery_end_date);
        keyQuery_end_date = NULL;
    }
    if(keyPairQuery_end_date){
        keyValuePair_free(keyPairQuery_end_date);
        keyPairQuery_end_date = NULL;
    }
    if(keyQuery_granularity){
        free(keyQuery_granularity);
        keyQuery_granularity = NULL;
    }
    if(keyPairQuery_granularity){
        keyValuePair_free(keyPairQuery_granularity);
        keyPairQuery_granularity = NULL;
    }
    if(keyQuery_click_window_days){
        free(keyQuery_click_window_days);
        keyQuery_click_window_days = NULL;
    }
    if(keyPairQuery_click_window_days){
        keyValuePair_free(keyPairQuery_click_window_days);
        keyPairQuery_click_window_days = NULL;
    }
    if(keyQuery_engagement_window_days){
        free(keyQuery_engagement_window_days);
        keyQuery_engagement_window_days = NULL;
    }
    if(keyPairQuery_engagement_window_days){
        keyValuePair_free(keyPairQuery_engagement_window_days);
        keyPairQuery_engagement_window_days = NULL;
    }
    if(keyQuery_view_window_days){
        free(keyQuery_view_window_days);
        keyQuery_view_window_days = NULL;
    }
    if(keyPairQuery_view_window_days){
        keyValuePair_free(keyPairQuery_view_window_days);
        keyPairQuery_view_window_days = NULL;
    }
    if(keyQuery_conversion_report_time){
        free(keyQuery_conversion_report_time);
        keyQuery_conversion_report_time = NULL;
    }
    if(keyPairQuery_conversion_report_time){
        keyValuePair_free(keyPairQuery_conversion_report_time);
        keyPairQuery_conversion_report_time = NULL;
    }
    if(keyQuery_reporting_timezone){
        free(keyQuery_reporting_timezone);
        keyQuery_reporting_timezone = NULL;
    }
    if(keyPairQuery_reporting_timezone){
        keyValuePair_free(keyPairQuery_reporting_timezone);
        keyPairQuery_reporting_timezone = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create ads
//
// Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
//
ad_batch_write_response_model_t*
AdsAPI_adsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *ad_create)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/ads");

    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    //notstring
    cJSON *localVar_ad_create = NULL;
    cJSON *localVarItemJSON_ad_create = NULL;
    cJSON *localVarSingleItemJSON_ad_create = NULL;
    if (ad_create != NULL)
    {
        localVarItemJSON_ad_create = cJSON_CreateObject();
        localVarSingleItemJSON_ad_create = cJSON_AddArrayToObject(localVarItemJSON_ad_create, "ad_create");
        if (localVarSingleItemJSON_ad_create == NULL)
        {
            // nonprimitive container

            goto end;
        }
    }

    listEntry_t *ad_createBodyListEntry;
    list_ForEach(ad_createBodyListEntry, ad_create)
    {
        localVar_ad_create = ad_create_convertToJSON(ad_createBodyListEntry->data);
        if(localVar_ad_create == NULL)
        {
            goto end;
        }
        cJSON_AddItemToArray(localVarSingleItemJSON_ad_create, localVar_ad_create);
        localVarBodyParameters = cJSON_Print(localVarItemJSON_ad_create);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    ad_batch_write_response_model_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_batch_write_response_model_parseFromJSON(AdsAPIlocalVarJSON);
        cJSON_Delete(AdsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if (localVarItemJSON_ad_create) {
        cJSON_Delete(localVarItemJSON_ad_create);
        localVarItemJSON_ad_create = NULL;
    }
    if (localVarSingleItemJSON_ad_create) {
        cJSON_Delete(localVarSingleItemJSON_ad_create);
        localVarSingleItemJSON_ad_create = NULL;
    }
    if (localVar_ad_create) {
        cJSON_Delete(localVar_ad_create);
        localVar_ad_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get ad
//
// Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
//
ad_t*
AdsAPI_adsGet(apiClient_t *apiClient, char *ad_id, char *ad_account_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/ads/{ad_id}");

    if(!ad_id)
        goto end;
    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_id = strlen(ad_id)+3 + strlen(ad_account_id)+3 + sizeof("{ ad_id }") - 1;
    if(ad_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_id = malloc(sizeOfPathParams_ad_id);
    sprintf(localVarToReplace_ad_id, "{%s}", "ad_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_id, ad_id);

    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_id)+3 + strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    ad_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_parseFromJSON(AdsAPIlocalVarJSON);
        cJSON_Delete(AdsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_ad_id);
    free(localVarToReplace_ad_account_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List ads
//
// List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
//
ads_list_200_response_t*
AdsAPI_adsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, list_t *campaign_ids, list_t *ad_group_ids, list_t *ad_ids, list_t *entity_statuses)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/ads");

    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
    }

    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }

    // query parameters
    char *keyQuery_order = NULL;
    pinterest_lib_pagination_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(adsList__ToString(
        &valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    if (campaign_ids)
    {
        list_addElement(localVarQueryParameters,campaign_ids);
    }

    // query parameters
    if (ad_group_ids)
    {
        list_addElement(localVarQueryParameters,ad_group_ids);
    }

    // query parameters
    if (ad_ids)
    {
        list_addElement(localVarQueryParameters,ad_ids);
    }

    // query parameters
    if (entity_statuses)
    {
        list_addElement(localVarQueryParameters,entity_statuses);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    ads_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ads_list_200_response_parseFromJSON(AdsAPIlocalVarJSON);
        cJSON_Delete(AdsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update ads
//
// Update multiple existing ads
//
ad_batch_write_response_model_t*
AdsAPI_adsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *ad_batch_update)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/ads");

    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    //notstring
    cJSON *localVar_ad_batch_update = NULL;
    cJSON *localVarItemJSON_ad_batch_update = NULL;
    cJSON *localVarSingleItemJSON_ad_batch_update = NULL;
    if (ad_batch_update != NULL)
    {
        localVarItemJSON_ad_batch_update = cJSON_CreateObject();
        localVarSingleItemJSON_ad_batch_update = cJSON_AddArrayToObject(localVarItemJSON_ad_batch_update, "ad_batch_update");
        if (localVarSingleItemJSON_ad_batch_update == NULL)
        {
            // nonprimitive container

            goto end;
        }
    }

    listEntry_t *ad_batch_updateBodyListEntry;
    list_ForEach(ad_batch_updateBodyListEntry, ad_batch_update)
    {
        localVar_ad_batch_update = ad_batch_update_convertToJSON(ad_batch_updateBodyListEntry->data);
        if(localVar_ad_batch_update == NULL)
        {
            goto end;
        }
        cJSON_AddItemToArray(localVarSingleItemJSON_ad_batch_update, localVar_ad_batch_update);
        localVarBodyParameters = cJSON_Print(localVarItemJSON_ad_batch_update);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "PATCH");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    //nonprimitive not container
    ad_batch_write_response_model_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_batch_write_response_model_parseFromJSON(AdsAPIlocalVarJSON);
        cJSON_Delete(AdsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if (localVarItemJSON_ad_batch_update) {
        cJSON_Delete(localVarItemJSON_ad_batch_update);
        localVarItemJSON_ad_batch_update = NULL;
    }
    if (localVarSingleItemJSON_ad_batch_update) {
        cJSON_Delete(localVarSingleItemJSON_ad_batch_update);
        localVarSingleItemJSON_ad_batch_update = NULL;
    }
    if (localVar_ad_batch_update) {
        cJSON_Delete(localVar_ad_batch_update);
        localVar_ad_batch_update = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create ad preview records for one or more ad groups
//
// Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
//
list_t*
AdsAPI_campaignAdPreviewCreate(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_ad_preview_create)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/campaign_ad_preview");

    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    //notstring
    cJSON *localVar_campaign_ad_preview_create = NULL;
    cJSON *localVarItemJSON_campaign_ad_preview_create = NULL;
    cJSON *localVarSingleItemJSON_campaign_ad_preview_create = NULL;
    if (campaign_ad_preview_create != NULL)
    {
        localVarItemJSON_campaign_ad_preview_create = cJSON_CreateObject();
        localVarSingleItemJSON_campaign_ad_preview_create = cJSON_AddArrayToObject(localVarItemJSON_campaign_ad_preview_create, "campaign_ad_preview_create");
        if (localVarSingleItemJSON_campaign_ad_preview_create == NULL)
        {
            // nonprimitive container

            goto end;
        }
    }

    listEntry_t *campaign_ad_preview_createBodyListEntry;
    list_ForEach(campaign_ad_preview_createBodyListEntry, campaign_ad_preview_create)
    {
        localVar_campaign_ad_preview_create = campaign_ad_preview_create_convertToJSON(campaign_ad_preview_createBodyListEntry->data);
        if(localVar_campaign_ad_preview_create == NULL)
        {
            goto end;
        }
        cJSON_AddItemToArray(localVarSingleItemJSON_campaign_ad_preview_create, localVar_campaign_ad_preview_create);
        localVarBodyParameters = cJSON_Print(localVarItemJSON_campaign_ad_preview_create);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 201) {
    //    printf("%s\n","Resource create operation completed successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(AdsAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, AdsAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( AdsAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
    }
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    if (localVarItemJSON_campaign_ad_preview_create) {
        cJSON_Delete(localVarItemJSON_campaign_ad_preview_create);
        localVarItemJSON_campaign_ad_preview_create = NULL;
    }
    if (localVarSingleItemJSON_campaign_ad_preview_create) {
        cJSON_Delete(localVarSingleItemJSON_campaign_ad_preview_create);
        localVarSingleItemJSON_campaign_ad_preview_create = NULL;
    }
    if (localVar_campaign_ad_preview_create) {
        cJSON_Delete(localVar_campaign_ad_preview_create);
        localVar_campaign_ad_preview_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete ad preview records for one or more ad groups
//
// Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
//
list_t*
AdsAPI_campaignAdPreviewDelete(apiClient_t *apiClient, list_t *ad_group_ids, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/campaign_ad_preview");

    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    if (ad_group_ids)
    {
        list_addElement(localVarQueryParameters,ad_group_ids);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 204) {
    //    printf("%s\n","Resource deleted successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(AdsAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, AdsAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( AdsAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
    }
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Fetch ad preview records for one or more ad groups
//
// Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
//
list_t*
AdsAPI_campaignAdPreviewRead(apiClient_t *apiClient, list_t *ad_group_ids, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/campaign_ad_preview");

    if(!ad_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    if (ad_group_ids)
    {
        list_addElement(localVarQueryParameters,ad_group_ids);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(AdsAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, AdsAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( AdsAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
    }
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

