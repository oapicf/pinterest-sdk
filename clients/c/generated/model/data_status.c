#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "data_status.h"


char* data_status_data_status_ToString(pinterest_rest_api_data_status__e data_status) {
    char *data_statusArray[] =  { "NULL", "PROCESSING", "READY", "ESTIMATE", "BEFORE_BUSINESS_CREATED", "BEFORE_DATA_RETENTION_PERIOD", "BEFORE_PIN_DATA_RETENTION_PERIOD", "BEFORE_METRIC_START_DATE", "BEFORE_CORE_METRIC_START_DATE", "BEFORE_PIN_FORMAT_METRIC_START_DATE", "BEFORE_AUDIENCE_METRIC_START_DATE", "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE", "BEFORE_VIDEO_METRIC_START_DATE", "BEFORE_CONVERSION_METRIC_START_DATE", "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD", "IN_BAD_TAG_DATE", "BEFORE_PUBLISHED_METRIC_START_DATE", "BEFORE_ASSIST_METRIC_START_DATE", "BEFORE_PIN_CREATED", "BEFORE_ACCOUNT_CLAIMED", "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE", "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD", "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD", "BEFORE_PRODUCT_GROUP_FILTER_START_DATE" };
    return data_statusArray[data_status];
}

pinterest_rest_api_data_status__e data_status_data_status_FromString(char* data_status) {
    int stringToReturn = 0;
    char *data_statusArray[] =  { "NULL", "PROCESSING", "READY", "ESTIMATE", "BEFORE_BUSINESS_CREATED", "BEFORE_DATA_RETENTION_PERIOD", "BEFORE_PIN_DATA_RETENTION_PERIOD", "BEFORE_METRIC_START_DATE", "BEFORE_CORE_METRIC_START_DATE", "BEFORE_PIN_FORMAT_METRIC_START_DATE", "BEFORE_AUDIENCE_METRIC_START_DATE", "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE", "BEFORE_VIDEO_METRIC_START_DATE", "BEFORE_CONVERSION_METRIC_START_DATE", "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD", "IN_BAD_TAG_DATE", "BEFORE_PUBLISHED_METRIC_START_DATE", "BEFORE_ASSIST_METRIC_START_DATE", "BEFORE_PIN_CREATED", "BEFORE_ACCOUNT_CLAIMED", "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE", "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD", "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD", "BEFORE_PRODUCT_GROUP_FILTER_START_DATE" };
    size_t sizeofArray = sizeof(data_statusArray) / sizeof(data_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(data_status, data_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *data_status_data_status_convertToJSON(pinterest_rest_api_data_status__e data_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "data_status", data_status_data_status_ToString(data_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_data_status__e data_status_data_status_parseFromJSON(cJSON *data_statusJSON) {
    pinterest_rest_api_data_status__e *data_status = NULL;
    pinterest_rest_api_data_status__e data_statusVariable;
    cJSON *data_statusVar = cJSON_GetObjectItemCaseSensitive(data_statusJSON, "data_status");
    if(!cJSON_IsString(data_statusVar) || (data_statusVar->valuestring == NULL)){
        goto end;
    }
    data_statusVariable = data_status_data_status_FromString(data_statusVar->valuestring);
    return data_statusVariable;
end:
    return 0;
}
