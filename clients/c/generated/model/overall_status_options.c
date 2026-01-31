#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "overall_status_options.h"


char* overall_status_options_overall_status_options_ToString(pinterest_rest_api_overall_status_options__e overall_status_options) {
    char *overall_status_optionsArray[] =  { "NULL", "NEEDS_IMPROVEMENT", "FAIR", "GOOD" };
    return overall_status_optionsArray[overall_status_options];
}

pinterest_rest_api_overall_status_options__e overall_status_options_overall_status_options_FromString(char* overall_status_options) {
    int stringToReturn = 0;
    char *overall_status_optionsArray[] =  { "NULL", "NEEDS_IMPROVEMENT", "FAIR", "GOOD" };
    size_t sizeofArray = sizeof(overall_status_optionsArray) / sizeof(overall_status_optionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(overall_status_options, overall_status_optionsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *overall_status_options_convertToJSON(pinterest_rest_api_overall_status_options__e overall_status_options) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "overall_status_options", overall_status_options_overall_status_options_ToString(overall_status_options)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_overall_status_options__e overall_status_options_parseFromJSON(cJSON *overall_status_optionsJSON) {
    if(!cJSON_IsString(overall_status_optionsJSON) || (overall_status_optionsJSON->valuestring == NULL)) {
        return 0;
    }
    return overall_status_options_overall_status_options_FromString(overall_status_optionsJSON->valuestring);
}
