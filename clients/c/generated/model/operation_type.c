#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "operation_type.h"


char* operation_type_operation_type_ToString(pinterest_rest_api_operation_type__e operation_type) {
    char *operation_typeArray[] =  { "NULL", "SHARE", "REVOKE" };
    return operation_typeArray[operation_type];
}

pinterest_rest_api_operation_type__e operation_type_operation_type_FromString(char* operation_type) {
    int stringToReturn = 0;
    char *operation_typeArray[] =  { "NULL", "SHARE", "REVOKE" };
    size_t sizeofArray = sizeof(operation_typeArray) / sizeof(operation_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation_type, operation_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *operation_type_operation_type_convertToJSON(pinterest_rest_api_operation_type__e operation_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "operation_type", operation_type_operation_type_ToString(operation_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_operation_type__e operation_type_operation_type_parseFromJSON(cJSON *operation_typeJSON) {
    pinterest_rest_api_operation_type__e *operation_type = NULL;
    pinterest_rest_api_operation_type__e operation_typeVariable;
    cJSON *operation_typeVar = cJSON_GetObjectItemCaseSensitive(operation_typeJSON, "operation_type");
    if(!cJSON_IsString(operation_typeVar) || (operation_typeVar->valuestring == NULL)){
        goto end;
    }
    operation_typeVariable = operation_type_operation_type_FromString(operation_typeVar->valuestring);
    return operation_typeVariable;
end:
    return 0;
}
