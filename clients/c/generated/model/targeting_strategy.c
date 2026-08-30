#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_strategy.h"


char* targeting_strategy_targeting_strategy_ToString(pinterest_rest_api_targeting_strategy__e targeting_strategy) {
    char *targeting_strategyArray[] =  { "NULL", "CHOOSE_YOUR_OWN", "FIND_NEW_CUSTOMERS", "RECONNECT_WITH_USERS" };
    return targeting_strategyArray[targeting_strategy];
}

pinterest_rest_api_targeting_strategy__e targeting_strategy_targeting_strategy_FromString(char* targeting_strategy) {
    int stringToReturn = 0;
    char *targeting_strategyArray[] =  { "NULL", "CHOOSE_YOUR_OWN", "FIND_NEW_CUSTOMERS", "RECONNECT_WITH_USERS" };
    size_t sizeofArray = sizeof(targeting_strategyArray) / sizeof(targeting_strategyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_strategy, targeting_strategyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *targeting_strategy_convertToJSON(pinterest_rest_api_targeting_strategy__e targeting_strategy) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "targeting_strategy", targeting_strategy_targeting_strategy_ToString(targeting_strategy)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_targeting_strategy__e targeting_strategy_parseFromJSON(cJSON *targeting_strategyJSON) {
    if(!cJSON_IsString(targeting_strategyJSON) || (targeting_strategyJSON->valuestring == NULL)) {
        return 0;
    }
    return targeting_strategy_targeting_strategy_FromString(targeting_strategyJSON->valuestring);
}
