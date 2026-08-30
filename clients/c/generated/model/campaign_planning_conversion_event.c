#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_conversion_event.h"


char* campaign_planning_conversion_event_campaign_planning_conversion_event_ToString(pinterest_rest_api_campaign_planning_conversion_event__e campaign_planning_conversion_event) {
    char *campaign_planning_conversion_eventArray[] =  { "NULL", "SIGNUP", "CHECKOUT", "ADD_TO_CART", "LEAD" };
    return campaign_planning_conversion_eventArray[campaign_planning_conversion_event];
}

pinterest_rest_api_campaign_planning_conversion_event__e campaign_planning_conversion_event_campaign_planning_conversion_event_FromString(char* campaign_planning_conversion_event) {
    int stringToReturn = 0;
    char *campaign_planning_conversion_eventArray[] =  { "NULL", "SIGNUP", "CHECKOUT", "ADD_TO_CART", "LEAD" };
    size_t sizeofArray = sizeof(campaign_planning_conversion_eventArray) / sizeof(campaign_planning_conversion_eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_planning_conversion_event, campaign_planning_conversion_eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *campaign_planning_conversion_event_convertToJSON(pinterest_rest_api_campaign_planning_conversion_event__e campaign_planning_conversion_event) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "campaign_planning_conversion_event", campaign_planning_conversion_event_campaign_planning_conversion_event_ToString(campaign_planning_conversion_event)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_campaign_planning_conversion_event__e campaign_planning_conversion_event_parseFromJSON(cJSON *campaign_planning_conversion_eventJSON) {
    if(!cJSON_IsString(campaign_planning_conversion_eventJSON) || (campaign_planning_conversion_eventJSON->valuestring == NULL)) {
        return 0;
    }
    return campaign_planning_conversion_event_campaign_planning_conversion_event_FromString(campaign_planning_conversion_eventJSON->valuestring);
}
