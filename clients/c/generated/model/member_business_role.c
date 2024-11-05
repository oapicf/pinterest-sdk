#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "member_business_role.h"


char* member_business_role_member_business_role_ToString(pinterest_rest_api_member_business_role__e member_business_role) {
    char *member_business_roleArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN" };
    return member_business_roleArray[member_business_role];
}

pinterest_rest_api_member_business_role__e member_business_role_member_business_role_FromString(char* member_business_role) {
    int stringToReturn = 0;
    char *member_business_roleArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN" };
    size_t sizeofArray = sizeof(member_business_roleArray) / sizeof(member_business_roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(member_business_role, member_business_roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *member_business_role_member_business_role_convertToJSON(pinterest_rest_api_member_business_role__e member_business_role) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "member_business_role", member_business_role_member_business_role_ToString(member_business_role)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_member_business_role__e member_business_role_member_business_role_parseFromJSON(cJSON *member_business_roleJSON) {
    pinterest_rest_api_member_business_role__e *member_business_role = NULL;
    pinterest_rest_api_member_business_role__e member_business_roleVariable;
    cJSON *member_business_roleVar = cJSON_GetObjectItemCaseSensitive(member_business_roleJSON, "member_business_role");
    if(!cJSON_IsString(member_business_roleVar) || (member_business_roleVar->valuestring == NULL)){
        goto end;
    }
    member_business_roleVariable = member_business_role_member_business_role_FromString(member_business_roleVar->valuestring);
    return member_business_roleVariable;
end:
    return 0;
}
