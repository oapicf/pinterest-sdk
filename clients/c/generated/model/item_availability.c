#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_availability.h"


char* item_availability_item_availability_ToString(pinterest_rest_api_item_availability__e item_availability) {
    char *item_availabilityArray[] =  { "NULL", "in stock", "out of stock", "preorder" };
    return item_availabilityArray[item_availability];
}

pinterest_rest_api_item_availability__e item_availability_item_availability_FromString(char* item_availability) {
    int stringToReturn = 0;
    char *item_availabilityArray[] =  { "NULL", "in stock", "out of stock", "preorder" };
    size_t sizeofArray = sizeof(item_availabilityArray) / sizeof(item_availabilityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(item_availability, item_availabilityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *item_availability_convertToJSON(pinterest_rest_api_item_availability__e item_availability) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "item_availability", item_availability_item_availability_ToString(item_availability)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_item_availability__e item_availability_parseFromJSON(cJSON *item_availabilityJSON) {
    if(!cJSON_IsString(item_availabilityJSON) || (item_availabilityJSON->valuestring == NULL)) {
        return 0;
    }
    return item_availability_item_availability_FromString(item_availabilityJSON->valuestring);
}
