#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_type_response.h"


char* asset_type_response_asset_type_response_ToString(pinterest_rest_api_asset_type_response__e asset_type_response) {
    char *asset_type_responseArray[] =  { "NULL", "AD_ACCOUNT", "MERCHANT", "PROFILE", "ASSET_GROUP", "PINNER_LIST", "CONVERSION_TAG", "CATALOG", "CONVERSION_SEGMENT" };
    return asset_type_responseArray[asset_type_response];
}

pinterest_rest_api_asset_type_response__e asset_type_response_asset_type_response_FromString(char* asset_type_response) {
    int stringToReturn = 0;
    char *asset_type_responseArray[] =  { "NULL", "AD_ACCOUNT", "MERCHANT", "PROFILE", "ASSET_GROUP", "PINNER_LIST", "CONVERSION_TAG", "CATALOG", "CONVERSION_SEGMENT" };
    size_t sizeofArray = sizeof(asset_type_responseArray) / sizeof(asset_type_responseArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(asset_type_response, asset_type_responseArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *asset_type_response_convertToJSON(pinterest_rest_api_asset_type_response__e asset_type_response) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "asset_type_response", asset_type_response_asset_type_response_ToString(asset_type_response)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_asset_type_response__e asset_type_response_parseFromJSON(cJSON *asset_type_responseJSON) {
    if(!cJSON_IsString(asset_type_responseJSON) || (asset_type_responseJSON->valuestring == NULL)) {
        return 0;
    }
    return asset_type_response_asset_type_response_FromString(asset_type_responseJSON->valuestring);
}
