#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_update_operation_type.h"


char* audience_update_operation_type_audience_update_operation_type_ToString(pinterest_rest_api_audience_update_operation_type__e audience_update_operation_type) {
    char *audience_update_operation_typeArray[] =  { "NULL", "UPDATE", "REMOVE" };
    return audience_update_operation_typeArray[audience_update_operation_type];
}

pinterest_rest_api_audience_update_operation_type__e audience_update_operation_type_audience_update_operation_type_FromString(char* audience_update_operation_type) {
    int stringToReturn = 0;
    char *audience_update_operation_typeArray[] =  { "NULL", "UPDATE", "REMOVE" };
    size_t sizeofArray = sizeof(audience_update_operation_typeArray) / sizeof(audience_update_operation_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audience_update_operation_type, audience_update_operation_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audience_update_operation_type_audience_update_operation_type_convertToJSON(pinterest_rest_api_audience_update_operation_type__e audience_update_operation_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audience_update_operation_type", audience_update_operation_type_audience_update_operation_type_ToString(audience_update_operation_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_audience_update_operation_type__e audience_update_operation_type_audience_update_operation_type_parseFromJSON(cJSON *audience_update_operation_typeJSON) {
    pinterest_rest_api_audience_update_operation_type__e *audience_update_operation_type = NULL;
    pinterest_rest_api_audience_update_operation_type__e audience_update_operation_typeVariable;
    cJSON *audience_update_operation_typeVar = cJSON_GetObjectItemCaseSensitive(audience_update_operation_typeJSON, "audience_update_operation_type");
    if(!cJSON_IsString(audience_update_operation_typeVar) || (audience_update_operation_typeVar->valuestring == NULL)){
        goto end;
    }
    audience_update_operation_typeVariable = audience_update_operation_type_audience_update_operation_type_FromString(audience_update_operation_typeVar->valuestring);
    return audience_update_operation_typeVariable;
end:
    return 0;
}
