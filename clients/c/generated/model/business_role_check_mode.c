#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_role_check_mode.h"


char* business_role_check_mode_business_role_check_mode_ToString(pinterest_rest_api_business_role_check_mode__e business_role_check_mode) {
    char *business_role_check_modeArray[] =  { "NULL", "INTERNAL", "EXTERNAL" };
    return business_role_check_modeArray[business_role_check_mode];
}

pinterest_rest_api_business_role_check_mode__e business_role_check_mode_business_role_check_mode_FromString(char* business_role_check_mode) {
    int stringToReturn = 0;
    char *business_role_check_modeArray[] =  { "NULL", "INTERNAL", "EXTERNAL" };
    size_t sizeofArray = sizeof(business_role_check_modeArray) / sizeof(business_role_check_modeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(business_role_check_mode, business_role_check_modeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *business_role_check_mode_business_role_check_mode_convertToJSON(pinterest_rest_api_business_role_check_mode__e business_role_check_mode) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "business_role_check_mode", business_role_check_mode_business_role_check_mode_ToString(business_role_check_mode)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_business_role_check_mode__e business_role_check_mode_business_role_check_mode_parseFromJSON(cJSON *business_role_check_modeJSON) {
    pinterest_rest_api_business_role_check_mode__e *business_role_check_mode = NULL;
    pinterest_rest_api_business_role_check_mode__e business_role_check_modeVariable;
    cJSON *business_role_check_modeVar = cJSON_GetObjectItemCaseSensitive(business_role_check_modeJSON, "business_role_check_mode");
    if(!cJSON_IsString(business_role_check_modeVar) || (business_role_check_modeVar->valuestring == NULL)){
        goto end;
    }
    business_role_check_modeVariable = business_role_check_mode_business_role_check_mode_FromString(business_role_check_modeVar->valuestring);
    return business_role_check_modeVariable;
end:
    return 0;
}
