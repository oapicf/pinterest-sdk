#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trends_gender_filter.h"


char* trends_gender_filter_trends_gender_filter_ToString(pinterest_rest_api_trends_gender_filter__e trends_gender_filter) {
    char *trends_gender_filterArray[] =  { "NULL", "male", "female", "unknown" };
    return trends_gender_filterArray[trends_gender_filter];
}

pinterest_rest_api_trends_gender_filter__e trends_gender_filter_trends_gender_filter_FromString(char* trends_gender_filter) {
    int stringToReturn = 0;
    char *trends_gender_filterArray[] =  { "NULL", "male", "female", "unknown" };
    size_t sizeofArray = sizeof(trends_gender_filterArray) / sizeof(trends_gender_filterArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(trends_gender_filter, trends_gender_filterArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *trends_gender_filter_convertToJSON(pinterest_rest_api_trends_gender_filter__e trends_gender_filter) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "trends_gender_filter", trends_gender_filter_trends_gender_filter_ToString(trends_gender_filter)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_trends_gender_filter__e trends_gender_filter_parseFromJSON(cJSON *trends_gender_filterJSON) {
    if(!cJSON_IsString(trends_gender_filterJSON) || (trends_gender_filterJSON->valuestring == NULL)) {
        return 0;
    }
    return trends_gender_filter_trends_gender_filter_FromString(trends_gender_filterJSON->valuestring);
}
