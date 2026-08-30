#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_filter.h"


char* pin_filter_pin_filter_ToString(pinterest_rest_api_pin_filter__e pin_filter) {
    char *pin_filterArray[] =  { "NULL", "exclude_native", "exclude_repins", "has_been_promoted" };
    return pin_filterArray[pin_filter];
}

pinterest_rest_api_pin_filter__e pin_filter_pin_filter_FromString(char* pin_filter) {
    int stringToReturn = 0;
    char *pin_filterArray[] =  { "NULL", "exclude_native", "exclude_repins", "has_been_promoted" };
    size_t sizeofArray = sizeof(pin_filterArray) / sizeof(pin_filterArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(pin_filter, pin_filterArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *pin_filter_convertToJSON(pinterest_rest_api_pin_filter__e pin_filter) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pin_filter", pin_filter_pin_filter_ToString(pin_filter)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_pin_filter__e pin_filter_parseFromJSON(cJSON *pin_filterJSON) {
    if(!cJSON_IsString(pin_filterJSON) || (pin_filterJSON->valuestring == NULL)) {
        return 0;
    }
    return pin_filter_pin_filter_FromString(pin_filterJSON->valuestring);
}
