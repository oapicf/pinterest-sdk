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

cJSON *granularity_granularity_convertToJSON(pinterest_rest_api_granularity__e granularity) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "granularity", granularity_granularity_ToString(granularity)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_granularity__e granularity_granularity_parseFromJSON(cJSON *granularityJSON) {
    pinterest_rest_api_granularity__e *granularity = NULL;
    pinterest_rest_api_granularity__e granularityVariable;
    cJSON *granularityVar = cJSON_GetObjectItemCaseSensitive(granularityJSON, "granularity");
    if(!cJSON_IsString(granularityVar) || (granularityVar->valuestring == NULL)){
        goto end;
    }
    granularityVariable = granularity_granularity_FromString(granularityVar->valuestring);
    return granularityVariable;
end:
    return 0;
}
