#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_product_report_request.h"


char* conversion_product_report_request_campaign_objective_types_ToString(pinterest_rest_api_conversion_product_report_request__e campaign_objective_types) {
    char *campaign_objective_typesArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION" };
    return campaign_objective_typesArray[campaign_objective_types - 1];
}

pinterest_rest_api_conversion_product_report_request__e conversion_product_report_request_campaign_objective_types_FromString(char* campaign_objective_types) {
    int stringToReturn = 0;
    char *campaign_objective_typesArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION" };
    size_t sizeofArray = sizeof(campaign_objective_typesArray) / sizeof(campaign_objective_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_objective_types, campaign_objective_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_product_report_request_columns_ToString(pinterest_rest_api_conversion_product_report_request__e columns) {
    char *columnsArray[] =  { "NULL", "CAMPAIGN_NAME", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_GROUP_ID", "CAMPAIGN_OBJECTIVE_TYPE", "AD_GROUP_NAME", "CONVERSION_PRODUCT_ID", "CONVERSION_PRODUCT_BRAND", "CONVERSION_PRODUCT_CATEGORY", "CONVERSION_PRODUCT_ID_GROUP", "TOTAL_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE", "TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY", "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE", "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE", "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE", "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY", "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE", "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY", "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE", "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY", "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE", "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY", "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE", "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD" };
    return columnsArray[columns - 1];
}

pinterest_rest_api_conversion_product_report_request__e conversion_product_report_request_columns_FromString(char* columns) {
    int stringToReturn = 0;
    char *columnsArray[] =  { "NULL", "CAMPAIGN_NAME", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_GROUP_ID", "CAMPAIGN_OBJECTIVE_TYPE", "AD_GROUP_NAME", "CONVERSION_PRODUCT_ID", "CONVERSION_PRODUCT_BRAND", "CONVERSION_PRODUCT_CATEGORY", "CONVERSION_PRODUCT_ID_GROUP", "TOTAL_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE", "TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY", "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE", "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE", "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE", "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY", "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE", "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY", "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE", "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY", "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE", "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY", "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE", "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD" };
    size_t sizeofArray = sizeof(columnsArray) / sizeof(columnsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(columns, columnsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_product_report_request_conversion_product_attribution_type_ToString(pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTATTRIBUTIONTYPE_e conversion_product_attribution_type) {
    char* conversion_product_attribution_typeArray[] =  { "NULL", "DEFAULT", "BRAND_ATTRIBUTION" };
    return conversion_product_attribution_typeArray[conversion_product_attribution_type];
}

pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTATTRIBUTIONTYPE_e conversion_product_report_request_conversion_product_attribution_type_FromString(char* conversion_product_attribution_type){
    int stringToReturn = 0;
    char *conversion_product_attribution_typeArray[] =  { "NULL", "DEFAULT", "BRAND_ATTRIBUTION" };
    size_t sizeofArray = sizeof(conversion_product_attribution_typeArray) / sizeof(conversion_product_attribution_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_product_attribution_type, conversion_product_attribution_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_product_report_request_conversion_product_breakdown_ToString(pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTBREAKDOWN_e conversion_product_breakdown) {
    char* conversion_product_breakdownArray[] =  { "NULL", "PRODUCT_BRAND", "PRODUCT_CATEGORY", "PRODUCT_BRAND_AND_CATEGORY", "PRODUCT_SKU", "PRODUCT_SKU_GROUP" };
    return conversion_product_breakdownArray[conversion_product_breakdown];
}

pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTBREAKDOWN_e conversion_product_report_request_conversion_product_breakdown_FromString(char* conversion_product_breakdown){
    int stringToReturn = 0;
    char *conversion_product_breakdownArray[] =  { "NULL", "PRODUCT_BRAND", "PRODUCT_CATEGORY", "PRODUCT_BRAND_AND_CATEGORY", "PRODUCT_SKU", "PRODUCT_SKU_GROUP" };
    size_t sizeofArray = sizeof(conversion_product_breakdownArray) / sizeof(conversion_product_breakdownArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_product_breakdown, conversion_product_breakdownArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_product_report_request_granularity_ToString(pinterest_rest_api_conversion_product_report_request_GRANULARITY_e granularity) {
    char* granularityArray[] =  { "NULL", "WEEK", "MONTH", "TOTAL" };
    return granularityArray[granularity];
}

pinterest_rest_api_conversion_product_report_request_GRANULARITY_e conversion_product_report_request_granularity_FromString(char* granularity){
    int stringToReturn = 0;
    char *granularityArray[] =  { "NULL", "WEEK", "MONTH", "TOTAL" };
    size_t sizeofArray = sizeof(granularityArray) / sizeof(granularityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(granularity, granularityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_product_report_request_level_ToString(pinterest_rest_api_conversion_product_report_request_LEVEL_e level) {
    char* levelArray[] =  { "NULL", "ADVERTISER", "CAMPAIGN", "AD_GROUP" };
    return levelArray[level];
}

pinterest_rest_api_conversion_product_report_request_LEVEL_e conversion_product_report_request_level_FromString(char* level){
    int stringToReturn = 0;
    char *levelArray[] =  { "NULL", "ADVERTISER", "CAMPAIGN", "AD_GROUP" };
    size_t sizeofArray = sizeof(levelArray) / sizeof(levelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(level, levelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static conversion_product_report_request_t *conversion_product_report_request_create_internal(
    list_t *ad_group_ids,
    list_t *campaign_ids,
    list_t *campaign_objective_types,
    conversion_attribution_window_days_t *click_window_days,
    list_t *columns,
    pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTATTRIBUTIONTYPE_e conversion_product_attribution_type,
    pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTBREAKDOWN_e conversion_product_breakdown,
    conversion_report_time_type_t *conversion_report_time,
    char *end_date,
    pinterest_rest_api_conversion_product_report_request_GRANULARITY_e granularity,
    pinterest_rest_api_conversion_product_report_request_LEVEL_e level,
    list_t *product_sku_ids,
    char *report_name,
    char *start_date,
    conversion_attribution_window_days_t *view_window_days
    ) {
    conversion_product_report_request_t *conversion_product_report_request_local_var = malloc(sizeof(conversion_product_report_request_t));
    if (!conversion_product_report_request_local_var) {
        return NULL;
    }
    conversion_product_report_request_local_var->ad_group_ids = ad_group_ids;
    conversion_product_report_request_local_var->campaign_ids = campaign_ids;
    conversion_product_report_request_local_var->campaign_objective_types = campaign_objective_types;
    conversion_product_report_request_local_var->click_window_days = click_window_days;
    conversion_product_report_request_local_var->columns = columns;
    conversion_product_report_request_local_var->conversion_product_attribution_type = conversion_product_attribution_type;
    conversion_product_report_request_local_var->conversion_product_breakdown = conversion_product_breakdown;
    conversion_product_report_request_local_var->conversion_report_time = conversion_report_time;
    conversion_product_report_request_local_var->end_date = end_date;
    conversion_product_report_request_local_var->granularity = granularity;
    conversion_product_report_request_local_var->level = level;
    conversion_product_report_request_local_var->product_sku_ids = product_sku_ids;
    conversion_product_report_request_local_var->report_name = report_name;
    conversion_product_report_request_local_var->start_date = start_date;
    conversion_product_report_request_local_var->view_window_days = view_window_days;

    conversion_product_report_request_local_var->_library_owned = 1;
    return conversion_product_report_request_local_var;
}

__attribute__((deprecated)) conversion_product_report_request_t *conversion_product_report_request_create(
    list_t *ad_group_ids,
    list_t *campaign_ids,
    list_t *campaign_objective_types,
    conversion_attribution_window_days_t *click_window_days,
    list_t *columns,
    pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTATTRIBUTIONTYPE_e conversion_product_attribution_type,
    pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTBREAKDOWN_e conversion_product_breakdown,
    conversion_report_time_type_t *conversion_report_time,
    char *end_date,
    pinterest_rest_api_conversion_product_report_request_GRANULARITY_e granularity,
    pinterest_rest_api_conversion_product_report_request_LEVEL_e level,
    list_t *product_sku_ids,
    char *report_name,
    char *start_date,
    conversion_attribution_window_days_t *view_window_days
    ) {
    return conversion_product_report_request_create_internal (
        ad_group_ids,
        campaign_ids,
        campaign_objective_types,
        click_window_days,
        columns,
        conversion_product_attribution_type,
        conversion_product_breakdown,
        conversion_report_time,
        end_date,
        granularity,
        level,
        product_sku_ids,
        report_name,
        start_date,
        view_window_days
        );
}

void conversion_product_report_request_free(conversion_product_report_request_t *conversion_product_report_request) {
    if(NULL == conversion_product_report_request){
        return ;
    }
    if(conversion_product_report_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_product_report_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_product_report_request->ad_group_ids) {
        list_ForEach(listEntry, conversion_product_report_request->ad_group_ids) {
            free(listEntry->data);
        }
        list_freeList(conversion_product_report_request->ad_group_ids);
        conversion_product_report_request->ad_group_ids = NULL;
    }
    if (conversion_product_report_request->campaign_ids) {
        list_ForEach(listEntry, conversion_product_report_request->campaign_ids) {
            free(listEntry->data);
        }
        list_freeList(conversion_product_report_request->campaign_ids);
        conversion_product_report_request->campaign_ids = NULL;
    }
    if (conversion_product_report_request->campaign_objective_types) {
        list_ForEach(listEntry, conversion_product_report_request->campaign_objective_types) {
            objective_type_free(listEntry->data);
        }
        list_freeList(conversion_product_report_request->campaign_objective_types);
        conversion_product_report_request->campaign_objective_types = NULL;
    }
    if (conversion_product_report_request->click_window_days) {
        conversion_attribution_window_days_free(conversion_product_report_request->click_window_days);
        conversion_product_report_request->click_window_days = NULL;
    }
    if (conversion_product_report_request->columns) {
        list_ForEach(listEntry, conversion_product_report_request->columns) {
            conversion_product_reporting_column_free(listEntry->data);
        }
        list_freeList(conversion_product_report_request->columns);
        conversion_product_report_request->columns = NULL;
    }
    if (conversion_product_report_request->conversion_report_time) {
        conversion_report_time_type_free(conversion_product_report_request->conversion_report_time);
        conversion_product_report_request->conversion_report_time = NULL;
    }
    if (conversion_product_report_request->end_date) {
        free(conversion_product_report_request->end_date);
        conversion_product_report_request->end_date = NULL;
    }
    if (conversion_product_report_request->product_sku_ids) {
        list_ForEach(listEntry, conversion_product_report_request->product_sku_ids) {
            free(listEntry->data);
        }
        list_freeList(conversion_product_report_request->product_sku_ids);
        conversion_product_report_request->product_sku_ids = NULL;
    }
    if (conversion_product_report_request->report_name) {
        free(conversion_product_report_request->report_name);
        conversion_product_report_request->report_name = NULL;
    }
    if (conversion_product_report_request->start_date) {
        free(conversion_product_report_request->start_date);
        conversion_product_report_request->start_date = NULL;
    }
    if (conversion_product_report_request->view_window_days) {
        conversion_attribution_window_days_free(conversion_product_report_request->view_window_days);
        conversion_product_report_request->view_window_days = NULL;
    }
    free(conversion_product_report_request);
}

cJSON *conversion_product_report_request_convertToJSON(conversion_product_report_request_t *conversion_product_report_request) {
    cJSON *item = cJSON_CreateObject();

    // conversion_product_report_request->ad_group_ids
    if(conversion_product_report_request->ad_group_ids) {
    cJSON *ad_group_ids = cJSON_AddArrayToObject(item, "ad_group_ids");
    if(ad_group_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ad_group_idsListEntry;
    list_ForEach(ad_group_idsListEntry, conversion_product_report_request->ad_group_ids) {
    if(cJSON_AddStringToObject(ad_group_ids, "", ad_group_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_product_report_request->campaign_ids
    if(conversion_product_report_request->campaign_ids) {
    cJSON *campaign_ids = cJSON_AddArrayToObject(item, "campaign_ids");
    if(campaign_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idsListEntry;
    list_ForEach(campaign_idsListEntry, conversion_product_report_request->campaign_ids) {
    if(cJSON_AddStringToObject(campaign_ids, "", campaign_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_product_report_request->campaign_objective_types
    if(conversion_product_report_request->campaign_objective_types != pinterest_rest_api_list_CAMPAIGNOBJECTIVETYPES_NULL) {
    cJSON *campaign_objective_types = cJSON_AddArrayToObject(item, "campaign_objective_types");
    if(campaign_objective_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *campaign_objective_typesListEntry;
    if (conversion_product_report_request->campaign_objective_types) {
    list_ForEach(campaign_objective_typesListEntry, conversion_product_report_request->campaign_objective_types) {
    cJSON *itemLocal = objective_type_convertToJSON((pinterest_rest_api_conversion_product_report_request__e)campaign_objective_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(campaign_objective_types, itemLocal);
    }
    }
    }


    // conversion_product_report_request->click_window_days
    if(conversion_product_report_request->click_window_days) {
    cJSON *click_window_days_local_JSON = conversion_attribution_window_days_convertToJSON(conversion_product_report_request->click_window_days);
    if(click_window_days_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "click_window_days", click_window_days_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_product_report_request->columns
    if (pinterest_rest_api_list_COLUMNS_NULL == conversion_product_report_request->columns) {
        goto fail;
    }
    cJSON *columns = cJSON_AddArrayToObject(item, "columns");
    if(columns == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *columnsListEntry;
    if (conversion_product_report_request->columns) {
    list_ForEach(columnsListEntry, conversion_product_report_request->columns) {
    cJSON *itemLocal = conversion_product_reporting_column_convertToJSON((pinterest_rest_api_conversion_product_report_request__e)columnsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(columns, itemLocal);
    }
    }


    // conversion_product_report_request->conversion_product_attribution_type
    if(conversion_product_report_request->conversion_product_attribution_type != pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTATTRIBUTIONTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "conversion_product_attribution_type", conversion_product_report_request_conversion_product_attribution_type_ToString(conversion_product_report_request->conversion_product_attribution_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // conversion_product_report_request->conversion_product_breakdown
    if(conversion_product_report_request->conversion_product_breakdown != pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTBREAKDOWN_NULL) {
    if(cJSON_AddStringToObject(item, "conversion_product_breakdown", conversion_product_report_request_conversion_product_breakdown_ToString(conversion_product_report_request->conversion_product_breakdown)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // conversion_product_report_request->conversion_report_time
    if(conversion_product_report_request->conversion_report_time) {
    cJSON *conversion_report_time_local_JSON = conversion_report_time_type_convertToJSON(conversion_product_report_request->conversion_report_time);
    if(conversion_report_time_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "conversion_report_time", conversion_report_time_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_product_report_request->end_date
    if (!conversion_product_report_request->end_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "end_date", conversion_product_report_request->end_date) == NULL) {
    goto fail; //String
    }


    // conversion_product_report_request->granularity
    if (pinterest_rest_api_conversion_product_report_request_GRANULARITY_NULL == conversion_product_report_request->granularity) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "granularity", conversion_product_report_request_granularity_ToString(conversion_product_report_request->granularity)) == NULL)
    {
    goto fail; //Enum
    }


    // conversion_product_report_request->level
    if (pinterest_rest_api_conversion_product_report_request_LEVEL_NULL == conversion_product_report_request->level) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "level", conversion_product_report_request_level_ToString(conversion_product_report_request->level)) == NULL)
    {
    goto fail; //Enum
    }


    // conversion_product_report_request->product_sku_ids
    if(conversion_product_report_request->product_sku_ids) {
    cJSON *product_sku_ids = cJSON_AddArrayToObject(item, "product_sku_ids");
    if(product_sku_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *product_sku_idsListEntry;
    list_ForEach(product_sku_idsListEntry, conversion_product_report_request->product_sku_ids) {
    if(cJSON_AddStringToObject(product_sku_ids, "", product_sku_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_product_report_request->report_name
    if (!conversion_product_report_request->report_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "report_name", conversion_product_report_request->report_name) == NULL) {
    goto fail; //String
    }


    // conversion_product_report_request->start_date
    if (!conversion_product_report_request->start_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "start_date", conversion_product_report_request->start_date) == NULL) {
    goto fail; //String
    }


    // conversion_product_report_request->view_window_days
    if(conversion_product_report_request->view_window_days) {
    cJSON *view_window_days_local_JSON = conversion_attribution_window_days_convertToJSON(conversion_product_report_request->view_window_days);
    if(view_window_days_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "view_window_days", view_window_days_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_product_report_request_t *conversion_product_report_request_parseFromJSON(cJSON *conversion_product_report_requestJSON){

    conversion_product_report_request_t *conversion_product_report_request_local_var = NULL;

    // define the local list for conversion_product_report_request->ad_group_ids
    list_t *ad_group_idsList = NULL;

    // define the local list for conversion_product_report_request->campaign_ids
    list_t *campaign_idsList = NULL;

    // define the local list for conversion_product_report_request->campaign_objective_types
    list_t *campaign_objective_typesList = NULL;

    // define the local variable for conversion_product_report_request->click_window_days
    conversion_attribution_window_days_t *click_window_days_local_nonprim = NULL;

    // define the local list for conversion_product_report_request->columns
    list_t *columnsList = NULL;

    // define the local variable for conversion_product_report_request->conversion_report_time
    conversion_report_time_type_t *conversion_report_time_local_nonprim = NULL;

    // define the local list for conversion_product_report_request->product_sku_ids
    list_t *product_sku_idsList = NULL;

    // define the local variable for conversion_product_report_request->view_window_days
    conversion_attribution_window_days_t *view_window_days_local_nonprim = NULL;

    // conversion_product_report_request->ad_group_ids
    cJSON *ad_group_ids = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "ad_group_ids");
    if (cJSON_IsNull(ad_group_ids)) {
        ad_group_ids = NULL;
    }
    if (ad_group_ids) { 
    cJSON *ad_group_ids_local = NULL;
    if(!cJSON_IsArray(ad_group_ids)) {
        goto end;//primitive container
    }
    ad_group_idsList = list_createList();

    cJSON_ArrayForEach(ad_group_ids_local, ad_group_ids)
    {
        if(!cJSON_IsString(ad_group_ids_local))
        {
            goto end;
        }
        list_addElement(ad_group_idsList , strdup(ad_group_ids_local->valuestring));
    }
    }

    // conversion_product_report_request->campaign_ids
    cJSON *campaign_ids = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "campaign_ids");
    if (cJSON_IsNull(campaign_ids)) {
        campaign_ids = NULL;
    }
    if (campaign_ids) { 
    cJSON *campaign_ids_local = NULL;
    if(!cJSON_IsArray(campaign_ids)) {
        goto end;//primitive container
    }
    campaign_idsList = list_createList();

    cJSON_ArrayForEach(campaign_ids_local, campaign_ids)
    {
        if(!cJSON_IsString(campaign_ids_local))
        {
            goto end;
        }
        list_addElement(campaign_idsList , strdup(campaign_ids_local->valuestring));
    }
    }

    // conversion_product_report_request->campaign_objective_types
    cJSON *campaign_objective_types = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "campaign_objective_types");
    if (cJSON_IsNull(campaign_objective_types)) {
        campaign_objective_types = NULL;
    }
    if (campaign_objective_types) { 
    cJSON *campaign_objective_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(campaign_objective_types)){
        goto end; //nonprimitive container
    }

    campaign_objective_typesList = list_createList();

    cJSON_ArrayForEach(campaign_objective_types_local_nonprimitive,campaign_objective_types )
    {
        if(!cJSON_IsObject(campaign_objective_types_local_nonprimitive)){
            goto end;
        }
        conversion_product_report_request_objective_type_e campaign_objective_typesItem = objective_type_parseFromJSON(campaign_objective_types_local_nonprimitive);

        list_addElement(campaign_objective_typesList, (void *)campaign_objective_typesItem);
    }
    }

    // conversion_product_report_request->click_window_days
    cJSON *click_window_days = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "click_window_days");
    if (cJSON_IsNull(click_window_days)) {
        click_window_days = NULL;
    }
    if (click_window_days) { 
    click_window_days_local_nonprim = conversion_attribution_window_days_parseFromJSON(click_window_days); //custom
    }

    // conversion_product_report_request->columns
    cJSON *columns = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "columns");
    if (cJSON_IsNull(columns)) {
        columns = NULL;
    }
    if (!columns) {
        goto end;
    }

    
    cJSON *columns_local_nonprimitive = NULL;
    if(!cJSON_IsArray(columns)){
        goto end; //nonprimitive container
    }

    columnsList = list_createList();

    cJSON_ArrayForEach(columns_local_nonprimitive,columns )
    {
        if(!cJSON_IsObject(columns_local_nonprimitive)){
            goto end;
        }
        conversion_product_report_request_conversion_product_reporting_column_e columnsItem = conversion_product_reporting_column_parseFromJSON(columns_local_nonprimitive);

        list_addElement(columnsList, (void *)columnsItem);
    }

    // conversion_product_report_request->conversion_product_attribution_type
    cJSON *conversion_product_attribution_type = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "conversion_product_attribution_type");
    if (cJSON_IsNull(conversion_product_attribution_type)) {
        conversion_product_attribution_type = NULL;
    }
    pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTATTRIBUTIONTYPE_e conversion_product_attribution_typeVariable;
    if (conversion_product_attribution_type) { 
    if(!cJSON_IsString(conversion_product_attribution_type))
    {
    goto end; //Enum
    }
    conversion_product_attribution_typeVariable = conversion_product_report_request_conversion_product_attribution_type_FromString(conversion_product_attribution_type->valuestring);
    }

    // conversion_product_report_request->conversion_product_breakdown
    cJSON *conversion_product_breakdown = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "conversion_product_breakdown");
    if (cJSON_IsNull(conversion_product_breakdown)) {
        conversion_product_breakdown = NULL;
    }
    pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTBREAKDOWN_e conversion_product_breakdownVariable;
    if (conversion_product_breakdown) { 
    if(!cJSON_IsString(conversion_product_breakdown))
    {
    goto end; //Enum
    }
    conversion_product_breakdownVariable = conversion_product_report_request_conversion_product_breakdown_FromString(conversion_product_breakdown->valuestring);
    }

    // conversion_product_report_request->conversion_report_time
    cJSON *conversion_report_time = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "conversion_report_time");
    if (cJSON_IsNull(conversion_report_time)) {
        conversion_report_time = NULL;
    }
    if (conversion_report_time) { 
    conversion_report_time_local_nonprim = conversion_report_time_type_parseFromJSON(conversion_report_time); //custom
    }

    // conversion_product_report_request->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "end_date");
    if (cJSON_IsNull(end_date)) {
        end_date = NULL;
    }
    if (!end_date) {
        goto end;
    }

    
    if(!cJSON_IsString(end_date))
    {
    goto end; //String
    }

    // conversion_product_report_request->granularity
    cJSON *granularity = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "granularity");
    if (cJSON_IsNull(granularity)) {
        granularity = NULL;
    }
    if (!granularity) {
        goto end;
    }

    pinterest_rest_api_conversion_product_report_request_GRANULARITY_e granularityVariable;
    
    if(!cJSON_IsString(granularity))
    {
    goto end; //Enum
    }
    granularityVariable = conversion_product_report_request_granularity_FromString(granularity->valuestring);

    // conversion_product_report_request->level
    cJSON *level = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "level");
    if (cJSON_IsNull(level)) {
        level = NULL;
    }
    if (!level) {
        goto end;
    }

    pinterest_rest_api_conversion_product_report_request_LEVEL_e levelVariable;
    
    if(!cJSON_IsString(level))
    {
    goto end; //Enum
    }
    levelVariable = conversion_product_report_request_level_FromString(level->valuestring);

    // conversion_product_report_request->product_sku_ids
    cJSON *product_sku_ids = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "product_sku_ids");
    if (cJSON_IsNull(product_sku_ids)) {
        product_sku_ids = NULL;
    }
    if (product_sku_ids) { 
    cJSON *product_sku_ids_local = NULL;
    if(!cJSON_IsArray(product_sku_ids)) {
        goto end;//primitive container
    }
    product_sku_idsList = list_createList();

    cJSON_ArrayForEach(product_sku_ids_local, product_sku_ids)
    {
        if(!cJSON_IsString(product_sku_ids_local))
        {
            goto end;
        }
        list_addElement(product_sku_idsList , strdup(product_sku_ids_local->valuestring));
    }
    }

    // conversion_product_report_request->report_name
    cJSON *report_name = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "report_name");
    if (cJSON_IsNull(report_name)) {
        report_name = NULL;
    }
    if (!report_name) {
        goto end;
    }

    
    if(!cJSON_IsString(report_name))
    {
    goto end; //String
    }

    // conversion_product_report_request->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "start_date");
    if (cJSON_IsNull(start_date)) {
        start_date = NULL;
    }
    if (!start_date) {
        goto end;
    }

    
    if(!cJSON_IsString(start_date))
    {
    goto end; //String
    }

    // conversion_product_report_request->view_window_days
    cJSON *view_window_days = cJSON_GetObjectItemCaseSensitive(conversion_product_report_requestJSON, "view_window_days");
    if (cJSON_IsNull(view_window_days)) {
        view_window_days = NULL;
    }
    if (view_window_days) { 
    view_window_days_local_nonprim = conversion_attribution_window_days_parseFromJSON(view_window_days); //custom
    }


    conversion_product_report_request_local_var = conversion_product_report_request_create_internal (
        ad_group_ids ? ad_group_idsList : NULL,
        campaign_ids ? campaign_idsList : NULL,
        campaign_objective_types ? campaign_objective_typesList : NULL,
        click_window_days ? click_window_days_local_nonprim : NULL,
        columnsList,
        conversion_product_attribution_type ? conversion_product_attribution_typeVariable : pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTATTRIBUTIONTYPE_NULL,
        conversion_product_breakdown ? conversion_product_breakdownVariable : pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTBREAKDOWN_NULL,
        conversion_report_time ? conversion_report_time_local_nonprim : NULL,
        strdup(end_date->valuestring),
        granularityVariable,
        levelVariable,
        product_sku_ids ? product_sku_idsList : NULL,
        strdup(report_name->valuestring),
        strdup(start_date->valuestring),
        view_window_days ? view_window_days_local_nonprim : NULL
        );

    return conversion_product_report_request_local_var;
end:
    if (ad_group_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_group_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_group_idsList);
        ad_group_idsList = NULL;
    }
    if (campaign_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_idsList);
        campaign_idsList = NULL;
    }
    if (campaign_objective_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_objective_typesList) {
            objective_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_objective_typesList);
        campaign_objective_typesList = NULL;
    }
    if (click_window_days_local_nonprim) {
        conversion_attribution_window_days_free(click_window_days_local_nonprim);
        click_window_days_local_nonprim = NULL;
    }
    if (columnsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, columnsList) {
            conversion_product_reporting_column_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(columnsList);
        columnsList = NULL;
    }
    if (conversion_report_time_local_nonprim) {
        conversion_report_time_type_free(conversion_report_time_local_nonprim);
        conversion_report_time_local_nonprim = NULL;
    }
    if (product_sku_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_sku_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_sku_idsList);
        product_sku_idsList = NULL;
    }
    if (view_window_days_local_nonprim) {
        conversion_attribution_window_days_free(view_window_days_local_nonprim);
        view_window_days_local_nonprim = NULL;
    }
    return NULL;

}
