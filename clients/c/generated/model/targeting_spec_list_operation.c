#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_list_operation.h"


char* targeting_spec_list_operation_targeting_spec_list_operation_ToString(pinterest_rest_api_targeting_spec_list_operation__e targeting_spec_list_operation) {
    char *targeting_spec_list_operationArray[] =  { "NULL", "SET", "ADD", "REMOVE" };
    return targeting_spec_list_operationArray[targeting_spec_list_operation];
}

pinterest_rest_api_targeting_spec_list_operation__e targeting_spec_list_operation_targeting_spec_list_operation_FromString(char* targeting_spec_list_operation) {
    int stringToReturn = 0;
    char *targeting_spec_list_operationArray[] =  { "NULL", "SET", "ADD", "REMOVE" };
    size_t sizeofArray = sizeof(targeting_spec_list_operationArray) / sizeof(targeting_spec_list_operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_spec_list_operation, targeting_spec_list_operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *targeting_spec_list_operation_convertToJSON(pinterest_rest_api_targeting_spec_list_operation__e targeting_spec_list_operation) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "targeting_spec_list_operation", targeting_spec_list_operation_targeting_spec_list_operation_ToString(targeting_spec_list_operation)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_targeting_spec_list_operation__e targeting_spec_list_operation_parseFromJSON(cJSON *targeting_spec_list_operationJSON) {
    if(!cJSON_IsString(targeting_spec_list_operationJSON) || (targeting_spec_list_operationJSON->valuestring == NULL)) {
        return 0;
    }
    return targeting_spec_list_operation_targeting_spec_list_operation_FromString(targeting_spec_list_operationJSON->valuestring);
}
