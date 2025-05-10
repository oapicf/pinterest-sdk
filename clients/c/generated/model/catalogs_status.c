#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_status.h"


char* catalogs_status_catalogs_status_ToString(pinterest_rest_api_catalogs_status__e catalogs_status) {
    char *catalogs_statusArray[] =  { "NULL", "ACTIVE", "INACTIVE" };
    return catalogs_statusArray[catalogs_status];
}

pinterest_rest_api_catalogs_status__e catalogs_status_catalogs_status_FromString(char* catalogs_status) {
    int stringToReturn = 0;
    char *catalogs_statusArray[] =  { "NULL", "ACTIVE", "INACTIVE" };
    size_t sizeofArray = sizeof(catalogs_statusArray) / sizeof(catalogs_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalogs_status, catalogs_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *catalogs_status_convertToJSON(pinterest_rest_api_catalogs_status__e catalogs_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "catalogs_status", catalogs_status_catalogs_status_ToString(catalogs_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_catalogs_status__e catalogs_status_parseFromJSON(cJSON *catalogs_statusJSON) {
    if(!cJSON_IsString(catalogs_statusJSON) || (catalogs_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return catalogs_status_catalogs_status_FromString(catalogs_statusJSON->valuestring);
}
