#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "objective_type.h"


char* objective_type_objective_type_ToString(pinterest_rest_api_objective_type__e objective_type) {
    char *objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS" };
    return objective_typeArray[objective_type];
}

pinterest_rest_api_objective_type__e objective_type_objective_type_FromString(char* objective_type) {
    int stringToReturn = 0;
    char *objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS" };
    size_t sizeofArray = sizeof(objective_typeArray) / sizeof(objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(objective_type, objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *objective_type_objective_type_convertToJSON(pinterest_rest_api_objective_type__e objective_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "objective_type", objective_type_objective_type_ToString(objective_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_objective_type__e objective_type_objective_type_parseFromJSON(cJSON *objective_typeJSON) {
    pinterest_rest_api_objective_type__e *objective_type = NULL;
    pinterest_rest_api_objective_type__e objective_typeVariable;
    cJSON *objective_typeVar = cJSON_GetObjectItemCaseSensitive(objective_typeJSON, "objective_type");
    if(!cJSON_IsString(objective_typeVar) || (objective_typeVar->valuestring == NULL)){
        goto end;
    }
    objective_typeVariable = objective_type_objective_type_FromString(objective_typeVar->valuestring);
    return objective_typeVariable;
end:
    return 0;
}
