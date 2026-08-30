#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_conversion_attribution_window_days.h"


char* campaign_planning_conversion_attribution_window_days_campaign_planning_conversion_attribution_window_days_ToString(pinterest_rest_api_campaign_planning_conversion_attribution_window_days__e campaign_planning_conversion_attribution_window_days) {
    char *campaign_planning_conversion_attribution_window_daysArray[] =  { "NULL", "DAYS_0", "DAYS_1", "DAYS_7", "DAYS_30", "DAYS_60" };
    return campaign_planning_conversion_attribution_window_daysArray[campaign_planning_conversion_attribution_window_days];
}

pinterest_rest_api_campaign_planning_conversion_attribution_window_days__e campaign_planning_conversion_attribution_window_days_campaign_planning_conversion_attribution_window_days_FromString(char* campaign_planning_conversion_attribution_window_days) {
    int stringToReturn = 0;
    char *campaign_planning_conversion_attribution_window_daysArray[] =  { "NULL", "DAYS_0", "DAYS_1", "DAYS_7", "DAYS_30", "DAYS_60" };
    size_t sizeofArray = sizeof(campaign_planning_conversion_attribution_window_daysArray) / sizeof(campaign_planning_conversion_attribution_window_daysArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_planning_conversion_attribution_window_days, campaign_planning_conversion_attribution_window_daysArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *campaign_planning_conversion_attribution_window_days_convertToJSON(pinterest_rest_api_campaign_planning_conversion_attribution_window_days__e campaign_planning_conversion_attribution_window_days) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "campaign_planning_conversion_attribution_window_days", campaign_planning_conversion_attribution_window_days_campaign_planning_conversion_attribution_window_days_ToString(campaign_planning_conversion_attribution_window_days)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_campaign_planning_conversion_attribution_window_days__e campaign_planning_conversion_attribution_window_days_parseFromJSON(cJSON *campaign_planning_conversion_attribution_window_daysJSON) {
    if(!cJSON_IsString(campaign_planning_conversion_attribution_window_daysJSON) || (campaign_planning_conversion_attribution_window_daysJSON->valuestring == NULL)) {
        return 0;
    }
    return campaign_planning_conversion_attribution_window_days_campaign_planning_conversion_attribution_window_days_FromString(campaign_planning_conversion_attribution_window_daysJSON->valuestring);
}
