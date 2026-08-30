#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "attribution_action_type.h"


char* attribution_action_type_attribution_action_type_ToString(pinterest_rest_api_attribution_action_type__e attribution_action_type) {
    char *attribution_action_typeArray[] =  { "NULL", "view", "click" };
    return attribution_action_typeArray[attribution_action_type];
}

pinterest_rest_api_attribution_action_type__e attribution_action_type_attribution_action_type_FromString(char* attribution_action_type) {
    int stringToReturn = 0;
    char *attribution_action_typeArray[] =  { "NULL", "view", "click" };
    size_t sizeofArray = sizeof(attribution_action_typeArray) / sizeof(attribution_action_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(attribution_action_type, attribution_action_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *attribution_action_type_convertToJSON(pinterest_rest_api_attribution_action_type__e attribution_action_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "attribution_action_type", attribution_action_type_attribution_action_type_ToString(attribution_action_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_attribution_action_type__e attribution_action_type_parseFromJSON(cJSON *attribution_action_typeJSON) {
    if(!cJSON_IsString(attribution_action_typeJSON) || (attribution_action_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return attribution_action_type_attribution_action_type_FromString(attribution_action_typeJSON->valuestring);
}
