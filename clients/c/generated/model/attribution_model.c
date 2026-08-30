#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "attribution_model.h"


char* attribution_model_attribution_model_ToString(pinterest_rest_api_attribution_model__e attribution_model) {
    char *attribution_modelArray[] =  { "NULL", "first_touch", "last_touch", "multi_touch", "mmm" };
    return attribution_modelArray[attribution_model];
}

pinterest_rest_api_attribution_model__e attribution_model_attribution_model_FromString(char* attribution_model) {
    int stringToReturn = 0;
    char *attribution_modelArray[] =  { "NULL", "first_touch", "last_touch", "multi_touch", "mmm" };
    size_t sizeofArray = sizeof(attribution_modelArray) / sizeof(attribution_modelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(attribution_model, attribution_modelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *attribution_model_convertToJSON(pinterest_rest_api_attribution_model__e attribution_model) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "attribution_model", attribution_model_attribution_model_ToString(attribution_model)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_attribution_model__e attribution_model_parseFromJSON(cJSON *attribution_modelJSON) {
    if(!cJSON_IsString(attribution_modelJSON) || (attribution_modelJSON->valuestring == NULL)) {
        return 0;
    }
    return attribution_model_attribution_model_FromString(attribution_modelJSON->valuestring);
}
