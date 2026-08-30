#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_targeting_strategy_items.h"


char* targeting_spec_targeting_strategy_items_targeting_spec_targeting_strategy_items_ToString(pinterest_rest_api_targeting_spec_targeting_strategy_items__e targeting_spec_targeting_strategy_items) {
    char *targeting_spec_targeting_strategy_itemsArray[] =  { "NULL", "CHOOSE_YOUR_OWN", "FIND_NEW_CUSTOMERS", "RECONNECT_WITH_USERS" };
    return targeting_spec_targeting_strategy_itemsArray[targeting_spec_targeting_strategy_items];
}

pinterest_rest_api_targeting_spec_targeting_strategy_items__e targeting_spec_targeting_strategy_items_targeting_spec_targeting_strategy_items_FromString(char* targeting_spec_targeting_strategy_items) {
    int stringToReturn = 0;
    char *targeting_spec_targeting_strategy_itemsArray[] =  { "NULL", "CHOOSE_YOUR_OWN", "FIND_NEW_CUSTOMERS", "RECONNECT_WITH_USERS" };
    size_t sizeofArray = sizeof(targeting_spec_targeting_strategy_itemsArray) / sizeof(targeting_spec_targeting_strategy_itemsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_spec_targeting_strategy_items, targeting_spec_targeting_strategy_itemsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *targeting_spec_targeting_strategy_items_convertToJSON(pinterest_rest_api_targeting_spec_targeting_strategy_items__e targeting_spec_targeting_strategy_items) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "targeting_spec_targeting_strategy_items", targeting_spec_targeting_strategy_items_targeting_spec_targeting_strategy_items_ToString(targeting_spec_targeting_strategy_items)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_targeting_spec_targeting_strategy_items__e targeting_spec_targeting_strategy_items_parseFromJSON(cJSON *targeting_spec_targeting_strategy_itemsJSON) {
    if(!cJSON_IsString(targeting_spec_targeting_strategy_itemsJSON) || (targeting_spec_targeting_strategy_itemsJSON->valuestring == NULL)) {
        return 0;
    }
    return targeting_spec_targeting_strategy_items_targeting_spec_targeting_strategy_items_FromString(targeting_spec_targeting_strategy_itemsJSON->valuestring);
}
