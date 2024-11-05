#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "permissions_with_owner.h"


char* permissions_with_owner_permissions_with_owner_ToString(pinterest_rest_api_permissions_with_owner__e permissions_with_owner) {
    char *permissions_with_ownerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "OWNER" };
    return permissions_with_ownerArray[permissions_with_owner];
}

pinterest_rest_api_permissions_with_owner__e permissions_with_owner_permissions_with_owner_FromString(char* permissions_with_owner) {
    int stringToReturn = 0;
    char *permissions_with_ownerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "OWNER" };
    size_t sizeofArray = sizeof(permissions_with_ownerArray) / sizeof(permissions_with_ownerArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(permissions_with_owner, permissions_with_ownerArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *permissions_with_owner_permissions_with_owner_convertToJSON(pinterest_rest_api_permissions_with_owner__e permissions_with_owner) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "permissions_with_owner", permissions_with_owner_permissions_with_owner_ToString(permissions_with_owner)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_permissions_with_owner__e permissions_with_owner_permissions_with_owner_parseFromJSON(cJSON *permissions_with_ownerJSON) {
    pinterest_rest_api_permissions_with_owner__e *permissions_with_owner = NULL;
    pinterest_rest_api_permissions_with_owner__e permissions_with_ownerVariable;
    cJSON *permissions_with_ownerVar = cJSON_GetObjectItemCaseSensitive(permissions_with_ownerJSON, "permissions_with_owner");
    if(!cJSON_IsString(permissions_with_ownerVar) || (permissions_with_ownerVar->valuestring == NULL)){
        goto end;
    }
    permissions_with_ownerVariable = permissions_with_owner_permissions_with_owner_FromString(permissions_with_ownerVar->valuestring);
    return permissions_with_ownerVariable;
end:
    return 0;
}
