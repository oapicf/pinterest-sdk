#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "change_history_operation_type.h"


char* change_history_operation_type_change_history_operation_type_ToString(pinterest_rest_api_change_history_operation_type__e change_history_operation_type) {
    char *change_history_operation_typeArray[] =  { "NULL", "CREATE", "UPDATE", "DELETE" };
    return change_history_operation_typeArray[change_history_operation_type];
}

pinterest_rest_api_change_history_operation_type__e change_history_operation_type_change_history_operation_type_FromString(char* change_history_operation_type) {
    int stringToReturn = 0;
    char *change_history_operation_typeArray[] =  { "NULL", "CREATE", "UPDATE", "DELETE" };
    size_t sizeofArray = sizeof(change_history_operation_typeArray) / sizeof(change_history_operation_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(change_history_operation_type, change_history_operation_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *change_history_operation_type_convertToJSON(pinterest_rest_api_change_history_operation_type__e change_history_operation_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "change_history_operation_type", change_history_operation_type_change_history_operation_type_ToString(change_history_operation_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_change_history_operation_type__e change_history_operation_type_parseFromJSON(cJSON *change_history_operation_typeJSON) {
    if(!cJSON_IsString(change_history_operation_typeJSON) || (change_history_operation_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return change_history_operation_type_change_history_operation_type_FromString(change_history_operation_typeJSON->valuestring);
}
