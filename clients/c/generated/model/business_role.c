#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_role.h"


char* business_role_business_role_ToString(pinterest_rest_api_business_role__e business_role) {
    char *business_roleArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN", "PARTNER" };
    return business_roleArray[business_role];
}

pinterest_rest_api_business_role__e business_role_business_role_FromString(char* business_role) {
    int stringToReturn = 0;
    char *business_roleArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN", "PARTNER" };
    size_t sizeofArray = sizeof(business_roleArray) / sizeof(business_roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(business_role, business_roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *business_role_business_role_convertToJSON(pinterest_rest_api_business_role__e business_role) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "business_role", business_role_business_role_ToString(business_role)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_business_role__e business_role_business_role_parseFromJSON(cJSON *business_roleJSON) {
    pinterest_rest_api_business_role__e *business_role = NULL;
    pinterest_rest_api_business_role__e business_roleVariable;
    cJSON *business_roleVar = cJSON_GetObjectItemCaseSensitive(business_roleJSON, "business_role");
    if(!cJSON_IsString(business_roleVar) || (business_roleVar->valuestring == NULL)){
        goto end;
    }
    business_roleVariable = business_role_business_role_FromString(business_roleVar->valuestring);
    return business_roleVariable;
end:
    return 0;
}
