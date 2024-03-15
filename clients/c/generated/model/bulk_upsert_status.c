#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_upsert_status.h"


char* bulk_upsert_status_bulk_upsert_status_ToString(pinterest_rest_api_bulk_upsert_status__e bulk_upsert_status) {
    char *bulk_upsert_statusArray[] =  { "NULL", "RUNNING", "SUCCEEDED", "FAILED" };
    return bulk_upsert_statusArray[bulk_upsert_status];
}

pinterest_rest_api_bulk_upsert_status__e bulk_upsert_status_bulk_upsert_status_FromString(char* bulk_upsert_status) {
    int stringToReturn = 0;
    char *bulk_upsert_statusArray[] =  { "NULL", "RUNNING", "SUCCEEDED", "FAILED" };
    size_t sizeofArray = sizeof(bulk_upsert_statusArray) / sizeof(bulk_upsert_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(bulk_upsert_status, bulk_upsert_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *bulk_upsert_status_bulk_upsert_status_convertToJSON(pinterest_rest_api_bulk_upsert_status__e bulk_upsert_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bulk_upsert_status", bulk_upsert_status_bulk_upsert_status_ToString(bulk_upsert_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_bulk_upsert_status__e bulk_upsert_status_bulk_upsert_status_parseFromJSON(cJSON *bulk_upsert_statusJSON) {
    pinterest_rest_api_bulk_upsert_status__e *bulk_upsert_status = NULL;
    pinterest_rest_api_bulk_upsert_status__e bulk_upsert_statusVariable;
    cJSON *bulk_upsert_statusVar = cJSON_GetObjectItemCaseSensitive(bulk_upsert_statusJSON, "bulk_upsert_status");
    if(!cJSON_IsString(bulk_upsert_statusVar) || (bulk_upsert_statusVar->valuestring == NULL)){
        goto end;
    }
    bulk_upsert_statusVariable = bulk_upsert_status_bulk_upsert_status_FromString(bulk_upsert_statusVar->valuestring);
    return bulk_upsert_statusVariable;
end:
    return 0;
}
