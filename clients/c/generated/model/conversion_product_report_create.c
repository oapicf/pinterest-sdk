#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_product_report_create.h"


char* conversion_product_report_create_campaign_objective_types_ToString(pinterest_rest_api_conversion_product_report_create__e campaign_objective_types) {
    char *campaign_objective_typesArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "APP_INSTALL", "SALES", "LEADS", "CTV_CONSIDERATION" };
    return campaign_objective_typesArray[campaign_objective_types - 1];
}

pinterest_rest_api_conversion_product_report_create__e conversion_product_report_create_campaign_objective_types_FromString(char* campaign_objective_types) {
    int stringToReturn = 0;
    char *campaign_objective_typesArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "APP_INSTALL", "SALES", "LEADS", "CTV_CONSIDERATION" };
    size_t sizeofArray = sizeof(campaign_objective_typesArray) / sizeof(campaign_objective_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_objective_types, campaign_objective_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_product_report_create_columns_ToString(pinterest_rest_api_conversion_product_report_create__e columns) {
    char *columnsArray[] =  { "NULL", "CAMPAIGN_NAME", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_GROUP_ID", "CAMPAIGN_OBJECTIVE_TYPE", "AD_GROUP_NAME", "CONVERSION_PRODUCT_ID", "CONVERSION_PRODUCT_BRAND", "CONVERSION_PRODUCT_CATEGORY", "CONVERSION_PRODUCT_ID_GROUP", "TOTAL_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE", "TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY", "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE", "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE", "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE", "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY", "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE", "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY", "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE", "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY", "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE", "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY", "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE", "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD", "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY", "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE", "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD" };
    return columnsArray[columns - 1];
}

pinterest_rest_api_conversion_product_report_create__e conversion_product_report_create_columns_FromString(char* columns) {
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

static conversion_product_report_create_t *conversion_product_report_create_create_internal(
    list_t *ad_group_ids,
    list_t *campaign_ids,
    list_t *campaign_objective_types,
    conversion_attribution_window_days_t *click_window_days,
    list_t *columns,
    conversion_product_attribution_type_t *conversion_product_attribution_type,
    conversion_product_report_breakdown_type_t *conversion_product_breakdown,
    conversion_report_time_type_t *conversion_report_time,
    char *end_date,
    conversion_product_report_granularity_t *granularity,
    conversion_product_report_level_t *level,
    list_t *product_sku_ids,
    char *report_name,
    char *start_date,
    conversion_attribution_window_days_t *view_window_days
    ) {
    conversion_product_report_create_t *conversion_product_report_create_local_var = malloc(sizeof(conversion_product_report_create_t));
    if (!conversion_product_report_create_local_var) {
        return NULL;
    }
    memset(conversion_product_report_create_local_var, 0, sizeof(conversion_product_report_create_t));
    conversion_product_report_create_local_var->_library_owned = 1;
    conversion_product_report_create_local_var->ad_group_ids = ad_group_ids;
    conversion_product_report_create_local_var->campaign_ids = campaign_ids;
    conversion_product_report_create_local_var->campaign_objective_types = campaign_objective_types;
    conversion_product_report_create_local_var->click_window_days = click_window_days;
    conversion_product_report_create_local_var->columns = columns;
    conversion_product_report_create_local_var->conversion_product_attribution_type = conversion_product_attribution_type;
    conversion_product_report_create_local_var->conversion_product_breakdown = conversion_product_breakdown;
    conversion_product_report_create_local_var->conversion_report_time = conversion_report_time;
    conversion_product_report_create_local_var->end_date = end_date;
    conversion_product_report_create_local_var->granularity = granularity;
    conversion_product_report_create_local_var->level = level;
    conversion_product_report_create_local_var->product_sku_ids = product_sku_ids;
    conversion_product_report_create_local_var->report_name = report_name;
    conversion_product_report_create_local_var->start_date = start_date;
    conversion_product_report_create_local_var->view_window_days = view_window_days;
    return conversion_product_report_create_local_var;
}

__attribute__((deprecated)) conversion_product_report_create_t *conversion_product_report_create_create(
    list_t *ad_group_ids,
    list_t *campaign_ids,
    list_t *campaign_objective_types,
    conversion_attribution_window_days_t *click_window_days,
    list_t *columns,
    conversion_product_attribution_type_t *conversion_product_attribution_type,
    conversion_product_report_breakdown_type_t *conversion_product_breakdown,
    conversion_report_time_type_t *conversion_report_time,
    char *end_date,
    conversion_product_report_granularity_t *granularity,
    conversion_product_report_level_t *level,
    list_t *product_sku_ids,
    char *report_name,
    char *start_date,
    conversion_attribution_window_days_t *view_window_days
    ) {
    conversion_product_report_create_t *result = conversion_product_report_create_create_internal (
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
    if (!result) {
    }
    return result;
}

void conversion_product_report_create_free(conversion_product_report_create_t *conversion_product_report_create) {
    if(NULL == conversion_product_report_create){
        return ;
    }
    if(conversion_product_report_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_product_report_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_product_report_create->ad_group_ids) {
        list_ForEach(listEntry, conversion_product_report_create->ad_group_ids) {
            free(listEntry->data);
        }
        list_freeList(conversion_product_report_create->ad_group_ids);
        conversion_product_report_create->ad_group_ids = NULL;
    }
    if (conversion_product_report_create->campaign_ids) {
        list_ForEach(listEntry, conversion_product_report_create->campaign_ids) {
            free(listEntry->data);
        }
        list_freeList(conversion_product_report_create->campaign_ids);
        conversion_product_report_create->campaign_ids = NULL;
    }
    if (conversion_product_report_create->campaign_objective_types) {
        list_ForEach(listEntry, conversion_product_report_create->campaign_objective_types) {
            conversion_objective_type_free(listEntry->data);
        }
        list_freeList(conversion_product_report_create->campaign_objective_types);
        conversion_product_report_create->campaign_objective_types = NULL;
    }
    if (conversion_product_report_create->click_window_days) {
        conversion_attribution_window_days_free(conversion_product_report_create->click_window_days);
        conversion_product_report_create->click_window_days = NULL;
    }
    if (conversion_product_report_create->columns) {
        list_ForEach(listEntry, conversion_product_report_create->columns) {
            conversion_product_reporting_column_free(listEntry->data);
        }
        list_freeList(conversion_product_report_create->columns);
        conversion_product_report_create->columns = NULL;
    }
    if (conversion_product_report_create->conversion_product_attribution_type) {
        conversion_product_attribution_type_free(conversion_product_report_create->conversion_product_attribution_type);
        conversion_product_report_create->conversion_product_attribution_type = NULL;
    }
    if (conversion_product_report_create->conversion_product_breakdown) {
        conversion_product_report_breakdown_type_free(conversion_product_report_create->conversion_product_breakdown);
        conversion_product_report_create->conversion_product_breakdown = NULL;
    }
    if (conversion_product_report_create->conversion_report_time) {
        conversion_report_time_type_free(conversion_product_report_create->conversion_report_time);
        conversion_product_report_create->conversion_report_time = NULL;
    }
    if (conversion_product_report_create->end_date) {
        free(conversion_product_report_create->end_date);
        conversion_product_report_create->end_date = NULL;
    }
    if (conversion_product_report_create->granularity) {
        conversion_product_report_granularity_free(conversion_product_report_create->granularity);
        conversion_product_report_create->granularity = NULL;
    }
    if (conversion_product_report_create->level) {
        conversion_product_report_level_free(conversion_product_report_create->level);
        conversion_product_report_create->level = NULL;
    }
    if (conversion_product_report_create->product_sku_ids) {
        list_ForEach(listEntry, conversion_product_report_create->product_sku_ids) {
            free(listEntry->data);
        }
        list_freeList(conversion_product_report_create->product_sku_ids);
        conversion_product_report_create->product_sku_ids = NULL;
    }
    if (conversion_product_report_create->report_name) {
        free(conversion_product_report_create->report_name);
        conversion_product_report_create->report_name = NULL;
    }
    if (conversion_product_report_create->start_date) {
        free(conversion_product_report_create->start_date);
        conversion_product_report_create->start_date = NULL;
    }
    if (conversion_product_report_create->view_window_days) {
        conversion_attribution_window_days_free(conversion_product_report_create->view_window_days);
        conversion_product_report_create->view_window_days = NULL;
    }
    free(conversion_product_report_create);
}

cJSON *conversion_product_report_create_convertToJSON(conversion_product_report_create_t *conversion_product_report_create) {
    cJSON *item = cJSON_CreateObject();

    // conversion_product_report_create->ad_group_ids
    if(conversion_product_report_create->ad_group_ids) {
    cJSON *ad_group_ids = cJSON_AddArrayToObject(item, "ad_group_ids");
    if(ad_group_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ad_group_idsListEntry;
    list_ForEach(ad_group_idsListEntry, conversion_product_report_create->ad_group_ids) {
    if(cJSON_AddStringToObject(ad_group_ids, "", ad_group_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_product_report_create->campaign_ids
    if(conversion_product_report_create->campaign_ids) {
    cJSON *campaign_ids = cJSON_AddArrayToObject(item, "campaign_ids");
    if(campaign_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idsListEntry;
    list_ForEach(campaign_idsListEntry, conversion_product_report_create->campaign_ids) {
    if(cJSON_AddStringToObject(campaign_ids, "", campaign_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_product_report_create->campaign_objective_types
    if(conversion_product_report_create->campaign_objective_types != pinterest_rest_api_list_CAMPAIGNOBJECTIVETYPES_NULL) {
    cJSON *campaign_objective_types = cJSON_AddArrayToObject(item, "campaign_objective_types");
    if(campaign_objective_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *campaign_objective_typesListEntry;
    if (conversion_product_report_create->campaign_objective_types) {
    list_ForEach(campaign_objective_typesListEntry, conversion_product_report_create->campaign_objective_types) {
    cJSON *itemLocal = conversion_objective_type_convertToJSON((pinterest_rest_api_conversion_product_report_create__e)campaign_objective_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(campaign_objective_types, itemLocal);
    }
    }
    }


    // conversion_product_report_create->click_window_days
    if(conversion_product_report_create->click_window_days) {
    cJSON *click_window_days_local_JSON = conversion_attribution_window_days_convertToJSON(conversion_product_report_create->click_window_days);
    if(click_window_days_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "click_window_days", click_window_days_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_product_report_create->columns
    if (pinterest_rest_api_list_COLUMNS_NULL == conversion_product_report_create->columns) {
        goto fail;
    }
    cJSON *columns = cJSON_AddArrayToObject(item, "columns");
    if(columns == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *columnsListEntry;
    if (conversion_product_report_create->columns) {
    list_ForEach(columnsListEntry, conversion_product_report_create->columns) {
    cJSON *itemLocal = conversion_product_reporting_column_convertToJSON((pinterest_rest_api_conversion_product_report_create__e)columnsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(columns, itemLocal);
    }
    }


    // conversion_product_report_create->conversion_product_attribution_type
    if(conversion_product_report_create->conversion_product_attribution_type) {
    cJSON *conversion_product_attribution_type_local_JSON = conversion_product_attribution_type_convertToJSON(conversion_product_report_create->conversion_product_attribution_type);
    if(conversion_product_attribution_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "conversion_product_attribution_type", conversion_product_attribution_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_product_report_create->conversion_product_breakdown
    if(conversion_product_report_create->conversion_product_breakdown) {
    cJSON *conversion_product_breakdown_local_JSON = conversion_product_report_breakdown_type_convertToJSON(conversion_product_report_create->conversion_product_breakdown);
    if(conversion_product_breakdown_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "conversion_product_breakdown", conversion_product_breakdown_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_product_report_create->conversion_report_time
    if(conversion_product_report_create->conversion_report_time) {
    cJSON *conversion_report_time_local_JSON = conversion_report_time_type_convertToJSON(conversion_product_report_create->conversion_report_time);
    if(conversion_report_time_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "conversion_report_time", conversion_report_time_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_product_report_create->end_date
    if (!conversion_product_report_create->end_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "end_date", conversion_product_report_create->end_date) == NULL) {
    goto fail; //String
    }


    // conversion_product_report_create->granularity
    if (!conversion_product_report_create->granularity) {
        goto fail;
    }
    cJSON *granularity_local_JSON = conversion_product_report_granularity_convertToJSON(conversion_product_report_create->granularity);
    if(granularity_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "granularity", granularity_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // conversion_product_report_create->level
    if (!conversion_product_report_create->level) {
        goto fail;
    }
    cJSON *level_local_JSON = conversion_product_report_level_convertToJSON(conversion_product_report_create->level);
    if(level_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "level", level_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // conversion_product_report_create->product_sku_ids
    if(conversion_product_report_create->product_sku_ids) {
    cJSON *product_sku_ids = cJSON_AddArrayToObject(item, "product_sku_ids");
    if(product_sku_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *product_sku_idsListEntry;
    list_ForEach(product_sku_idsListEntry, conversion_product_report_create->product_sku_ids) {
    if(cJSON_AddStringToObject(product_sku_ids, "", product_sku_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_product_report_create->report_name
    if (!conversion_product_report_create->report_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "report_name", conversion_product_report_create->report_name) == NULL) {
    goto fail; //String
    }


    // conversion_product_report_create->start_date
    if (!conversion_product_report_create->start_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "start_date", conversion_product_report_create->start_date) == NULL) {
    goto fail; //String
    }


    // conversion_product_report_create->view_window_days
    if(conversion_product_report_create->view_window_days) {
    cJSON *view_window_days_local_JSON = conversion_attribution_window_days_convertToJSON(conversion_product_report_create->view_window_days);
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

conversion_product_report_create_t *conversion_product_report_create_parseFromJSON(cJSON *conversion_product_report_createJSON){

    conversion_product_report_create_t *conversion_product_report_create_local_var = NULL;

    // define the local list for conversion_product_report_create->ad_group_ids
    list_t *ad_group_idsList = NULL;

    // define the local list for conversion_product_report_create->campaign_ids
    list_t *campaign_idsList = NULL;

    // define the local list for conversion_product_report_create->campaign_objective_types
    list_t *campaign_objective_typesList = NULL;

    // define the local variable for conversion_product_report_create->click_window_days
    conversion_attribution_window_days_t *click_window_days_local_nonprim = NULL;

    // define the local list for conversion_product_report_create->columns
    list_t *columnsList = NULL;

    // define the local variable for conversion_product_report_create->conversion_product_attribution_type
    conversion_product_attribution_type_t *conversion_product_attribution_type_local_nonprim = NULL;

    // define the local variable for conversion_product_report_create->conversion_product_breakdown
    conversion_product_report_breakdown_type_t *conversion_product_breakdown_local_nonprim = NULL;

    // define the local variable for conversion_product_report_create->conversion_report_time
    conversion_report_time_type_t *conversion_report_time_local_nonprim = NULL;

    char *end_date_local_str = NULL;

    // define the local variable for conversion_product_report_create->granularity
    conversion_product_report_granularity_t *granularity_local_nonprim = NULL;

    // define the local variable for conversion_product_report_create->level
    conversion_product_report_level_t *level_local_nonprim = NULL;

    // define the local list for conversion_product_report_create->product_sku_ids
    list_t *product_sku_idsList = NULL;

    char *report_name_local_str = NULL;

    char *start_date_local_str = NULL;

    // define the local variable for conversion_product_report_create->view_window_days
    conversion_attribution_window_days_t *view_window_days_local_nonprim = NULL;

    // conversion_product_report_create->ad_group_ids
    cJSON *ad_group_ids = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "ad_group_ids");
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

    // conversion_product_report_create->campaign_ids
    cJSON *campaign_ids = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "campaign_ids");
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

    // conversion_product_report_create->campaign_objective_types
    cJSON *campaign_objective_types = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "campaign_objective_types");
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
        conversion_product_report_create_conversion_objective_type_e campaign_objective_typesItem = conversion_objective_type_parseFromJSON(campaign_objective_types_local_nonprimitive);

        list_addElement(campaign_objective_typesList, (void *)campaign_objective_typesItem);
    }
    }

    // conversion_product_report_create->click_window_days
    cJSON *click_window_days = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "click_window_days");
    if (cJSON_IsNull(click_window_days)) {
        click_window_days = NULL;
    }
    if (click_window_days) { 
    click_window_days_local_nonprim = conversion_attribution_window_days_parseFromJSON(click_window_days); //custom
    }

    // conversion_product_report_create->columns
    cJSON *columns = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "columns");
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
        conversion_product_report_create_conversion_product_reporting_column_e columnsItem = conversion_product_reporting_column_parseFromJSON(columns_local_nonprimitive);

        list_addElement(columnsList, (void *)columnsItem);
    }

    // conversion_product_report_create->conversion_product_attribution_type
    cJSON *conversion_product_attribution_type = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "conversion_product_attribution_type");
    if (cJSON_IsNull(conversion_product_attribution_type)) {
        conversion_product_attribution_type = NULL;
    }
    if (conversion_product_attribution_type) { 
    conversion_product_attribution_type_local_nonprim = conversion_product_attribution_type_parseFromJSON(conversion_product_attribution_type); //custom
    }

    // conversion_product_report_create->conversion_product_breakdown
    cJSON *conversion_product_breakdown = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "conversion_product_breakdown");
    if (cJSON_IsNull(conversion_product_breakdown)) {
        conversion_product_breakdown = NULL;
    }
    if (conversion_product_breakdown) { 
    conversion_product_breakdown_local_nonprim = conversion_product_report_breakdown_type_parseFromJSON(conversion_product_breakdown); //custom
    }

    // conversion_product_report_create->conversion_report_time
    cJSON *conversion_report_time = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "conversion_report_time");
    if (cJSON_IsNull(conversion_report_time)) {
        conversion_report_time = NULL;
    }
    if (conversion_report_time) { 
    conversion_report_time_local_nonprim = conversion_report_time_type_parseFromJSON(conversion_report_time); //custom
    }

    // conversion_product_report_create->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "end_date");
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

    // conversion_product_report_create->granularity
    cJSON *granularity = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "granularity");
    if (cJSON_IsNull(granularity)) {
        granularity = NULL;
    }
    if (!granularity) {
        goto end;
    }

    
    granularity_local_nonprim = conversion_product_report_granularity_parseFromJSON(granularity); //custom

    // conversion_product_report_create->level
    cJSON *level = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "level");
    if (cJSON_IsNull(level)) {
        level = NULL;
    }
    if (!level) {
        goto end;
    }

    
    level_local_nonprim = conversion_product_report_level_parseFromJSON(level); //custom

    // conversion_product_report_create->product_sku_ids
    cJSON *product_sku_ids = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "product_sku_ids");
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

    // conversion_product_report_create->report_name
    cJSON *report_name = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "report_name");
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

    // conversion_product_report_create->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "start_date");
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

    // conversion_product_report_create->view_window_days
    cJSON *view_window_days = cJSON_GetObjectItemCaseSensitive(conversion_product_report_createJSON, "view_window_days");
    if (cJSON_IsNull(view_window_days)) {
        view_window_days = NULL;
    }
    if (view_window_days) { 
    view_window_days_local_nonprim = conversion_attribution_window_days_parseFromJSON(view_window_days); //custom
    }


    if (end_date && !cJSON_IsNull(end_date)) end_date_local_str = strdup(end_date->valuestring);
    if (report_name && !cJSON_IsNull(report_name)) report_name_local_str = strdup(report_name->valuestring);
    if (start_date && !cJSON_IsNull(start_date)) start_date_local_str = strdup(start_date->valuestring);

    conversion_product_report_create_local_var = conversion_product_report_create_create_internal (
        ad_group_ids ? ad_group_idsList : NULL,
        campaign_ids ? campaign_idsList : NULL,
        campaign_objective_types ? campaign_objective_typesList : NULL,
        click_window_days ? click_window_days_local_nonprim : NULL,
        columnsList,
        conversion_product_attribution_type ? conversion_product_attribution_type_local_nonprim : NULL,
        conversion_product_breakdown ? conversion_product_breakdown_local_nonprim : NULL,
        conversion_report_time ? conversion_report_time_local_nonprim : NULL,
        end_date_local_str,
        granularity_local_nonprim,
        level_local_nonprim,
        product_sku_ids ? product_sku_idsList : NULL,
        report_name_local_str,
        start_date_local_str,
        view_window_days ? view_window_days_local_nonprim : NULL
        );

    if (!conversion_product_report_create_local_var) {
        goto end;
    }

    return conversion_product_report_create_local_var;
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
            conversion_objective_type_free(listEntry->data);
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
    if (conversion_product_attribution_type_local_nonprim) {
        conversion_product_attribution_type_free(conversion_product_attribution_type_local_nonprim);
        conversion_product_attribution_type_local_nonprim = NULL;
    }
    if (conversion_product_breakdown_local_nonprim) {
        conversion_product_report_breakdown_type_free(conversion_product_breakdown_local_nonprim);
        conversion_product_breakdown_local_nonprim = NULL;
    }
    if (conversion_report_time_local_nonprim) {
        conversion_report_time_type_free(conversion_report_time_local_nonprim);
        conversion_report_time_local_nonprim = NULL;
    }
    if (end_date_local_str) {
        free(end_date_local_str);
        end_date_local_str = NULL;
    }
    if (granularity_local_nonprim) {
        conversion_product_report_granularity_free(granularity_local_nonprim);
        granularity_local_nonprim = NULL;
    }
    if (level_local_nonprim) {
        conversion_product_report_level_free(level_local_nonprim);
        level_local_nonprim = NULL;
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
    if (report_name_local_str) {
        free(report_name_local_str);
        report_name_local_str = NULL;
    }
    if (start_date_local_str) {
        free(start_date_local_str);
        start_date_local_str = NULL;
    }
    if (view_window_days_local_nonprim) {
        conversion_attribution_window_days_free(view_window_days_local_nonprim);
        view_window_days_local_nonprim = NULL;
    }
    return NULL;

}
