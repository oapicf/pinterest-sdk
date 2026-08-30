#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_objective_type.h"


char* campaign_objective_type_campaign_objective_type_ToString(pinterest_rest_api_campaign_objective_type__e campaign_objective_type) {
    char *campaign_objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS", "VIDEO_COMPLETION", "APP_INSTALL", "SALES", "LEADS", "CTV_CONSIDERATION" };
    return campaign_objective_typeArray[campaign_objective_type];
}

pinterest_rest_api_campaign_objective_type__e campaign_objective_type_campaign_objective_type_FromString(char* campaign_objective_type) {
    int stringToReturn = 0;
    char *campaign_objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS", "VIDEO_COMPLETION", "APP_INSTALL", "SALES", "LEADS", "CTV_CONSIDERATION" };
    size_t sizeofArray = sizeof(campaign_objective_typeArray) / sizeof(campaign_objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_objective_type, campaign_objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *campaign_objective_type_convertToJSON(pinterest_rest_api_campaign_objective_type__e campaign_objective_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "campaign_objective_type", campaign_objective_type_campaign_objective_type_ToString(campaign_objective_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_campaign_objective_type__e campaign_objective_type_parseFromJSON(cJSON *campaign_objective_typeJSON) {
    if(!cJSON_IsString(campaign_objective_typeJSON) || (campaign_objective_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return campaign_objective_type_campaign_objective_type_FromString(campaign_objective_typeJSON->valuestring);
}
