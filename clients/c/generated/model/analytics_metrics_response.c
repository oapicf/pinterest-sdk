#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "analytics_metrics_response.h"



analytics_metrics_response_t *analytics_metrics_response_create(
    list_t* summary_metrics,
    list_t *daily_metrics
    ) {
    analytics_metrics_response_t *analytics_metrics_response_local_var = malloc(sizeof(analytics_metrics_response_t));
    if (!analytics_metrics_response_local_var) {
        return NULL;
    }
    analytics_metrics_response_local_var->summary_metrics = summary_metrics;
    analytics_metrics_response_local_var->daily_metrics = daily_metrics;

    return analytics_metrics_response_local_var;
}


void analytics_metrics_response_free(analytics_metrics_response_t *analytics_metrics_response) {
    if(NULL == analytics_metrics_response){
        return ;
    }
    listEntry_t *listEntry;
    if (analytics_metrics_response->summary_metrics) {
        list_ForEach(listEntry, analytics_metrics_response->summary_metrics) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(analytics_metrics_response->summary_metrics);
        analytics_metrics_response->summary_metrics = NULL;
    }
    if (analytics_metrics_response->daily_metrics) {
        list_ForEach(listEntry, analytics_metrics_response->daily_metrics) {
            analytics_daily_metrics_free(listEntry->data);
        }
        list_freeList(analytics_metrics_response->daily_metrics);
        analytics_metrics_response->daily_metrics = NULL;
    }
    free(analytics_metrics_response);
}

cJSON *analytics_metrics_response_convertToJSON(analytics_metrics_response_t *analytics_metrics_response) {
    cJSON *item = cJSON_CreateObject();

    // analytics_metrics_response->summary_metrics
    if(analytics_metrics_response->summary_metrics) {
    cJSON *summary_metrics = cJSON_AddObjectToObject(item, "summary_metrics");
    if(summary_metrics == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = summary_metrics;
    listEntry_t *summary_metricsListEntry;
    if (analytics_metrics_response->summary_metrics) {
    list_ForEach(summary_metricsListEntry, analytics_metrics_response->summary_metrics) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)summary_metricsListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }


    // analytics_metrics_response->daily_metrics
    if(analytics_metrics_response->daily_metrics) {
    cJSON *daily_metrics = cJSON_AddArrayToObject(item, "daily_metrics");
    if(daily_metrics == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *daily_metricsListEntry;
    if (analytics_metrics_response->daily_metrics) {
    list_ForEach(daily_metricsListEntry, analytics_metrics_response->daily_metrics) {
    cJSON *itemLocal = analytics_daily_metrics_convertToJSON(daily_metricsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(daily_metrics, itemLocal);
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

analytics_metrics_response_t *analytics_metrics_response_parseFromJSON(cJSON *analytics_metrics_responseJSON){

    analytics_metrics_response_t *analytics_metrics_response_local_var = NULL;

    // define the local map for analytics_metrics_response->summary_metrics
    list_t *summary_metricsList = NULL;

    // define the local list for analytics_metrics_response->daily_metrics
    list_t *daily_metricsList = NULL;

    // analytics_metrics_response->summary_metrics
    cJSON *summary_metrics = cJSON_GetObjectItemCaseSensitive(analytics_metrics_responseJSON, "summary_metrics");
    if (summary_metrics) { 
    cJSON *summary_metrics_local_map = NULL;
    if(!cJSON_IsObject(summary_metrics) && !cJSON_IsNull(summary_metrics))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(summary_metrics))
    {
        summary_metricsList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(summary_metrics_local_map, summary_metrics)
        {
            cJSON *localMapObject = summary_metrics_local_map;
            if(!cJSON_IsNumber(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),&localMapObject->valuedouble );
            list_addElement(summary_metricsList , localMapKeyPair);
        }
    }
    }

    // analytics_metrics_response->daily_metrics
    cJSON *daily_metrics = cJSON_GetObjectItemCaseSensitive(analytics_metrics_responseJSON, "daily_metrics");
    if (daily_metrics) { 
    cJSON *daily_metrics_local_nonprimitive = NULL;
    if(!cJSON_IsArray(daily_metrics)){
        goto end; //nonprimitive container
    }

    daily_metricsList = list_createList();

    cJSON_ArrayForEach(daily_metrics_local_nonprimitive,daily_metrics )
    {
        if(!cJSON_IsObject(daily_metrics_local_nonprimitive)){
            goto end;
        }
        analytics_daily_metrics_t *daily_metricsItem = analytics_daily_metrics_parseFromJSON(daily_metrics_local_nonprimitive);

        list_addElement(daily_metricsList, daily_metricsItem);
    }
    }


    analytics_metrics_response_local_var = analytics_metrics_response_create (
        summary_metrics ? summary_metricsList : NULL,
        daily_metrics ? daily_metricsList : NULL
        );

    return analytics_metrics_response_local_var;
end:
    if (summary_metricsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, summary_metricsList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(summary_metricsList);
        summary_metricsList = NULL;
    }
    if (daily_metricsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, daily_metricsList) {
            analytics_daily_metrics_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(daily_metricsList);
        daily_metricsList = NULL;
    }
    return NULL;

}
