#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "granularity.h"


char* granularity_granularity_ToString(pinterest_rest_api_granularity__e granularity) {
    char *granularityArray[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    return granularityArray[granularity];
}

pinterest_rest_api_granularity__e granularity_granularity_FromString(char* granularity) {
    int stringToReturn = 0;
    char *granularityArray[] =  { "NULL", "TOTAL", "DAY", "HOUR", "WEEK", "MONTH" };
    size_t sizeofArray = sizeof(granularityArray) / sizeof(granularityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(granularity, granularityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *granularity_convertToJSON(pinterest_rest_api_granularity__e granularity) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "granularity", granularity_granularity_ToString(granularity)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_granularity__e granularity_parseFromJSON(cJSON *granularityJSON) {
    if(!cJSON_IsString(granularityJSON) || (granularityJSON->valuestring == NULL)) {
        return 0;
    }
    return granularity_granularity_FromString(granularityJSON->valuestring);
}
