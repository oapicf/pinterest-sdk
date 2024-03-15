#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "analytics_daily_metrics.h"


char* analytics_daily_metrics_data_status_ToString(pinterest_rest_api_analytics_daily_metrics__e data_status) {
    char* data_statusArray[] =  { "NULL", "PROCESSING", "READY", "ESTIMATE", "BEFORE_BUSINESS_CREATED", "BEFORE_DATA_RETENTION_PERIOD", "BEFORE_PIN_DATA_RETENTION_PERIOD", "BEFORE_METRIC_START_DATE", "BEFORE_CORE_METRIC_START_DATE", "BEFORE_PIN_FORMAT_METRIC_START_DATE", "BEFORE_AUDIENCE_METRIC_START_DATE", "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE", "BEFORE_VIDEO_METRIC_START_DATE", "BEFORE_CONVERSION_METRIC_START_DATE", "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD", "IN_BAD_TAG_DATE", "BEFORE_PUBLISHED_METRIC_START_DATE", "BEFORE_ASSIST_METRIC_START_DATE", "BEFORE_PIN_CREATED", "BEFORE_ACCOUNT_CLAIMED", "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE", "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD", "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD", "BEFORE_PRODUCT_GROUP_FILTER_START_DATE" };
    return data_statusArray[data_status];
}

pinterest_rest_api_analytics_daily_metrics__e analytics_daily_metrics_data_status_FromString(char* data_status){
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

analytics_daily_metrics_t *analytics_daily_metrics_create(
    data_status_t *data_status,
    char *date,
    list_t* metrics
    ) {
    analytics_daily_metrics_t *analytics_daily_metrics_local_var = malloc(sizeof(analytics_daily_metrics_t));
    if (!analytics_daily_metrics_local_var) {
        return NULL;
    }
    analytics_daily_metrics_local_var->data_status = data_status;
    analytics_daily_metrics_local_var->date = date;
    analytics_daily_metrics_local_var->metrics = metrics;

    return analytics_daily_metrics_local_var;
}


void analytics_daily_metrics_free(analytics_daily_metrics_t *analytics_daily_metrics) {
    if(NULL == analytics_daily_metrics){
        return ;
    }
    listEntry_t *listEntry;
    if (analytics_daily_metrics->data_status) {
        data_status_free(analytics_daily_metrics->data_status);
        analytics_daily_metrics->data_status = NULL;
    }
    if (analytics_daily_metrics->date) {
        free(analytics_daily_metrics->date);
        analytics_daily_metrics->date = NULL;
    }
    if (analytics_daily_metrics->metrics) {
        list_ForEach(listEntry, analytics_daily_metrics->metrics) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(analytics_daily_metrics->metrics);
        analytics_daily_metrics->metrics = NULL;
    }
    free(analytics_daily_metrics);
}

cJSON *analytics_daily_metrics_convertToJSON(analytics_daily_metrics_t *analytics_daily_metrics) {
    cJSON *item = cJSON_CreateObject();

    // analytics_daily_metrics->data_status
    if(analytics_daily_metrics->data_status != pinterest_rest_api_analytics_daily_metrics__NULL) {
    cJSON *data_status_local_JSON = data_status_convertToJSON(analytics_daily_metrics->data_status);
    if(data_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "data_status", data_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // analytics_daily_metrics->date
    if(analytics_daily_metrics->date) {
    if(cJSON_AddStringToObject(item, "date", analytics_daily_metrics->date) == NULL) {
    goto fail; //String
    }
    }


    // analytics_daily_metrics->metrics
    if(analytics_daily_metrics->metrics) {
    cJSON *metrics = cJSON_AddObjectToObject(item, "metrics");
    if(metrics == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = metrics;
    listEntry_t *metricsListEntry;
    if (analytics_daily_metrics->metrics) {
    list_ForEach(metricsListEntry, analytics_daily_metrics->metrics) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)metricsListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

analytics_daily_metrics_t *analytics_daily_metrics_parseFromJSON(cJSON *analytics_daily_metricsJSON){

    analytics_daily_metrics_t *analytics_daily_metrics_local_var = NULL;

    // define the local variable for analytics_daily_metrics->data_status
    data_status_t *data_status_local_nonprim = NULL;

    // define the local map for analytics_daily_metrics->metrics
    list_t *metricsList = NULL;

    // analytics_daily_metrics->data_status
    cJSON *data_status = cJSON_GetObjectItemCaseSensitive(analytics_daily_metricsJSON, "data_status");
    if (data_status) { 
    data_status_local_nonprim = data_status_parseFromJSON(data_status); //custom
    }

    // analytics_daily_metrics->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(analytics_daily_metricsJSON, "date");
    if (date) { 
    if(!cJSON_IsString(date) && !cJSON_IsNull(date))
    {
    goto end; //String
    }
    }

    // analytics_daily_metrics->metrics
    cJSON *metrics = cJSON_GetObjectItemCaseSensitive(analytics_daily_metricsJSON, "metrics");
    if (metrics) { 
    cJSON *metrics_local_map = NULL;
    if(!cJSON_IsObject(metrics) && !cJSON_IsNull(metrics))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(metrics))
    {
        metricsList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(metrics_local_map, metrics)
        {
            cJSON *localMapObject = metrics_local_map;
            if(!cJSON_IsNumber(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),&localMapObject->valuedouble );
            list_addElement(metricsList , localMapKeyPair);
        }
    }
    }


    analytics_daily_metrics_local_var = analytics_daily_metrics_create (
        data_status ? data_status_local_nonprim : NULL,
        date && !cJSON_IsNull(date) ? strdup(date->valuestring) : NULL,
        metrics ? metricsList : NULL
        );

    return analytics_daily_metrics_local_var;
end:
    if (data_status_local_nonprim) {
        data_status_free(data_status_local_nonprim);
        data_status_local_nonprim = NULL;
    }
    if (metricsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, metricsList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(metricsList);
        metricsList = NULL;
    }
    return NULL;

}
