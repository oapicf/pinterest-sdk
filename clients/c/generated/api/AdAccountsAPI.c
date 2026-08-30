#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "AdAccountsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum COLUMNS for AdAccountsAPI_adAccountAnalytics

static char* adAccountAnalytics_COLUMNS_ToString(pinterest_rest_api_adAccountAnalytics_columns_e COLUMNS){
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "OUTBOUND_CTR_1", "CAMPAIGN_NAME", "CAMPAIGN_BRAND_LABEL", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_NAME", "AD_GROUP_BUDGET_TYPE", "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY", "AD_GROUP_ENTITY_STATUS", "AD_GROUP_BID_MULTIPLIER", "PROMO_ID", "PROMO_NAME", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "COLLECTION_PIN_ITEM_IMPRESSION_1", "COLLECTION_PIN_ITEM_IMPRESSION_2", "TOTAL_COLLECTION_PIN_ITEM_IMPRESSION", "COLLECTION_PIN_ITEM_CLICKTHROUGH_1", "COLLECTION_PIN_ITEM_CLICKTHROUGH_2", "TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "AD_NAME", "CAMPAIGN_LIFETIME_SPEND_CAP", "AD_GROUP_OPTIMIZATION", "CAMPAIGN_DAILY_SPEND_CAP", "CAMPAIGN_BUDGET_OPTIMIZATION", "IS_PREMIERE_CAMPAIGN", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_ADD_TO_WISHLIST", "TOTAL_SUBSCRIBE", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "PRODUCT_GROUP_AD_IMAGE_TAG", "PRODUCT_GROUP_AD_VIDEO_TAG", "VIDEO_3SEC_VIEWS_1", "VIDEO_15SEC_UNIQUE_VIEWS_1", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_15SEC_UNIQUE_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "VIDEO_SPEND_IN_DOLLAR", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "TOTAL_APP_INSTALL_CONVERSION_RATE", "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE", "INAPP_SKAN_APP_INSTALL", "INAPP_SKAN_ASSISTED_APP_INSTALL", "INAPP_SKAN_APP_INSTALL_COST_PER_ACTION", "INAPP_SKAN_APP_INSTALL_CONVERSION_RATE" };
    return COLUMNSArray[COLUMNS];
}

