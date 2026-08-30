#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_status_bulk_update.h"


char* label_status_bulk_update_label_status_bulk_update_ToString(pinterest_rest_api_label_status_bulk_update__e label_status_bulk_update) {
    char *label_status_bulk_updateArray[] =  { "NULL", "ARCHIVED" };
    return label_status_bulk_updateArray[label_status_bulk_update];
}

pinterest_rest_api_label_status_bulk_update__e label_status_bulk_update_label_status_bulk_update_FromString(char* label_status_bulk_update) {
    int stringToReturn = 0;
    char *label_status_bulk_updateArray[] =  { "NULL", "ARCHIVED" };
    size_t sizeofArray = sizeof(label_status_bulk_updateArray) / sizeof(label_status_bulk_updateArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(label_status_bulk_update, label_status_bulk_updateArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *label_status_bulk_update_convertToJSON(pinterest_rest_api_label_status_bulk_update__e label_status_bulk_update) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "label_status_bulk_update", label_status_bulk_update_label_status_bulk_update_ToString(label_status_bulk_update)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_label_status_bulk_update__e label_status_bulk_update_parseFromJSON(cJSON *label_status_bulk_updateJSON) {
    if(!cJSON_IsString(label_status_bulk_updateJSON) || (label_status_bulk_updateJSON->valuestring == NULL)) {
        return 0;
    }
    return label_status_bulk_update_label_status_bulk_update_FromString(label_status_bulk_updateJSON->valuestring);
}
