#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_business_asset_type_response.h"


char* get_business_asset_type_response_get_business_asset_type_response_ToString(pinterest_rest_api_get_business_asset_type_response__e get_business_asset_type_response) {
    char *get_business_asset_type_responseArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP", "CONVERSION_TAG" };
    return get_business_asset_type_responseArray[get_business_asset_type_response];
}

pinterest_rest_api_get_business_asset_type_response__e get_business_asset_type_response_get_business_asset_type_response_FromString(char* get_business_asset_type_response) {
    int stringToReturn = 0;
    char *get_business_asset_type_responseArray[] =  { "NULL", "AD_ACCOUNT", "PROFILE", "ASSET_GROUP", "CONVERSION_TAG" };
    size_t sizeofArray = sizeof(get_business_asset_type_responseArray) / sizeof(get_business_asset_type_responseArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(get_business_asset_type_response, get_business_asset_type_responseArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *get_business_asset_type_response_get_business_asset_type_response_convertToJSON(pinterest_rest_api_get_business_asset_type_response__e get_business_asset_type_response) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "get_business_asset_type_response", get_business_asset_type_response_get_business_asset_type_response_ToString(get_business_asset_type_response)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_get_business_asset_type_response__e get_business_asset_type_response_get_business_asset_type_response_parseFromJSON(cJSON *get_business_asset_type_responseJSON) {
    pinterest_rest_api_get_business_asset_type_response__e *get_business_asset_type_response = NULL;
    pinterest_rest_api_get_business_asset_type_response__e get_business_asset_type_responseVariable;
    cJSON *get_business_asset_type_responseVar = cJSON_GetObjectItemCaseSensitive(get_business_asset_type_responseJSON, "get_business_asset_type_response");
    if(!cJSON_IsString(get_business_asset_type_responseVar) || (get_business_asset_type_responseVar->valuestring == NULL)){
        goto end;
    }
    get_business_asset_type_responseVariable = get_business_asset_type_response_get_business_asset_type_response_FromString(get_business_asset_type_responseVar->valuestring);
    return get_business_asset_type_responseVariable;
end:
    return 0;
}
