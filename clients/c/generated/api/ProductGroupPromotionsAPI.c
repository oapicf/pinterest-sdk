#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ProductGroupPromotionsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum ENTITYSTATUSES for ProductGroupPromotionsAPI_productGroupPromotionsList

static char* productGroupPromotionsList_ENTITYSTATUSES_ToString(pinterest_rest_api_productGroupPromotionsList_entity_statuses_e ENTITYSTATUSES){
    char *ENTITYSTATUSESArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return ENTITYSTATUSESArray[ENTITYSTATUSES];
}

static pinterest_rest_api_productGroupPromotionsList_entity_statuses_e productGroupPromotionsList_ENTITYSTATUSES_FromString(char* ENTITYSTATUSES){
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
// Function productGroupPromotionsList_ENTITYSTATUSES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *productGroupPromotionsList_ENTITYSTATUSES_convertToJSON(pinterest_rest_api_productGroupPromotionsList_entity_statuses_e ENTITYSTATUSES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function productGroupPromotionsList_ENTITYSTATUSES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_productGroupPromotionsList_entity_statuses_e productGroupPromotionsList_ENTITYSTATUSES_parseFromJSON(cJSON* ENTITYSTATUSESJSON) {
    pinterest_rest_api_productGroupPromotionsList_entity_statuses_e ENTITYSTATUSESVariable = 0;
    return ENTITYSTATUSESVariable;
end:
    return 0;
}
*/

// Functions for enum ORDER for ProductGroupPromotionsAPI_productGroupPromotionsList

static char* productGroupPromotionsList_ORDER_ToString(pinterest_rest_api_productGroupPromotionsList_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "ASCENDING", "DESCENDING" };
    return ORDERArray[ORDER];
}

