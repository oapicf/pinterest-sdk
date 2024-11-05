#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_group_type.h"


char* asset_group_type_asset_group_type_ToString(pinterest_rest_api_asset_group_type__e asset_group_type) {
    char *asset_group_typeArray[] =  { "NULL", "BRAND", "LOCATION_OR_LANGUAGE", "PRODUCT_LINE", "OTHER" };
    return asset_group_typeArray[asset_group_type];
}

pinterest_rest_api_asset_group_type__e asset_group_type_asset_group_type_FromString(char* asset_group_type) {
    int stringToReturn = 0;
    char *asset_group_typeArray[] =  { "NULL", "BRAND", "LOCATION_OR_LANGUAGE", "PRODUCT_LINE", "OTHER" };
    size_t sizeofArray = sizeof(asset_group_typeArray) / sizeof(asset_group_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(asset_group_type, asset_group_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *asset_group_type_asset_group_type_convertToJSON(pinterest_rest_api_asset_group_type__e asset_group_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "asset_group_type", asset_group_type_asset_group_type_ToString(asset_group_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_asset_group_type__e asset_group_type_asset_group_type_parseFromJSON(cJSON *asset_group_typeJSON) {
    pinterest_rest_api_asset_group_type__e *asset_group_type = NULL;
    pinterest_rest_api_asset_group_type__e asset_group_typeVariable;
    cJSON *asset_group_typeVar = cJSON_GetObjectItemCaseSensitive(asset_group_typeJSON, "asset_group_type");
    if(!cJSON_IsString(asset_group_typeVar) || (asset_group_typeVar->valuestring == NULL)){
        goto end;
    }
    asset_group_typeVariable = asset_group_type_asset_group_type_FromString(asset_group_typeVar->valuestring);
    return asset_group_typeVariable;
end:
    return 0;
}
