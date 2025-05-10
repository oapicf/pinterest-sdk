#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_operation.h"


char* advanced_auction_operation_advanced_auction_operation_ToString(pinterest_rest_api_advanced_auction_operation__e advanced_auction_operation) {
    char *advanced_auction_operationArray[] =  { "NULL", "UPSERT", "DELETE" };
    return advanced_auction_operationArray[advanced_auction_operation];
}

pinterest_rest_api_advanced_auction_operation__e advanced_auction_operation_advanced_auction_operation_FromString(char* advanced_auction_operation) {
    int stringToReturn = 0;
    char *advanced_auction_operationArray[] =  { "NULL", "UPSERT", "DELETE" };
    size_t sizeofArray = sizeof(advanced_auction_operationArray) / sizeof(advanced_auction_operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(advanced_auction_operation, advanced_auction_operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *advanced_auction_operation_convertToJSON(pinterest_rest_api_advanced_auction_operation__e advanced_auction_operation) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "advanced_auction_operation", advanced_auction_operation_advanced_auction_operation_ToString(advanced_auction_operation)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_advanced_auction_operation__e advanced_auction_operation_parseFromJSON(cJSON *advanced_auction_operationJSON) {
    if(!cJSON_IsString(advanced_auction_operationJSON) || (advanced_auction_operationJSON->valuestring == NULL)) {
        return 0;
    }
    return advanced_auction_operation_advanced_auction_operation_FromString(advanced_auction_operationJSON->valuestring);
}
