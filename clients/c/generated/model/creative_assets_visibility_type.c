#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "creative_assets_visibility_type.h"


char* creative_assets_visibility_type_creative_assets_visibility_type_ToString(pinterest_rest_api_creative_assets_visibility_type__e creative_assets_visibility_type) {
    char *creative_assets_visibility_typeArray[] =  { "NULL", "VISIBLE", "HIDDEN" };
    return creative_assets_visibility_typeArray[creative_assets_visibility_type];
}

pinterest_rest_api_creative_assets_visibility_type__e creative_assets_visibility_type_creative_assets_visibility_type_FromString(char* creative_assets_visibility_type) {
    int stringToReturn = 0;
    char *creative_assets_visibility_typeArray[] =  { "NULL", "VISIBLE", "HIDDEN" };
    size_t sizeofArray = sizeof(creative_assets_visibility_typeArray) / sizeof(creative_assets_visibility_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(creative_assets_visibility_type, creative_assets_visibility_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *creative_assets_visibility_type_creative_assets_visibility_type_convertToJSON(pinterest_rest_api_creative_assets_visibility_type__e creative_assets_visibility_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "creative_assets_visibility_type", creative_assets_visibility_type_creative_assets_visibility_type_ToString(creative_assets_visibility_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_creative_assets_visibility_type__e creative_assets_visibility_type_creative_assets_visibility_type_parseFromJSON(cJSON *creative_assets_visibility_typeJSON) {
    pinterest_rest_api_creative_assets_visibility_type__e *creative_assets_visibility_type = NULL;
    pinterest_rest_api_creative_assets_visibility_type__e creative_assets_visibility_typeVariable;
    cJSON *creative_assets_visibility_typeVar = cJSON_GetObjectItemCaseSensitive(creative_assets_visibility_typeJSON, "creative_assets_visibility_type");
    if(!cJSON_IsString(creative_assets_visibility_typeVar) || (creative_assets_visibility_typeVar->valuestring == NULL)){
        goto end;
    }
    creative_assets_visibility_typeVariable = creative_assets_visibility_type_creative_assets_visibility_type_FromString(creative_assets_visibility_typeVar->valuestring);
    return creative_assets_visibility_typeVariable;
end:
    return 0;
}
