#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "querymetrictypes_items.h"


char* querymetrictypes_items_querymetrictypes_items_ToString(pinterest_rest_api_querymetrictypes_items__e querymetrictypes_items) {
    char *querymetrictypes_itemsArray[] =  { "NULL", "ENGAGEMENT", "ENGAGEMENT_RATE", "IMPRESSION", "OUTBOUND_CLICK", "OUTBOUND_CLICK_RATE", "PIN_CLICK", "PIN_CLICK_RATE", "SAVE", "SAVE_RATE" };
    return querymetrictypes_itemsArray[querymetrictypes_items];
}

pinterest_rest_api_querymetrictypes_items__e querymetrictypes_items_querymetrictypes_items_FromString(char* querymetrictypes_items) {
    int stringToReturn = 0;
    char *querymetrictypes_itemsArray[] =  { "NULL", "ENGAGEMENT", "ENGAGEMENT_RATE", "IMPRESSION", "OUTBOUND_CLICK", "OUTBOUND_CLICK_RATE", "PIN_CLICK", "PIN_CLICK_RATE", "SAVE", "SAVE_RATE" };
    size_t sizeofArray = sizeof(querymetrictypes_itemsArray) / sizeof(querymetrictypes_itemsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(querymetrictypes_items, querymetrictypes_itemsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *querymetrictypes_items_convertToJSON(pinterest_rest_api_querymetrictypes_items__e querymetrictypes_items) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "querymetrictypes_items", querymetrictypes_items_querymetrictypes_items_ToString(querymetrictypes_items)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_querymetrictypes_items__e querymetrictypes_items_parseFromJSON(cJSON *querymetrictypes_itemsJSON) {
    if(!cJSON_IsString(querymetrictypes_itemsJSON) || (querymetrictypes_itemsJSON->valuestring == NULL)) {
        return 0;
    }
    return querymetrictypes_items_querymetrictypes_items_FromString(querymetrictypes_itemsJSON->valuestring);
}
