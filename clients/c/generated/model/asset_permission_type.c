#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_permission_type.h"


char* asset_permission_type_asset_permission_type_ToString(pinterest_rest_api_asset_permission_type__e asset_permission_type) {
    char *asset_permission_typeArray[] =  { "NULL", "AGGREGATED_PERMISSION", "DIRECT_PERMISSION" };
    return asset_permission_typeArray[asset_permission_type];
}

pinterest_rest_api_asset_permission_type__e asset_permission_type_asset_permission_type_FromString(char* asset_permission_type) {
    int stringToReturn = 0;
    char *asset_permission_typeArray[] =  { "NULL", "AGGREGATED_PERMISSION", "DIRECT_PERMISSION" };
    size_t sizeofArray = sizeof(asset_permission_typeArray) / sizeof(asset_permission_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(asset_permission_type, asset_permission_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *asset_permission_type_convertToJSON(pinterest_rest_api_asset_permission_type__e asset_permission_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "asset_permission_type", asset_permission_type_asset_permission_type_ToString(asset_permission_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_asset_permission_type__e asset_permission_type_parseFromJSON(cJSON *asset_permission_typeJSON) {
    if(!cJSON_IsString(asset_permission_typeJSON) || (asset_permission_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return asset_permission_type_asset_permission_type_FromString(asset_permission_typeJSON->valuestring);
}