static pinterest_rest_api_productGroupPromotionsList_order_e productGroupPromotionsList_ORDER_FromString(char* ORDER){
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
// Function productGroupPromotionsList_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *productGroupPromotionsList_ORDER_convertToJSON(pinterest_rest_api_productGroupPromotionsList_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", productGroupPromotionsList_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function productGroupPromotionsList_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_productGroupPromotionsList_order_e productGroupPromotionsList_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    pinterest_rest_api_productGroupPromotionsList_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = productGroupPromotionsList_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/

// Functions for enum COLUMNS for ProductGroupPromotionsAPI_productGroupsAnalytics

static char* productGroupsAnalytics_COLUMNS_ToString(pinterest_rest_api_productGroupsAnalytics_columns_e COLUMNS){
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE" };
    return COLUMNSArray[COLUMNS];
}

static pinterest_rest_api_productGroupsAnalytics_columns_e productGroupsAnalytics_COLUMNS_FromString(char* COLUMNS){
    int stringToReturn = 0;
    char *COLUMNSArray[] =  { "NULL", "SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE" };
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
// Function productGroupsAnalytics_COLUMNS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *productGroupsAnalytics_COLUMNS_convertToJSON(pinterest_rest_api_productGroupsAnalytics_columns_e COLUMNS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function productGroupsAnalytics_COLUMNS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_productGroupsAnalytics_columns_e productGroupsAnalytics_COLUMNS_parseFromJSON(cJSON* COLUMNSJSON) {
    pinterest_rest_api_productGroupsAnalytics_columns_e COLUMNSVariable = 0;
    return COLUMNSVariable;
end:
    return 0;
}
*/

// Functions for enum  for ProductGroupPromotionsAPI_productGroupsAnalytics

static char* productGroupsAnalytics__ToString(pinterest_rest_api_productGroupsAnalytics_granularity_e ){
    char *Array[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    return Array[];
}

static pinterest_rest_api_productGroupsAnalytics_granularity_e productGroupsAnalytics__FromString(char* ){
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
// Function productGroupsAnalytics__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *productGroupsAnalytics__convertToJSON(pinterest_rest_api_productGroupsAnalytics_granularity_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function productGroupsAnalytics__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_productGroupsAnalytics_granularity_e productGroupsAnalytics__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_productGroupsAnalytics_granularity_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum CLICKWINDOWDAYS for ProductGroupPromotionsAPI_productGroupsAnalytics

static char* productGroupsAnalytics_CLICKWINDOWDAYS_ToString(pinterest_rest_api_productGroupsAnalytics_click_window_days_e CLICKWINDOWDAYS){
    char *CLICKWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return CLICKWINDOWDAYSArray[CLICKWINDOWDAYS];
}

static pinterest_rest_api_productGroupsAnalytics_click_window_days_e productGroupsAnalytics_CLICKWINDOWDAYS_FromString(char* CLICKWINDOWDAYS){
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
// Function productGroupsAnalytics_CLICKWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *productGroupsAnalytics_CLICKWINDOWDAYS_convertToJSON(pinterest_rest_api_productGroupsAnalytics_click_window_days_e CLICKWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function productGroupsAnalytics_CLICKWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_productGroupsAnalytics_click_window_days_e productGroupsAnalytics_CLICKWINDOWDAYS_parseFromJSON(cJSON* CLICKWINDOWDAYSJSON) {
    pinterest_rest_api_productGroupsAnalytics_click_window_days_e CLICKWINDOWDAYSVariable = 0;
    return CLICKWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum ENGAGEMENTWINDOWDAYS for ProductGroupPromotionsAPI_productGroupsAnalytics

static char* productGroupsAnalytics_ENGAGEMENTWINDOWDAYS_ToString(pinterest_rest_api_productGroupsAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYS){
    char *ENGAGEMENTWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return ENGAGEMENTWINDOWDAYSArray[ENGAGEMENTWINDOWDAYS];
}

static pinterest_rest_api_productGroupsAnalytics_engagement_window_days_e productGroupsAnalytics_ENGAGEMENTWINDOWDAYS_FromString(char* ENGAGEMENTWINDOWDAYS){
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
// Function productGroupsAnalytics_ENGAGEMENTWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *productGroupsAnalytics_ENGAGEMENTWINDOWDAYS_convertToJSON(pinterest_rest_api_productGroupsAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function productGroupsAnalytics_ENGAGEMENTWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_productGroupsAnalytics_engagement_window_days_e productGroupsAnalytics_ENGAGEMENTWINDOWDAYS_parseFromJSON(cJSON* ENGAGEMENTWINDOWDAYSJSON) {
    pinterest_rest_api_productGroupsAnalytics_engagement_window_days_e ENGAGEMENTWINDOWDAYSVariable = 0;
    return ENGAGEMENTWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum VIEWWINDOWDAYS for ProductGroupPromotionsAPI_productGroupsAnalytics

static char* productGroupsAnalytics_VIEWWINDOWDAYS_ToString(pinterest_rest_api_productGroupsAnalytics_view_window_days_e VIEWWINDOWDAYS){
    char *VIEWWINDOWDAYSArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return VIEWWINDOWDAYSArray[VIEWWINDOWDAYS];
}

static pinterest_rest_api_productGroupsAnalytics_view_window_days_e productGroupsAnalytics_VIEWWINDOWDAYS_FromString(char* VIEWWINDOWDAYS){
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
// Function productGroupsAnalytics_VIEWWINDOWDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *productGroupsAnalytics_VIEWWINDOWDAYS_convertToJSON(pinterest_rest_api_productGroupsAnalytics_view_window_days_e VIEWWINDOWDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function productGroupsAnalytics_VIEWWINDOWDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_productGroupsAnalytics_view_window_days_e productGroupsAnalytics_VIEWWINDOWDAYS_parseFromJSON(cJSON* VIEWWINDOWDAYSJSON) {
    pinterest_rest_api_productGroupsAnalytics_view_window_days_e VIEWWINDOWDAYSVariable = 0;
    return VIEWWINDOWDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum CONVERSIONREPORTTIME for ProductGroupPromotionsAPI_productGroupsAnalytics

static char* productGroupsAnalytics_CONVERSIONREPORTTIME_ToString(pinterest_rest_api_productGroupsAnalytics_conversion_report_time_e CONVERSIONREPORTTIME){
    char *CONVERSIONREPORTTIMEArray[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    return CONVERSIONREPORTTIMEArray[CONVERSIONREPORTTIME];
}

static pinterest_rest_api_productGroupsAnalytics_conversion_report_time_e productGroupsAnalytics_CONVERSIONREPORTTIME_FromString(char* CONVERSIONREPORTTIME){
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
// Function productGroupsAnalytics_CONVERSIONREPORTTIME_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *productGroupsAnalytics_CONVERSIONREPORTTIME_convertToJSON(pinterest_rest_api_productGroupsAnalytics_conversion_report_time_e CONVERSIONREPORTTIME) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_report_time", productGroupsAnalytics_CONVERSIONREPORTTIME_ToString(CONVERSIONREPORTTIME)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function productGroupsAnalytics_CONVERSIONREPORTTIME_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_productGroupsAnalytics_conversion_report_time_e productGroupsAnalytics_CONVERSIONREPORTTIME_parseFromJSON(cJSON* CONVERSIONREPORTTIMEJSON) {
    pinterest_rest_api_productGroupsAnalytics_conversion_report_time_e CONVERSIONREPORTTIMEVariable = 0;
    cJSON *CONVERSIONREPORTTIMEVar = cJSON_GetObjectItemCaseSensitive(CONVERSIONREPORTTIMEJSON, "conversion_report_time");
    if(!cJSON_IsString(CONVERSIONREPORTTIMEVar) || (CONVERSIONREPORTTIMEVar->valuestring == NULL))
    {
        goto end;
    }
    CONVERSIONREPORTTIMEVariable = productGroupsAnalytics_CONVERSIONREPORTTIME_FromString(CONVERSIONREPORTTIMEVar->valuestring);
    return CONVERSIONREPORTTIMEVariable;
end:
    return 0;
}
*/


// Create product group promotions
//
// Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
//
product_group_promotion_response_t*
ProductGroupPromotionsAPI_productGroupPromotionsCreate(apiClient_t *apiClient, char *ad_account_id, product_group_promotion_create_request_t *product_group_promotion_create_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/product_group_promotions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/product_group_promotions");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_product_group_promotion_create_request = NULL;
    if (product_group_promotion_create_request != NULL)
    {
        //string
        localVarSingleItemJSON_product_group_promotion_create_request = product_group_promotion_create_request_convertToJSON(product_group_promotion_create_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_product_group_promotion_create_request);
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
    cJSON *ProductGroupPromotionsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    product_group_promotion_response_t *elementToReturn = product_group_promotion_response_parseFromJSON(ProductGroupPromotionsAPIlocalVarJSON);
    cJSON_Delete(ProductGroupPromotionsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_product_group_promotion_create_request) {
        cJSON_Delete(localVarSingleItemJSON_product_group_promotion_create_request);
        localVarSingleItemJSON_product_group_promotion_create_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get a product group promotion by id
//
// Get a product group promotion by id
//
product_group_promotion_response_t*
ProductGroupPromotionsAPI_productGroupPromotionsGet(apiClient_t *apiClient, char *ad_account_id, char *product_group_promotion_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen(product_group_promotion_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);

    // Path Params
    long sizeOfPathParams_product_group_promotion_id = strlen(ad_account_id)+3 + strlen(product_group_promotion_id)+3 + strlen("{ product_group_promotion_id }");
    if(product_group_promotion_id == NULL) {
        goto end;
    }
    char* localVarToReplace_product_group_promotion_id = malloc(sizeOfPathParams_product_group_promotion_id);
    sprintf(localVarToReplace_product_group_promotion_id, "{%s}", "product_group_promotion_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_product_group_promotion_id, product_group_promotion_id);


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
    cJSON *ProductGroupPromotionsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    product_group_promotion_response_t *elementToReturn = product_group_promotion_response_parseFromJSON(ProductGroupPromotionsAPIlocalVarJSON);
    cJSON_Delete(ProductGroupPromotionsAPIlocalVarJSON);
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
    free(localVarToReplace_product_group_promotion_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get product group promotions
//
// List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
//
product_group_promotions_list_200_response_t*
ProductGroupPromotionsAPI_productGroupPromotionsList(apiClient_t *apiClient, char *ad_account_id, list_t *product_group_promotion_ids, list_t *entity_statuses, char *ad_group_id, int *page_size, pinterest_rest_api_productGroupPromotionsList_order_e order, char *bookmark)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/product_group_promotions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/product_group_promotions");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // query parameters
    if (product_group_promotion_ids)
    {
        list_addElement(localVarQueryParameters,product_group_promotion_ids);
    }

    // query parameters
    if (entity_statuses)
    {
        list_addElement(localVarQueryParameters,entity_statuses);
    }

    // query parameters
    char *keyQuery_ad_group_id = NULL;
    char * valueQuery_ad_group_id = NULL;
    keyValuePair_t *keyPairQuery_ad_group_id = 0;
    if (ad_group_id)
    {
        keyQuery_ad_group_id = strdup("ad_group_id");
        valueQuery_ad_group_id = strdup((ad_group_id));
        keyPairQuery_ad_group_id = keyValuePair_create(keyQuery_ad_group_id, valueQuery_ad_group_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_group_id);
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
    pinterest_rest_api_productGroupPromotionsList_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, (void *)strdup(productGroupPromotionsList_ORDER_ToString(
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
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *ProductGroupPromotionsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    product_group_promotions_list_200_response_t *elementToReturn = product_group_promotions_list_200_response_parseFromJSON(ProductGroupPromotionsAPIlocalVarJSON);
    cJSON_Delete(ProductGroupPromotionsAPIlocalVarJSON);
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
    if(keyQuery_ad_group_id){
        free(keyQuery_ad_group_id);
        keyQuery_ad_group_id = NULL;
    }
    if(valueQuery_ad_group_id){
        free(valueQuery_ad_group_id);
        valueQuery_ad_group_id = NULL;
    }
    if(keyPairQuery_ad_group_id){
        keyValuePair_free(keyPairQuery_ad_group_id);
        keyPairQuery_ad_group_id = NULL;
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

// Update product group promotions
//
// Update multiple existing Product Group Promotions (by product_group_id)
//
product_group_promotion_response_t*
ProductGroupPromotionsAPI_productGroupPromotionsUpdate(apiClient_t *apiClient, char *ad_account_id, product_group_promotion_update_request_t *product_group_promotion_update_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/product_group_promotions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/product_group_promotions");


    // Path Params
    long sizeOfPathParams_ad_account_id = strlen(ad_account_id)+3 + strlen("{ ad_account_id }");
    if(ad_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_ad_account_id = malloc(sizeOfPathParams_ad_account_id);
    sprintf(localVarToReplace_ad_account_id, "{%s}", "ad_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_ad_account_id, ad_account_id);



    // Body Param
    cJSON *localVarSingleItemJSON_product_group_promotion_update_request = NULL;
    if (product_group_promotion_update_request != NULL)
    {
        //string
        localVarSingleItemJSON_product_group_promotion_update_request = product_group_promotion_update_request_convertToJSON(product_group_promotion_update_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_product_group_promotion_update_request);
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
    cJSON *ProductGroupPromotionsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    product_group_promotion_response_t *elementToReturn = product_group_promotion_response_parseFromJSON(ProductGroupPromotionsAPIlocalVarJSON);
    cJSON_Delete(ProductGroupPromotionsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_product_group_promotion_update_request) {
        cJSON_Delete(localVarSingleItemJSON_product_group_promotion_update_request);
        localVarSingleItemJSON_product_group_promotion_update_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get product group analytics
//
// Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
//
list_t*
ProductGroupPromotionsAPI_productGroupsAnalytics(apiClient_t *apiClient, char *ad_account_id, char start_date, char end_date, list_t *product_group_ids, list_t *columns, granularity_e granularity, int *click_window_days, int *engagement_window_days, int *view_window_days, pinterest_rest_api_productGroupsAnalytics_conversion_report_time_e conversion_report_time)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/ad_accounts/{ad_account_id}/product_groups/analytics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/ad_accounts/{ad_account_id}/product_groups/analytics");


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
    if (product_group_ids)
    {
        list_addElement(localVarQueryParameters,product_group_ids);
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
        keyPairQuery_granularity = keyValuePair_create(keyQuery_granularity, (void *)strdup(productGroupsAnalytics__ToString(
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
        keyPairQuery_click_window_days = keyValuePair_create(keyQuery_click_window_days, (void *)strdup(productGroupsAnalytics_CLICKWINDOWDAYS_ToString(
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
        keyPairQuery_engagement_window_days = keyValuePair_create(keyQuery_engagement_window_days, (void *)strdup(productGroupsAnalytics_ENGAGEMENTWINDOWDAYS_ToString(
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
        keyPairQuery_view_window_days = keyValuePair_create(keyQuery_view_window_days, (void *)strdup(productGroupsAnalytics_VIEWWINDOWDAYS_ToString(
        valueQuery_view_window_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_view_window_days);
    }

    // query parameters
    char *keyQuery_conversion_report_time = NULL;
    pinterest_rest_api_productGroupsAnalytics_conversion_report_time_e valueQuery_conversion_report_time ;
    keyValuePair_t *keyPairQuery_conversion_report_time = 0;
    if (conversion_report_time)
    {
        keyQuery_conversion_report_time = strdup("conversion_report_time");
        valueQuery_conversion_report_time = (conversion_report_time);
        keyPairQuery_conversion_report_time = keyValuePair_create(keyQuery_conversion_report_time, (void *)strdup(productGroupsAnalytics_CONVERSIONREPORTTIME_ToString(
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
    //    printf("%s\n","Invalid ad account ads analytics parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    cJSON *ProductGroupPromotionsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(ProductGroupPromotionsAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_createList();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, ProductGroupPromotionsAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( ProductGroupPromotionsAPIlocalVarJSON);
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

