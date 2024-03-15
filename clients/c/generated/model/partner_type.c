#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "partner_type.h"


char* partner_type_partner_type_ToString(pinterest_rest_api_partner_type__e partner_type) {
    char *partner_typeArray[] =  { "NULL", "INTERNAL", "EXTERNAL" };
    return partner_typeArray[partner_type];
}

pinterest_rest_api_partner_type__e partner_type_partner_type_FromString(char* partner_type) {
    int stringToReturn = 0;
    char *partner_typeArray[] =  { "NULL", "INTERNAL", "EXTERNAL" };
    size_t sizeofArray = sizeof(partner_typeArray) / sizeof(partner_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(partner_type, partner_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *partner_type_partner_type_convertToJSON(pinterest_rest_api_partner_type__e partner_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "partner_type", partner_type_partner_type_ToString(partner_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_partner_type__e partner_type_partner_type_parseFromJSON(cJSON *partner_typeJSON) {
    pinterest_rest_api_partner_type__e *partner_type = NULL;
    pinterest_rest_api_partner_type__e partner_typeVariable;
    cJSON *partner_typeVar = cJSON_GetObjectItemCaseSensitive(partner_typeJSON, "partner_type");
    if(!cJSON_IsString(partner_typeVar) || (partner_typeVar->valuestring == NULL)){
        goto end;
    }
    partner_typeVariable = partner_type_partner_type_FromString(partner_typeVar->valuestring);
    return partner_typeVariable;
end:
    return 0;
}
