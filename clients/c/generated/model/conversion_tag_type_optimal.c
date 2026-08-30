#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_tag_type_optimal.h"


char* conversion_tag_type_optimal_conversion_tag_type_optimal_ToString(pinterest_rest_api_conversion_tag_type_optimal__e conversion_tag_type_optimal) {
    char *conversion_tag_type_optimalArray[] =  { "NULL", "PAGE_LOAD", "UNKNOWN", "INITIALIZED", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL", "WEB_SESSION", "EXTERNAL_MEASUREMENT", "ADD_PAYMENT_INFO", "ADD_TO_WISHLIST", "INITIATE_CHECKOUT", "SUBSCRIBE", "VIEW_CONTENT", "ADVERTISER_DEFINED_EVENT", "APP_OPEN", "CONTACT", "SCHEDULE", "FIND_LOCATION", "CUSTOMIZE_PRODUCT", "SUBMIT_APPLICATION", "START_TRIAL" };
    return conversion_tag_type_optimalArray[conversion_tag_type_optimal];
}

pinterest_rest_api_conversion_tag_type_optimal__e conversion_tag_type_optimal_conversion_tag_type_optimal_FromString(char* conversion_tag_type_optimal) {
    int stringToReturn = 0;
    char *conversion_tag_type_optimalArray[] =  { "NULL", "PAGE_LOAD", "UNKNOWN", "INITIALIZED", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL", "WEB_SESSION", "EXTERNAL_MEASUREMENT", "ADD_PAYMENT_INFO", "ADD_TO_WISHLIST", "INITIATE_CHECKOUT", "SUBSCRIBE", "VIEW_CONTENT", "ADVERTISER_DEFINED_EVENT", "APP_OPEN", "CONTACT", "SCHEDULE", "FIND_LOCATION", "CUSTOMIZE_PRODUCT", "SUBMIT_APPLICATION", "START_TRIAL" };
    size_t sizeofArray = sizeof(conversion_tag_type_optimalArray) / sizeof(conversion_tag_type_optimalArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_tag_type_optimal, conversion_tag_type_optimalArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_tag_type_optimal_convertToJSON(pinterest_rest_api_conversion_tag_type_optimal__e conversion_tag_type_optimal) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_tag_type_optimal", conversion_tag_type_optimal_conversion_tag_type_optimal_ToString(conversion_tag_type_optimal)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_tag_type_optimal__e conversion_tag_type_optimal_parseFromJSON(cJSON *conversion_tag_type_optimalJSON) {
    if(!cJSON_IsString(conversion_tag_type_optimalJSON) || (conversion_tag_type_optimalJSON->valuestring == NULL)) {
        return 0;
    }
    return conversion_tag_type_optimal_conversion_tag_type_optimal_FromString(conversion_tag_type_optimalJSON->valuestring);
}
