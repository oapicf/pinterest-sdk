#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "action_type.h"


char* action_type_action_type_ToString(pinterest_rest_api_action_type__e action_type) {
    char *action_typeArray[] =  { "NULL", "CLICKTHROUGH", "IMPRESSION", "VIDEO_V_50_MRC" };
    return action_typeArray[action_type];
}

pinterest_rest_api_action_type__e action_type_action_type_FromString(char* action_type) {
    int stringToReturn = 0;
    char *action_typeArray[] =  { "NULL", "CLICKTHROUGH", "IMPRESSION", "VIDEO_V_50_MRC" };
    size_t sizeofArray = sizeof(action_typeArray) / sizeof(action_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(action_type, action_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *action_type_action_type_convertToJSON(pinterest_rest_api_action_type__e action_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "action_type", action_type_action_type_ToString(action_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_action_type__e action_type_action_type_parseFromJSON(cJSON *action_typeJSON) {
    pinterest_rest_api_action_type__e *action_type = NULL;
    pinterest_rest_api_action_type__e action_typeVariable;
    cJSON *action_typeVar = cJSON_GetObjectItemCaseSensitive(action_typeJSON, "action_type");
    if(!cJSON_IsString(action_typeVar) || (action_typeVar->valuestring == NULL)){
        goto end;
    }
    action_typeVariable = action_type_action_type_FromString(action_typeVar->valuestring);
    return action_typeVariable;
end:
    return 0;
}
