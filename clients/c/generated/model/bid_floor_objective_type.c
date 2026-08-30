#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_floor_objective_type.h"


char* bid_floor_objective_type_bid_floor_objective_type_ToString(pinterest_rest_api_bid_floor_objective_type__e bid_floor_objective_type) {
    char *bid_floor_objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "SALES" };
    return bid_floor_objective_typeArray[bid_floor_objective_type];
}

pinterest_rest_api_bid_floor_objective_type__e bid_floor_objective_type_bid_floor_objective_type_FromString(char* bid_floor_objective_type) {
    int stringToReturn = 0;
    char *bid_floor_objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "SALES" };
    size_t sizeofArray = sizeof(bid_floor_objective_typeArray) / sizeof(bid_floor_objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(bid_floor_objective_type, bid_floor_objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *bid_floor_objective_type_convertToJSON(pinterest_rest_api_bid_floor_objective_type__e bid_floor_objective_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bid_floor_objective_type", bid_floor_objective_type_bid_floor_objective_type_ToString(bid_floor_objective_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_bid_floor_objective_type__e bid_floor_objective_type_parseFromJSON(cJSON *bid_floor_objective_typeJSON) {
    if(!cJSON_IsString(bid_floor_objective_typeJSON) || (bid_floor_objective_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return bid_floor_objective_type_bid_floor_objective_type_FromString(bid_floor_objective_typeJSON->valuestring);
}
