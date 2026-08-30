#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advertiser_defined_event_mapping_type.h"


char* advertiser_defined_event_mapping_type_advertiser_defined_event_mapping_type_ToString(pinterest_rest_api_advertiser_defined_event_mapping_type__e advertiser_defined_event_mapping_type) {
    char *advertiser_defined_event_mapping_typeArray[] =  { "NULL", "SIGNUP", "ADD_TO_CART", "LEAD", "CHECKOUT", "SUBSCRIBE", "ADD_TO_WISHLIST", "ADD_PAYMENT_INFO", "INITIATE_CHECKOUT", "CONTACT", "CUSTOMIZE_PRODUCT", "FIND_LOCATION", "SCHEDULE", "SUBMIT_APPLICATION", "START_TRIAL", "PAGE_VISIT", "VIEW_CATEGORY", "VIEW_CONTENT", "SEARCH", "WATCH_VIDEO" };
    return advertiser_defined_event_mapping_typeArray[advertiser_defined_event_mapping_type];
}

pinterest_rest_api_advertiser_defined_event_mapping_type__e advertiser_defined_event_mapping_type_advertiser_defined_event_mapping_type_FromString(char* advertiser_defined_event_mapping_type) {
    int stringToReturn = 0;
    char *advertiser_defined_event_mapping_typeArray[] =  { "NULL", "SIGNUP", "ADD_TO_CART", "LEAD", "CHECKOUT", "SUBSCRIBE", "ADD_TO_WISHLIST", "ADD_PAYMENT_INFO", "INITIATE_CHECKOUT", "CONTACT", "CUSTOMIZE_PRODUCT", "FIND_LOCATION", "SCHEDULE", "SUBMIT_APPLICATION", "START_TRIAL", "PAGE_VISIT", "VIEW_CATEGORY", "VIEW_CONTENT", "SEARCH", "WATCH_VIDEO" };
    size_t sizeofArray = sizeof(advertiser_defined_event_mapping_typeArray) / sizeof(advertiser_defined_event_mapping_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(advertiser_defined_event_mapping_type, advertiser_defined_event_mapping_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *advertiser_defined_event_mapping_type_convertToJSON(pinterest_rest_api_advertiser_defined_event_mapping_type__e advertiser_defined_event_mapping_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "advertiser_defined_event_mapping_type", advertiser_defined_event_mapping_type_advertiser_defined_event_mapping_type_ToString(advertiser_defined_event_mapping_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_advertiser_defined_event_mapping_type__e advertiser_defined_event_mapping_type_parseFromJSON(cJSON *advertiser_defined_event_mapping_typeJSON) {
    if(!cJSON_IsString(advertiser_defined_event_mapping_typeJSON) || (advertiser_defined_event_mapping_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return advertiser_defined_event_mapping_type_advertiser_defined_event_mapping_type_FromString(advertiser_defined_event_mapping_typeJSON->valuestring);
}
