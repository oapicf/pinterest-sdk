#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_summary_status.h"


char* ad_group_summary_status_ad_group_summary_status_ToString(pinterest_rest_api_ad_group_summary_status__e ad_group_summary_status) {
    char *ad_group_summary_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "NOT_STARTED", "COMPLETED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return ad_group_summary_statusArray[ad_group_summary_status];
}

pinterest_rest_api_ad_group_summary_status__e ad_group_summary_status_ad_group_summary_status_FromString(char* ad_group_summary_status) {
    int stringToReturn = 0;
    char *ad_group_summary_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "NOT_STARTED", "COMPLETED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(ad_group_summary_statusArray) / sizeof(ad_group_summary_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ad_group_summary_status, ad_group_summary_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ad_group_summary_status_ad_group_summary_status_convertToJSON(pinterest_rest_api_ad_group_summary_status__e ad_group_summary_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ad_group_summary_status", ad_group_summary_status_ad_group_summary_status_ToString(ad_group_summary_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ad_group_summary_status__e ad_group_summary_status_ad_group_summary_status_parseFromJSON(cJSON *ad_group_summary_statusJSON) {
    pinterest_rest_api_ad_group_summary_status__e *ad_group_summary_status = NULL;
    pinterest_rest_api_ad_group_summary_status__e ad_group_summary_statusVariable;
    cJSON *ad_group_summary_statusVar = cJSON_GetObjectItemCaseSensitive(ad_group_summary_statusJSON, "ad_group_summary_status");
    if(!cJSON_IsString(ad_group_summary_statusVar) || (ad_group_summary_statusVar->valuestring == NULL)){
        goto end;
    }
    ad_group_summary_statusVariable = ad_group_summary_status_ad_group_summary_status_FromString(ad_group_summary_statusVar->valuestring);
    return ad_group_summary_statusVariable;
end:
    return 0;
}
