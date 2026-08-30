#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_response_error_code.h"


char* campaign_planning_response_error_code_campaign_planning_response_error_code_ToString(pinterest_rest_api_campaign_planning_response_error_code__e campaign_planning_response_error_code) {
    char *campaign_planning_response_error_codeArray[] =  { "NULL", "SERVER_ERROR", "AUDIENCE_LIST_MISSING", "INVALID_REQUEST", "PRODUCT_GROUP_MISSING" };
    return campaign_planning_response_error_codeArray[campaign_planning_response_error_code];
}

pinterest_rest_api_campaign_planning_response_error_code__e campaign_planning_response_error_code_campaign_planning_response_error_code_FromString(char* campaign_planning_response_error_code) {
    int stringToReturn = 0;
    char *campaign_planning_response_error_codeArray[] =  { "NULL", "SERVER_ERROR", "AUDIENCE_LIST_MISSING", "INVALID_REQUEST", "PRODUCT_GROUP_MISSING" };
    size_t sizeofArray = sizeof(campaign_planning_response_error_codeArray) / sizeof(campaign_planning_response_error_codeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_planning_response_error_code, campaign_planning_response_error_codeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *campaign_planning_response_error_code_convertToJSON(pinterest_rest_api_campaign_planning_response_error_code__e campaign_planning_response_error_code) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "campaign_planning_response_error_code", campaign_planning_response_error_code_campaign_planning_response_error_code_ToString(campaign_planning_response_error_code)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_campaign_planning_response_error_code__e campaign_planning_response_error_code_parseFromJSON(cJSON *campaign_planning_response_error_codeJSON) {
    if(!cJSON_IsString(campaign_planning_response_error_codeJSON) || (campaign_planning_response_error_codeJSON->valuestring == NULL)) {
        return 0;
    }
    return campaign_planning_response_error_code_campaign_planning_response_error_code_FromString(campaign_planning_response_error_codeJSON->valuestring);
}
