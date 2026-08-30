#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_estimation_type.h"


char* campaign_planning_estimation_type_campaign_planning_estimation_type_ToString(pinterest_rest_api_campaign_planning_estimation_type__e campaign_planning_estimation_type) {
    char *campaign_planning_estimation_typeArray[] =  { "NULL", "IMPRESSION", "CLICK", "CONVERSION", "WEEKLY_FREQUENCY", "WEEKLY_REACH", "LIFETIME_FREQUENCY", "LIFETIME_REACH", "CPM", "CPC", "CPA" };
    return campaign_planning_estimation_typeArray[campaign_planning_estimation_type];
}

pinterest_rest_api_campaign_planning_estimation_type__e campaign_planning_estimation_type_campaign_planning_estimation_type_FromString(char* campaign_planning_estimation_type) {
    int stringToReturn = 0;
    char *campaign_planning_estimation_typeArray[] =  { "NULL", "IMPRESSION", "CLICK", "CONVERSION", "WEEKLY_FREQUENCY", "WEEKLY_REACH", "LIFETIME_FREQUENCY", "LIFETIME_REACH", "CPM", "CPC", "CPA" };
    size_t sizeofArray = sizeof(campaign_planning_estimation_typeArray) / sizeof(campaign_planning_estimation_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_planning_estimation_type, campaign_planning_estimation_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *campaign_planning_estimation_type_convertToJSON(pinterest_rest_api_campaign_planning_estimation_type__e campaign_planning_estimation_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "campaign_planning_estimation_type", campaign_planning_estimation_type_campaign_planning_estimation_type_ToString(campaign_planning_estimation_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_campaign_planning_estimation_type__e campaign_planning_estimation_type_parseFromJSON(cJSON *campaign_planning_estimation_typeJSON) {
    if(!cJSON_IsString(campaign_planning_estimation_typeJSON) || (campaign_planning_estimation_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return campaign_planning_estimation_type_campaign_planning_estimation_type_FromString(campaign_planning_estimation_typeJSON->valuestring);
}
