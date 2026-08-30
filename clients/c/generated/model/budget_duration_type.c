#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "budget_duration_type.h"


char* budget_duration_type_budget_duration_type_ToString(pinterest_rest_api_budget_duration_type__e budget_duration_type) {
    char *budget_duration_typeArray[] =  { "NULL", "FIXED_DAILY", "FLEXIBLE_DAILY", "LIFETIME" };
    return budget_duration_typeArray[budget_duration_type];
}

pinterest_rest_api_budget_duration_type__e budget_duration_type_budget_duration_type_FromString(char* budget_duration_type) {
    int stringToReturn = 0;
    char *budget_duration_typeArray[] =  { "NULL", "FIXED_DAILY", "FLEXIBLE_DAILY", "LIFETIME" };
    size_t sizeofArray = sizeof(budget_duration_typeArray) / sizeof(budget_duration_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(budget_duration_type, budget_duration_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *budget_duration_type_convertToJSON(pinterest_rest_api_budget_duration_type__e budget_duration_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "budget_duration_type", budget_duration_type_budget_duration_type_ToString(budget_duration_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_budget_duration_type__e budget_duration_type_parseFromJSON(cJSON *budget_duration_typeJSON) {
    if(!cJSON_IsString(budget_duration_typeJSON) || (budget_duration_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return budget_duration_type_budget_duration_type_FromString(budget_duration_typeJSON->valuestring);
}
