#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_search_by.h"


char* asset_search_by_asset_search_by_ToString(pinterest_rest_api_asset_search_by__e asset_search_by) {
    char *asset_search_byArray[] =  { "NULL", "NAME", "ID", "NAME_OR_ID", "OWNER_NAME", "NAME_OR_OWNER" };
    return asset_search_byArray[asset_search_by];
}

pinterest_rest_api_asset_search_by__e asset_search_by_asset_search_by_FromString(char* asset_search_by) {
    int stringToReturn = 0;
    char *asset_search_byArray[] =  { "NULL", "NAME", "ID", "NAME_OR_ID", "OWNER_NAME", "NAME_OR_OWNER" };
    size_t sizeofArray = sizeof(asset_search_byArray) / sizeof(asset_search_byArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(asset_search_by, asset_search_byArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *asset_search_by_convertToJSON(pinterest_rest_api_asset_search_by__e asset_search_by) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "asset_search_by", asset_search_by_asset_search_by_ToString(asset_search_by)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_asset_search_by__e asset_search_by_parseFromJSON(cJSON *asset_search_byJSON) {
    if(!cJSON_IsString(asset_search_byJSON) || (asset_search_byJSON->valuestring == NULL)) {
        return 0;
    }
    return asset_search_by_asset_search_by_FromString(asset_search_byJSON->valuestring);
}
