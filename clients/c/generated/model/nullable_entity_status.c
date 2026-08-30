#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nullable_entity_status.h"


char* nullable_entity_status_nullable_entity_status_ToString(pinterest_rest_api_nullable_entity_status__e nullable_entity_status) {
    char *nullable_entity_statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT", "" };
    return nullable_entity_statusArray[nullable_entity_status];
}

pinterest_rest_api_nullable_entity_status__e nullable_entity_status_nullable_entity_status_FromString(char* nullable_entity_status) {
    int stringToReturn = 0;
    char *nullable_entity_statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT", "" };
    size_t sizeofArray = sizeof(nullable_entity_statusArray) / sizeof(nullable_entity_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(nullable_entity_status, nullable_entity_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *nullable_entity_status_convertToJSON(pinterest_rest_api_nullable_entity_status__e nullable_entity_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "nullable_entity_status", nullable_entity_status_nullable_entity_status_ToString(nullable_entity_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_nullable_entity_status__e nullable_entity_status_parseFromJSON(cJSON *nullable_entity_statusJSON) {
    if(!cJSON_IsString(nullable_entity_statusJSON) || (nullable_entity_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return nullable_entity_status_nullable_entity_status_FromString(nullable_entity_statusJSON->valuestring);
}
