#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_analytics_filter_column.h"


char* ads_analytics_filter_column_ads_analytics_filter_column_ToString(pinterest_rest_api_ads_analytics_filter_column__e ads_analytics_filter_column) {
    char *ads_analytics_filter_columnArray[] =  { "NULL", "SPEND_IN_DOLLAR", "TOTAL_IMPRESSION" };
    return ads_analytics_filter_columnArray[ads_analytics_filter_column];
}

pinterest_rest_api_ads_analytics_filter_column__e ads_analytics_filter_column_ads_analytics_filter_column_FromString(char* ads_analytics_filter_column) {
    int stringToReturn = 0;
    char *ads_analytics_filter_columnArray[] =  { "NULL", "SPEND_IN_DOLLAR", "TOTAL_IMPRESSION" };
    size_t sizeofArray = sizeof(ads_analytics_filter_columnArray) / sizeof(ads_analytics_filter_columnArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ads_analytics_filter_column, ads_analytics_filter_columnArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ads_analytics_filter_column_ads_analytics_filter_column_convertToJSON(pinterest_rest_api_ads_analytics_filter_column__e ads_analytics_filter_column) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ads_analytics_filter_column", ads_analytics_filter_column_ads_analytics_filter_column_ToString(ads_analytics_filter_column)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ads_analytics_filter_column__e ads_analytics_filter_column_ads_analytics_filter_column_parseFromJSON(cJSON *ads_analytics_filter_columnJSON) {
    pinterest_rest_api_ads_analytics_filter_column__e *ads_analytics_filter_column = NULL;
    pinterest_rest_api_ads_analytics_filter_column__e ads_analytics_filter_columnVariable;
    cJSON *ads_analytics_filter_columnVar = cJSON_GetObjectItemCaseSensitive(ads_analytics_filter_columnJSON, "ads_analytics_filter_column");
    if(!cJSON_IsString(ads_analytics_filter_columnVar) || (ads_analytics_filter_columnVar->valuestring == NULL)){
        goto end;
    }
    ads_analytics_filter_columnVariable = ads_analytics_filter_column_ads_analytics_filter_column_FromString(ads_analytics_filter_columnVar->valuestring);
    return ads_analytics_filter_columnVariable;
end:
    return 0;
}
