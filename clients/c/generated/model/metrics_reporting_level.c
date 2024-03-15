#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "metrics_reporting_level.h"


char* metrics_reporting_level_metrics_reporting_level_ToString(pinterest_rest_api_metrics_reporting_level__e metrics_reporting_level) {
    char *metrics_reporting_levelArray[] =  { "NULL", "ADVERTISER", "ADVERTISER_TARGETING", "CAMPAIGN", "CAMPAIGN_TARGETING", "AD_GROUP", "AD_GROUP_TARGETING", "PIN_PROMOTION", "PIN_PROMOTION_TARGETING", "KEYWORD", "PRODUCT_GROUP", "PRODUCT_GROUP_TARGETING", "PRODUCT_ITEM" };
    return metrics_reporting_levelArray[metrics_reporting_level];
}

pinterest_rest_api_metrics_reporting_level__e metrics_reporting_level_metrics_reporting_level_FromString(char* metrics_reporting_level) {
    int stringToReturn = 0;
    char *metrics_reporting_levelArray[] =  { "NULL", "ADVERTISER", "ADVERTISER_TARGETING", "CAMPAIGN", "CAMPAIGN_TARGETING", "AD_GROUP", "AD_GROUP_TARGETING", "PIN_PROMOTION", "PIN_PROMOTION_TARGETING", "KEYWORD", "PRODUCT_GROUP", "PRODUCT_GROUP_TARGETING", "PRODUCT_ITEM" };
    size_t sizeofArray = sizeof(metrics_reporting_levelArray) / sizeof(metrics_reporting_levelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(metrics_reporting_level, metrics_reporting_levelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *metrics_reporting_level_metrics_reporting_level_convertToJSON(pinterest_rest_api_metrics_reporting_level__e metrics_reporting_level) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "metrics_reporting_level", metrics_reporting_level_metrics_reporting_level_ToString(metrics_reporting_level)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_metrics_reporting_level__e metrics_reporting_level_metrics_reporting_level_parseFromJSON(cJSON *metrics_reporting_levelJSON) {
    pinterest_rest_api_metrics_reporting_level__e *metrics_reporting_level = NULL;
    pinterest_rest_api_metrics_reporting_level__e metrics_reporting_levelVariable;
    cJSON *metrics_reporting_levelVar = cJSON_GetObjectItemCaseSensitive(metrics_reporting_levelJSON, "metrics_reporting_level");
    if(!cJSON_IsString(metrics_reporting_levelVar) || (metrics_reporting_levelVar->valuestring == NULL)){
        goto end;
    }
    metrics_reporting_levelVariable = metrics_reporting_level_metrics_reporting_level_FromString(metrics_reporting_levelVar->valuestring);
    return metrics_reporting_levelVariable;
end:
    return 0;
}
