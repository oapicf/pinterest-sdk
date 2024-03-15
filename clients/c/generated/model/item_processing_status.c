#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_processing_status.h"


char* item_processing_status_item_processing_status_ToString(pinterest_rest_api_item_processing_status__e item_processing_status) {
    char *item_processing_statusArray[] =  { "NULL", "SUCCESS", "FAILURE", "PROCESSING" };
    return item_processing_statusArray[item_processing_status];
}

pinterest_rest_api_item_processing_status__e item_processing_status_item_processing_status_FromString(char* item_processing_status) {
    int stringToReturn = 0;
    char *item_processing_statusArray[] =  { "NULL", "SUCCESS", "FAILURE", "PROCESSING" };
    size_t sizeofArray = sizeof(item_processing_statusArray) / sizeof(item_processing_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(item_processing_status, item_processing_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *item_processing_status_item_processing_status_convertToJSON(pinterest_rest_api_item_processing_status__e item_processing_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "item_processing_status", item_processing_status_item_processing_status_ToString(item_processing_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_item_processing_status__e item_processing_status_item_processing_status_parseFromJSON(cJSON *item_processing_statusJSON) {
    pinterest_rest_api_item_processing_status__e *item_processing_status = NULL;
    pinterest_rest_api_item_processing_status__e item_processing_statusVariable;
    cJSON *item_processing_statusVar = cJSON_GetObjectItemCaseSensitive(item_processing_statusJSON, "item_processing_status");
    if(!cJSON_IsString(item_processing_statusVar) || (item_processing_statusVar->valuestring == NULL)){
        goto end;
    }
    item_processing_statusVariable = item_processing_status_item_processing_status_FromString(item_processing_statusVar->valuestring);
    return item_processing_statusVariable;
end:
    return 0;
}
