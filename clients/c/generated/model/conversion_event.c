#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_event.h"


char* conversion_event_conversion_event_ToString(pinterest_rest_api_conversion_event__e conversion_event) {
    char *conversion_eventArray[] =  { "NULL", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL" };
    return conversion_eventArray[conversion_event];
}

pinterest_rest_api_conversion_event__e conversion_event_conversion_event_FromString(char* conversion_event) {
    int stringToReturn = 0;
    char *conversion_eventArray[] =  { "NULL", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL" };
    size_t sizeofArray = sizeof(conversion_eventArray) / sizeof(conversion_eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_event, conversion_eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_event_convertToJSON(pinterest_rest_api_conversion_event__e conversion_event) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_event", conversion_event_conversion_event_ToString(conversion_event)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_event__e conversion_event_parseFromJSON(cJSON *conversion_eventJSON) {
    if(!cJSON_IsString(conversion_eventJSON) || (conversion_eventJSON->valuestring == NULL)) {
        return 0;
    }
    return conversion_event_conversion_event_FromString(conversion_eventJSON->valuestring);
}
