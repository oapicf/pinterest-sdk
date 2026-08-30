#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_confidence_level_alert_reason.h"


char* campaign_planning_confidence_level_alert_reason_campaign_planning_confidence_level_alert_reason_ToString(pinterest_rest_api_campaign_planning_confidence_level_alert_reason__e campaign_planning_confidence_level_alert_reason) {
    char *campaign_planning_confidence_level_alert_reasonArray[] =  { "NULL", "UNKNOWN", "OTHER", "ADVERTISER_HAS_NO_RECENT_CAMPAIGNS", "ADVERTISER_HAS_NO_RECENT_CONVERSIONS" };
    return campaign_planning_confidence_level_alert_reasonArray[campaign_planning_confidence_level_alert_reason];
}

pinterest_rest_api_campaign_planning_confidence_level_alert_reason__e campaign_planning_confidence_level_alert_reason_campaign_planning_confidence_level_alert_reason_FromString(char* campaign_planning_confidence_level_alert_reason) {
    int stringToReturn = 0;
    char *campaign_planning_confidence_level_alert_reasonArray[] =  { "NULL", "UNKNOWN", "OTHER", "ADVERTISER_HAS_NO_RECENT_CAMPAIGNS", "ADVERTISER_HAS_NO_RECENT_CONVERSIONS" };
    size_t sizeofArray = sizeof(campaign_planning_confidence_level_alert_reasonArray) / sizeof(campaign_planning_confidence_level_alert_reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_planning_confidence_level_alert_reason, campaign_planning_confidence_level_alert_reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *campaign_planning_confidence_level_alert_reason_convertToJSON(pinterest_rest_api_campaign_planning_confidence_level_alert_reason__e campaign_planning_confidence_level_alert_reason) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "campaign_planning_confidence_level_alert_reason", campaign_planning_confidence_level_alert_reason_campaign_planning_confidence_level_alert_reason_ToString(campaign_planning_confidence_level_alert_reason)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_campaign_planning_confidence_level_alert_reason__e campaign_planning_confidence_level_alert_reason_parseFromJSON(cJSON *campaign_planning_confidence_level_alert_reasonJSON) {
    if(!cJSON_IsString(campaign_planning_confidence_level_alert_reasonJSON) || (campaign_planning_confidence_level_alert_reasonJSON->valuestring == NULL)) {
        return 0;
    }
    return campaign_planning_confidence_level_alert_reason_campaign_planning_confidence_level_alert_reason_FromString(campaign_planning_confidence_level_alert_reasonJSON->valuestring);
}
