#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nullable_partner_type.h"


char* nullable_partner_type_nullable_partner_type_ToString(pinterest_rest_api_nullable_partner_type__e nullable_partner_type) {
    char *nullable_partner_typeArray[] =  { "NULL", "INTERNAL", "EXTERNAL", "" };
    return nullable_partner_typeArray[nullable_partner_type];
}

pinterest_rest_api_nullable_partner_type__e nullable_partner_type_nullable_partner_type_FromString(char* nullable_partner_type) {
    int stringToReturn = 0;
    char *nullable_partner_typeArray[] =  { "NULL", "INTERNAL", "EXTERNAL", "" };
    size_t sizeofArray = sizeof(nullable_partner_typeArray) / sizeof(nullable_partner_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(nullable_partner_type, nullable_partner_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *nullable_partner_type_convertToJSON(pinterest_rest_api_nullable_partner_type__e nullable_partner_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "nullable_partner_type", nullable_partner_type_nullable_partner_type_ToString(nullable_partner_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_nullable_partner_type__e nullable_partner_type_parseFromJSON(cJSON *nullable_partner_typeJSON) {
    if(!cJSON_IsString(nullable_partner_typeJSON) || (nullable_partner_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return nullable_partner_type_nullable_partner_type_FromString(nullable_partner_typeJSON->valuestring);
}
