#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_shopping_preview_creative_type.h"


char* ad_shopping_preview_creative_type_ad_shopping_preview_creative_type_ToString(pinterest_rest_api_ad_shopping_preview_creative_type__e ad_shopping_preview_creative_type) {
    char *ad_shopping_preview_creative_typeArray[] =  { "NULL", "SHOPPING", "COLLECTION", "CAROUSEL", "MAX_WIDTH_COLLECTION" };
    return ad_shopping_preview_creative_typeArray[ad_shopping_preview_creative_type];
}

pinterest_rest_api_ad_shopping_preview_creative_type__e ad_shopping_preview_creative_type_ad_shopping_preview_creative_type_FromString(char* ad_shopping_preview_creative_type) {
    int stringToReturn = 0;
    char *ad_shopping_preview_creative_typeArray[] =  { "NULL", "SHOPPING", "COLLECTION", "CAROUSEL", "MAX_WIDTH_COLLECTION" };
    size_t sizeofArray = sizeof(ad_shopping_preview_creative_typeArray) / sizeof(ad_shopping_preview_creative_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ad_shopping_preview_creative_type, ad_shopping_preview_creative_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ad_shopping_preview_creative_type_convertToJSON(pinterest_rest_api_ad_shopping_preview_creative_type__e ad_shopping_preview_creative_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ad_shopping_preview_creative_type", ad_shopping_preview_creative_type_ad_shopping_preview_creative_type_ToString(ad_shopping_preview_creative_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ad_shopping_preview_creative_type__e ad_shopping_preview_creative_type_parseFromJSON(cJSON *ad_shopping_preview_creative_typeJSON) {
    if(!cJSON_IsString(ad_shopping_preview_creative_typeJSON) || (ad_shopping_preview_creative_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return ad_shopping_preview_creative_type_ad_shopping_preview_creative_type_FromString(ad_shopping_preview_creative_typeJSON->valuestring);
}
