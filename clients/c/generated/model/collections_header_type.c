#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "collections_header_type.h"


char* collections_header_type_collections_header_type_ToString(pinterest_rest_api_collections_header_type__e collections_header_type) {
    char *collections_header_typeArray[] =  { "NULL", "SHOP_THIS_COLLECTION", "EXPLORE_THIS_COLLECTION", "NO_HEADER", "ON_SALE", "GET_DEAL", "" };
    return collections_header_typeArray[collections_header_type];
}

pinterest_rest_api_collections_header_type__e collections_header_type_collections_header_type_FromString(char* collections_header_type) {
    int stringToReturn = 0;
    char *collections_header_typeArray[] =  { "NULL", "SHOP_THIS_COLLECTION", "EXPLORE_THIS_COLLECTION", "NO_HEADER", "ON_SALE", "GET_DEAL", "" };
    size_t sizeofArray = sizeof(collections_header_typeArray) / sizeof(collections_header_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(collections_header_type, collections_header_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *collections_header_type_convertToJSON(pinterest_rest_api_collections_header_type__e collections_header_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "collections_header_type", collections_header_type_collections_header_type_ToString(collections_header_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_collections_header_type__e collections_header_type_parseFromJSON(cJSON *collections_header_typeJSON) {
    if(!cJSON_IsString(collections_header_typeJSON) || (collections_header_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return collections_header_type_collections_header_type_FromString(collections_header_typeJSON->valuestring);
}
