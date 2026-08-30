#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_action.h"


char* schedule_action_schedule_action_ToString(pinterest_rest_api_schedule_action__e schedule_action) {
    char *schedule_actionArray[] =  { "NULL", "INCREASE_BY_VALUE", "INCREASE_BY_PERCENT" };
    return schedule_actionArray[schedule_action];
}

pinterest_rest_api_schedule_action__e schedule_action_schedule_action_FromString(char* schedule_action) {
    int stringToReturn = 0;
    char *schedule_actionArray[] =  { "NULL", "INCREASE_BY_VALUE", "INCREASE_BY_PERCENT" };
    size_t sizeofArray = sizeof(schedule_actionArray) / sizeof(schedule_actionArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(schedule_action, schedule_actionArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *schedule_action_convertToJSON(pinterest_rest_api_schedule_action__e schedule_action) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "schedule_action", schedule_action_schedule_action_ToString(schedule_action)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_schedule_action__e schedule_action_parseFromJSON(cJSON *schedule_actionJSON) {
    if(!cJSON_IsString(schedule_actionJSON) || (schedule_actionJSON->valuestring == NULL)) {
        return 0;
    }
    return schedule_action_schedule_action_FromString(schedule_actionJSON->valuestring);
}
