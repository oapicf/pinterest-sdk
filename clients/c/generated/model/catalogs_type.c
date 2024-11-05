#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_type.h"


char* catalogs_type_catalogs_type_ToString(pinterest_rest_api_catalogs_type__e catalogs_type) {
    char *catalogs_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    return catalogs_typeArray[catalogs_type];
}

pinterest_rest_api_catalogs_type__e catalogs_type_catalogs_type_FromString(char* catalogs_type) {
    int stringToReturn = 0;
    char *catalogs_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalogs_typeArray) / sizeof(catalogs_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalogs_type, catalogs_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *catalogs_type_catalogs_type_convertToJSON(pinterest_rest_api_catalogs_type__e catalogs_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "catalogs_type", catalogs_type_catalogs_type_ToString(catalogs_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_catalogs_type__e catalogs_type_catalogs_type_parseFromJSON(cJSON *catalogs_typeJSON) {
    pinterest_rest_api_catalogs_type__e *catalogs_type = NULL;
    pinterest_rest_api_catalogs_type__e catalogs_typeVariable;
    cJSON *catalogs_typeVar = cJSON_GetObjectItemCaseSensitive(catalogs_typeJSON, "catalogs_type");
    if(!cJSON_IsString(catalogs_typeVar) || (catalogs_typeVar->valuestring == NULL)){
        goto end;
    }
    catalogs_typeVariable = catalogs_type_catalogs_type_FromString(catalogs_typeVar->valuestring);
    return catalogs_typeVariable;
end:
    return 0;
}
