#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "workload_state.h"


char* workload_state_workload_state_ToString(pinterest_rest_api_workload_state__e workload_state) {
    char *workload_stateArray[] =  { "NULL", "NOT_STARTED", "RUNNING", "PAUSED", "SUCCEEDED", "FAILED" };
    return workload_stateArray[workload_state];
}

pinterest_rest_api_workload_state__e workload_state_workload_state_FromString(char* workload_state) {
    int stringToReturn = 0;
    char *workload_stateArray[] =  { "NULL", "NOT_STARTED", "RUNNING", "PAUSED", "SUCCEEDED", "FAILED" };
    size_t sizeofArray = sizeof(workload_stateArray) / sizeof(workload_stateArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(workload_state, workload_stateArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *workload_state_convertToJSON(pinterest_rest_api_workload_state__e workload_state) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "workload_state", workload_state_workload_state_ToString(workload_state)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_workload_state__e workload_state_parseFromJSON(cJSON *workload_stateJSON) {
    if(!cJSON_IsString(workload_stateJSON) || (workload_stateJSON->valuestring == NULL)) {
        return 0;
    }
    return workload_state_workload_state_FromString(workload_stateJSON->valuestring);
}
