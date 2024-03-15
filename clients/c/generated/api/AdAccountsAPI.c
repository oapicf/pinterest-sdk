#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "AdAccountsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum COLUMNS for AdAccountsAPI_adAccountAnalytics

static char* adAccountAnalytics_COLUMNS_ToString(pinterest_rest_api_adAccountAnalytics_columns_e COLUMNS){
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE" };
    return COLUMNSArray[COLUMNS];
}

static pinterest_rest_api_adAccountAnalytics_columns_e adAccountAnalytics_COLUMNS_FromString(char* COLUMNS){
    int stringToReturn = 0;
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE" };
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

// Functions for enum TARGETINGTYPES for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet_TARGETINGTYPES_ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_targeting_types_e TARGETINGTYPES){
    char *TARGETINGTYPESArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION" };
    return TARGETINGTYPESArray[TARGETINGTYPES];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_targeting_types_e adAccountTargetingAnalyticsGet_TARGETINGTYPES_FromString(char* TARGETINGTYPES){
    int stringToReturn = 0;
    char *TARGETINGTYPESArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION" };
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
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE" };
    return COLUMNSArray[COLUMNS];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_columns_e adAccountTargetingAnalyticsGet_COLUMNS_FromString(char* COLUMNS){
    int stringToReturn = 0;
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE" };
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

// Functions for enum  for AdAccountsAPI_adAccountTargetingAnalyticsGet

static char* adAccountTargetingAnalyticsGet__ToString(pinterest_rest_api_adAccountTargetingAnalyticsGet_attribution_types_e ){
    char *Array[] =  { "NULL", "INDIVIDUAL", "HOUSEHOLD" };
    return Array[];
}

static pinterest_rest_api_adAccountTargetingAnalyticsGet_attribution_types_e adAccountTargetingAnalyticsGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "INDIVIDUAL", "HOUSEHOLD" };
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
static cJSON *adAccountTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adAccountTargetingAnalyticsGet_attribution_types_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adAccountTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adAccountTargetingAnalyticsGet_attribution_types_e adAccountTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adAccountTargetingAnalyticsGet_attribution_types_e Variable = 0;
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

// Functions for enum ORDER for AdAccountsAPI_templatesList

static char* templatesList_ORDER_ToString(pinterest_rest_api_templatesList_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return ORDERArray[ORDER];
}

static pinterest_rest_api_templatesList_order_e templatesList_ORDER_FromString(char* ORDER){
    int stringToReturn = 0;
    char *ORDERArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    size_t sizeofArray = sizeof(ORDERArray) / sizeof(ORDERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ORDER, ORDERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function templatesList_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *templatesList_ORDER_convertToJSON(pinterest_rest_api_templatesList_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", templatesList_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function templatesList_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_templatesList_order_e templatesList_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    pinterest_rest_api_templatesList_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = templatesList_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/


// Get ad account analytics
//
// Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
//
list_t*
AdAccountsAPI_adAccountAnalytics(apiClient_t *apiClient, char *ad_account_id, char start_date, char end_date, list_t *columns, granularity_e granularity, int *click_window_days, int *engagement_window_days, int *view_window_days, pinterest_rest_api_adAccountAnalytics_conversion_report_time_e conversion_report_time)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/analytics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/analytics");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, (void *)strdup(adAccountAnalytics__ToString(
        &valueQuery_granularity)));
        list_addElement(localVarQueryParameters,keyPairQuery_granularity);
    }

    // query parameters
    char *keyQuery_click_window_days = NULL;
    char * valueQuery_click_window_days = NULL;
    keyValuePair_t *keyPairQuery_click_window_days = 0;
    if (click_window_days)
    {
        keyQuery_click_window_days = strdup("click_window_days");
        valueQuery_click_window_days = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_click_window_days, MAX_NUMBER_LENGTH, "%d", *click_window_days);
        keyPairQuery_click_window_days = keyValuePair_create(keyQuery_click_window_days, (void *)strdup(adAccountAnalytics_CLICKWINDOWDAYS_ToString(
        valueQuery_click_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_click_window_days);
    }

    // query parameters
    char *keyQuery_engagement_window_days = NULL;
    char * valueQuery_engagement_window_days = NULL;
    keyValuePair_t *keyPairQuery_engagement_window_days = 0;
    if (engagement_window_days)
    {
        keyQuery_engagement_window_days = strdup("engagement_window_days");
        valueQuery_engagement_window_days = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_engagement_window_days, MAX_NUMBER_LENGTH, "%d", *engagement_window_days);
        keyPairQuery_engagement_window_days = keyValuePair_create(keyQuery_engagement_window_days, (void *)strdup(adAccountAnalytics_ENGAGEMENTWINDOWDAYS_ToString(
        valueQuery_engagement_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_engagement_window_days);
    }

    // query parameters
    char *keyQuery_view_window_days = NULL;
    char * valueQuery_view_window_days = NULL;
    keyValuePair_t *keyPairQuery_view_window_days = 0;
    if (view_window_days)
    {
        keyQuery_view_window_days = strdup("view_window_days");
        valueQuery_view_window_days = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_view_window_days, MAX_NUMBER_LENGTH, "%d", *view_window_days);
        keyPairQuery_view_window_days = keyValuePair_create(keyQuery_view_window_days, (void *)strdup(adAccountAnalytics_VIEWWINDOWDAYS_ToString(
        valueQuery_view_window_days)));
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
        keyPairQuery_conversion_report_time = keyValuePair_create(keyQuery_conversion_report_time, (void *)strdup(adAccountAnalytics_CONVERSIONREPORTTIME_ToString(
        valueQuery_conversion_report_time)));
        list_addElement(localVarQueryParameters,keyPairQuery_conversion_report_time);
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account analytics parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(AdAccountsAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_createList();
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
    if(valueQuery_click_window_days){
        free(valueQuery_click_window_days);
        valueQuery_click_window_days = NULL;
    }
    if(keyPairQuery_click_window_days){
        keyValuePair_free(keyPairQuery_click_window_days);
        keyPairQuery_click_window_days = NULL;
    }
    if(keyQuery_engagement_window_days){
        free(keyQuery_engagement_window_days);
        keyQuery_engagement_window_days = NULL;
    }
    if(valueQuery_engagement_window_days){
        free(valueQuery_engagement_window_days);
        valueQuery_engagement_window_days = NULL;
    }
    if(keyPairQuery_engagement_window_days){
        keyValuePair_free(keyPairQuery_engagement_window_days);
        keyPairQuery_engagement_window_days = NULL;
    }
    if(keyQuery_view_window_days){
        free(keyQuery_view_window_days);
        keyQuery_view_window_days = NULL;
    }
    if(valueQuery_view_window_days){
        free(valueQuery_view_window_days);
        valueQuery_view_window_days = NULL;
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get targeting analytics for an ad account
//
// Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
//
metrics_response_t*
AdAccountsAPI_adAccountTargetingAnalyticsGet(apiClient_t *apiClient, char *ad_account_id, char start_date, char end_date, list_t *targeting_types, list_t *columns, granularity_e granularity, int *click_window_days, int *engagement_window_days, int *view_window_days, pinterest_rest_api_adAccountTargetingAnalyticsGet_conversion_report_time_e conversion_report_time, conversion_report_attribution_type_e attribution_types)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/targeting_analytics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/targeting_analytics");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, (void *)strdup(adAccountTargetingAnalyticsGet__ToString(
        &valueQuery_granularity)));
        list_addElement(localVarQueryParameters,keyPairQuery_granularity);
    }

    // query parameters
    char *keyQuery_click_window_days = NULL;
    char * valueQuery_click_window_days = NULL;
    keyValuePair_t *keyPairQuery_click_window_days = 0;
    if (click_window_days)
    {
        keyQuery_click_window_days = strdup("click_window_days");
        valueQuery_click_window_days = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_click_window_days, MAX_NUMBER_LENGTH, "%d", *click_window_days);
        keyPairQuery_click_window_days = keyValuePair_create(keyQuery_click_window_days, (void *)strdup(adAccountTargetingAnalyticsGet_CLICKWINDOWDAYS_ToString(
        valueQuery_click_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_click_window_days);
    }

    // query parameters
    char *keyQuery_engagement_window_days = NULL;
    char * valueQuery_engagement_window_days = NULL;
    keyValuePair_t *keyPairQuery_engagement_window_days = 0;
    if (engagement_window_days)
    {
        keyQuery_engagement_window_days = strdup("engagement_window_days");
        valueQuery_engagement_window_days = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_engagement_window_days, MAX_NUMBER_LENGTH, "%d", *engagement_window_days);
        keyPairQuery_engagement_window_days = keyValuePair_create(keyQuery_engagement_window_days, (void *)strdup(adAccountTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_ToString(
        valueQuery_engagement_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_engagement_window_days);
    }

    // query parameters
    char *keyQuery_view_window_days = NULL;
    char * valueQuery_view_window_days = NULL;
    keyValuePair_t *keyPairQuery_view_window_days = 0;
    if (view_window_days)
    {
        keyQuery_view_window_days = strdup("view_window_days");
        valueQuery_view_window_days = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_view_window_days, MAX_NUMBER_LENGTH, "%d", *view_window_days);
        keyPairQuery_view_window_days = keyValuePair_create(keyQuery_view_window_days, (void *)strdup(adAccountTargetingAnalyticsGet_VIEWWINDOWDAYS_ToString(
        valueQuery_view_window_days)));
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
        keyPairQuery_conversion_report_time = keyValuePair_create(keyQuery_conversion_report_time, (void *)strdup(adAccountTargetingAnalyticsGet_CONVERSIONREPORTTIME_ToString(
        valueQuery_conversion_report_time)));
        list_addElement(localVarQueryParameters,keyPairQuery_conversion_report_time);
    }

    // query parameters
    char *keyQuery_attribution_types = NULL;
    conversion_report_attribution_type_e valueQuery_attribution_types ;
    keyValuePair_t *keyPairQuery_attribution_types = 0;
    if (attribution_types)
    {
        keyQuery_attribution_types = strdup("attribution_types");
        valueQuery_attribution_types = (attribution_types);
        keyPairQuery_attribution_types = keyValuePair_create(keyQuery_attribution_types, (void *)strdup(adAccountTargetingAnalyticsGet__ToString(
        &valueQuery_attribution_types)));
        list_addElement(localVarQueryParameters,keyPairQuery_attribution_types);
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    metrics_response_t *elementToReturn = metrics_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
    cJSON_Delete(AdAccountsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    if(valueQuery_click_window_days){
        free(valueQuery_click_window_days);
        valueQuery_click_window_days = NULL;
    }
    if(keyPairQuery_click_window_days){
        keyValuePair_free(keyPairQuery_click_window_days);
        keyPairQuery_click_window_days = NULL;
    }
    if(keyQuery_engagement_window_days){
        free(keyQuery_engagement_window_days);
        keyQuery_engagement_window_days = NULL;
    }
    if(valueQuery_engagement_window_days){
        free(valueQuery_engagement_window_days);
        valueQuery_engagement_window_days = NULL;
    }
    if(keyPairQuery_engagement_window_days){
        keyValuePair_free(keyPairQuery_engagement_window_days);
        keyPairQuery_engagement_window_days = NULL;
    }
    if(keyQuery_view_window_days){
        free(keyQuery_view_window_days);
        keyQuery_view_window_days = NULL;
    }
    if(valueQuery_view_window_days){
        free(valueQuery_view_window_days);
        valueQuery_view_window_days = NULL;
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
    if(keyQuery_attribution_types){
        free(keyQuery_attribution_types);
        keyQuery_attribution_types = NULL;
    }
    if(keyPairQuery_attribution_types){
        keyValuePair_free(keyPairQuery_attribution_types);
        keyPairQuery_attribution_types = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create ad account
//
// Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.
//
ad_account_t*
AdAccountsAPI_adAccountsCreate(apiClient_t *apiClient, ad_account_create_request_t *ad_account_create_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts");




    // Body Param
    cJSON *localVarSingleItemJSON_ad_account_create_request = NULL;
    if (ad_account_create_request != NULL)
    {
        //string
        localVarSingleItemJSON_ad_account_create_request = ad_account_create_request_convertToJSON(ad_account_create_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_ad_account_create_request);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_account_t *elementToReturn = ad_account_parseFromJSON(AdAccountsAPIlocalVarJSON);
    cJSON_Delete(AdAccountsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    if (localVarSingleItemJSON_ad_account_create_request) {
        cJSON_Delete(localVarSingleItemJSON_ad_account_create_request);
        localVarSingleItemJSON_ad_account_create_request = NULL;
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

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_account_t *elementToReturn = ad_account_parseFromJSON(AdAccountsAPIlocalVarJSON);
    cJSON_Delete(AdAccountsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
// Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
//
ad_accounts_list_200_response_t*
AdAccountsAPI_adAccountsList(apiClient_t *apiClient, char *bookmark, int *page_size, int *include_shared_accounts)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts");




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
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_accounts_list_200_response_t *elementToReturn = ad_accounts_list_200_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
    cJSON_Delete(AdAccountsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a request for a Marketing Mix Modeling (MMM) report
//
// This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.
//
create_mmm_report_response_t*
AdAccountsAPI_analyticsCreateMmmReport(apiClient_t *apiClient, char *ad_account_id, create_mmm_report_request_t *create_mmm_report_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/mmm_reports")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/mmm_reports");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_create_mmm_report_request = NULL;
    if (create_mmm_report_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_mmm_report_request = create_mmm_report_request_convertToJSON(create_mmm_report_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_mmm_report_request);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account ads analytics mmm parameters");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_mmm_report_response_t *elementToReturn = create_mmm_report_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
    cJSON_Delete(AdAccountsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    if (localVarSingleItemJSON_create_mmm_report_request) {
        cJSON_Delete(localVarSingleItemJSON_create_mmm_report_request);
        localVarSingleItemJSON_create_mmm_report_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create async request for an account analytics report
//
// This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
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

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/reports")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/reports");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
        //string
        localVarSingleItemJSON_ads_analytics_create_async_request = ads_analytics_create_async_request_convertToJSON(ads_analytics_create_async_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_ads_analytics_create_async_request);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account ads analytics parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ads_analytics_create_async_response_t *elementToReturn = ads_analytics_create_async_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
    cJSON_Delete(AdAccountsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
// This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
//
ads_analytics_create_async_response_t*
AdAccountsAPI_analyticsCreateTemplateReport(apiClient_t *apiClient, char *ad_account_id, char *template_id, char start_date, char end_date, granularity_e granularity)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/templates/{template_id}/reports")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/templates/{template_id}/reports");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(template_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_template_id = strlen(ad_account_id)+3 + strlen(template_id)+3 + strlen("{ template_id }");
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
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, (void *)strdup(analyticsCreateTemplateReport__ToString(
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account ads analytics template parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ads_analytics_create_async_response_t *elementToReturn = ads_analytics_create_async_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
    cJSON_Delete(AdAccountsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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

// Get advertiser Marketing Mix Modeling (MMM) report.
//
// Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
//
get_mmm_report_response_t*
AdAccountsAPI_analyticsGetMmmReport(apiClient_t *apiClient, char *ad_account_id, char *token)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/mmm_reports")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/mmm_reports");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account ads analytics parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    get_mmm_report_response_t *elementToReturn = get_mmm_report_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
    cJSON_Delete(AdAccountsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
// This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
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

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/reports")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/reports");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account ads analytics parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ads_analytics_get_async_response_t *elementToReturn = ads_analytics_get_async_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
    cJSON_Delete(AdAccountsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
// Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.
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

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/sandbox")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/sandbox");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account id.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //primitive return type simple
    char* elementToReturn =  strdup((char*)apiClient->dataReceived);

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
AdAccountsAPI_templatesList(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_templatesList_order_e order, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/templates")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/templates");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



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
    pinterest_rest_api_templatesList_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, (void *)strdup(templatesList_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
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
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad account template parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdAccountsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    templates_list_200_response_t *elementToReturn = templates_list_200_response_parseFromJSON(AdAccountsAPIlocalVarJSON);
    cJSON_Delete(AdAccountsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

