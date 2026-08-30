#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "top_pins_sort_by.h"


char* top_pins_sort_by_top_pins_sort_by_ToString(pinterest_rest_api_top_pins_sort_by__e top_pins_sort_by) {
    char *top_pins_sort_byArray[] =  { "NULL", "ENGAGEMENT", "SAVE", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK" };
    return top_pins_sort_byArray[top_pins_sort_by];
}

pinterest_rest_api_top_pins_sort_by__e top_pins_sort_by_top_pins_sort_by_FromString(char* top_pins_sort_by) {
    int stringToReturn = 0;
    char *top_pins_sort_byArray[] =  { "NULL", "ENGAGEMENT", "SAVE", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK" };
    size_t sizeofArray = sizeof(top_pins_sort_byArray) / sizeof(top_pins_sort_byArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(top_pins_sort_by, top_pins_sort_byArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *top_pins_sort_by_convertToJSON(pinterest_rest_api_top_pins_sort_by__e top_pins_sort_by) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "top_pins_sort_by", top_pins_sort_by_top_pins_sort_by_ToString(top_pins_sort_by)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_top_pins_sort_by__e top_pins_sort_by_parseFromJSON(cJSON *top_pins_sort_byJSON) {
    if(!cJSON_IsString(top_pins_sort_byJSON) || (top_pins_sort_byJSON->valuestring == NULL)) {
        return 0;
    }
    return top_pins_sort_by_top_pins_sort_by_FromString(top_pins_sort_byJSON->valuestring);
}
