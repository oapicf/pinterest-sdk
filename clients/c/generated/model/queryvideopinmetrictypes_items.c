#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "queryvideopinmetrictypes_items.h"


char* queryvideopinmetrictypes_items_queryvideopinmetrictypes_items_ToString(pinterest_rest_api_queryvideopinmetrictypes_items__e queryvideopinmetrictypes_items) {
    char *queryvideopinmetrictypes_itemsArray[] =  { "NULL", "IMPRESSION", "SAVE", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START", "OUTBOUND_CLICK" };
    return queryvideopinmetrictypes_itemsArray[queryvideopinmetrictypes_items];
}

pinterest_rest_api_queryvideopinmetrictypes_items__e queryvideopinmetrictypes_items_queryvideopinmetrictypes_items_FromString(char* queryvideopinmetrictypes_items) {
    int stringToReturn = 0;
    char *queryvideopinmetrictypes_itemsArray[] =  { "NULL", "IMPRESSION", "SAVE", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START", "OUTBOUND_CLICK" };
    size_t sizeofArray = sizeof(queryvideopinmetrictypes_itemsArray) / sizeof(queryvideopinmetrictypes_itemsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(queryvideopinmetrictypes_items, queryvideopinmetrictypes_itemsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *queryvideopinmetrictypes_items_convertToJSON(pinterest_rest_api_queryvideopinmetrictypes_items__e queryvideopinmetrictypes_items) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "queryvideopinmetrictypes_items", queryvideopinmetrictypes_items_queryvideopinmetrictypes_items_ToString(queryvideopinmetrictypes_items)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_queryvideopinmetrictypes_items__e queryvideopinmetrictypes_items_parseFromJSON(cJSON *queryvideopinmetrictypes_itemsJSON) {
    if(!cJSON_IsString(queryvideopinmetrictypes_itemsJSON) || (queryvideopinmetrictypes_itemsJSON->valuestring == NULL)) {
        return 0;
    }
    return queryvideopinmetrictypes_items_queryvideopinmetrictypes_items_FromString(queryvideopinmetrictypes_itemsJSON->valuestring);
}
