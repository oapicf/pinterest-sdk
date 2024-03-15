#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_summary_status.h"


char* campaign_summary_status_campaign_summary_status_ToString(pinterest_rest_api_campaign_summary_status__e campaign_summary_status) {
    char *campaign_summary_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "NOT_STARTED", "COMPLETED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return campaign_summary_statusArray[campaign_summary_status];
}

pinterest_rest_api_campaign_summary_status__e campaign_summary_status_campaign_summary_status_FromString(char* campaign_summary_status) {
    int stringToReturn = 0;
    char *campaign_summary_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "NOT_STARTED", "COMPLETED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(campaign_summary_statusArray) / sizeof(campaign_summary_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_summary_status, campaign_summary_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *campaign_summary_status_campaign_summary_status_convertToJSON(pinterest_rest_api_campaign_summary_status__e campaign_summary_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "campaign_summary_status", campaign_summary_status_campaign_summary_status_ToString(campaign_summary_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_campaign_summary_status__e campaign_summary_status_campaign_summary_status_parseFromJSON(cJSON *campaign_summary_statusJSON) {
    pinterest_rest_api_campaign_summary_status__e *campaign_summary_status = NULL;
    pinterest_rest_api_campaign_summary_status__e campaign_summary_statusVariable;
    cJSON *campaign_summary_statusVar = cJSON_GetObjectItemCaseSensitive(campaign_summary_statusJSON, "campaign_summary_status");
    if(!cJSON_IsString(campaign_summary_statusVar) || (campaign_summary_statusVar->valuestring == NULL)){
        goto end;
    }
    campaign_summary_statusVariable = campaign_summary_status_campaign_summary_status_FromString(campaign_summary_statusVar->valuestring);
    return campaign_summary_statusVariable;
end:
    return 0;
}
