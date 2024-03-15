#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "budget_type.h"


char* budget_type_budget_type_ToString(pinterest_rest_api_budget_type__e budget_type) {
    char *budget_typeArray[] =  { "NULL", "DAILY", "LIFETIME", "CBO_ADGROUP" };
    return budget_typeArray[budget_type];
}

pinterest_rest_api_budget_type__e budget_type_budget_type_FromString(char* budget_type) {
    int stringToReturn = 0;
    char *budget_typeArray[] =  { "NULL", "DAILY", "LIFETIME", "CBO_ADGROUP" };
    size_t sizeofArray = sizeof(budget_typeArray) / sizeof(budget_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(budget_type, budget_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *budget_type_budget_type_convertToJSON(pinterest_rest_api_budget_type__e budget_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "budget_type", budget_type_budget_type_ToString(budget_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_budget_type__e budget_type_budget_type_parseFromJSON(cJSON *budget_typeJSON) {
    pinterest_rest_api_budget_type__e *budget_type = NULL;
    pinterest_rest_api_budget_type__e budget_typeVariable;
    cJSON *budget_typeVar = cJSON_GetObjectItemCaseSensitive(budget_typeJSON, "budget_type");
    if(!cJSON_IsString(budget_typeVar) || (budget_typeVar->valuestring == NULL)){
        goto end;
    }
    budget_typeVariable = budget_type_budget_type_FromString(budget_typeVar->valuestring);
    return budget_typeVariable;
end:
    return 0;
}
