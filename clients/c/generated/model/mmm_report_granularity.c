#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "mmm_report_granularity.h"


char* mmm_report_granularity_mmm_report_granularity_ToString(pinterest_rest_api_mmm_report_granularity__e mmm_report_granularity) {
    char *mmm_report_granularityArray[] =  { "NULL", "DAY", "WEEK" };
    return mmm_report_granularityArray[mmm_report_granularity];
}

pinterest_rest_api_mmm_report_granularity__e mmm_report_granularity_mmm_report_granularity_FromString(char* mmm_report_granularity) {
    int stringToReturn = 0;
    char *mmm_report_granularityArray[] =  { "NULL", "DAY", "WEEK" };
    size_t sizeofArray = sizeof(mmm_report_granularityArray) / sizeof(mmm_report_granularityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(mmm_report_granularity, mmm_report_granularityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *mmm_report_granularity_convertToJSON(pinterest_rest_api_mmm_report_granularity__e mmm_report_granularity) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "mmm_report_granularity", mmm_report_granularity_mmm_report_granularity_ToString(mmm_report_granularity)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_mmm_report_granularity__e mmm_report_granularity_parseFromJSON(cJSON *mmm_report_granularityJSON) {
    if(!cJSON_IsString(mmm_report_granularityJSON) || (mmm_report_granularityJSON->valuestring == NULL)) {
        return 0;
    }
    return mmm_report_granularity_mmm_report_granularity_FromString(mmm_report_granularityJSON->valuestring);
}
