#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_sort_by.h"


char* asset_sort_by_asset_sort_by_ToString(pinterest_rest_api_asset_sort_by__e asset_sort_by) {
    char *asset_sort_byArray[] =  { "NULL", "NAME", "ID", "PERMISSIONS" };
    return asset_sort_byArray[asset_sort_by];
}

pinterest_rest_api_asset_sort_by__e asset_sort_by_asset_sort_by_FromString(char* asset_sort_by) {
    int stringToReturn = 0;
    char *asset_sort_byArray[] =  { "NULL", "NAME", "ID", "PERMISSIONS" };
    size_t sizeofArray = sizeof(asset_sort_byArray) / sizeof(asset_sort_byArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(asset_sort_by, asset_sort_byArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *asset_sort_by_convertToJSON(pinterest_rest_api_asset_sort_by__e asset_sort_by) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "asset_sort_by", asset_sort_by_asset_sort_by_ToString(asset_sort_by)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_asset_sort_by__e asset_sort_by_parseFromJSON(cJSON *asset_sort_byJSON) {
    if(!cJSON_IsString(asset_sort_byJSON) || (asset_sort_byJSON->valuestring == NULL)) {
        return 0;
    }
    return asset_sort_by_asset_sort_by_FromString(asset_sort_byJSON->valuestring);
}
