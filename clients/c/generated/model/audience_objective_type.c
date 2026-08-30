#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_objective_type.h"


char* audience_objective_type_audience_objective_type_ToString(pinterest_rest_api_audience_objective_type__e audience_objective_type) {
    char *audience_objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "SALES" };
    return audience_objective_typeArray[audience_objective_type];
}

pinterest_rest_api_audience_objective_type__e audience_objective_type_audience_objective_type_FromString(char* audience_objective_type) {
    int stringToReturn = 0;
    char *audience_objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "SALES" };
    size_t sizeofArray = sizeof(audience_objective_typeArray) / sizeof(audience_objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audience_objective_type, audience_objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audience_objective_type_convertToJSON(pinterest_rest_api_audience_objective_type__e audience_objective_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audience_objective_type", audience_objective_type_audience_objective_type_ToString(audience_objective_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_audience_objective_type__e audience_objective_type_parseFromJSON(cJSON *audience_objective_typeJSON) {
    if(!cJSON_IsString(audience_objective_typeJSON) || (audience_objective_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return audience_objective_type_audience_objective_type_FromString(audience_objective_typeJSON->valuestring);
}
