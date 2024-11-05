#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_processing_status.h"


char* catalogs_feed_processing_status_catalogs_feed_processing_status_ToString(pinterest_rest_api_catalogs_feed_processing_status__e catalogs_feed_processing_status) {
    char *catalogs_feed_processing_statusArray[] =  { "NULL", "COMPLETED", "FAILED", "PROCESSING" };
    return catalogs_feed_processing_statusArray[catalogs_feed_processing_status];
}

pinterest_rest_api_catalogs_feed_processing_status__e catalogs_feed_processing_status_catalogs_feed_processing_status_FromString(char* catalogs_feed_processing_status) {
    int stringToReturn = 0;
    char *catalogs_feed_processing_statusArray[] =  { "NULL", "COMPLETED", "FAILED", "PROCESSING" };
    size_t sizeofArray = sizeof(catalogs_feed_processing_statusArray) / sizeof(catalogs_feed_processing_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalogs_feed_processing_status, catalogs_feed_processing_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *catalogs_feed_processing_status_catalogs_feed_processing_status_convertToJSON(pinterest_rest_api_catalogs_feed_processing_status__e catalogs_feed_processing_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "catalogs_feed_processing_status", catalogs_feed_processing_status_catalogs_feed_processing_status_ToString(catalogs_feed_processing_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_catalogs_feed_processing_status__e catalogs_feed_processing_status_catalogs_feed_processing_status_parseFromJSON(cJSON *catalogs_feed_processing_statusJSON) {
    pinterest_rest_api_catalogs_feed_processing_status__e *catalogs_feed_processing_status = NULL;
    pinterest_rest_api_catalogs_feed_processing_status__e catalogs_feed_processing_statusVariable;
    cJSON *catalogs_feed_processing_statusVar = cJSON_GetObjectItemCaseSensitive(catalogs_feed_processing_statusJSON, "catalogs_feed_processing_status");
    if(!cJSON_IsString(catalogs_feed_processing_statusVar) || (catalogs_feed_processing_statusVar->valuestring == NULL)){
        goto end;
    }
    catalogs_feed_processing_statusVariable = catalogs_feed_processing_status_catalogs_feed_processing_status_FromString(catalogs_feed_processing_statusVar->valuestring);
    return catalogs_feed_processing_statusVariable;
end:
    return 0;
}
