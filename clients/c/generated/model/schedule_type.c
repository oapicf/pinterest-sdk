#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_type.h"


char* schedule_type_schedule_type_ToString(pinterest_rest_api_schedule_type__e schedule_type) {
    char *schedule_typeArray[] =  { "NULL", "CAMPAIGN_BUDGET_CHANGE", "CAMPAIGN_BID_MULTIPLIERS" };
    return schedule_typeArray[schedule_type];
}

pinterest_rest_api_schedule_type__e schedule_type_schedule_type_FromString(char* schedule_type) {
    int stringToReturn = 0;
    char *schedule_typeArray[] =  { "NULL", "CAMPAIGN_BUDGET_CHANGE", "CAMPAIGN_BID_MULTIPLIERS" };
    size_t sizeofArray = sizeof(schedule_typeArray) / sizeof(schedule_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(schedule_type, schedule_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *schedule_type_convertToJSON(pinterest_rest_api_schedule_type__e schedule_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "schedule_type", schedule_type_schedule_type_ToString(schedule_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_schedule_type__e schedule_type_parseFromJSON(cJSON *schedule_typeJSON) {
    if(!cJSON_IsString(schedule_typeJSON) || (schedule_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return schedule_type_schedule_type_FromString(schedule_typeJSON->valuestring);
}
