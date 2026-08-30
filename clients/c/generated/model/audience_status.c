#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_status.h"


char* audience_status_audience_status_ToString(pinterest_rest_api_audience_status__e audience_status) {
    char *audience_statusArray[] =  { "NULL", "INITIALIZING", "READY", "TOO_SMALL", "ELIGIBLE", "PERSONAS_INELIGIBLE_SIZE", "PERSONAS_INITIALIZING" };
    return audience_statusArray[audience_status];
}

pinterest_rest_api_audience_status__e audience_status_audience_status_FromString(char* audience_status) {
    int stringToReturn = 0;
    char *audience_statusArray[] =  { "NULL", "INITIALIZING", "READY", "TOO_SMALL", "ELIGIBLE", "PERSONAS_INELIGIBLE_SIZE", "PERSONAS_INITIALIZING" };
    size_t sizeofArray = sizeof(audience_statusArray) / sizeof(audience_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audience_status, audience_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audience_status_convertToJSON(pinterest_rest_api_audience_status__e audience_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audience_status", audience_status_audience_status_ToString(audience_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_audience_status__e audience_status_parseFromJSON(cJSON *audience_statusJSON) {
    if(!cJSON_IsString(audience_statusJSON) || (audience_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return audience_status_audience_status_FromString(audience_statusJSON->valuestring);
}
