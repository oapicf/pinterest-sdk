#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "querypinanalyticsmetrictypes_items.h"


char* querypinanalyticsmetrictypes_items_querypinanalyticsmetrictypes_items_ToString(pinterest_rest_api_querypinanalyticsmetrictypes_items__e querypinanalyticsmetrictypes_items) {
    char *querypinanalyticsmetrictypes_itemsArray[] =  { "NULL", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE", "SAVE_RATE", "TOTAL_COMMENTS", "TOTAL_REACTIONS", "USER_FOLLOW", "PROFILE_VISIT", "VIDEO_MRC_VIEW", "VIDEO_10S_VIEW", "QUARTILE_95_PERCENT_VIEW", "VIDEO_V50_WATCH_TIME", "VIDEO_START", "VIDEO_AVG_WATCH_TIME" };
    return querypinanalyticsmetrictypes_itemsArray[querypinanalyticsmetrictypes_items];
}

pinterest_rest_api_querypinanalyticsmetrictypes_items__e querypinanalyticsmetrictypes_items_querypinanalyticsmetrictypes_items_FromString(char* querypinanalyticsmetrictypes_items) {
    int stringToReturn = 0;
    char *querypinanalyticsmetrictypes_itemsArray[] =  { "NULL", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE", "SAVE_RATE", "TOTAL_COMMENTS", "TOTAL_REACTIONS", "USER_FOLLOW", "PROFILE_VISIT", "VIDEO_MRC_VIEW", "VIDEO_10S_VIEW", "QUARTILE_95_PERCENT_VIEW", "VIDEO_V50_WATCH_TIME", "VIDEO_START", "VIDEO_AVG_WATCH_TIME" };
    size_t sizeofArray = sizeof(querypinanalyticsmetrictypes_itemsArray) / sizeof(querypinanalyticsmetrictypes_itemsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(querypinanalyticsmetrictypes_items, querypinanalyticsmetrictypes_itemsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *querypinanalyticsmetrictypes_items_convertToJSON(pinterest_rest_api_querypinanalyticsmetrictypes_items__e querypinanalyticsmetrictypes_items) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "querypinanalyticsmetrictypes_items", querypinanalyticsmetrictypes_items_querypinanalyticsmetrictypes_items_ToString(querypinanalyticsmetrictypes_items)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_querypinanalyticsmetrictypes_items__e querypinanalyticsmetrictypes_items_parseFromJSON(cJSON *querypinanalyticsmetrictypes_itemsJSON) {
    if(!cJSON_IsString(querypinanalyticsmetrictypes_itemsJSON) || (querypinanalyticsmetrictypes_itemsJSON->valuestring == NULL)) {
        return 0;
    }
    return querypinanalyticsmetrictypes_items_querypinanalyticsmetrictypes_items_FromString(querypinanalyticsmetrictypes_itemsJSON->valuestring);
}
