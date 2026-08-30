#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "mmm_report_level.h"


char* mmm_report_level_mmm_report_level_ToString(pinterest_rest_api_mmm_report_level__e mmm_report_level) {
    char *mmm_report_levelArray[] =  { "NULL", "CAMPAIGN_TARGETING", "AD_GROUP_TARGETING" };
    return mmm_report_levelArray[mmm_report_level];
}

pinterest_rest_api_mmm_report_level__e mmm_report_level_mmm_report_level_FromString(char* mmm_report_level) {
    int stringToReturn = 0;
    char *mmm_report_levelArray[] =  { "NULL", "CAMPAIGN_TARGETING", "AD_GROUP_TARGETING" };
    size_t sizeofArray = sizeof(mmm_report_levelArray) / sizeof(mmm_report_levelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(mmm_report_level, mmm_report_levelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *mmm_report_level_convertToJSON(pinterest_rest_api_mmm_report_level__e mmm_report_level) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "mmm_report_level", mmm_report_level_mmm_report_level_ToString(mmm_report_level)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_mmm_report_level__e mmm_report_level_parseFromJSON(cJSON *mmm_report_levelJSON) {
    if(!cJSON_IsString(mmm_report_levelJSON) || (mmm_report_levelJSON->valuestring == NULL)) {
        return 0;
    }
    return mmm_report_level_mmm_report_level_FromString(mmm_report_levelJSON->valuestring);
}
