#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_profile_status.h"


char* billing_profile_status_billing_profile_status_ToString(pinterest_rest_api_billing_profile_status__e billing_profile_status) {
    char *billing_profile_statusArray[] =  { "NULL", "UNSPECIFIED", "VALID", "INVALID", "PENDING", "DELETED", "SECONDARY", "PENDING_SECONDARY" };
    return billing_profile_statusArray[billing_profile_status];
}

pinterest_rest_api_billing_profile_status__e billing_profile_status_billing_profile_status_FromString(char* billing_profile_status) {
    int stringToReturn = 0;
    char *billing_profile_statusArray[] =  { "NULL", "UNSPECIFIED", "VALID", "INVALID", "PENDING", "DELETED", "SECONDARY", "PENDING_SECONDARY" };
    size_t sizeofArray = sizeof(billing_profile_statusArray) / sizeof(billing_profile_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(billing_profile_status, billing_profile_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *billing_profile_status_convertToJSON(pinterest_rest_api_billing_profile_status__e billing_profile_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "billing_profile_status", billing_profile_status_billing_profile_status_ToString(billing_profile_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_billing_profile_status__e billing_profile_status_parseFromJSON(cJSON *billing_profile_statusJSON) {
    if(!cJSON_IsString(billing_profile_statusJSON) || (billing_profile_statusJSON->valuestring == NULL)) {
        return 0;
    }
    return billing_profile_status_billing_profile_status_FromString(billing_profile_statusJSON->valuestring);
}
