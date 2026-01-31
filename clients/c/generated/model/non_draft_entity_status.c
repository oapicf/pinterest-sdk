#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "non_draft_entity_status.h"


char* non_draft_entity_status_non_draft_entity_status_ToString(pinterest_rest_api_non_draft_entity_status__e non_draft_entity_status) {
    char *non_draft_entity_statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED" };
    return non_draft_entity_statusArray[non_draft_entity_status];
}

pinterest_rest_api_non_draft_entity_status__e non_draft_entity_status_non_draft_entity_status_FromString(char* non_draft_entity_status) {
    int stringToReturn = 0;
    char *non_draft_entity_statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED" };
    size_t sizeofArray = sizeof(non_draft_entity_statusArray) / sizeof(non_draft_entity_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(non_draft_entity_status, non_draft_entity_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *non_draft_entity_status_convertToJSON(pinterest_rest_api_non_draft_entity_status__e non_draft_entity_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "non_draft_entity_status", non_draft_entity_status_non_draft_entity_status_ToString(non_draft_entity_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_non_draft_entity_status__e non_draft_entity_status_parseFromJSON(cJSON *non_draft_entity_statusJSON) {
    if(!cJSON_IsString(non_draft_entity_statusJSON) || (non_draft_entity_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return non_draft_entity_status_non_draft_entity_status_FromString(non_draft_entity_statusJSON->valuestring);
}
