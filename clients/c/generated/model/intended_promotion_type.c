#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "intended_promotion_type.h"


char* intended_promotion_type_intended_promotion_type_ToString(pinterest_rest_api_intended_promotion_type__e intended_promotion_type) {
    char *intended_promotion_typeArray[] =  { "NULL", "LEGACY", "STANDARD_AD", "CATALOG" };
    return intended_promotion_typeArray[intended_promotion_type];
}

pinterest_rest_api_intended_promotion_type__e intended_promotion_type_intended_promotion_type_FromString(char* intended_promotion_type) {
    int stringToReturn = 0;
    char *intended_promotion_typeArray[] =  { "NULL", "LEGACY", "STANDARD_AD", "CATALOG" };
    size_t sizeofArray = sizeof(intended_promotion_typeArray) / sizeof(intended_promotion_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(intended_promotion_type, intended_promotion_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *intended_promotion_type_convertToJSON(pinterest_rest_api_intended_promotion_type__e intended_promotion_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "intended_promotion_type", intended_promotion_type_intended_promotion_type_ToString(intended_promotion_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_intended_promotion_type__e intended_promotion_type_parseFromJSON(cJSON *intended_promotion_typeJSON) {
    if(!cJSON_IsString(intended_promotion_typeJSON) || (intended_promotion_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return intended_promotion_type_intended_promotion_type_FromString(intended_promotion_typeJSON->valuestring);
}
