#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_strategy_type.h"


char* bid_strategy_type_bid_strategy_type_ToString(pinterest_rest_api_bid_strategy_type__e bid_strategy_type) {
    char *bid_strategy_typeArray[] =  { "NULL", "AUTOMATIC_BID", "MAX_BID", "TARGET_AVG", "" };
    return bid_strategy_typeArray[bid_strategy_type];
}

pinterest_rest_api_bid_strategy_type__e bid_strategy_type_bid_strategy_type_FromString(char* bid_strategy_type) {
    int stringToReturn = 0;
    char *bid_strategy_typeArray[] =  { "NULL", "AUTOMATIC_BID", "MAX_BID", "TARGET_AVG", "" };
    size_t sizeofArray = sizeof(bid_strategy_typeArray) / sizeof(bid_strategy_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(bid_strategy_type, bid_strategy_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *bid_strategy_type_convertToJSON(pinterest_rest_api_bid_strategy_type__e bid_strategy_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bid_strategy_type", bid_strategy_type_bid_strategy_type_ToString(bid_strategy_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_bid_strategy_type__e bid_strategy_type_parseFromJSON(cJSON *bid_strategy_typeJSON) {
    if(!cJSON_IsString(bid_strategy_typeJSON) || (bid_strategy_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return bid_strategy_type_bid_strategy_type_FromString(bid_strategy_typeJSON->valuestring);
}
