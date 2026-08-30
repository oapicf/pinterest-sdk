#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_confidence_level_alert_severity.h"


char* campaign_planning_confidence_level_alert_severity_campaign_planning_confidence_level_alert_severity_ToString(pinterest_rest_api_campaign_planning_confidence_level_alert_severity__e campaign_planning_confidence_level_alert_severity) {
    char *campaign_planning_confidence_level_alert_severityArray[] =  { "NULL", "UNKNOWN", "LOW_MILD", "LOW_MODERATE", "LOW_SEVERE" };
    return campaign_planning_confidence_level_alert_severityArray[campaign_planning_confidence_level_alert_severity];
}

pinterest_rest_api_campaign_planning_confidence_level_alert_severity__e campaign_planning_confidence_level_alert_severity_campaign_planning_confidence_level_alert_severity_FromString(char* campaign_planning_confidence_level_alert_severity) {
    int stringToReturn = 0;
    char *campaign_planning_confidence_level_alert_severityArray[] =  { "NULL", "UNKNOWN", "LOW_MILD", "LOW_MODERATE", "LOW_SEVERE" };
    size_t sizeofArray = sizeof(campaign_planning_confidence_level_alert_severityArray) / sizeof(campaign_planning_confidence_level_alert_severityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_planning_confidence_level_alert_severity, campaign_planning_confidence_level_alert_severityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *campaign_planning_confidence_level_alert_severity_convertToJSON(pinterest_rest_api_campaign_planning_confidence_level_alert_severity__e campaign_planning_confidence_level_alert_severity) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "campaign_planning_confidence_level_alert_severity", campaign_planning_confidence_level_alert_severity_campaign_planning_confidence_level_alert_severity_ToString(campaign_planning_confidence_level_alert_severity)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_campaign_planning_confidence_level_alert_severity__e campaign_planning_confidence_level_alert_severity_parseFromJSON(cJSON *campaign_planning_confidence_level_alert_severityJSON) {
    if(!cJSON_IsString(campaign_planning_confidence_level_alert_severityJSON) || (campaign_planning_confidence_level_alert_severityJSON->valuestring == NULL)) {
        return 0;
    }
    return campaign_planning_confidence_level_alert_severity_campaign_planning_confidence_level_alert_severity_FromString(campaign_planning_confidence_level_alert_severityJSON->valuestring);
}
