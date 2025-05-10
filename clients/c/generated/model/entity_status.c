#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "entity_status.h"


char* entity_status_entity_status_ToString(pinterest_rest_api_entity_status__e entity_status) {
    char *entity_statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return entity_statusArray[entity_status];
}

pinterest_rest_api_entity_status__e entity_status_entity_status_FromString(char* entity_status) {
    int stringToReturn = 0;
    char *entity_statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(entity_statusArray) / sizeof(entity_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(entity_status, entity_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *entity_status_convertToJSON(pinterest_rest_api_entity_status__e entity_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "entity_status", entity_status_entity_status_ToString(entity_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_entity_status__e entity_status_parseFromJSON(cJSON *entity_statusJSON) {
    if(!cJSON_IsString(entity_statusJSON) || (entity_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return entity_status_entity_status_FromString(entity_statusJSON->valuestring);
}
