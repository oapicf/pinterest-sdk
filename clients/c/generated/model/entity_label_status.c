#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "entity_label_status.h"


char* entity_label_status_entity_label_status_ToString(pinterest_rest_api_entity_label_status__e entity_label_status) {
    char *entity_label_statusArray[] =  { "NULL", "ACTIVE", "ARCHIVED", "NULL" };
    return entity_label_statusArray[entity_label_status];
}

pinterest_rest_api_entity_label_status__e entity_label_status_entity_label_status_FromString(char* entity_label_status) {
    int stringToReturn = 0;
    char *entity_label_statusArray[] =  { "NULL", "ACTIVE", "ARCHIVED", "NULL" };
    size_t sizeofArray = sizeof(entity_label_statusArray) / sizeof(entity_label_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(entity_label_status, entity_label_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *entity_label_status_convertToJSON(pinterest_rest_api_entity_label_status__e entity_label_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "entity_label_status", entity_label_status_entity_label_status_ToString(entity_label_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_entity_label_status__e entity_label_status_parseFromJSON(cJSON *entity_label_statusJSON) {
    if(!cJSON_IsString(entity_label_statusJSON) || (entity_label_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return entity_label_status_entity_label_status_FromString(entity_label_statusJSON->valuestring);
}
