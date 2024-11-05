#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_operation_status.h"


char* batch_operation_status_batch_operation_status_ToString(pinterest_rest_api_batch_operation_status__e batch_operation_status) {
    char *batch_operation_statusArray[] =  { "NULL", "PROCESSING", "COMPLETED", "FAILED" };
    return batch_operation_statusArray[batch_operation_status];
}

pinterest_rest_api_batch_operation_status__e batch_operation_status_batch_operation_status_FromString(char* batch_operation_status) {
    int stringToReturn = 0;
    char *batch_operation_statusArray[] =  { "NULL", "PROCESSING", "COMPLETED", "FAILED" };
    size_t sizeofArray = sizeof(batch_operation_statusArray) / sizeof(batch_operation_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(batch_operation_status, batch_operation_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *batch_operation_status_batch_operation_status_convertToJSON(pinterest_rest_api_batch_operation_status__e batch_operation_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "batch_operation_status", batch_operation_status_batch_operation_status_ToString(batch_operation_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_batch_operation_status__e batch_operation_status_batch_operation_status_parseFromJSON(cJSON *batch_operation_statusJSON) {
    pinterest_rest_api_batch_operation_status__e *batch_operation_status = NULL;
    pinterest_rest_api_batch_operation_status__e batch_operation_statusVariable;
    cJSON *batch_operation_statusVar = cJSON_GetObjectItemCaseSensitive(batch_operation_statusJSON, "batch_operation_status");
    if(!cJSON_IsString(batch_operation_statusVar) || (batch_operation_statusVar->valuestring == NULL)){
        goto end;
    }
    batch_operation_statusVariable = batch_operation_status_batch_operation_status_FromString(batch_operation_statusVar->valuestring);
    return batch_operation_statusVariable;
end:
    return 0;
}
