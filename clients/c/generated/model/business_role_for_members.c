#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_role_for_members.h"


char* business_role_for_members_business_role_for_members_ToString(pinterest_rest_api_business_role_for_members__e business_role_for_members) {
    char *business_role_for_membersArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN" };
    return business_role_for_membersArray[business_role_for_members];
}

pinterest_rest_api_business_role_for_members__e business_role_for_members_business_role_for_members_FromString(char* business_role_for_members) {
    int stringToReturn = 0;
    char *business_role_for_membersArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN" };
    size_t sizeofArray = sizeof(business_role_for_membersArray) / sizeof(business_role_for_membersArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(business_role_for_members, business_role_for_membersArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *business_role_for_members_business_role_for_members_convertToJSON(pinterest_rest_api_business_role_for_members__e business_role_for_members) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "business_role_for_members", business_role_for_members_business_role_for_members_ToString(business_role_for_members)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_business_role_for_members__e business_role_for_members_business_role_for_members_parseFromJSON(cJSON *business_role_for_membersJSON) {
    pinterest_rest_api_business_role_for_members__e *business_role_for_members = NULL;
    pinterest_rest_api_business_role_for_members__e business_role_for_membersVariable;
    cJSON *business_role_for_membersVar = cJSON_GetObjectItemCaseSensitive(business_role_for_membersJSON, "business_role_for_members");
    if(!cJSON_IsString(business_role_for_membersVar) || (business_role_for_membersVar->valuestring == NULL)){
        goto end;
    }
    business_role_for_membersVariable = business_role_for_members_business_role_for_members_FromString(business_role_for_membersVar->valuestring);
    return business_role_for_membersVariable;
end:
    return 0;
}
