#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lookback_period_options.h"


char* lookback_period_options_lookback_period_options_ToString(pinterest_rest_api_lookback_period_options__e lookback_period_options) {
    char *lookback_period_optionsArray[] =  { "NULL", "1d", "14d" };
    return lookback_period_optionsArray[lookback_period_options];
}

pinterest_rest_api_lookback_period_options__e lookback_period_options_lookback_period_options_FromString(char* lookback_period_options) {
    int stringToReturn = 0;
    char *lookback_period_optionsArray[] =  { "NULL", "1d", "14d" };
    size_t sizeofArray = sizeof(lookback_period_optionsArray) / sizeof(lookback_period_optionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(lookback_period_options, lookback_period_optionsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *lookback_period_options_convertToJSON(pinterest_rest_api_lookback_period_options__e lookback_period_options) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "lookback_period_options", lookback_period_options_lookback_period_options_ToString(lookback_period_options)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_lookback_period_options__e lookback_period_options_parseFromJSON(cJSON *lookback_period_optionsJSON) {
    if(!cJSON_IsString(lookback_period_optionsJSON) || (lookback_period_optionsJSON->valuestring == NULL)) {
        return 0;
    }
    return lookback_period_options_lookback_period_options_FromString(lookback_period_optionsJSON->valuestring);
}
