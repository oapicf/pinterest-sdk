#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pacing_delivery_type.h"


char* pacing_delivery_type_pacing_delivery_type_ToString(pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type) {
    char *pacing_delivery_typeArray[] =  { "NULL", "STANDARD", "ACCELERATED" };
    return pacing_delivery_typeArray[pacing_delivery_type];
}

pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type_pacing_delivery_type_FromString(char* pacing_delivery_type) {
    int stringToReturn = 0;
    char *pacing_delivery_typeArray[] =  { "NULL", "STANDARD", "ACCELERATED" };
    size_t sizeofArray = sizeof(pacing_delivery_typeArray) / sizeof(pacing_delivery_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(pacing_delivery_type, pacing_delivery_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *pacing_delivery_type_pacing_delivery_type_convertToJSON(pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pacing_delivery_type", pacing_delivery_type_pacing_delivery_type_ToString(pacing_delivery_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type_pacing_delivery_type_parseFromJSON(cJSON *pacing_delivery_typeJSON) {
    pinterest_rest_api_pacing_delivery_type__e *pacing_delivery_type = NULL;
    pinterest_rest_api_pacing_delivery_type__e pacing_delivery_typeVariable;
    cJSON *pacing_delivery_typeVar = cJSON_GetObjectItemCaseSensitive(pacing_delivery_typeJSON, "pacing_delivery_type");
    if(!cJSON_IsString(pacing_delivery_typeVar) || (pacing_delivery_typeVar->valuestring == NULL)){
        goto end;
    }
    pacing_delivery_typeVariable = pacing_delivery_type_pacing_delivery_type_FromString(pacing_delivery_typeVar->valuestring);
    return pacing_delivery_typeVariable;
end:
    return 0;
}