static pinterest_rest_api_adAccountAnalytics_columns_e adAccountAnalytics_COLUMNS_FromString(char* COLUMNS){
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
// Function adAccountAnalytics_COLUMNS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountAnalytics_COLUMNS_convertToJSON(pinterest_rest_api_adAccountAnalytics_columns_e COLUMNS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountAnalytics_COLUMNS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountAnalytics_columns_e adAccountAnalytics_COLUMNS_parseFromJSON(cJSON* COLUMNSJSON) {
    pinterest_rest_api_adAccountAnalytics_columns_e COLUMNSVariable = 0;
    return COLUMNSVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdAccountsAPI_adAccountAnalytics

static char* adAccountAnalytics__ToString(pinterest_rest_api_adAccountAnalytics_granularity_e ){
    char *Array[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    return Array[];
}

static pinterest_rest_api_adAccountAnalytics_granularity_e adAccountAnalytics__FromString(char* ){
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
// Function adAccountAnalytics__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountAnalytics__convertToJSON(pinterest_rest_api_adAccountAnalytics_granularity_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountAnalytics__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountAnalytics_granularity_e adAccountAnalytics__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adAccountAnalytics_granularity_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum CLICKWINDOWDAYS for AdAccountsAPI_adAccountAnalytics

static char* adAccountAnalytics_CLICKWINDOWDAYS_ToString(pinterest_rest_api_adAccountAnalytics_click_window_days_e CLICKWINDOWDAYS){
    char *CLICKWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return CLICKWINDOWDAYSArray[CLICKWINDOWDAYS];
}

static pinterest_rest_api_adAccountAnalytics_click_window_days_e adAccountAnalytics_CLICKWINDOWDAYS_FromString(char* CLICKWINDOWDAYS){
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
// Function adAccountAnalytics_CLICKWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountAnalytics_CLICKWINDOWDAYS_convertToJSON(pinterest_rest_api_adAccountAnalytics_click_window_days_e CLICKWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountAnalytics_CLICKWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountAnalytics_click_window_days_e adAccountAnalytics_CLICKWINDOWDAYS_parseFromJSON(cJSON* CLICKWINDOWDAYSJSON) {
    pinterest_rest_api_adAccountAnalytics_click_window_days_e CLICKWINDOWDAYSVariable = 0;
    return CLICKWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum ENGAGEMENTWINDOWDAYS for AdAccountsAPI_adAccountAnalytics

static char* adAccountAnalytics_ENGAGEMENTWINDOWDAYS_ToString(pinterest_rest_api_adAccountAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYS){
    char *ENGAGEMENTWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return ENGAGEMENTWINDOWDAYSArray[ENGAGEMENTWINDOWDAYS];
}

static pinterest_rest_api_adAccountAnalytics_engagement_window_days_e adAccountAnalytics_ENGAGEMENTWINDOWDAYS_FromString(char* ENGAGEMENTWINDOWDAYS){
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
// Function adAccountAnalytics_ENGAGEMENTWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountAnalytics_ENGAGEMENTWINDOWDAYS_convertToJSON(pinterest_rest_api_adAccountAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountAnalytics_ENGAGEMENTWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountAnalytics_engagement_window_days_e adAccountAnalytics_ENGAGEMENTWINDOWDAYS_parseFromJSON(cJSON* ENGAGEMENTWINDOWDAYSJSON) {
    pinterest_rest_api_adAccountAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYSVariable = 0;
    return ENGAGEMENTWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum VIEWWINDOWDAYS for AdAccountsAPI_adAccountAnalytics

static char* adAccountAnalytics_VIEWWINDOWDAYS_ToString(pinterest_rest_api_adAccountAnalytics_view_window_days_e VIEWWINDOWDAYS){
    char *VIEWWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return VIEWWINDOWDAYSArray[VIEWWINDOWDAYS];
}

static pinterest_rest_api_adAccountAnalytics_view_window_days_e adAccountAnalytics_VIEWWINDOWDAYS_FromString(char* VIEWWINDOWDAYS){
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
// Function adAccountAnalytics_VIEWWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountAnalytics_VIEWWINDOWDAYS_convertToJSON(pinterest_rest_api_adAccountAnalytics_view_window_days_e VIEWWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountAnalytics_VIEWWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountAnalytics_view_window_days_e adAccountAnalytics_VIEWWINDOWDAYS_parseFromJSON(cJSON* VIEWWINDOWDAYSJSON) {
    pinterest_rest_api_adAccountAnalytics_view_window_days_e VIEWWINDOWDAYSVariable = 0;
    return VIEWWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum CONVERSIONREPORTTIME for AdAccountsAPI_adAccountAnalytics

static char* adAccountAnalytics_CONVERSIONREPORTTIME_ToString(pinterest_rest_api_adAccountAnalytics_conversion_report_time_e CONVERSIONREPORTTIME){
    char *CONVERSIONREPORTTIMEArray[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    return CONVERSIONREPORTTIMEArray[CONVERSIONREPORTTIME];
}

static pinterest_rest_api_adAccountAnalytics_conversion_report_time_e adAccountAnalytics_CONVERSIONREPORTTIME_FromString(char* CONVERSIONREPORTTIME){
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
// Function adAccountAnalytics_CONVERSIONREPORTTIME_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountAnalytics_CONVERSIONREPORTTIME_convertToJSON(pinterest_rest_api_adAccountAnalytics_conversion_report_time_e CONVERSIONREPORTTIME) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_report_time", adAccountAnalytics_CONVERSIONREPORTTIME_ToString(CONVERSIONREPORTTIME)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountAnalytics_CONVERSIONREPORTTIME_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountAnalytics_conversion_report_time_e adAccountAnalytics_CONVERSIONREPORTTIME_parseFromJSON(cJSON* CONVERSIONREPORTTIMEJSON) {
    pinterest_rest_api_adAccountAnalytics_conversion_report_time_e CONVERSIONREPORTTIMEVariable = 0;
    cJSON *CONVERSIONREPORTTIMEVar = cJSON_GetObjectItemCaseSensitive(CONVERSIONREPORTTIMEJSON, "conversion_report_time");
    if(!cJSON_IsString(CONVERSIONREPORTTIMEVar) || (CONVERSIONREPORTTIMEVar->valuestring == NULL))
    {
        goto end;
    }
    CONVERSIONREPORTTIMEVariable = adAccountAnalytics_CONVERSIONREPORTTIME_FromString(CONVERSIONREPORTTIMEVar->valuestring);
    return CONVERSIONREPORTTIMEVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdAccountsAPI_adAccountAnalytics

static char* adAccountAnalytics__ToString(pinterest_rest_api_adAccountAnalytics_reporting_timezone_e ){
    char *Array[] =  { "NULL", "PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE" };
    return Array[];
}

static pinterest_rest_api_adAccountAnalytics_reporting_timezone_e adAccountAnalytics__FromString(char* ){
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
// Function adAccountAnalytics__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountAnalytics__convertToJSON(pinterest_rest_api_adAccountAnalytics_reporting_timezone_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountAnalytics__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountAnalytics_reporting_timezone_e adAccountAnalytics__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adAccountAnalytics_reporting_timezone_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum TARGETINGTYPES for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet_TARGETINGTYPES_ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_targeting_types_e TARGETINGTYPES){
    char *TARGETINGTYPESArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION", "AGE_BUCKET_AND_GENDER" };
    return TARGETINGTYPESArray[TARGETINGTYPES];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_targeting_types_e adAccountTargetingAnalyticsGet_TARGETINGTYPES_FromString(char* TARGETINGTYPES){
    int stringToReturn = 0;
    char *TARGETINGTYPESArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION", "AGE_BUCKET_AND_GENDER" };
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
// Function adAccountTargetingAnalyticsGet_TARGETINGTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountTargetingAnalyticsGet_TARGETINGTYPES_convertToJSON(pinterest_rest_api_adAccountTargetingAnalyticsGet_targeting_types_e TARGETINGTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountTargetingAnalyticsGet_TARGETINGTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountTargetingAnalyticsGet_targeting_types_e adAccountTargetingAnalyticsGet_TARGETINGTYPES_parseFromJSON(cJSON* TARGETINGTYPESJSON) {
    pinterest_rest_api_adAccountTargetingAnalyticsGet_targeting_types_e TARGETINGTYPESVariable = 0;
    return TARGETINGTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum COLUMNS for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet_COLUMNS_ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_columns_e COLUMNS){
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "OUTBOUND_CTR_1", "CAMPAIGN_NAME", "CAMPAIGN_BRAND_LABEL", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_NAME", "AD_GROUP_BUDGET_TYPE", "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY", "AD_GROUP_ENTITY_STATUS", "AD_GROUP_BID_MULTIPLIER", "PROMO_ID", "PROMO_NAME", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "COLLECTION_PIN_ITEM_IMPRESSION_1", "COLLECTION_PIN_ITEM_IMPRESSION_2", "TOTAL_COLLECTION_PIN_ITEM_IMPRESSION", "COLLECTION_PIN_ITEM_CLICKTHROUGH_1", "COLLECTION_PIN_ITEM_CLICKTHROUGH_2", "TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "AD_NAME", "CAMPAIGN_LIFETIME_SPEND_CAP", "AD_GROUP_OPTIMIZATION", "CAMPAIGN_DAILY_SPEND_CAP", "CAMPAIGN_BUDGET_OPTIMIZATION", "IS_PREMIERE_CAMPAIGN", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_ADD_TO_WISHLIST", "TOTAL_SUBSCRIBE", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "PRODUCT_GROUP_AD_IMAGE_TAG", "PRODUCT_GROUP_AD_VIDEO_TAG", "VIDEO_3SEC_VIEWS_1", "VIDEO_15SEC_UNIQUE_VIEWS_1", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_15SEC_UNIQUE_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "VIDEO_SPEND_IN_DOLLAR", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "TOTAL_APP_INSTALL_CONVERSION_RATE", "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE", "INAPP_SKAN_APP_INSTALL", "INAPP_SKAN_ASSISTED_APP_INSTALL", "INAPP_SKAN_APP_INSTALL_COST_PER_ACTION", "INAPP_SKAN_APP_INSTALL_CONVERSION_RATE" };
    return COLUMNSArray[COLUMNS];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_columns_e adAccountTargetingAnalyticsGet_COLUMNS_FromString(char* COLUMNS){
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
// Function adAccountTargetingAnalyticsGet_COLUMNS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountTargetingAnalyticsGet_COLUMNS_convertToJSON(pinterest_rest_api_adAccountTargetingAnalyticsGet_columns_e COLUMNS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountTargetingAnalyticsGet_COLUMNS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountTargetingAnalyticsGet_columns_e adAccountTargetingAnalyticsGet_COLUMNS_parseFromJSON(cJSON* COLUMNSJSON) {
    pinterest_rest_api_adAccountTargetingAnalyticsGet_columns_e COLUMNSVariable = 0;
    return COLUMNSVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet__ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_granularity_e ){
    char *Array[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    return Array[];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_granularity_e adAccountTargetingAnalyticsGet__FromString(char* ){
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
// Function adAccountTargetingAnalyticsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adAccountTargetingAnalyticsGet_granularity_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountTargetingAnalyticsGet_granularity_e adAccountTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adAccountTargetingAnalyticsGet_granularity_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum CLICKWINDOWDAYS for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet_CLICKWINDOWDAYS_ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_click_window_days_e CLICKWINDOWDAYS){
    char *CLICKWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return CLICKWINDOWDAYSArray[CLICKWINDOWDAYS];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_click_window_days_e adAccountTargetingAnalyticsGet_CLICKWINDOWDAYS_FromString(char* CLICKWINDOWDAYS){
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
// Function adAccountTargetingAnalyticsGet_CLICKWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountTargetingAnalyticsGet_CLICKWINDOWDAYS_convertToJSON(pinterest_rest_api_adAccountTargetingAnalyticsGet_click_window_days_e CLICKWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountTargetingAnalyticsGet_CLICKWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountTargetingAnalyticsGet_click_window_days_e adAccountTargetingAnalyticsGet_CLICKWINDOWDAYS_parseFromJSON(cJSON* CLICKWINDOWDAYSJSON) {
    pinterest_rest_api_adAccountTargetingAnalyticsGet_click_window_days_e CLICKWINDOWDAYSVariable = 0;
    return CLICKWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum ENGAGEMENTWINDOWDAYS for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_engagement_window_days_e ENGAGEMENTWINDOWDAYS){
    char *ENGAGEMENTWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return ENGAGEMENTWINDOWDAYSArray[ENGAGEMENTWINDOWDAYS];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_engagement_window_days_e adAccountTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_FromString(char* ENGAGEMENTWINDOWDAYS){
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
// Function adAccountTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_convertToJSON(pinterest_rest_api_adAccountTargetingAnalyticsGet_engagement_window_days_e ENGAGEMENTWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountTargetingAnalyticsGet_engagement_window_days_e adAccountTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_parseFromJSON(cJSON* ENGAGEMENTWINDOWDAYSJSON) {
    pinterest_rest_api_adAccountTargetingAnalyticsGet_engagement_window_days_e ENGAGEMENTWINDOWDAYSVariable = 0;
    return ENGAGEMENTWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum VIEWWINDOWDAYS for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet_VIEWWINDOWDAYS_ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_view_window_days_e VIEWWINDOWDAYS){
    char *VIEWWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return VIEWWINDOWDAYSArray[VIEWWINDOWDAYS];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_view_window_days_e adAccountTargetingAnalyticsGet_VIEWWINDOWDAYS_FromString(char* VIEWWINDOWDAYS){
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
// Function adAccountTargetingAnalyticsGet_VIEWWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountTargetingAnalyticsGet_VIEWWINDOWDAYS_convertToJSON(pinterest_rest_api_adAccountTargetingAnalyticsGet_view_window_days_e VIEWWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountTargetingAnalyticsGet_VIEWWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountTargetingAnalyticsGet_view_window_days_e adAccountTargetingAnalyticsGet_VIEWWINDOWDAYS_parseFromJSON(cJSON* VIEWWINDOWDAYSJSON) {
    pinterest_rest_api_adAccountTargetingAnalyticsGet_view_window_days_e VIEWWINDOWDAYSVariable = 0;
    return VIEWWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum CONVERSIONREPORTTIME for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet_CONVERSIONREPORTTIME_ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_conversion_report_time_e CONVERSIONREPORTTIME){
    char *CONVERSIONREPORTTIMEArray[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    return CONVERSIONREPORTTIMEArray[CONVERSIONREPORTTIME];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_conversion_report_time_e adAccountTargetingAnalyticsGet_CONVERSIONREPORTTIME_FromString(char* CONVERSIONREPORTTIME){
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
// Function adAccountTargetingAnalyticsGet_CONVERSIONREPORTTIME_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountTargetingAnalyticsGet_CONVERSIONREPORTTIME_convertToJSON(pinterest_rest_api_adAccountTargetingAnalyticsGet_conversion_report_time_e CONVERSIONREPORTTIME) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_report_time", adAccountTargetingAnalyticsGet_CONVERSIONREPORTTIME_ToString(CONVERSIONREPORTTIME)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountTargetingAnalyticsGet_CONVERSIONREPORTTIME_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountTargetingAnalyticsGet_conversion_report_time_e adAccountTargetingAnalyticsGet_CONVERSIONREPORTTIME_parseFromJSON(cJSON* CONVERSIONREPORTTIMEJSON) {
    pinterest_rest_api_adAccountTargetingAnalyticsGet_conversion_report_time_e CONVERSIONREPORTTIMEVariable = 0;
    cJSON *CONVERSIONREPORTTIMEVar = cJSON_GetObjectItemCaseSensitive(CONVERSIONREPORTTIMEJSON, "conversion_report_time");
    if(!cJSON_IsString(CONVERSIONREPORTTIMEVar) || (CONVERSIONREPORTTIMEVar->valuestring == NULL))
    {
        goto end;
    }
    CONVERSIONREPORTTIMEVariable = adAccountTargetingAnalyticsGet_CONVERSIONREPORTTIME_FromString(CONVERSIONREPORTTIMEVar->valuestring);
    return CONVERSIONREPORTTIMEVariable;
end:
    return 0;
}
*/

// Functions for enum ATTRIBUTIONTYPES for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet_ATTRIBUTIONTYPES_ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_attribution_types_e ATTRIBUTIONTYPES){
    char *ATTRIBUTIONTYPESArray[] =  { "NULL", "INDIVIDUAL", "HOUSEHOLD" };
    return ATTRIBUTIONTYPESArray[ATTRIBUTIONTYPES];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_attribution_types_e adAccountTargetingAnalyticsGet_ATTRIBUTIONTYPES_FromString(char* ATTRIBUTIONTYPES){
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
// Function adAccountTargetingAnalyticsGet_ATTRIBUTIONTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountTargetingAnalyticsGet_ATTRIBUTIONTYPES_convertToJSON(pinterest_rest_api_adAccountTargetingAnalyticsGet_attribution_types_e ATTRIBUTIONTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountTargetingAnalyticsGet_ATTRIBUTIONTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountTargetingAnalyticsGet_attribution_types_e adAccountTargetingAnalyticsGet_ATTRIBUTIONTYPES_parseFromJSON(cJSON* ATTRIBUTIONTYPESJSON) {
    pinterest_rest_api_adAccountTargetingAnalyticsGet_attribution_types_e ATTRIBUTIONTYPESVariable = 0;
    return ATTRIBUTIONTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet__ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_reporting_timezone_e ){
    char *Array[] =  { "NULL", "PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE" };
    return Array[];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_reporting_timezone_e adAccountTargetingAnalyticsGet__FromString(char* ){
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
// Function adAccountTargetingAnalyticsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adAccountTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adAccountTargetingAnalyticsGet_reporting_timezone_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountTargetingAnalyticsGet_reporting_timezone_e adAccountTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adAccountTargetingAnalyticsGet_reporting_timezone_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for AdAccountsAPI_analyticsCreateTemplateReport

static char* analyticsCreateTemplateReport__ToString(pinterest_rest_api_analyticsCreateTemplateReport_granularity_e ){
    char *Array[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    return Array[];
}

static pinterest_rest_api_analyticsCreateTemplateReport_granularity_e analyticsCreateTemplateReport__FromString(char* ){
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
// Function analyticsCreateTemplateReport__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *analyticsCreateTemplateReport__convertToJSON(pinterest_rest_api_analyticsCreateTemplateReport_granularity_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function analyticsCreateTemplateReport__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_analyticsCreateTemplateReport_granularity_e analyticsCreateTemplateReport__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_analyticsCreateTemplateReport_granularity_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for AdAccountsAPI_templatesList

static char* templatesList__ToString(pinterest_rest_api_templatesList_order_e ){
    char *Array[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return Array[];
}

static pinterest_rest_api_templatesList_order_e templatesList__FromString(char* ){
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
// Function templatesList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *templatesList__convertToJSON(pinterest_rest_api_templatesList_order_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function templatesList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_templatesList_order_e templatesList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_templatesList_order_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Get ad account analytics
//
//   Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
//
list_t*
AdAccountsAPI_adAccountAnalytics(apiClient_t *apiClient, char start_date, char end_date, list_t *columns, granularity_e granularity, char *ad_account_id, double click_window_days, double engagement_window_days, double view_window_days, pinterest_rest_api_adAccountAnalytics_conversion_report_time_e conversion_report_time, reporting_time_zone_e reporting_timezone)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/analytics");

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
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, strdup(adAccountAnalytics__ToString(
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
        keyPairQuery_click_window_days = keyValuePair_create(keyQuery_click_window_days, strdup(adAccountAnalytics_CLICKWINDOWDAYS_ToString(
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
        keyPairQuery_engagement_window_days = keyValuePair_create(keyQuery_engagement_window_days, strdup(adAccountAnalytics_ENGAGEMENTWINDOWDAYS_ToString(
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
        keyPairQuery_view_window_days = keyValuePair_create(keyQuery_view_window_days, strdup(adAccountAnalytics_VIEWWINDOWDAYS_ToString(
        &valueQuery_view_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_view_window_days);
    }

    // query parameters
    char *keyQuery_conversion_report_time = NULL;
    pinterest_rest_api_adAccountAnalytics_conversion_report_time_e valueQuery_conversion_report_time ;
    keyValuePair_t *keyPairQuery_conversion_report_time = 0;
    if (conversion_report_time)
    {
        keyQuery_conversion_report_time = strdup("conversion_report_time");
        valueQuery_conversion_report_time = (conversion_report_time);
        keyPairQuery_conversion_report_time = keyValuePair_create(keyQuery_conversion_report_time, strdup(adAccountAnalytics_CONVERSIONREPORTTIME_ToString(
        valueQuery_conversion_report_time)));
        list_addElement(localVarQueryParameters,keyPairQuery_conversion_report_time);
    }

    // query parameters
    char *keyQuery_reporting_timezone = NULL;
    reporting_time_zone_e valueQuery_reporting_timezone ;
    keyValuePair_t *keyPairQuery_reporting_timezone = 0;
    if (reporting_timezone)
    {
        keyQuery_reporting_timezone = strdup("reporting_timezone");
        valueQuery_reporting_timezone = (reporting_timezone);
        keyPairQuery_reporting_timezone = keyValuePair_create(keyQuery_reporting_timezone, strdup(adAccountAnalytics__ToString(
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
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(AdAccountsAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, AdAccountsAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( AdAccountsAPIlocalVarJSON);
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

// Get targeting analytics for an ad account
//
// Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
//
metrics_response_t*
AdAccountsAPI_adAccountTargetingAnalyticsGet(apiClient_t *apiClient, char *ad_account_id, char start_date, char end_date, list_t *targeting_types, list_t *columns, granularity_e granularity, double click_window_days, double engagement_window_days, double view_window_days, pinterest_rest_api_adAccountTargetingAnalyticsGet_conversion_report_time_e conversion_report_time, list_t *attribution_types, reporting_time_zone_e reporting_timezone)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/targeting_analytics");

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
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, strdup(adAccountTargetingAnalyticsGet__ToString(
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
        keyPairQuery_click_window_days = keyValuePair_create(keyQuery_click_window_days, strdup(adAccountTargetingAnalyticsGet_CLICKWINDOWDAYS_ToString(
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
        keyPairQuery_engagement_window_days = keyValuePair_create(keyQuery_engagement_window_days, strdup(adAccountTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_ToString(
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
        keyPairQuery_view_window_days = keyValuePair_create(keyQuery_view_window_days, strdup(adAccountTargetingAnalyticsGet_VIEWWINDOWDAYS_ToString(
        &valueQuery_view_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_view_window_days);
    }

    // query parameters
    char *keyQuery_conversion_report_time = NULL;
    pinterest_rest_api_adAccountTargetingAnalyticsGet_conversion_report_time_e valueQuery_conversion_report_time ;
    keyValuePair_t *keyPairQuery_conversion_report_time = 0;
    if (conversion_report_time)
    {
        keyQuery_conversion_report_time = strdup("conversion_report_time");
        valueQuery_conversion_report_time = (conversion_report_time);
        keyPairQuery_conversion_report_time = keyValuePair_create(keyQuery_conversion_report_time, strdup(adAccountTargetingAnalyticsGet_CONVERSIONREPORTTIME_ToString(
        valueQuery_conversion_report_time)));
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
        keyPairQuery_reporting_timezone = keyValuePair_create(keyQuery_reporting_timezone, strdup(adAccountTargetingAnalyticsGet__ToString(
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
    //nonprimitive not container
    metrics_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = metrics_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create ad account
//
// Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
//
ad_account_t*
AdAccountsAPI_adAccountsCreate(apiClient_t *apiClient, ad_account_create_t *ad_account_create)
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
    char *localVarPath = strdup("/ad_accounts");





    // Body Param
    cJSON *localVarSingleItemJSON_ad_account_create = NULL;
    if (ad_account_create != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_ad_account_create = ad_account_create_convertToJSON(ad_account_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_ad_account_create);
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
    ad_account_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_account_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_ad_account_create) {
        cJSON_Delete(localVarSingleItemJSON_ad_account_create);
        localVarSingleItemJSON_ad_account_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get ad account
//
// Get an ad account
//
ad_account_t*
AdAccountsAPI_adAccountsGet(apiClient_t *apiClient, char *ad_account_id)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}");

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
    ad_account_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_account_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    free(localVarToReplace_ad_account_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List ad accounts
//
// Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
//
ad_accounts_list_200_response_t*
AdAccountsAPI_adAccountsList(apiClient_t *apiClient, int *include_shared_accounts, char *bookmark, int *page_size)
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
    char *localVarPath = strdup("/ad_accounts");





    // query parameters
    char *keyQuery_include_shared_accounts = NULL;
    char * valueQuery_include_shared_accounts = NULL;
    keyValuePair_t *keyPairQuery_include_shared_accounts = 0;
    if (include_shared_accounts)
    {
        keyQuery_include_shared_accounts = strdup("include_shared_accounts");
        valueQuery_include_shared_accounts = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_shared_accounts, MAX_NUMBER_LENGTH, "%d", *include_shared_accounts);
        keyPairQuery_include_shared_accounts = keyValuePair_create(keyQuery_include_shared_accounts, valueQuery_include_shared_accounts);
        list_addElement(localVarQueryParameters,keyPairQuery_include_shared_accounts);
    }

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
    ad_accounts_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ad_accounts_list_200_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    if(keyQuery_include_shared_accounts){
        free(keyQuery_include_shared_accounts);
        keyQuery_include_shared_accounts = NULL;
    }
    if(valueQuery_include_shared_accounts){
        free(valueQuery_include_shared_accounts);
        valueQuery_include_shared_accounts = NULL;
    }
    if(keyPairQuery_include_shared_accounts){
        keyValuePair_free(keyPairQuery_include_shared_accounts);
        keyPairQuery_include_shared_accounts = NULL;
    }
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a request for a brand, category, SKU report
//
//   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
//
conversion_product_report_t*
AdAccountsAPI_analyticsCreateConversionProductReport(apiClient_t *apiClient, char *ad_account_id, conversion_product_report_create_t *conversion_product_report_create)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/reports/brand_category_sku");

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
    cJSON *localVarSingleItemJSON_conversion_product_report_create = NULL;
    if (conversion_product_report_create != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_conversion_product_report_create = conversion_product_report_create_convertToJSON(conversion_product_report_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_conversion_product_report_create);
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
    conversion_product_report_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = conversion_product_report_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_conversion_product_report_create) {
        cJSON_Delete(localVarSingleItemJSON_conversion_product_report_create);
        localVarSingleItemJSON_conversion_product_report_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a request for a Marketing Mix Modeling (MMM) report
//
//     This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it's in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we'll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.
//
mmm_report_t*
AdAccountsAPI_analyticsCreateMmmReport(apiClient_t *apiClient, char *ad_account_id, mmm_report_create_t *mmm_report_create)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/mmm_reports");

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
    cJSON *localVarSingleItemJSON_mmm_report_create = NULL;
    if (mmm_report_create != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_mmm_report_create = mmm_report_create_convertToJSON(mmm_report_create);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_mmm_report_create);
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
    mmm_report_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = mmm_report_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_mmm_report_create) {
        cJSON_Delete(localVarSingleItemJSON_mmm_report_create);
        localVarSingleItemJSON_mmm_report_create = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create async request for an account analytics report
//
//   This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
//
ads_analytics_create_async_response_t*
AdAccountsAPI_analyticsCreateReport(apiClient_t *apiClient, char *ad_account_id, ads_analytics_create_async_request_t *ads_analytics_create_async_request)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/reports");

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
    cJSON *localVarSingleItemJSON_ads_analytics_create_async_request = NULL;
    if (ads_analytics_create_async_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_ads_analytics_create_async_request = ads_analytics_create_async_request_convertToJSON(ads_analytics_create_async_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_ads_analytics_create_async_request);
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
    ads_analytics_create_async_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ads_analytics_create_async_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_ads_analytics_create_async_request) {
        cJSON_Delete(localVarSingleItemJSON_ads_analytics_create_async_request);
        localVarSingleItemJSON_ads_analytics_create_async_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create async request for an analytics report using a template
//
//   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
//
template_based_report_t*
AdAccountsAPI_analyticsCreateTemplateReport(apiClient_t *apiClient, char *ad_account_id, char *template_id, char start_date, char end_date, granularity_e granularity)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/templates/{template_id}/reports");

    if(!ad_account_id)
        goto end;
    if(!template_id)
        goto end;


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(template_id)+3 + sizeof("{ ad_account_id }") - 1;
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_template_id = strlen(ad_account_id)+3 + strlen(template_id)+3 + sizeof("{ template_id }") - 1;
    if(template_id == NULL) {
        goto end;
    }
    char* localVarToReplace_template_id = malloc(sizeOfPathParams_template_id);
    sprintf(localVarToReplace_template_id, "{%s}", "template_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_template_id, template_id);



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
    char *keyQuery_granularity = NULL;
    granularity_e valueQuery_granularity ;
    keyValuePair_t *keyPairQuery_granularity = 0;
    if (granularity)
    {
        keyQuery_granularity = strdup("granularity");
        valueQuery_granularity = (granularity);
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, strdup(analyticsCreateTemplateReport__ToString(
        &valueQuery_granularity)));
        list_addElement(localVarQueryParameters,keyPairQuery_granularity);
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
    template_based_report_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = template_based_report_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    free(localVarToReplace_template_id);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get advertiser brand, category, SKU report
//
//   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
//
conversion_product_report_t*
AdAccountsAPI_analyticsGetConversionProductReport(apiClient_t *apiClient, char *ad_account_id, char *token)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/reports/brand_category_sku");

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
    char *keyQuery_token = NULL;
    char * valueQuery_token = NULL;
    keyValuePair_t *keyPairQuery_token = 0;
    if (token)
    {
        keyQuery_token = strdup("token");
        valueQuery_token = strdup((token));
        keyPairQuery_token = keyValuePair_create(keyQuery_token, valueQuery_token);
        list_addElement(localVarQueryParameters,keyPairQuery_token);
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
    conversion_product_report_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = conversion_product_report_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    if(keyQuery_token){
        free(keyQuery_token);
        keyQuery_token = NULL;
    }
    if(valueQuery_token){
        free(valueQuery_token);
        valueQuery_token = NULL;
    }
    if(keyPairQuery_token){
        keyValuePair_free(keyPairQuery_token);
        keyPairQuery_token = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get advertiser Marketing Mix Modeling (MMM) report.
//
//     Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.
//
mmm_report_t*
AdAccountsAPI_analyticsGetMmmReport(apiClient_t *apiClient, char *ad_account_id, char *token)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/mmm_reports");

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
    char *keyQuery_token = NULL;
    char * valueQuery_token = NULL;
    keyValuePair_t *keyPairQuery_token = 0;
    if (token)
    {
        keyQuery_token = strdup("token");
        valueQuery_token = strdup((token));
        keyPairQuery_token = keyValuePair_create(keyQuery_token, valueQuery_token);
        list_addElement(localVarQueryParameters,keyPairQuery_token);
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
    mmm_report_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = mmm_report_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    if(keyQuery_token){
        free(keyQuery_token);
        keyQuery_token = NULL;
    }
    if(valueQuery_token){
        free(valueQuery_token);
        valueQuery_token = NULL;
    }
    if(keyPairQuery_token){
        keyValuePair_free(keyPairQuery_token);
        keyPairQuery_token = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get the account analytics report created by the async call
//
//   This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
//
ads_analytics_get_async_response_t*
AdAccountsAPI_analyticsGetReport(apiClient_t *apiClient, char *ad_account_id, char *token)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/reports");

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
    char *keyQuery_token = NULL;
    char * valueQuery_token = NULL;
    keyValuePair_t *keyPairQuery_token = 0;
    if (token)
    {
        keyQuery_token = strdup("token");
        valueQuery_token = strdup((token));
        keyPairQuery_token = keyValuePair_create(keyQuery_token, valueQuery_token);
        list_addElement(localVarQueryParameters,keyPairQuery_token);
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
    ads_analytics_get_async_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = ads_analytics_get_async_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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
    if(keyQuery_token){
        free(keyQuery_token);
        keyQuery_token = NULL;
    }
    if(valueQuery_token){
        free(valueQuery_token);
        valueQuery_token = NULL;
    }
    if(keyPairQuery_token){
        keyValuePair_free(keyPairQuery_token);
        keyPairQuery_token = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete ads data for ad account in API Sandbox
//
// Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
//
char*
AdAccountsAPI_sandboxDelete(apiClient_t *apiClient, char *ad_account_id)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/sandbox");

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
    //primitive return type simple string
    char* elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300)
        elementToReturn = strdup((char*)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_ad_account_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List templates
//
// Gets all Templates associated with an ad account ID.
//
templates_list_200_response_t*
AdAccountsAPI_templatesList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order)
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
    char *localVarPath = strdup("/ad_accounts/{ad_account_id}/templates");

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
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(templatesList__ToString(
        &valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
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
    templates_list_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = templates_list_200_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
        cJSON_Delete(AdAccountsAPIlocalVarJSON);
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

