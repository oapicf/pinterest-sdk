#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_access_role.h"


char* business_access_role_business_access_role_ToString(pinterest_rest_api_business_access_role__e business_access_role) {
    char *business_access_roleArray[] =  { "NULL", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    return business_access_roleArray[business_access_role];
}

pinterest_rest_api_business_access_role__e business_access_role_business_access_role_FromString(char* business_access_role) {
    int stringToReturn = 0;
    char *business_access_roleArray[] =  { "NULL", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    size_t sizeofArray = sizeof(business_access_roleArray) / sizeof(business_access_roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(business_access_role, business_access_roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *business_access_role_business_access_role_convertToJSON(pinterest_rest_api_business_access_role__e business_access_role) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "business_access_role", business_access_role_business_access_role_ToString(business_access_role)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_business_access_role__e business_access_role_business_access_role_parseFromJSON(cJSON *business_access_roleJSON) {
    pinterest_rest_api_business_access_role__e *business_access_role = NULL;
    pinterest_rest_api_business_access_role__e business_access_roleVariable;
    cJSON *business_access_roleVar = cJSON_GetObjectItemCaseSensitive(business_access_roleJSON, "business_access_role");
    if(!cJSON_IsString(business_access_roleVar) || (business_access_roleVar->valuestring == NULL)){
        goto end;
    }
    business_access_roleVariable = business_access_role_business_access_role_FromString(business_access_roleVar->valuestring);
    return business_access_roleVariable;
end:
    return 0;
}
