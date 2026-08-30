#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_role_for_invite.h"


char* business_role_for_invite_business_role_for_invite_ToString(pinterest_rest_api_business_role_for_invite__e business_role_for_invite) {
    char *business_role_for_inviteArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN", "PARTNER" };
    return business_role_for_inviteArray[business_role_for_invite];
}

pinterest_rest_api_business_role_for_invite__e business_role_for_invite_business_role_for_invite_FromString(char* business_role_for_invite) {
    int stringToReturn = 0;
    char *business_role_for_inviteArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN", "PARTNER" };
    size_t sizeofArray = sizeof(business_role_for_inviteArray) / sizeof(business_role_for_inviteArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(business_role_for_invite, business_role_for_inviteArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *business_role_for_invite_convertToJSON(pinterest_rest_api_business_role_for_invite__e business_role_for_invite) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "business_role_for_invite", business_role_for_invite_business_role_for_invite_ToString(business_role_for_invite)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_business_role_for_invite__e business_role_for_invite_parseFromJSON(cJSON *business_role_for_inviteJSON) {
    if(!cJSON_IsString(business_role_for_inviteJSON) || (business_role_for_inviteJSON->valuestring == NULL)) {
        return 0;
    }
    return business_role_for_invite_business_role_for_invite_FromString(business_role_for_inviteJSON->valuestring);
}
