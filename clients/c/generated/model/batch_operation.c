#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_operation.h"


char* batch_operation_batch_operation_ToString(pinterest_rest_api_batch_operation__e batch_operation) {
    char *batch_operationArray[] =  { "NULL", "UPDATE", "UPSERT", "CREATE", "DELETE_DISCONTINUED", "DELETE" };
    return batch_operationArray[batch_operation];
}

pinterest_rest_api_batch_operation__e batch_operation_batch_operation_FromString(char* batch_operation) {
    int stringToReturn = 0;
    char *batch_operationArray[] =  { "NULL", "UPDATE", "UPSERT", "CREATE", "DELETE_DISCONTINUED", "DELETE" };
    size_t sizeofArray = sizeof(batch_operationArray) / sizeof(batch_operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(batch_operation, batch_operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *batch_operation_batch_operation_convertToJSON(pinterest_rest_api_batch_operation__e batch_operation) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "batch_operation", batch_operation_batch_operation_ToString(batch_operation)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_batch_operation__e batch_operation_batch_operation_parseFromJSON(cJSON *batch_operationJSON) {
    pinterest_rest_api_batch_operation__e *batch_operation = NULL;
    pinterest_rest_api_batch_operation__e batch_operationVariable;
    cJSON *batch_operationVar = cJSON_GetObjectItemCaseSensitive(batch_operationJSON, "batch_operation");
    if(!cJSON_IsString(batch_operationVar) || (batch_operationVar->valuestring == NULL)){
        goto end;
    }
    batch_operationVariable = batch_operation_batch_operation_FromString(batch_operationVar->valuestring);
    return batch_operationVariable;
end:
    return 0;
}
