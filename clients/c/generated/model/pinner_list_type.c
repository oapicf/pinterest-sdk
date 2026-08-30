#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pinner_list_type.h"


char* pinner_list_type_pinner_list_type_ToString(pinterest_rest_api_pinner_list_type__e pinner_list_type) {
    char *pinner_list_typeArray[] =  { "NULL", "CUSTOMER_LIST", "VISITOR", "ENGAGEMENT", "LOOKALIKE", "ACTALIKE", "PERSONA" };
    return pinner_list_typeArray[pinner_list_type];
}

pinterest_rest_api_pinner_list_type__e pinner_list_type_pinner_list_type_FromString(char* pinner_list_type) {
    int stringToReturn = 0;
    char *pinner_list_typeArray[] =  { "NULL", "CUSTOMER_LIST", "VISITOR", "ENGAGEMENT", "LOOKALIKE", "ACTALIKE", "PERSONA" };
    size_t sizeofArray = sizeof(pinner_list_typeArray) / sizeof(pinner_list_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(pinner_list_type, pinner_list_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *pinner_list_type_convertToJSON(pinterest_rest_api_pinner_list_type__e pinner_list_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pinner_list_type", pinner_list_type_pinner_list_type_ToString(pinner_list_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_pinner_list_type__e pinner_list_type_parseFromJSON(cJSON *pinner_list_typeJSON) {
    if(!cJSON_IsString(pinner_list_typeJSON) || (pinner_list_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return pinner_list_type_pinner_list_type_FromString(pinner_list_typeJSON->valuestring);
}
