#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_analytics_daily_metrics.h"



static pin_analytics_daily_metrics_t *pin_analytics_daily_metrics_create_internal(
    pinterest_rest_api_data_status__e data_status,
    char *date,
    list_t* metrics
    ) {
    pin_analytics_daily_metrics_t *pin_analytics_daily_metrics_local_var = malloc(sizeof(pin_analytics_daily_metrics_t));
    if (!pin_analytics_daily_metrics_local_var) {
        return NULL;
    }
    memset(pin_analytics_daily_metrics_local_var, 0, sizeof(pin_analytics_daily_metrics_t));
    pin_analytics_daily_metrics_local_var->_library_owned = 1;
    pin_analytics_daily_metrics_local_var->data_status = data_status;
    pin_analytics_daily_metrics_local_var->date = date;
    pin_analytics_daily_metrics_local_var->metrics = metrics;
    return pin_analytics_daily_metrics_local_var;
}

__attribute__((deprecated)) pin_analytics_daily_metrics_t *pin_analytics_daily_metrics_create(
    pinterest_rest_api_data_status__e data_status,
    char *date,
    list_t* metrics
    ) {
    pin_analytics_daily_metrics_t *result = pin_analytics_daily_metrics_create_internal (
        data_status,
        date,
        metrics
        );
    if (!result) {
    }
    return result;
}

void pin_analytics_daily_metrics_free(pin_analytics_daily_metrics_t *pin_analytics_daily_metrics) {
    if(NULL == pin_analytics_daily_metrics){
        return ;
    }
    if(pin_analytics_daily_metrics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_analytics_daily_metrics_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_analytics_daily_metrics->date) {
        free(pin_analytics_daily_metrics->date);
        pin_analytics_daily_metrics->date = NULL;
    }
    if (pin_analytics_daily_metrics->metrics) {
        list_ForEach(listEntry, pin_analytics_daily_metrics->metrics) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(pin_analytics_daily_metrics->metrics);
        pin_analytics_daily_metrics->metrics = NULL;
    }
    free(pin_analytics_daily_metrics);
}

cJSON *pin_analytics_daily_metrics_convertToJSON(pin_analytics_daily_metrics_t *pin_analytics_daily_metrics) {
    cJSON *item = cJSON_CreateObject();

    // pin_analytics_daily_metrics->data_status
    if(pin_analytics_daily_metrics->data_status != pinterest_rest_api_data_status__NULL) {
    cJSON *data_status_local_JSON = data_status_convertToJSON(pin_analytics_daily_metrics->data_status);
    if(data_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "data_status", data_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // pin_analytics_daily_metrics->date
    if(pin_analytics_daily_metrics->date) {
    if(cJSON_AddStringToObject(item, "date", pin_analytics_daily_metrics->date) == NULL) {
    goto fail; //String
    }
    }


    // pin_analytics_daily_metrics->metrics
    if(pin_analytics_daily_metrics->metrics) {
    cJSON *metrics = cJSON_AddObjectToObject(item, "metrics");
    if(metrics == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = metrics;
    listEntry_t *metricsListEntry;
    if (pin_analytics_daily_metrics->metrics) {
    list_ForEach(metricsListEntry, pin_analytics_daily_metrics->metrics) {
        keyValuePair_t *localKeyValue = metricsListEntry->data;
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

pin_analytics_daily_metrics_t *pin_analytics_daily_metrics_parseFromJSON(cJSON *pin_analytics_daily_metricsJSON){

    pin_analytics_daily_metrics_t *pin_analytics_daily_metrics_local_var = NULL;

    // define the local variable for pin_analytics_daily_metrics->data_status
    pinterest_rest_api_data_status__e data_status_local_nonprim = 0;

    char *date_local_str = NULL;

    // define the local map for pin_analytics_daily_metrics->metrics
    list_t *metricsList = NULL;

    // pin_analytics_daily_metrics->data_status
    cJSON *data_status = cJSON_GetObjectItemCaseSensitive(pin_analytics_daily_metricsJSON, "data_status");
    if (cJSON_IsNull(data_status)) {
        data_status = NULL;
    }
    if (data_status) { 
    data_status_local_nonprim = data_status_parseFromJSON(data_status); //custom
    }

    // pin_analytics_daily_metrics->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(pin_analytics_daily_metricsJSON, "date");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date) && !cJSON_IsNull(date))
    {
    goto end; //String
    }
    }

    // pin_analytics_daily_metrics->metrics
    cJSON *metrics = cJSON_GetObjectItemCaseSensitive(pin_analytics_daily_metricsJSON, "metrics");
    if (cJSON_IsNull(metrics)) {
        metrics = NULL;
    }
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


    if (date && !cJSON_IsNull(date)) date_local_str = strdup(date->valuestring);

    pin_analytics_daily_metrics_local_var = pin_analytics_daily_metrics_create_internal (
        data_status ? data_status_local_nonprim : 0,
        date_local_str,
        metrics ? metricsList : NULL
        );

    if (!pin_analytics_daily_metrics_local_var) {
        goto end;
    }

    return pin_analytics_daily_metrics_local_var;
end:
    if (data_status_local_nonprim) {
        data_status_local_nonprim = 0;
    }
    if (date_local_str) {
        free(date_local_str);
        date_local_str = NULL;
    }
    if (metricsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, metricsList) {
            keyValuePair_t *localKeyValue = listEntry->data;
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
