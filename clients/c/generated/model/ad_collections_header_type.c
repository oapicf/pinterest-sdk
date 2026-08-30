#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_collections_header_type.h"


char* ad_collections_header_type_ad_collections_header_type_ToString(pinterest_rest_api_ad_collections_header_type__e ad_collections_header_type) {
    char *ad_collections_header_typeArray[] =  { "NULL", "SHOP_THIS_COLLECTION", "EXPLORE_THIS_COLLECTION", "NO_HEADER", "" };
    return ad_collections_header_typeArray[ad_collections_header_type];
}

pinterest_rest_api_ad_collections_header_type__e ad_collections_header_type_ad_collections_header_type_FromString(char* ad_collections_header_type) {
    int stringToReturn = 0;
    char *ad_collections_header_typeArray[] =  { "NULL", "SHOP_THIS_COLLECTION", "EXPLORE_THIS_COLLECTION", "NO_HEADER", "" };
    size_t sizeofArray = sizeof(ad_collections_header_typeArray) / sizeof(ad_collections_header_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ad_collections_header_type, ad_collections_header_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ad_collections_header_type_convertToJSON(pinterest_rest_api_ad_collections_header_type__e ad_collections_header_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ad_collections_header_type", ad_collections_header_type_ad_collections_header_type_ToString(ad_collections_header_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ad_collections_header_type__e ad_collections_header_type_parseFromJSON(cJSON *ad_collections_header_typeJSON) {
    if(!cJSON_IsString(ad_collections_header_typeJSON) || (ad_collections_header_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return ad_collections_header_type_ad_collections_header_type_FromString(ad_collections_header_typeJSON->valuestring);
}
