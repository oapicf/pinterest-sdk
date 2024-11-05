#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_app_type.h"


char* targeting_spec_app_type_targeting_spec_app_type_ToString(pinterest_rest_api_targeting_spec_app_type__e targeting_spec_app_type) {
    char *targeting_spec_app_typeArray[] =  { "NULL", "android_mobile", "android_tablet", "ipad", "iphone", "web", "web_mobile" };
    return targeting_spec_app_typeArray[targeting_spec_app_type];
}

pinterest_rest_api_targeting_spec_app_type__e targeting_spec_app_type_targeting_spec_app_type_FromString(char* targeting_spec_app_type) {
    int stringToReturn = 0;
    char *targeting_spec_app_typeArray[] =  { "NULL", "android_mobile", "android_tablet", "ipad", "iphone", "web", "web_mobile" };
    size_t sizeofArray = sizeof(targeting_spec_app_typeArray) / sizeof(targeting_spec_app_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_spec_app_type, targeting_spec_app_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *targeting_spec_app_type_targeting_spec_app_type_convertToJSON(pinterest_rest_api_targeting_spec_app_type__e targeting_spec_app_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "targeting_spec_app_type", targeting_spec_app_type_targeting_spec_app_type_ToString(targeting_spec_app_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_targeting_spec_app_type__e targeting_spec_app_type_targeting_spec_app_type_parseFromJSON(cJSON *targeting_spec_app_typeJSON) {
    pinterest_rest_api_targeting_spec_app_type__e *targeting_spec_app_type = NULL;
    pinterest_rest_api_targeting_spec_app_type__e targeting_spec_app_typeVariable;
    cJSON *targeting_spec_app_typeVar = cJSON_GetObjectItemCaseSensitive(targeting_spec_app_typeJSON, "targeting_spec_app_type");
    if(!cJSON_IsString(targeting_spec_app_typeVar) || (targeting_spec_app_typeVar->valuestring == NULL)){
        goto end;
    }
    targeting_spec_app_typeVariable = targeting_spec_app_type_targeting_spec_app_type_FromString(targeting_spec_app_typeVar->valuestring);
    return targeting_spec_app_typeVariable;
end:
    return 0;
}
