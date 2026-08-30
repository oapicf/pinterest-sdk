#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "supplemental_item_batch_operation_status.h"


char* supplemental_item_batch_operation_status_supplemental_item_batch_operation_status_ToString(pinterest_rest_api_supplemental_item_batch_operation_status__e supplemental_item_batch_operation_status) {
    char *supplemental_item_batch_operation_statusArray[] =  { "NULL", "PROCESSING", "COMPLETED", "FAILED" };
    return supplemental_item_batch_operation_statusArray[supplemental_item_batch_operation_status];
}

pinterest_rest_api_supplemental_item_batch_operation_status__e supplemental_item_batch_operation_status_supplemental_item_batch_operation_status_FromString(char* supplemental_item_batch_operation_status) {
    int stringToReturn = 0;
    char *supplemental_item_batch_operation_statusArray[] =  { "NULL", "PROCESSING", "COMPLETED", "FAILED" };
    size_t sizeofArray = sizeof(supplemental_item_batch_operation_statusArray) / sizeof(supplemental_item_batch_operation_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(supplemental_item_batch_operation_status, supplemental_item_batch_operation_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *supplemental_item_batch_operation_status_convertToJSON(pinterest_rest_api_supplemental_item_batch_operation_status__e supplemental_item_batch_operation_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "supplemental_item_batch_operation_status", supplemental_item_batch_operation_status_supplemental_item_batch_operation_status_ToString(supplemental_item_batch_operation_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_supplemental_item_batch_operation_status__e supplemental_item_batch_operation_status_parseFromJSON(cJSON *supplemental_item_batch_operation_statusJSON) {
    if(!cJSON_IsString(supplemental_item_batch_operation_statusJSON) || (supplemental_item_batch_operation_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return supplemental_item_batch_operation_status_supplemental_item_batch_operation_status_FromString(supplemental_item_batch_operation_statusJSON->valuestring);
}
