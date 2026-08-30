#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "public_targeting_type.h"


char* public_targeting_type_public_targeting_type_ToString(pinterest_rest_api_public_targeting_type__e public_targeting_type) {
    char *public_targeting_typeArray[] =  { "NULL", "APPTYPE", "GENDER", "LOCALE", "AGE_BUCKET", "LOCATION", "GEO", "INTEREST", "KEYWORD", "AUDIENCE_INCLUDE", "AUDIENCE_EXCLUDE" };
    return public_targeting_typeArray[public_targeting_type];
}

pinterest_rest_api_public_targeting_type__e public_targeting_type_public_targeting_type_FromString(char* public_targeting_type) {
    int stringToReturn = 0;
    char *public_targeting_typeArray[] =  { "NULL", "APPTYPE", "GENDER", "LOCALE", "AGE_BUCKET", "LOCATION", "GEO", "INTEREST", "KEYWORD", "AUDIENCE_INCLUDE", "AUDIENCE_EXCLUDE" };
    size_t sizeofArray = sizeof(public_targeting_typeArray) / sizeof(public_targeting_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(public_targeting_type, public_targeting_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *public_targeting_type_convertToJSON(pinterest_rest_api_public_targeting_type__e public_targeting_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "public_targeting_type", public_targeting_type_public_targeting_type_ToString(public_targeting_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_public_targeting_type__e public_targeting_type_parseFromJSON(cJSON *public_targeting_typeJSON) {
    if(!cJSON_IsString(public_targeting_typeJSON) || (public_targeting_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return public_targeting_type_public_targeting_type_FromString(public_targeting_typeJSON->valuestring);
}
