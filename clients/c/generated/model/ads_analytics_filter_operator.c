#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_analytics_filter_operator.h"


char* ads_analytics_filter_operator_ads_analytics_filter_operator_ToString(pinterest_rest_api_ads_analytics_filter_operator__e ads_analytics_filter_operator) {
    char *ads_analytics_filter_operatorArray[] =  { "NULL", "LESS_THAN", "GREATER_THAN" };
    return ads_analytics_filter_operatorArray[ads_analytics_filter_operator];
}

pinterest_rest_api_ads_analytics_filter_operator__e ads_analytics_filter_operator_ads_analytics_filter_operator_FromString(char* ads_analytics_filter_operator) {
    int stringToReturn = 0;
    char *ads_analytics_filter_operatorArray[] =  { "NULL", "LESS_THAN", "GREATER_THAN" };
    size_t sizeofArray = sizeof(ads_analytics_filter_operatorArray) / sizeof(ads_analytics_filter_operatorArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ads_analytics_filter_operator, ads_analytics_filter_operatorArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ads_analytics_filter_operator_ads_analytics_filter_operator_convertToJSON(pinterest_rest_api_ads_analytics_filter_operator__e ads_analytics_filter_operator) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ads_analytics_filter_operator", ads_analytics_filter_operator_ads_analytics_filter_operator_ToString(ads_analytics_filter_operator)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ads_analytics_filter_operator__e ads_analytics_filter_operator_ads_analytics_filter_operator_parseFromJSON(cJSON *ads_analytics_filter_operatorJSON) {
    pinterest_rest_api_ads_analytics_filter_operator__e *ads_analytics_filter_operator = NULL;
    pinterest_rest_api_ads_analytics_filter_operator__e ads_analytics_filter_operatorVariable;
    cJSON *ads_analytics_filter_operatorVar = cJSON_GetObjectItemCaseSensitive(ads_analytics_filter_operatorJSON, "ads_analytics_filter_operator");
    if(!cJSON_IsString(ads_analytics_filter_operatorVar) || (ads_analytics_filter_operatorVar->valuestring == NULL)){
        goto end;
    }
    ads_analytics_filter_operatorVariable = ads_analytics_filter_operator_ads_analytics_filter_operator_FromString(ads_analytics_filter_operatorVar->valuestring);
    return ads_analytics_filter_operatorVariable;
end:
    return 0;
}
