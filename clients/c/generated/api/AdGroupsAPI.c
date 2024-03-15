#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "AdGroupsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum COLUMNS for AdGroupsAPI_adGroupsAnalytics

static char* adGroupsAnalytics_COLUMNS_ToString(pinterest_rest_api_adGroupsAnalytics_columns_e COLUMNS){
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE" };
    return COLUMNSArray[COLUMNS];
}

static pinterest_rest_api_adGroupsAnalytics_columns_e adGroupsAnalytics_COLUMNS_FromString(char* COLUMNS){
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
// Function adGroupsAnalytics_COLUMNS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsAnalytics_COLUMNS_convertToJSON(pinterest_rest_api_adGroupsAnalytics_columns_e COLUMNS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsAnalytics_COLUMNS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsAnalytics_columns_e adGroupsAnalytics_COLUMNS_parseFromJSON(cJSON* COLUMNSJSON) {
    pinterest_rest_api_adGroupsAnalytics_columns_e COLUMNSVariable = 0;
    return COLUMNSVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdGroupsAPI_adGroupsAnalytics

static char* adGroupsAnalytics__ToString(pinterest_rest_api_adGroupsAnalytics_granularity_e ){
    char *Array[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    return Array[];
}

static pinterest_rest_api_adGroupsAnalytics_granularity_e adGroupsAnalytics__FromString(char* ){
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
// Function adGroupsAnalytics__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsAnalytics__convertToJSON(pinterest_rest_api_adGroupsAnalytics_granularity_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsAnalytics__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsAnalytics_granularity_e adGroupsAnalytics__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adGroupsAnalytics_granularity_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum CLICKWINDOWDAYS for AdGroupsAPI_adGroupsAnalytics

static char* adGroupsAnalytics_CLICKWINDOWDAYS_ToString(pinterest_rest_api_adGroupsAnalytics_click_window_days_e CLICKWINDOWDAYS){
    char *CLICKWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return CLICKWINDOWDAYSArray[CLICKWINDOWDAYS];
}

static pinterest_rest_api_adGroupsAnalytics_click_window_days_e adGroupsAnalytics_CLICKWINDOWDAYS_FromString(char* CLICKWINDOWDAYS){
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
// Function adGroupsAnalytics_CLICKWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsAnalytics_CLICKWINDOWDAYS_convertToJSON(pinterest_rest_api_adGroupsAnalytics_click_window_days_e CLICKWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsAnalytics_CLICKWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsAnalytics_click_window_days_e adGroupsAnalytics_CLICKWINDOWDAYS_parseFromJSON(cJSON* CLICKWINDOWDAYSJSON) {
    pinterest_rest_api_adGroupsAnalytics_click_window_days_e CLICKWINDOWDAYSVariable = 0;
    return CLICKWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum ENGAGEMENTWINDOWDAYS for AdGroupsAPI_adGroupsAnalytics

static char* adGroupsAnalytics_ENGAGEMENTWINDOWDAYS_ToString(pinterest_rest_api_adGroupsAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYS){
    char *ENGAGEMENTWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return ENGAGEMENTWINDOWDAYSArray[ENGAGEMENTWINDOWDAYS];
}

static pinterest_rest_api_adGroupsAnalytics_engagement_window_days_e adGroupsAnalytics_ENGAGEMENTWINDOWDAYS_FromString(char* ENGAGEMENTWINDOWDAYS){
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
// Function adGroupsAnalytics_ENGAGEMENTWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsAnalytics_ENGAGEMENTWINDOWDAYS_convertToJSON(pinterest_rest_api_adGroupsAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsAnalytics_ENGAGEMENTWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsAnalytics_engagement_window_days_e adGroupsAnalytics_ENGAGEMENTWINDOWDAYS_parseFromJSON(cJSON* ENGAGEMENTWINDOWDAYSJSON) {
    pinterest_rest_api_adGroupsAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYSVariable = 0;
    return ENGAGEMENTWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum VIEWWINDOWDAYS for AdGroupsAPI_adGroupsAnalytics

static char* adGroupsAnalytics_VIEWWINDOWDAYS_ToString(pinterest_rest_api_adGroupsAnalytics_view_window_days_e VIEWWINDOWDAYS){
    char *VIEWWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return VIEWWINDOWDAYSArray[VIEWWINDOWDAYS];
}

static pinterest_rest_api_adGroupsAnalytics_view_window_days_e adGroupsAnalytics_VIEWWINDOWDAYS_FromString(char* VIEWWINDOWDAYS){
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
// Function adGroupsAnalytics_VIEWWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsAnalytics_VIEWWINDOWDAYS_convertToJSON(pinterest_rest_api_adGroupsAnalytics_view_window_days_e VIEWWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsAnalytics_VIEWWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsAnalytics_view_window_days_e adGroupsAnalytics_VIEWWINDOWDAYS_parseFromJSON(cJSON* VIEWWINDOWDAYSJSON) {
    pinterest_rest_api_adGroupsAnalytics_view_window_days_e VIEWWINDOWDAYSVariable = 0;
    return VIEWWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum CONVERSIONREPORTTIME for AdGroupsAPI_adGroupsAnalytics

static char* adGroupsAnalytics_CONVERSIONREPORTTIME_ToString(pinterest_rest_api_adGroupsAnalytics_conversion_report_time_e CONVERSIONREPORTTIME){
    char *CONVERSIONREPORTTIMEArray[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    return CONVERSIONREPORTTIMEArray[CONVERSIONREPORTTIME];
}

static pinterest_rest_api_adGroupsAnalytics_conversion_report_time_e adGroupsAnalytics_CONVERSIONREPORTTIME_FromString(char* CONVERSIONREPORTTIME){
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
// Function adGroupsAnalytics_CONVERSIONREPORTTIME_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsAnalytics_CONVERSIONREPORTTIME_convertToJSON(pinterest_rest_api_adGroupsAnalytics_conversion_report_time_e CONVERSIONREPORTTIME) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_report_time", adGroupsAnalytics_CONVERSIONREPORTTIME_ToString(CONVERSIONREPORTTIME)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsAnalytics_CONVERSIONREPORTTIME_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsAnalytics_conversion_report_time_e adGroupsAnalytics_CONVERSIONREPORTTIME_parseFromJSON(cJSON* CONVERSIONREPORTTIMEJSON) {
    pinterest_rest_api_adGroupsAnalytics_conversion_report_time_e CONVERSIONREPORTTIMEVariable = 0;
    cJSON *CONVERSIONREPORTTIMEVar = cJSON_GetObjectItemCaseSensitive(CONVERSIONREPORTTIMEJSON, "conversion_report_time");
    if(!cJSON_IsString(CONVERSIONREPORTTIMEVar) || (CONVERSIONREPORTTIMEVar->valuestring == NULL))
    {
        goto end;
    }
    CONVERSIONREPORTTIMEVariable = adGroupsAnalytics_CONVERSIONREPORTTIME_FromString(CONVERSIONREPORTTIMEVar->valuestring);
    return CONVERSIONREPORTTIMEVariable;
end:
    return 0;
}
*/

// Functions for enum ENTITYSTATUSES for AdGroupsAPI_adGroupsList

static char* adGroupsList_ENTITYSTATUSES_ToString(pinterest_rest_api_adGroupsList_entity_statuses_e ENTITYSTATUSES){
    char *ENTITYSTATUSESArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return ENTITYSTATUSESArray[ENTITYSTATUSES];
}

static pinterest_rest_api_adGroupsList_entity_statuses_e adGroupsList_ENTITYSTATUSES_FromString(char* ENTITYSTATUSES){
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
// Function adGroupsList_ENTITYSTATUSES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsList_ENTITYSTATUSES_convertToJSON(pinterest_rest_api_adGroupsList_entity_statuses_e ENTITYSTATUSES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsList_ENTITYSTATUSES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsList_entity_statuses_e adGroupsList_ENTITYSTATUSES_parseFromJSON(cJSON* ENTITYSTATUSESJSON) {
    pinterest_rest_api_adGroupsList_entity_statuses_e ENTITYSTATUSESVariable = 0;
    return ENTITYSTATUSESVariable;
end:
    return 0;
}
*/

// Functions for enum ORDER for AdGroupsAPI_adGroupsList

static char* adGroupsList_ORDER_ToString(pinterest_rest_api_adGroupsList_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return ORDERArray[ORDER];
}

static pinterest_rest_api_adGroupsList_order_e adGroupsList_ORDER_FromString(char* ORDER){
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
// Function adGroupsList_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsList_ORDER_convertToJSON(pinterest_rest_api_adGroupsList_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", adGroupsList_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsList_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsList_order_e adGroupsList_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    pinterest_rest_api_adGroupsList_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = adGroupsList_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/

// Functions for enum TARGETINGTYPES for AdGroupsAPI_adGroupsTargetingAnalyticsGet

static char* adGroupsTargetingAnalyticsGet_TARGETINGTYPES_ToString(pinterest_rest_api_adGroupsTargetingAnalyticsGet_targeting_types_e TARGETINGTYPES){
    char *TARGETINGTYPESArray[] =  { "NULL", "KEYWORD", "APPTYPE", "GENDER", "LOCATION", "PLACEMENT", "COUNTRY", "TARGETED_INTEREST", "PINNER_INTEREST", "AUDIENCE_INCLUDE", "GEO", "AGE_BUCKET", "REGION" };
    return TARGETINGTYPESArray[TARGETINGTYPES];
}

static pinterest_rest_api_adGroupsTargetingAnalyticsGet_targeting_types_e adGroupsTargetingAnalyticsGet_TARGETINGTYPES_FromString(char* TARGETINGTYPES){
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
// Function adGroupsTargetingAnalyticsGet_TARGETINGTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsTargetingAnalyticsGet_TARGETINGTYPES_convertToJSON(pinterest_rest_api_adGroupsTargetingAnalyticsGet_targeting_types_e TARGETINGTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsTargetingAnalyticsGet_TARGETINGTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsTargetingAnalyticsGet_targeting_types_e adGroupsTargetingAnalyticsGet_TARGETINGTYPES_parseFromJSON(cJSON* TARGETINGTYPESJSON) {
    pinterest_rest_api_adGroupsTargetingAnalyticsGet_targeting_types_e TARGETINGTYPESVariable = 0;
    return TARGETINGTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum COLUMNS for AdGroupsAPI_adGroupsTargetingAnalyticsGet

static char* adGroupsTargetingAnalyticsGet_COLUMNS_ToString(pinterest_rest_api_adGroupsTargetingAnalyticsGet_columns_e COLUMNS){
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE" };
    return COLUMNSArray[COLUMNS];
}

static pinterest_rest_api_adGroupsTargetingAnalyticsGet_columns_e adGroupsTargetingAnalyticsGet_COLUMNS_FromString(char* COLUMNS){
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
// Function adGroupsTargetingAnalyticsGet_COLUMNS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsTargetingAnalyticsGet_COLUMNS_convertToJSON(pinterest_rest_api_adGroupsTargetingAnalyticsGet_columns_e COLUMNS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsTargetingAnalyticsGet_COLUMNS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsTargetingAnalyticsGet_columns_e adGroupsTargetingAnalyticsGet_COLUMNS_parseFromJSON(cJSON* COLUMNSJSON) {
    pinterest_rest_api_adGroupsTargetingAnalyticsGet_columns_e COLUMNSVariable = 0;
    return COLUMNSVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdGroupsAPI_adGroupsTargetingAnalyticsGet

static char* adGroupsTargetingAnalyticsGet__ToString(pinterest_rest_api_adGroupsTargetingAnalyticsGet_granularity_e ){
    char *Array[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    return Array[];
}

static pinterest_rest_api_adGroupsTargetingAnalyticsGet_granularity_e adGroupsTargetingAnalyticsGet__FromString(char* ){
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
// Function adGroupsTargetingAnalyticsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adGroupsTargetingAnalyticsGet_granularity_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsTargetingAnalyticsGet_granularity_e adGroupsTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adGroupsTargetingAnalyticsGet_granularity_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum CLICKWINDOWDAYS for AdGroupsAPI_adGroupsTargetingAnalyticsGet

static char* adGroupsTargetingAnalyticsGet_CLICKWINDOWDAYS_ToString(pinterest_rest_api_adGroupsTargetingAnalyticsGet_click_window_days_e CLICKWINDOWDAYS){
    char *CLICKWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return CLICKWINDOWDAYSArray[CLICKWINDOWDAYS];
}

static pinterest_rest_api_adGroupsTargetingAnalyticsGet_click_window_days_e adGroupsTargetingAnalyticsGet_CLICKWINDOWDAYS_FromString(char* CLICKWINDOWDAYS){
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
// Function adGroupsTargetingAnalyticsGet_CLICKWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsTargetingAnalyticsGet_CLICKWINDOWDAYS_convertToJSON(pinterest_rest_api_adGroupsTargetingAnalyticsGet_click_window_days_e CLICKWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsTargetingAnalyticsGet_CLICKWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsTargetingAnalyticsGet_click_window_days_e adGroupsTargetingAnalyticsGet_CLICKWINDOWDAYS_parseFromJSON(cJSON* CLICKWINDOWDAYSJSON) {
    pinterest_rest_api_adGroupsTargetingAnalyticsGet_click_window_days_e CLICKWINDOWDAYSVariable = 0;
    return CLICKWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum ENGAGEMENTWINDOWDAYS for AdGroupsAPI_adGroupsTargetingAnalyticsGet

static char* adGroupsTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_ToString(pinterest_rest_api_adGroupsTargetingAnalyticsGet_engagement_window_days_e ENGAGEMENTWINDOWDAYS){
    char *ENGAGEMENTWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return ENGAGEMENTWINDOWDAYSArray[ENGAGEMENTWINDOWDAYS];
}

static pinterest_rest_api_adGroupsTargetingAnalyticsGet_engagement_window_days_e adGroupsTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_FromString(char* ENGAGEMENTWINDOWDAYS){
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
// Function adGroupsTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_convertToJSON(pinterest_rest_api_adGroupsTargetingAnalyticsGet_engagement_window_days_e ENGAGEMENTWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsTargetingAnalyticsGet_engagement_window_days_e adGroupsTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_parseFromJSON(cJSON* ENGAGEMENTWINDOWDAYSJSON) {
    pinterest_rest_api_adGroupsTargetingAnalyticsGet_engagement_window_days_e ENGAGEMENTWINDOWDAYSVariable = 0;
    return ENGAGEMENTWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum VIEWWINDOWDAYS for AdGroupsAPI_adGroupsTargetingAnalyticsGet

static char* adGroupsTargetingAnalyticsGet_VIEWWINDOWDAYS_ToString(pinterest_rest_api_adGroupsTargetingAnalyticsGet_view_window_days_e VIEWWINDOWDAYS){
    char *VIEWWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return VIEWWINDOWDAYSArray[VIEWWINDOWDAYS];
}

static pinterest_rest_api_adGroupsTargetingAnalyticsGet_view_window_days_e adGroupsTargetingAnalyticsGet_VIEWWINDOWDAYS_FromString(char* VIEWWINDOWDAYS){
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
// Function adGroupsTargetingAnalyticsGet_VIEWWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsTargetingAnalyticsGet_VIEWWINDOWDAYS_convertToJSON(pinterest_rest_api_adGroupsTargetingAnalyticsGet_view_window_days_e VIEWWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsTargetingAnalyticsGet_VIEWWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsTargetingAnalyticsGet_view_window_days_e adGroupsTargetingAnalyticsGet_VIEWWINDOWDAYS_parseFromJSON(cJSON* VIEWWINDOWDAYSJSON) {
    pinterest_rest_api_adGroupsTargetingAnalyticsGet_view_window_days_e VIEWWINDOWDAYSVariable = 0;
    return VIEWWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum CONVERSIONREPORTTIME for AdGroupsAPI_adGroupsTargetingAnalyticsGet

static char* adGroupsTargetingAnalyticsGet_CONVERSIONREPORTTIME_ToString(pinterest_rest_api_adGroupsTargetingAnalyticsGet_conversion_report_time_e CONVERSIONREPORTTIME){
    char *CONVERSIONREPORTTIMEArray[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    return CONVERSIONREPORTTIMEArray[CONVERSIONREPORTTIME];
}

static pinterest_rest_api_adGroupsTargetingAnalyticsGet_conversion_report_time_e adGroupsTargetingAnalyticsGet_CONVERSIONREPORTTIME_FromString(char* CONVERSIONREPORTTIME){
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
// Function adGroupsTargetingAnalyticsGet_CONVERSIONREPORTTIME_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsTargetingAnalyticsGet_CONVERSIONREPORTTIME_convertToJSON(pinterest_rest_api_adGroupsTargetingAnalyticsGet_conversion_report_time_e CONVERSIONREPORTTIME) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_report_time", adGroupsTargetingAnalyticsGet_CONVERSIONREPORTTIME_ToString(CONVERSIONREPORTTIME)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsTargetingAnalyticsGet_CONVERSIONREPORTTIME_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsTargetingAnalyticsGet_conversion_report_time_e adGroupsTargetingAnalyticsGet_CONVERSIONREPORTTIME_parseFromJSON(cJSON* CONVERSIONREPORTTIMEJSON) {
    pinterest_rest_api_adGroupsTargetingAnalyticsGet_conversion_report_time_e CONVERSIONREPORTTIMEVariable = 0;
    cJSON *CONVERSIONREPORTTIMEVar = cJSON_GetObjectItemCaseSensitive(CONVERSIONREPORTTIMEJSON, "conversion_report_time");
    if(!cJSON_IsString(CONVERSIONREPORTTIMEVar) || (CONVERSIONREPORTTIMEVar->valuestring == NULL))
    {
        goto end;
    }
    CONVERSIONREPORTTIMEVariable = adGroupsTargetingAnalyticsGet_CONVERSIONREPORTTIME_FromString(CONVERSIONREPORTTIMEVar->valuestring);
    return CONVERSIONREPORTTIMEVariable;
end:
    return 0;
}
*/

// Functions for enum  for AdGroupsAPI_adGroupsTargetingAnalyticsGet

static char* adGroupsTargetingAnalyticsGet__ToString(pinterest_rest_api_adGroupsTargetingAnalyticsGet_attribution_types_e ){
    char *Array[] =  { "NULL", "INDIVIDUAL", "HOUSEHOLD" };
    return Array[];
}

static pinterest_rest_api_adGroupsTargetingAnalyticsGet_attribution_types_e adGroupsTargetingAnalyticsGet__FromString(char* ){
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
// Function adGroupsTargetingAnalyticsGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *adGroupsTargetingAnalyticsGet__convertToJSON(pinterest_rest_api_adGroupsTargetingAnalyticsGet_attribution_types_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function adGroupsTargetingAnalyticsGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_adGroupsTargetingAnalyticsGet_attribution_types_e adGroupsTargetingAnalyticsGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_adGroupsTargetingAnalyticsGet_attribution_types_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Get ad group analytics
//
// Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
//
list_t*
AdGroupsAPI_adGroupsAnalytics(apiClient_t *apiClient, char *ad_account_id, char start_date, char end_date, list_t *ad_group_ids, list_t *columns, granularity_e granularity, int *click_window_days, int *engagement_window_days, int *view_window_days, pinterest_rest_api_adGroupsAnalytics_conversion_report_time_e conversion_report_time)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/ad_groups/analytics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/ad_groups/analytics");


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
    if (ad_group_ids)
    {
        list_addElement(localVarQueryParameters,ad_group_ids);
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
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, (void *)strdup(adGroupsAnalytics__ToString(
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
        keyPairQuery_click_window_days = keyValuePair_create(keyQuery_click_window_days, (void *)strdup(adGroupsAnalytics_CLICKWINDOWDAYS_ToString(
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
        keyPairQuery_engagement_window_days = keyValuePair_create(keyQuery_engagement_window_days, (void *)strdup(adGroupsAnalytics_ENGAGEMENTWINDOWDAYS_ToString(
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
        keyPairQuery_view_window_days = keyValuePair_create(keyQuery_view_window_days, (void *)strdup(adGroupsAnalytics_VIEWWINDOWDAYS_ToString(
        valueQuery_view_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_view_window_days);
    }

    // query parameters
    char *keyQuery_conversion_report_time = NULL;
    pinterest_rest_api_adGroupsAnalytics_conversion_report_time_e valueQuery_conversion_report_time ;
    keyValuePair_t *keyPairQuery_conversion_report_time = 0;
    if (conversion_report_time)
    {
        keyQuery_conversion_report_time = strdup("conversion_report_time");
        valueQuery_conversion_report_time = (conversion_report_time);
        keyPairQuery_conversion_report_time = keyValuePair_create(keyQuery_conversion_report_time, (void *)strdup(adGroupsAnalytics_CONVERSIONREPORTTIME_ToString(
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
    //    printf("%s\n","Invalid ad account group analytics parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    cJSON *AdGroupsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(AdGroupsAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_createList();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, AdGroupsAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( AdGroupsAPIlocalVarJSON);
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

// Get audience sizing
//
// Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
//
ad_group_audience_sizing_response_t*
AdGroupsAPI_adGroupsAudienceSizing(apiClient_t *apiClient, char *ad_account_id, ad_group_audience_sizing_request_t *ad_group_audience_sizing_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/ad_groups/audience_sizing")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_ad_group_audience_sizing_request = NULL;
    if (ad_group_audience_sizing_request != NULL)
    {
        //string
        localVarSingleItemJSON_ad_group_audience_sizing_request = ad_group_audience_sizing_request_convertToJSON(ad_group_audience_sizing_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_ad_group_audience_sizing_request);
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid ad group audience sizing parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","No access to requested audience list or product group.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdGroupsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_group_audience_sizing_response_t *elementToReturn = ad_group_audience_sizing_response_parseFromJSON(AdGroupsAPIlocalVarJSON);
    cJSON_Delete(AdGroupsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_ad_group_audience_sizing_request) {
        cJSON_Delete(localVarSingleItemJSON_ad_group_audience_sizing_request);
        localVarSingleItemJSON_ad_group_audience_sizing_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get bid floors
//
// List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
//
bid_floor_t*
AdGroupsAPI_adGroupsBidFloorGet(apiClient_t *apiClient, char *ad_account_id, bid_floor_request_t *bid_floor_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/bid_floor")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/bid_floor");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_bid_floor_request = NULL;
    if (bid_floor_request != NULL)
    {
        //string
        localVarSingleItemJSON_bid_floor_request = bid_floor_request_convertToJSON(bid_floor_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_bid_floor_request);
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
    cJSON *AdGroupsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    bid_floor_t *elementToReturn = bid_floor_parseFromJSON(AdGroupsAPIlocalVarJSON);
    cJSON_Delete(AdGroupsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_bid_floor_request) {
        cJSON_Delete(localVarSingleItemJSON_bid_floor_request);
        localVarSingleItemJSON_bid_floor_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create ad groups
//
// Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
//
ad_group_array_response_t*
AdGroupsAPI_adGroupsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *ad_group_create_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/ad_groups")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/ad_groups");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    //notstring
    cJSON *localVar_ad_group_create_request = NULL;
    cJSON *localVarItemJSON_ad_group_create_request = NULL;
    cJSON *localVarSingleItemJSON_ad_group_create_request = NULL;
    if (ad_group_create_request != NULL)
    {
        localVarItemJSON_ad_group_create_request = cJSON_CreateObject();
        localVarSingleItemJSON_ad_group_create_request = cJSON_AddArrayToObject(localVarItemJSON_ad_group_create_request, "ad_group_create_request");
        if (localVarSingleItemJSON_ad_group_create_request == NULL)
        {
            // nonprimitive container

            goto end;
        }
    }

    listEntry_t *ad_group_create_requestBodyListEntry;
    list_ForEach(ad_group_create_requestBodyListEntry, ad_group_create_request)
    {
        localVar_ad_group_create_request = ad_group_create_request_convertToJSON(ad_group_create_requestBodyListEntry->data);
        if(localVar_ad_group_create_request == NULL)
        {
            goto end;
        }
        cJSON_AddItemToArray(localVarSingleItemJSON_ad_group_create_request, localVar_ad_group_create_request);
        localVarBodyParameters = cJSON_Print(localVarItemJSON_ad_group_create_request);
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
    cJSON *AdGroupsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_group_array_response_t *elementToReturn = ad_group_array_response_parseFromJSON(AdGroupsAPIlocalVarJSON);
    cJSON_Delete(AdGroupsAPIlocalVarJSON);
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
    if (localVarItemJSON_ad_group_create_request) {
        cJSON_Delete(localVarItemJSON_ad_group_create_request);
        localVarItemJSON_ad_group_create_request = NULL;
    }
    if (localVarSingleItemJSON_ad_group_create_request) {
        cJSON_Delete(localVarSingleItemJSON_ad_group_create_request);
        localVarSingleItemJSON_ad_group_create_request = NULL;
    }
    if (localVar_ad_group_create_request) {
        cJSON_Delete(localVar_ad_group_create_request);
        localVar_ad_group_create_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get ad group
//
// Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
//
ad_group_response_t*
AdGroupsAPI_adGroupsGet(apiClient_t *apiClient, char *ad_account_id, char *ad_group_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(ad_group_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_ad_group_id = strlen(ad_account_id)+3 + strlen(ad_group_id)+3 + strlen("{ ad_group_id }");
    if(ad_group_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_group_id = malloc(sizeOfPathParams_ad_group_id);
    sprintf(localVarToReplace_ad_group_id, "{%s}", "ad_group_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_group_id, ad_group_id);


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
    cJSON *AdGroupsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_group_response_t *elementToReturn = ad_group_response_parseFromJSON(AdGroupsAPIlocalVarJSON);
    cJSON_Delete(AdGroupsAPIlocalVarJSON);
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
    free(localVarToReplace_ad_group_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List ad groups
//
// List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
//
ad_groups_list_200_response_t*
AdGroupsAPI_adGroupsList(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_ids, list_t *ad_group_ids, list_t *entity_statuses, int *page_size, pinterest_rest_api_adGroupsList_order_e order, char *bookmark, int *translate_interests_to_names)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/ad_groups")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/ad_groups");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



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
    if (entity_statuses)
    {
        list_addElement(localVarQueryParameters,entity_statuses);
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
    pinterest_rest_api_adGroupsList_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, (void *)strdup(adGroupsList_ORDER_ToString(
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

    // query parameters
    char *keyQuery_translate_interests_to_names = NULL;
    char * valueQuery_translate_interests_to_names = NULL;
    keyValuePair_t *keyPairQuery_translate_interests_to_names = 0;
    if (translate_interests_to_names)
    {
        keyQuery_translate_interests_to_names = strdup("translate_interests_to_names");
        valueQuery_translate_interests_to_names = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_translate_interests_to_names, MAX_NUMBER_LENGTH, "%d", *translate_interests_to_names);
        keyPairQuery_translate_interests_to_names = keyValuePair_create(keyQuery_translate_interests_to_names, valueQuery_translate_interests_to_names);
        list_addElement(localVarQueryParameters,keyPairQuery_translate_interests_to_names);
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
    //    printf("%s\n","Invalid ad account group parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdGroupsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_groups_list_200_response_t *elementToReturn = ad_groups_list_200_response_parseFromJSON(AdGroupsAPIlocalVarJSON);
    cJSON_Delete(AdGroupsAPIlocalVarJSON);
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
    if(keyQuery_translate_interests_to_names){
        free(keyQuery_translate_interests_to_names);
        keyQuery_translate_interests_to_names = NULL;
    }
    if(valueQuery_translate_interests_to_names){
        free(valueQuery_translate_interests_to_names);
        valueQuery_translate_interests_to_names = NULL;
    }
    if(keyPairQuery_translate_interests_to_names){
        keyValuePair_free(keyPairQuery_translate_interests_to_names);
        keyPairQuery_translate_interests_to_names = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get targeting analytics for ad groups
//
// Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
//
metrics_response_t*
AdGroupsAPI_adGroupsTargetingAnalyticsGet(apiClient_t *apiClient, char *ad_account_id, list_t *ad_group_ids, char start_date, char end_date, list_t *targeting_types, list_t *columns, granularity_e granularity, int *click_window_days, int *engagement_window_days, int *view_window_days, pinterest_rest_api_adGroupsTargetingAnalyticsGet_conversion_report_time_e conversion_report_time, conversion_report_attribution_type_e attribution_types)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
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
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, (void *)strdup(adGroupsTargetingAnalyticsGet__ToString(
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
        keyPairQuery_click_window_days = keyValuePair_create(keyQuery_click_window_days, (void *)strdup(adGroupsTargetingAnalyticsGet_CLICKWINDOWDAYS_ToString(
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
        keyPairQuery_engagement_window_days = keyValuePair_create(keyQuery_engagement_window_days, (void *)strdup(adGroupsTargetingAnalyticsGet_ENGAGEMENTWINDOWDAYS_ToString(
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
        keyPairQuery_view_window_days = keyValuePair_create(keyQuery_view_window_days, (void *)strdup(adGroupsTargetingAnalyticsGet_VIEWWINDOWDAYS_ToString(
        valueQuery_view_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_view_window_days);
    }

    // query parameters
    char *keyQuery_conversion_report_time = NULL;
    pinterest_rest_api_adGroupsTargetingAnalyticsGet_conversion_report_time_e valueQuery_conversion_report_time ;
    keyValuePair_t *keyPairQuery_conversion_report_time = 0;
    if (conversion_report_time)
    {
        keyQuery_conversion_report_time = strdup("conversion_report_time");
        valueQuery_conversion_report_time = (conversion_report_time);
        keyPairQuery_conversion_report_time = keyValuePair_create(keyQuery_conversion_report_time, (void *)strdup(adGroupsTargetingAnalyticsGet_CONVERSIONREPORTTIME_ToString(
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
        keyPairQuery_attribution_types = keyValuePair_create(keyQuery_attribution_types, (void *)strdup(adGroupsTargetingAnalyticsGet__ToString(
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
    cJSON *AdGroupsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    metrics_response_t *elementToReturn = metrics_response_parseFromJSON(AdGroupsAPIlocalVarJSON);
    cJSON_Delete(AdGroupsAPIlocalVarJSON);
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

// Update ad groups
//
// Update multiple existing ad groups.
//
ad_group_array_response_t*
AdGroupsAPI_adGroupsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *ad_group_update_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/ad_groups")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/ad_groups");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    //notstring
    cJSON *localVar_ad_group_update_request = NULL;
    cJSON *localVarItemJSON_ad_group_update_request = NULL;
    cJSON *localVarSingleItemJSON_ad_group_update_request = NULL;
    if (ad_group_update_request != NULL)
    {
        localVarItemJSON_ad_group_update_request = cJSON_CreateObject();
        localVarSingleItemJSON_ad_group_update_request = cJSON_AddArrayToObject(localVarItemJSON_ad_group_update_request, "ad_group_update_request");
        if (localVarSingleItemJSON_ad_group_update_request == NULL)
        {
            // nonprimitive container

            goto end;
        }
    }

    listEntry_t *ad_group_update_requestBodyListEntry;
    list_ForEach(ad_group_update_requestBodyListEntry, ad_group_update_request)
    {
        localVar_ad_group_update_request = ad_group_update_request_convertToJSON(ad_group_update_requestBodyListEntry->data);
        if(localVar_ad_group_update_request == NULL)
        {
            goto end;
        }
        cJSON_AddItemToArray(localVarSingleItemJSON_ad_group_update_request, localVar_ad_group_update_request);
        localVarBodyParameters = cJSON_Print(localVarItemJSON_ad_group_update_request);
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
                    "PATCH");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *AdGroupsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ad_group_array_response_t *elementToReturn = ad_group_array_response_parseFromJSON(AdGroupsAPIlocalVarJSON);
    cJSON_Delete(AdGroupsAPIlocalVarJSON);
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
    if (localVarItemJSON_ad_group_update_request) {
        cJSON_Delete(localVarItemJSON_ad_group_update_request);
        localVarItemJSON_ad_group_update_request = NULL;
    }
    if (localVarSingleItemJSON_ad_group_update_request) {
        cJSON_Delete(localVarSingleItemJSON_ad_group_update_request);
        localVarSingleItemJSON_ad_group_update_request = NULL;
    }
    if (localVar_ad_group_update_request) {
        cJSON_Delete(localVar_ad_group_update_request);
        localVar_ad_group_update_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

