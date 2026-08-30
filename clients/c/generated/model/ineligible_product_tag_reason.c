#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ineligible_product_tag_reason.h"


char* ineligible_product_tag_reason_ineligible_product_tag_reason_ToString(pinterest_rest_api_ineligible_product_tag_reason__e ineligible_product_tag_reason) {
    char *ineligible_product_tag_reasonArray[] =  { "NULL", "PIN_MISSING", "PIN_IS_PRIVATE", "PRODUCT_METADATA_MISSING", "PIN_NOT_FROM_VERIFIED_DOMAIN", "PIN_NOT_FROM_SAME_USER_AS_HERO_PIN" };
    return ineligible_product_tag_reasonArray[ineligible_product_tag_reason];
}

pinterest_rest_api_ineligible_product_tag_reason__e ineligible_product_tag_reason_ineligible_product_tag_reason_FromString(char* ineligible_product_tag_reason) {
    int stringToReturn = 0;
    char *ineligible_product_tag_reasonArray[] =  { "NULL", "PIN_MISSING", "PIN_IS_PRIVATE", "PRODUCT_METADATA_MISSING", "PIN_NOT_FROM_VERIFIED_DOMAIN", "PIN_NOT_FROM_SAME_USER_AS_HERO_PIN" };
    size_t sizeofArray = sizeof(ineligible_product_tag_reasonArray) / sizeof(ineligible_product_tag_reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ineligible_product_tag_reason, ineligible_product_tag_reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ineligible_product_tag_reason_convertToJSON(pinterest_rest_api_ineligible_product_tag_reason__e ineligible_product_tag_reason) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ineligible_product_tag_reason", ineligible_product_tag_reason_ineligible_product_tag_reason_ToString(ineligible_product_tag_reason)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ineligible_product_tag_reason__e ineligible_product_tag_reason_parseFromJSON(cJSON *ineligible_product_tag_reasonJSON) {
    if(!cJSON_IsString(ineligible_product_tag_reasonJSON) || (ineligible_product_tag_reasonJSON->valuestring == NULL)) {
        return 0;
    }
    return ineligible_product_tag_reason_ineligible_product_tag_reason_FromString(ineligible_product_tag_reasonJSON->valuestring);
}
