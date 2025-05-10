#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "role.h"


char* role_role_ToString(pinterest_rest_api_role__e role) {
    char *roleArray[] =  { "NULL", "UNKNOWN", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    return roleArray[role];
}

pinterest_rest_api_role__e role_role_FromString(char* role) {
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "UNKNOWN", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *role_convertToJSON(pinterest_rest_api_role__e role) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "role", role_role_ToString(role)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_role__e role_parseFromJSON(cJSON *roleJSON) {
    if(!cJSON_IsString(roleJSON) || (roleJSON->valuestring == NULL)) {
        return 0;
    }
    return role_role_FromString(roleJSON->valuestring);
}
