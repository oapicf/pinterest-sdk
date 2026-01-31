#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_analytics_create_async_request_all_of_custom_conversion_event_metrics.h"


char* ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_custom_event_metrics_type_ToString(pinterest_rest_api_ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_CUSTOMEVENTMETRICSTYPE_e custom_event_metrics_type) {
    char* custom_event_metrics_typeArray[] =  { "NULL", "ADE_COST_PER_ACTION", "ADE_ROAS", "ADE_TOTAL_CONVERSIONS", "ADE_TOTAL_VALUE_IN_MICRO_DOLLAR", "ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CLICK", "ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_VIEW", "ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CONVERSION_RATE", "ADE_WEB_COST_PER_ACTION", "ADE_WEB_ROAS", "ADE_TOTAL_WEB_CONVERSIONS", "ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_WEB_CLICK", "ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_WEB_VIEW", "ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_INAPP_COST_PER_ACTION", "ADE_INAPP_ROAS", "ADE_TOTAL_INAPP_CONVERSIONS", "ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_INAPP_CLICK", "ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_INAPP_VIEW", "ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_OFFLINE_COST_PER_ACTION", "ADE_OFFLINE_ROAS", "ADE_TOTAL_OFFLINE_CONVERSIONS", "ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_OFFLINE_CLICK", "ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_OFFLINE_VIEW", "ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD" };
    return custom_event_metrics_typeArray[custom_event_metrics_type];
}

pinterest_rest_api_ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_CUSTOMEVENTMETRICSTYPE_e ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_custom_event_metrics_type_FromString(char* custom_event_metrics_type){
    int stringToReturn = 0;
    char *custom_event_metrics_typeArray[] =  { "NULL", "ADE_COST_PER_ACTION", "ADE_ROAS", "ADE_TOTAL_CONVERSIONS", "ADE_TOTAL_VALUE_IN_MICRO_DOLLAR", "ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CLICK", "ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_VIEW", "ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CONVERSION_RATE", "ADE_WEB_COST_PER_ACTION", "ADE_WEB_ROAS", "ADE_TOTAL_WEB_CONVERSIONS", "ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_WEB_CLICK", "ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_WEB_VIEW", "ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_INAPP_COST_PER_ACTION", "ADE_INAPP_ROAS", "ADE_TOTAL_INAPP_CONVERSIONS", "ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_INAPP_CLICK", "ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_INAPP_VIEW", "ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_OFFLINE_COST_PER_ACTION", "ADE_OFFLINE_ROAS", "ADE_TOTAL_OFFLINE_CONVERSIONS", "ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_OFFLINE_CLICK", "ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_OFFLINE_VIEW", "ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR", "ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD", "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD" };
    size_t sizeofArray = sizeof(custom_event_metrics_typeArray) / sizeof(custom_event_metrics_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(custom_event_metrics_type, custom_event_metrics_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_t *ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_create_internal(
    pinterest_rest_api_ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_CUSTOMEVENTMETRICSTYPE_e custom_event_metrics_type,
    char *custom_event_name
    ) {
    ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_t *ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_local_var = malloc(sizeof(ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_t));
    if (!ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_local_var) {
        return NULL;
    }
    ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_local_var->custom_event_metrics_type = custom_event_metrics_type;
    ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_local_var->custom_event_name = custom_event_name;

    ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_local_var->_library_owned = 1;
    return ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_local_var;
}

__attribute__((deprecated)) ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_t *ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_create(
    pinterest_rest_api_ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_CUSTOMEVENTMETRICSTYPE_e custom_event_metrics_type,
    char *custom_event_name
    ) {
    return ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_create_internal (
        custom_event_metrics_type,
        custom_event_name
        );
}

void ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_free(ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_t *ads_analytics_create_async_request_all_of_custom_conversion_event_metrics) {
    if(NULL == ads_analytics_create_async_request_all_of_custom_conversion_event_metrics){
        return ;
    }
    if(ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_name) {
        free(ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_name);
        ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_name = NULL;
    }
    free(ads_analytics_create_async_request_all_of_custom_conversion_event_metrics);
}

cJSON *ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_convertToJSON(ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_t *ads_analytics_create_async_request_all_of_custom_conversion_event_metrics) {
    cJSON *item = cJSON_CreateObject();

    // ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_metrics_type
    if (pinterest_rest_api_ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_CUSTOMEVENTMETRICSTYPE_NULL == ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_metrics_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "custom_event_metrics_type", ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_custom_event_metrics_type_ToString(ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_metrics_type)) == NULL)
    {
    goto fail; //Enum
    }


    // ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_name
    if (!ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "custom_event_name", ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_t *ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_parseFromJSON(cJSON *ads_analytics_create_async_request_all_of_custom_conversion_event_metricsJSON){

    ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_t *ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_local_var = NULL;

    // ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_metrics_type
    cJSON *custom_event_metrics_type = cJSON_GetObjectItemCaseSensitive(ads_analytics_create_async_request_all_of_custom_conversion_event_metricsJSON, "custom_event_metrics_type");
    if (cJSON_IsNull(custom_event_metrics_type)) {
        custom_event_metrics_type = NULL;
    }
    if (!custom_event_metrics_type) {
        goto end;
    }

    pinterest_rest_api_ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_CUSTOMEVENTMETRICSTYPE_e custom_event_metrics_typeVariable;
    
    if(!cJSON_IsString(custom_event_metrics_type))
    {
    goto end; //Enum
    }
    custom_event_metrics_typeVariable = ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_custom_event_metrics_type_FromString(custom_event_metrics_type->valuestring);

    // ads_analytics_create_async_request_all_of_custom_conversion_event_metrics->custom_event_name
    cJSON *custom_event_name = cJSON_GetObjectItemCaseSensitive(ads_analytics_create_async_request_all_of_custom_conversion_event_metricsJSON, "custom_event_name");
    if (cJSON_IsNull(custom_event_name)) {
        custom_event_name = NULL;
    }
    if (!custom_event_name) {
        goto end;
    }

    
    if(!cJSON_IsString(custom_event_name))
    {
    goto end; //String
    }


    ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_local_var = ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_create_internal (
        custom_event_metrics_typeVariable,
        strdup(custom_event_name->valuestring)
        );

    return ads_analytics_create_async_request_all_of_custom_conversion_event_metrics_local_var;
end:
    return NULL;

}
