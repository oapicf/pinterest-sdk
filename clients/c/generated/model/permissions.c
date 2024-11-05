#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "permissions.h"


char* permissions_permissions_ToString(pinterest_rest_api_permissions__e permissions) {
    char *permissionsArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "PROFILE_PUBLISHER" };
    return permissionsArray[permissions];
}

pinterest_rest_api_permissions__e permissions_permissions_FromString(char* permissions) {
    int stringToReturn = 0;
    char *permissionsArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "PROFILE_PUBLISHER" };
    size_t sizeofArray = sizeof(permissionsArray) / sizeof(permissionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(permissions, permissionsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *permissions_permissions_convertToJSON(pinterest_rest_api_permissions__e permissions) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "permissions", permissions_permissions_ToString(permissions)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_permissions__e permissions_permissions_parseFromJSON(cJSON *permissionsJSON) {
    pinterest_rest_api_permissions__e *permissions = NULL;
    pinterest_rest_api_permissions__e permissionsVariable;
    cJSON *permissionsVar = cJSON_GetObjectItemCaseSensitive(permissionsJSON, "permissions");
    if(!cJSON_IsString(permissionsVar) || (permissionsVar->valuestring == NULL)){
        goto end;
    }
    permissionsVariable = permissions_permissions_FromString(permissionsVar->valuestring);
    return permissionsVariable;
end:
    return 0;
}
